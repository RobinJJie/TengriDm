package com.qdgdcm.apphome;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.DpTool;
import com.lk.robin.commonlibrary.tools.MyFMService;
import com.lk.robin.commonlibrary.tools.MyFMUtils;
import com.lk.robin.commonlibrary.widget.GlobalPlay;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.fragment.MainFragment;

import java.util.ArrayList;
import java.util.List;

@Route(path = ConstantsRouter.Home.HomeMainActivity)
public class MainActivity extends ActivityPresenter implements MsgServer.ChangedListener<TurnToFrag>, MyFMService.OnPlayStateChangedListener {
    private GlobalPlay globalplay;
    private MainFragment mainFragment;

    private List<AppFragment> taskFragLsit = new ArrayList<>();

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean statusBarLightMode() {
        return false;
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
        globalplay.setOnClickListener(view -> ARouter.getInstance().build(ConstantsRouter.Home.PlayFMActivity).navigation());
        MyFMUtils.getInstance(this).addPlayListener(this);
        if(MyFMUtils.getInstance(this).hasLoadSource()){
            globalplay.setProgress(1f*MyFMUtils.getInstance(this).getProgress()/
                    MyFMUtils.getInstance(this).getDuration());
            if(MyFMUtils.getInstance(this).isPlaying()){
                globalplay.play(R.mipmap.ic_local_fm_01);
            }else {
                globalplay.pause();
            }
        }
    }

    @Override
    protected void initData() {
        super.initData();
        MsgServer.addChangedListener(TurnToFrag.class, this);
        mainFragment = new MainFragment();
        taskFragLsit.add(mainFragment);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root_view, mainFragment, "home_frag")
                .commit();
    }

    @Override
    public void onDataPush(TurnToFrag data) {
        if (data == null) return;
        if (data.launchMode == TurnToFrag.FRAG_OPEN) {
            fragTonew(data);
        } else if (data.launchMode == TurnToFrag.FRAG_CLOSE) {
            frgBack();
        }
    }

    private void frgBack() {
        if (taskFragLsit.size() <= 1) {
            return;
        } else if (taskFragLsit.size() == 2) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out)
                    .hide(taskFragLsit.get(taskFragLsit.size() - 1))
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .setCustomAnimations(R.anim.no_anim, R.anim.no_anim)
                    .show(taskFragLsit.get(taskFragLsit.size() - 2))
                    .commit();
        } else {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out)
                    .hide(taskFragLsit.get(taskFragLsit.size() - 1))
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .setCustomAnimations(R.anim.no_anim, R.anim.no_anim)
                    .show(taskFragLsit.get(taskFragLsit.size() - 2))
                    .commit();

        }
        taskFragLsit.remove(taskFragLsit.size() - 1);
        if (taskFragLsit.size() == 1) {
            globalplay.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    private void fragTonew(TurnToFrag data) {
        if (ConstantsRouter.Home.HomeMainFragment.equals(data.fragHoust) && mainFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.root_view, mainFragment).commit();
            taskFragLsit.clear();
            taskFragLsit.add(mainFragment);
            return;
        }

        globalplay.setBackground(getResources().getDrawable(R.drawable.shap_main_globalplay));

        Object navigation = mRouter.build(data.fragHoust).navigation();
        if (navigation instanceof AppFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
                    .setCustomAnimations(R.anim.no_anim, R.anim.no_anim)
                    .disallowAddToBackStack()
                    .hide(taskFragLsit.get(taskFragLsit.size() - 1))
                    .commit();
            AppFragment newFragment = (AppFragment) navigation;
            if (data.bundle != null) {
                newFragment.setArguments(data.bundle);
            }
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .setCustomAnimations(R.anim.push_right_in, R.anim.push_right_out)
                    .add(R.id.root_view, newFragment, data.fragHoust)
                    .commit();
            taskFragLsit.add(newFragment);
        }
    }

    @Override
    public void onBackPressed() {
        if (taskFragLsit.size() == 1) {
            super.onBackPressed();
        } else {
            frgBack();
        }

    }

    @Override
    protected void onDestroy() {
        MyFMUtils.getInstance(this).removePlayListener(this);
        MsgServer.removeChangedListener(TurnToFrag.class, this);
        super.onDestroy();
    }


    @Override
    public void onPrepare(String name) {
        setProgress(0);
    }

    @Override
    public void onStart(String name, int duration) {
        globalplay.play(R.mipmap.ic_local_fm_01);
    }

    @Override
    public void onProgress(int progress, int duration) {
        if(duration>0){
            float p = 1f*progress/duration;
            globalplay.setProgress(p);
        }
    }

    @Override
    public void onPauseOrPlay(boolean isPlay) {
        if(isPlay){
            globalplay.play(R.mipmap.ic_local_fm_01);
        }else {
            globalplay.pause();
        }
    }

    @Override
    public void onComplete() { globalplay.pause(); }

    @Override
    public void onError(String error) {
        globalplay.pause();
    }
}
