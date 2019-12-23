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
import com.qdgdcm.appmine.adapter.DownloadAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DownloadActivity extends ActivityPresenter {

    @BindView(R2.id.iv_left)
    ImageView ivLeft;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.rv_list)
    RecyclerView rvList;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_download;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        rvList.setLayoutManager(new LinearLayoutManager(this));
        DownloadAdapter adapter = new DownloadAdapter(this);
        rvList.setAdapter(adapter);
        adapter.refresh(MineDataHelper.getDownLoadList());
    }
}
