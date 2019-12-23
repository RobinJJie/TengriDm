package com.qdgdcm.appmine;


import androidx.fragment.app.Fragment;

import com.lk.robin.commonlibrary.app.FragmentPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListenRecentlyFragment extends FragmentPresenter {


    public ListenRecentlyFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_listen_recently;
    }

    @Override
    protected BaseContract.Presenter initPersenter() {
        return null;
    }
}
