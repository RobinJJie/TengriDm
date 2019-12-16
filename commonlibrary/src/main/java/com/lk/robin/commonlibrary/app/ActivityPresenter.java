package com.lk.robin.commonlibrary.app;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.lk.robin.commonlibrary.presenter.BaseContract;


/**
 * @author lubin
 * @version 1.0 ·2018/11/6
 */
public abstract class ActivityPresenter<Presenter extends BaseContract.Presenter> extends AppActivity implements BaseContract.View<Presenter> {
    protected Presenter mPersenter;

    protected abstract Presenter initPresenter();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initPresenter();
        super.onCreate(savedInstanceState);
    }


    @Override
    public void showLoading() {
        showLoading("请稍后",true);
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void setPresenter(Presenter persenter) {
        this.mPersenter = persenter;
    }

    @Override
    public void showLoading(String msg, boolean cancelOut) {

    }

}
