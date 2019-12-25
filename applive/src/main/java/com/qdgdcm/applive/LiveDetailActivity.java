package com.qdgdcm.applive;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.MyShareFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.widget.MyPagerAdapter;
import com.lk.robin.commonlibrary.widget.SampleCoverVideo;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder;
import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack;

import butterknife.BindView;

@Route(path = ConstantsRouter.Home.LiveDetailActivity)
public class LiveDetailActivity extends ActivityPresenter {

    @BindView(R2.id.scv_live)
    SampleCoverVideo coverVideo;
    @BindView(R2.id.rv_select_live)
    RecyclerView rvSelectLive;
    @BindView(R2.id.iv_back)
    ImageView ivBack;
    @BindView(R2.id.iv_share)
    ImageView ivShare;
    @BindView(R2.id.toolbar)
    Toolbar toolbar;
    @BindView(R2.id.collapsingToolbarLayout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R2.id.tb_main)
    TabLayout tbMain;
    @BindView(R2.id.appbar)
    AppBarLayout appbar;
    @BindView(R2.id.vp_programs)
    ViewPager vpPrograms;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_live_detail;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        ivBack.setOnClickListener(view -> onBackPressed());
        ivShare.setOnClickListener(view -> showShare());
        MyPagerAdapter pageAdapter = new MyPagerAdapter(getSupportFragmentManager(),
                new Fragment[]{new LiveDetailFragment(),new LiveCommentFragment()},
                new String[]{"直播间","互动",});
        vpPrograms.setAdapter(pageAdapter);
        tbMain.setupWithViewPager(vpPrograms);

        GSYVideoOptionBuilder gsyVideoOption = new GSYVideoOptionBuilder();
        gsyVideoOption
                .setIsTouchWiget(false)
                .setCacheWithPlay(false)
                .setRotateViewAuto(true)
                .setLockLand(true)
                .setShowFullAnimation(true)
                .setNeedLockFull(true)
                .setVideoAllCallBack(new GSYSampleCallBack() {
                    @Override
                    public void onPrepared(String url, Object... objects) {
                        super.onPrepared(url, objects);
                        if (!coverVideo.isIfCurrentIsFullscreen()) {
                            GSYVideoManager.instance().setNeedMute(false);
                        }
                    }
                    @Override
                    public void onQuitFullscreen(String url, Object... objects) {
                        super.onQuitFullscreen(url, objects);
                        //全屏不静音
                        GSYVideoManager.instance().setNeedMute(false);
                    }

                    @Override
                    public void onEnterFullscreen(String url, Object... objects) {
                        super.onEnterFullscreen(url, objects);
                        GSYVideoManager.instance().setNeedMute(false);
                        coverVideo.getCurrentPlayer().getTitleTextView().setText((String) objects[0]);
                    }
                }).build(coverVideo);
        coverVideo.getTitleTextView().setVisibility(View.GONE);
        coverVideo.getBackButton().setVisibility(View.GONE);
        //设置全屏按键功能
        coverVideo.getFullscreenButton().setOnClickListener(v ->
                coverVideo.startWindowFullscreen(this, true, true));
        coverVideo.release();
        coverVideo.loadCoverImage(R.mipmap.ic_local_shizheng01);
        gsyVideoOption
                .setUrl("http://ivi.bupt.edu.cn/hls/cctv1hd.m3u8")
                .setCacheWithPlay(false)
                .build(coverVideo);
    }

    @Override
    protected boolean statusBarLightMode() {
        return false;
    }

    private MyShareFragment shareFragment;
    public void showShare(){
        if(shareFragment == null)
            shareFragment = new MyShareFragment();
        shareFragment.show(getSupportFragmentManager(),
                MyShareFragment.class.getSimpleName());
    }


    @Override
    protected void onDestroy() {
        coverVideo.release();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if (GSYVideoManager.backFromWindowFull(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        coverVideo.onVideoPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        coverVideo.onVideoResume();
    }
}
