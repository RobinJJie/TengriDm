package com.qdgdcm.appmine.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;
import com.qdgdcm.appmine.adapter.SigninAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignInActivity extends ActivityPresenter {

    @BindView(R2.id.iv_left)
    ImageView ivLeft;
    @BindView(R2.id.tv_signin_status)
    TextView tvSigninStatus;
    @BindView(R2.id.rv_list)
    RecyclerView rvList;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_sign_in;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        ivLeft.setOnClickListener(view -> onBackPressed());
        rvList.setLayoutManager(new GridLayoutManager(this,6));
        SigninAdapter adapter = new SigninAdapter(this);
        rvList.setAdapter(adapter);
    }

    @Override
    protected boolean statusBarLightMode() {
        return false;
    }
}
