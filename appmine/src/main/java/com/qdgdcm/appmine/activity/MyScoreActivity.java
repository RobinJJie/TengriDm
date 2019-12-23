package com.qdgdcm.appmine.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.qdgdcm.appmine.MineDataHelper;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;
import com.qdgdcm.appmine.adapter.MyScoreAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyScoreActivity extends ActivityPresenter {

    @BindView(R2.id.iv_left)
    ImageView ivLeft;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_score)
    TextView tvScore;
    @BindView(R2.id.rv_list)
    RecyclerView rvList;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_my_score;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        rvList.setLayoutManager(new LinearLayoutManager(this));
        MyScoreAdapter adapter = new MyScoreAdapter(this);
        rvList.setAdapter(adapter);
    }
}
