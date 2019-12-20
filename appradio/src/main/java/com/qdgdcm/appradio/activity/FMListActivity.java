package com.qdgdcm.appradio.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.qdgdcm.appradio.FMDataHelper;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import com.qdgdcm.appradio.adapter.FMListAdapter;
import butterknife.BindView;

public class FMListActivity extends ActivityPresenter {

    @BindView(R2.id.iv_left)
    ImageView ivLeft;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.iv_right)
    ImageView ivRight;
    @BindView(R2.id.rv_list)
    RecyclerView rvList;

    public static final int BENDI = 1;
    public static final int ZHONGYANG = 2;
    public static final int GUOJI = 3;
    public static final int SHOUCANG = 4;
    public static final int SUISHENTING = 5;
    private FMListAdapter fmListAdapter;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_fmlist;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        fmListAdapter = new FMListAdapter(this);
        fmListAdapter.setOnItemClickListener((type, position, bean) -> {
            startActivity(new Intent(this, PlayFMActivity.class));
        });
        rvList.setLayoutManager(new LinearLayoutManager(this));
        rvList.setNestedScrollingEnabled(false);
        rvList.setAdapter(fmListAdapter);
        setStyle(getIntent().getIntExtra("type",BENDI));
    }

    public void setStyle(int type){
        switch (type){
            case BENDI:
                tvTitle.setText("内蒙古");
                fmListAdapter.setShowDeleteOrPlay(false,false);
                fmListAdapter.refresh(FMDataHelper.getFMList());
                break;
            case ZHONGYANG:
                tvTitle.setText("中央台");
                fmListAdapter.setShowDeleteOrPlay(false,false);
                fmListAdapter.refresh(FMDataHelper.getYangShiList());
                break;
            case GUOJI:
                tvTitle.setText("国际台");
                fmListAdapter.setShowDeleteOrPlay(false,false);
                fmListAdapter.refresh(FMDataHelper.getGuoJiList());
                break;
            case SHOUCANG:
                tvTitle.setText("收藏");
                fmListAdapter.setShowDeleteOrPlay(true,false);
                fmListAdapter.refresh(FMDataHelper.getShouCangList());
                break;
            case SUISHENTING:
                tvTitle.setText("音乐随身听");
                fmListAdapter.setShowDeleteOrPlay(false,false);
                fmListAdapter.refresh(FMDataHelper.getYYSList());
                break;
        }
    }
}
