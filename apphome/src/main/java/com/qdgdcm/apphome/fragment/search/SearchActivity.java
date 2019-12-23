package com.qdgdcm.apphome.fragment.search;

import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.AppActivity;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.qdgdcm.apphome.R;

public class SearchActivity extends ActivityPresenter {


    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }
}
