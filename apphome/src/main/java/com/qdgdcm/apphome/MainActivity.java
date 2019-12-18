package com.qdgdcm.apphome;

import android.graphics.Color;
import android.view.Gravity;
import android.widget.FrameLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.DpTool;
import com.lk.robin.commonlibrary.widget.GlobalPlay;
import com.qdgdcm.apphome.fragment.MainFragment;

@Route(path = ConstantsRouter.Home.HomeMainActivity)
public class MainActivity extends ActivityPresenter {
    private GlobalPlay globalplay;

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
        MainFragment mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.root_view,mainFragment ).commit();
    }
}
