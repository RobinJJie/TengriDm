package com.lk.robin.commonlibrary.app;

import android.content.Context;

import com.lk.robin.commonlibrary.presenter.BaseContract;


/**
 * @author wjunjie
 * @version 1.0
 * @E-mail wang_junjie007@163.com
 * @company ZZYD
 * @createTime 2018/7/20 15:27
 * @类注释:
 */
public abstract class FragmentPresenter<Presenter extends BaseContract.Presenter> extends AppFragment implements BaseContract.View<Presenter> {

    protected Presenter mPersenter;

    protected abstract Presenter initPersenter();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        initPersenter();
    }

    @Override
    public void showLoading() {
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void setPresenter(Presenter persenter) {
        mPersenter = persenter;
    }

    @Override
    public void showLoading(String msg, boolean cancelOut) {

    }

}
