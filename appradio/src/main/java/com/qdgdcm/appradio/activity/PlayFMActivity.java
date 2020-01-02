package com.qdgdcm.appradio.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.MyShareFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.DateTimeTool;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.commonlibrary.tools.MyFMService;
import com.lk.robin.commonlibrary.tools.MyFMUtils;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.appradio.FMDataHelper;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import com.qdgdcm.appradio.adapter.AlbumListAdapter;
import com.qdgdcm.appradio.adapter.FMListAdapter;

import butterknife.BindView;

@Route(path = ConstantsRouter.Home.PlayFMActivity)
public class PlayFMActivity extends ActivityPresenter implements MyFMService.OnPlayStateChangedListener {

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
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_play_name)
    TextView tvPlayName;
    @BindView(R2.id.iv_back)
    ImageView ivBack;
    @BindView(R2.id.iv_share)
    ImageView ivShare;
    @BindView(R2.id.pb_loading)
    ProgressBar pbLoading;
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
    @BindView(R2.id.tv_current_progress)
    TextView currentProgress;
    @BindView(R2.id.tv_total_progress)
    TextView totalProgress;
    @BindView(R2.id.rv_fm_list)
    RecyclerView rvFmList;
    @BindView(R2.id.ns_root)
    NestedScrollView nsRoot;
    @BindView(R2.id.title_bg)
    View titleBg;
    @BindView(R2.id.rl_programs)
    RelativeLayout rlPrograms;
    private boolean isPrepare;
    private RotateAnimation rotateAnimation;
    private int id,ic;
    private String title,info;
    private ContentBean contentBean;


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
        tvTitle.setText("中央人民广播电视台");
        tvNowTitle.setText("经典音乐广播");
        Glide.with(this).load(R.mipmap.ic_local_fm_01).into(rvCover);

        AlbumListAdapter albumListAdapter = new AlbumListAdapter(this);
        rvAlbum.setLayoutManager(new LinearLayoutManager(this));
        rvAlbum.setNestedScrollingEnabled(false);
        rvAlbum.setAdapter(albumListAdapter);
        FMListAdapter fmListAdapter = new FMListAdapter(this);
        fmListAdapter.setShowDeleteOrPlay(false,true);
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
        ivShare.setOnClickListener(view -> showShare());
        rlPrograms.setOnClickListener(view -> startActivity(new Intent(this,FMProgramsActivity.class)));
        llPrograms.setOnClickListener(view -> startActivity(new Intent(this,ScheduleActivity.class)));
        rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(this, R.anim.anim_rotate_common);
        // 添加匀速转动动画
        LinearInterpolator lir = new LinearInterpolator();
        rotateAnimation.setInterpolator(lir);
    }

    @SuppressLint("ResourceType")
    private void initPlayer(){

        if(MyFMUtils.getInstance(this).hasLoadSource()){
            if(MyFMUtils.getInstance(this).isLoading()){
                ivPlay.setVisibility(View.GONE);
                pbLoading.setVisibility(View.VISIBLE);
                playerSeekbar.setEnabled(false);
            }else {
                isPrepare = true;
                if(MyFMUtils.getInstance(this).getDuration() <= 0){//直播流
                    playerSeekbar.setEnabled(false);
                    currentProgress.setVisibility(View.INVISIBLE);
                    totalProgress.setVisibility(View.INVISIBLE);
                }else {
                    currentProgress.setVisibility(View.VISIBLE);
                    totalProgress.setVisibility(View.VISIBLE);
                    playerSeekbar.setEnabled(true);
                    setProgress(MyFMUtils.getInstance(this).getProgress(),
                            MyFMUtils.getInstance(this).getDuration());
                }
                ivPlay.setVisibility(View.VISIBLE);
                pbLoading.setVisibility(View.GONE);
                if(MyFMUtils.getInstance(this).isPlaying()){
                    ivPlay.setImageResource(R.drawable.ic_app_pause);
                    rvCover.startAnimation(rotateAnimation);
                }else {
                    ivPlay.setImageResource(R.drawable.ic_app_play);
                }

                ContentBean contentBean = MyFMUtils.getInstance(this).getContentBean();
                if(contentBean != null){
                    Glide.with(this).load(contentBean.resId).into(rvCover);
                    tvTitle.setText(contentBean.info);
                    tvNowTitle.setText(contentBean.title);
                }
            }
        }

        MyFMUtils.getInstance(this).addPlayListener(this);
        ivPlay.setOnClickListener(view -> {
            if(isPrepare){
                MyFMUtils.getInstance(this).pause();
            }else {
                playAudio();
            }
        });
        playerSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {}
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                MyFMUtils.getInstance(PlayFMActivity.this).setProgress(seekBar.getProgress());
            }
        });

        Glide.with(this).load(R.drawable.rm_player_bg).into(playerBg);
    }

    @Override
    protected void initData() {
        super.initData();
        Bundle bundle = getIntent().getBundleExtra("bundle");
        if(bundle != null){
            title = bundle.getString("title","驯鹿角上的丝带");
            info = bundle.getString("info");
            ic = bundle.getInt("ic",R.mipmap.ic_local_sy02);
            id = bundle.getInt("id",0);
            contentBean = (ContentBean) bundle.getSerializable("bean");
            Glide.with(this).load(ic).into(rvCover);
            tvTitle.setText(title);
            tvNowTitle.setText(contentBean.title);
            if(contentBean != null){
                contentBean.info = title;
                contentBean.resId = ic;
                MyFMUtils.getInstance(this).setContentBean(contentBean);
                MyFMUtils.getInstance(this).release();
                MyFMUtils.getInstance(this).playFM(contentBean.title, contentBean.playUrl);
            }
        }
    }

    private void playAudio(){
        MyFMUtils.getInstance(this).release();
        MyFMUtils.getInstance(this).playFM("CNR中国之声",
                "https://lhttp.qingting.fm/live/386/64k.mp3");
    }

    private MyShareFragment shareFragment;
    public void showShare(){
        if(shareFragment == null)
            shareFragment = new MyShareFragment();
        shareFragment.show(getSupportFragmentManager(),
                MyShareFragment.class.getSimpleName());
    }

    private void setProgress(int progress,int duration){
        int p = (int) (progress*100f/duration);
        currentProgress.setText(DateTimeTool.longToStr(progress,"mm:ss"));
        totalProgress.setText(DateTimeTool.longToStr(duration,"mm:ss"));
        playerSeekbar.setProgress(p);
    }

    @Override
    protected boolean statusBarLightMode() {
        return false;
    }

    @Override
    protected void onDestroy() {
        MyFMUtils.getInstance(this).removePlayListener(this);
        super.onDestroy();
    }

    //==============播放状态监听===================
    @Override
    public void onPrepare(String name) {
        tvPlayName.setText(name);
        ivPlay.setVisibility(View.GONE);
        pbLoading.setVisibility(View.VISIBLE);
        playerSeekbar.setEnabled(false);
    }

    @Override
    public void onStart(String name,int duration) {
        Log.e("name",String.valueOf(name));
        isPrepare = true;
        ivPlay.setVisibility(View.VISIBLE);
        ivPlay.setImageResource(R.drawable.ic_app_pause);
        pbLoading.setVisibility(View.GONE);
        rvCover.startAnimation(rotateAnimation);
        if(duration <= 0){//直播流
            playerSeekbar.setEnabled(false);
            currentProgress.setVisibility(View.INVISIBLE);
            totalProgress.setVisibility(View.INVISIBLE);
        }else {
            currentProgress.setVisibility(View.VISIBLE);
            totalProgress.setVisibility(View.VISIBLE);
            playerSeekbar.setEnabled(true);
            totalProgress.setText(DateTimeTool.longToStr(duration,"mm:ss"));
        }
    }

    @Override
    public void onProgress(int progress,int duration) {
        Factory.LogE("progress",progress+"  duration："+duration);
        setProgress(progress,duration);
    }

    @Override
    public void onPauseOrPlay(boolean isPlay) {
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
        currentProgress.setText(DateTimeTool
                .longToStr(MyFMUtils.getInstance(this).getDuration(),"mm:ss"));
        totalProgress.setText(DateTimeTool
                .longToStr(MyFMUtils.getInstance(this).getDuration(),"mm:ss"));
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
}
