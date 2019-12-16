package com.lk.robin.commonlibrary.presenter;

/**
 * @author lubin
 * @version 1.0
 */
public abstract class BasePresenter<V extends BaseContract.View> implements BaseContract.Presenter {
    private V mView;

    public BasePresenter(V mView) {
        this.mView = mView;
        setPresenter();
    }

    private void setPresenter() {
        mView.setPresenter(this);
    }

    protected V getView() {
        return mView;
    }

    @Override
    public void destroy() {
        V view = mView;
        if (view != null) {
            view.setPresenter(null);
        }
    }

    @Override
    public void start() {

    }
}
