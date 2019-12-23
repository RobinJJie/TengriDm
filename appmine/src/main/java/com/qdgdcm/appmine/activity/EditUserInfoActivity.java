package com.qdgdcm.appmine.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EditUserInfoActivity extends ActivityPresenter {

    @BindView(R2.id.iv_left)
    ImageView ivLeft;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_right)
    TextView tvRight;
    @BindView(R2.id.rv_logo)
    RoundedImageView rvLogo;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_edit_user_info;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        Glide.with(this).load(R.mipmap.ic_mine_head).into(rvLogo);
    }
}
