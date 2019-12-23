package com.qdgdcm.apphome.fragment.classify;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.FragmentPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import butterknife.OnClick;

@Route(path = ConstantsRouter.Home.HomeClassifyFragment)
public class ClassifyFragment extends FragmentPresenter {


    public ClassifyFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_classify;
    }

    @Override
    protected BaseContract.Presenter initPersenter() {
        return null;
    }

    @OnClick(R2.id.btn_back)
    void onBack() {
        onHomeBack();
    }
}
