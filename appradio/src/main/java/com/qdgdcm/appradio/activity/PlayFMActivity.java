package com.qdgdcm.appradio.activity;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.commonlibrary.tools.MyFMService;
import com.lk.robin.commonlibrary.tools.MyFMUtils;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.qdgdcm.appradio.FMDataHelper;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import com.qdgdcm.appradio.adapter.AlbumListAdapter;
import com.qdgdcm.appradio.adapter.FMListAdapter;

import butterknife.BindView;

public class PlayFMActivity extends ActivityPresenter {

    @BindView(R2.id.rv_cover)
    RoundedImageView rvCover;
    @BindView(R2.id.progress)
    SeekBar playerSeekbar;
    @BindView(R2.id.ll_programs)
    LinearLayout llPrograms;
    @BindView(R2.id.iv_player_bg)
    ImageView playerBg;
    @BindView(R2.id.iv_last)
    ImageView ivLast;
    @BindView(R2.id.iv_play)
    ImageView ivPlay;
    @BindView(R2.id.iv_next)
    ImageView ivNext;
    @BindView(R2.id.ll_timing)
    LinearLayout llTiming;
    @BindView(R2.id.ll_btn)
    LinearLayout llBtn;
    @BindView(R2.id.iv_back)
    ImageView ivBack;
    @BindView(R2.id.pb_loading)
    ProgressBar pbLoading;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.iv_share)
    ImageView ivShare;
    @BindView(R2.id.iv_now_cover)
    ImageView ivNowCover;
    @BindView(R2.id.tv_now_title)
    TextView tvNowTitle;
    @BindView(R2.id.tv_now_collect)
    TextView tvNowCollect;
    @BindView(R2.id.tv_other_title)
    TextView tvOtherTitle;
    @BindView(R2.id.rv_album)
    RecyclerView rvAlbum;
    @BindView(R2.id.tv_other_fm)
    TextView tvOtherFm;
    @BindView(R2.id.rv_fm_list)
    RecyclerView rvFmList;
    @BindView(R2.id.ns_root)
    NestedScrollView nsRoot;
    @BindView(R2.id.title_bg)
    View titleBg;
    private boolean isPrepare;
    private RotateAnimation rotateAnimation;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_play_fm;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        initCover();
        initList();
        initPlayer();
    }

    private void initList() {
        AlbumListAdapter albumListAdapter = new AlbumListAdapter(this);
        rvAlbum.setLayoutManager(new LinearLayoutManager(this));
        rvAlbum.setNestedScrollingEnabled(false);
        rvAlbum.setAdapter(albumListAdapter);
        FMListAdapter fmListAdapter = new FMListAdapter(this);
        rvFmList.setLayoutManager(new LinearLayoutManager(this));
        rvFmList.setNestedScrollingEnabled(false);
        rvFmList.setAdapter(fmListAdapter);
        albumListAdapter.refresh(FMDataHelper.getXiangsheng());
        fmListAdapter.refresh(FMDataHelper.getFMList());
        rvAlbum.setFocusable(false);
        rvFmList.setFocusable(false);
        nsRoot.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener)
                (v, scrollX, scrollY, oldScrollX, oldScrollY) -> {
            titleBg.setAlpha(Math.min(scrollY,1140)/1140f);
        });
    }

    private void initCover(){
        ivBack.setOnClickListener(view -> onBackPressed());
        Glide.with(this).load(R.mipmap.ic_local_fmdf_02).into(rvCover);
        rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.anim_rotate_common);
        // 添加匀速转动动画
        LinearInterpolator lir = new LinearInterpolator();
        rotateAnimation.setInterpolator(lir);
    }

    private void initPlayer(){
        if(MyFMUtils.getInstance(this).isBindService()){
            if(MyFMUtils.getInstance(this).isPlaying()){
                ivPlay.setVisibility(View.VISIBLE);
                ivPlay.setImageResource(R.drawable.ic_app_pause);
                pbLoading.setVisibility(View.GONE);
                rvCover.startAnimation(rotateAnimation);
            }else {
                ivPlay.setImageResource(R.drawable.ic_app_play);
            }
        }else {
            MyFMUtils.getInstance(this).startSingletonService();
        }
        MyFMUtils.getInstance(this).setPreparedListener(this::getPlayState);
        if(MyFMUtils.getInstance(this).isBindService()) getPlayState();
        ivPlay.setOnClickListener(view -> {
            if(isPrepare){
                MyFMUtils.getInstance(this).pause();
            }else {
                playAudio();
            }
        });
        Glide.with(this).load(R.drawable.rm_player_bg).into(playerBg);
    }

    private void getPlayState() {
        MyFMUtils.getInstance(this).setPlayListener(new MyFMService.OnPlayStateChangedListener() {
            @Override
            public void onPrepare(String name) {
                isPrepare = true;
                ivPlay.setVisibility(View.GONE);
                pbLoading.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStart(String name,int duration) {
                Log.e("name",String.valueOf(name));
                ivPlay.setVisibility(View.VISIBLE);
                ivPlay.setImageResource(R.drawable.ic_app_pause);
                pbLoading.setVisibility(View.GONE);
                rvCover.startAnimation(rotateAnimation);
            }

            @Override
            public void onProgress(int progress,int duration) {
                int p = (int) (progress*100f/duration);
                //Log.e("progress",progress+" duration："+duration+" seek：" + p);
                playerSeekbar.setProgress(p);
            }

            @Override
            public void onPauseOrPlay(boolean isPlay) {
                //Log.e("isPlay",String.valueOf(isPlay));
                if(isPlay){
                    ivPlay.setImageResource(R.drawable.ic_app_pause);
                    rvCover.startAnimation(rotateAnimation);
                }else {
                    ivPlay.setImageResource(R.drawable.ic_app_play);
                    rvCover.clearAnimation();
                }
            }
            @Override
            public void onComplete() {
                ivPlay.setImageResource(R.drawable.ic_app_play);
                rvCover.clearAnimation();
            }
            @Override
            public void onError(String error) {
                ivPlay.setVisibility(View.VISIBLE);
                ivPlay.setImageResource(R.drawable.ic_app_play);
                pbLoading.setVisibility(View.GONE);
                rvCover.clearAnimation();
                Factory.toast("播放出错"+error);
            }
        });
    }

    private void playAudio(){
        if(MyFMUtils.getInstance(this).isBindService()){
            MyFMUtils.getInstance(this).playFM("未命名",
                    "http://fdfs.xmcdn.com/group6/M09/C8/BF/wKgDg1UTwLKDHe8bABZp8SvJMY4882.mp3");
        }else {
            Factory.toast("音频服务正在启动");
        }
    }

}
