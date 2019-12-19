package com.qdgdcm.apphome;

import android.graphics.Color;
import android.view.Gravity;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.DpTool;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.commonlibrary.widget.GlobalPlay;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.fragment.MainFragment;

import java.util.List;

@Route(path = ConstantsRouter.Home.HomeMainActivity)
public class MainActivity extends ActivityPresenter implements MsgServer.ChangedListener<TurnToFrag> {
    private GlobalPlay globalplay;
    private AppFragment newFragment;
    private MainFragment mainFragment;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        //手动添加布局,减少布局层级
        globalplay = new GlobalPlay(this);
        globalplay.setRadius(DpTool.DpToPx(this, 22));
        globalplay.setBarWidth(DpTool.DpToPx(this, 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DpTool.DpToPx(this, 58), DpTool.DpToPx(this, 58));
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;
        playBar.setLayoutParams(layoutParams);
        playBar.addView(globalplay);
        globalplay.show();
        globalplay.play(R.mipmap.ic_home_biting_bangdan);
        globalplay.setBackground(getResources().getDrawable(R.drawable.shap_main_globalplay));
        globalplay.setBackgroundColor(Color.TRANSPARENT);
        globalplay.setProgress(0.6F);

    }

    @Override
    protected void initData() {
        super.initData();

        MsgServer.addChangedListener(TurnToFrag.class,this);
        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.root_view, mainFragment).commit();
    }

    @Override
    public void onDataPush(TurnToFrag data) {
        Factory.LogE("msg_bus_m1",data.toString());
        if (data==null)return;
        if (ConstantsRouter.Home.HomeMainFragment.equals(data.fragHoust)&&mainFragment!=null){
            getSupportFragmentManager().beginTransaction().show(mainFragment).commit();
            return;
        }
        Object navigation = mRouter.build(data.fragHoust).navigation();
        if (navigation instanceof AppFragment){
            newFragment= (AppFragment) navigation;
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .setCustomAnimations(R.anim.no_anim,R.anim.no_anim)
                    .hide(mainFragment).commit();
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .setCustomAnimations(R.anim.push_right_in,R.anim.push_right_out)
                    .add(R.id.root_view, newFragment).commit();
        }
    }

    @Override
    public void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments.size()>1){
            for (int i = 0; i < fragments.size(); i++) {
                if (fragments.get(i)!=mainFragment){
                    getSupportFragmentManager().beginTransaction()
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                            .setCustomAnimations(R.anim.push_right_in,R.anim.push_right_out)
                            .remove(fragments.get(i)).commitAllowingStateLoss();
                }
            }
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .setCustomAnimations(R.anim.no_anim,R.anim.no_anim)
                    .show(mainFragment).commit();
        }

//        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        MsgServer.removeChangedListener(TurnToFrag.class,this);
        super.onDestroy();
    }
}
