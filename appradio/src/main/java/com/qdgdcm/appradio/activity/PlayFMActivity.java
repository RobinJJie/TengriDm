package com.qdgdcm.appradio.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.StatusBarUtil;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import butterknife.BindView;

public class PlayFMActivity extends ActivityPresenter {

    @BindView(R2.id.rv_cover)
    RoundedImageView rvCover;
    @BindView(R2.id.progress)
    SeekBar progress;
    @BindView(R2.id.ll_programs)
    LinearLayout llPrograms;
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
    }
}
