package com.qdgdcm.appmine.activity;

import android.view.View;
import android.widget.TextView;

import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;

import butterknife.BindView;

public class ActionBaomingActivity extends ActivityPresenter {
    @BindView(R2.id.ic_bm_top_back)
    View back;
    @BindView(R2.id.txt_bm_top_title)
    TextView txt;
    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_action_baoming;
    }

    @Override
    protected void initData() {
        super.initData();
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(v -> finish());
        txt.setText("报名");
    }
}
