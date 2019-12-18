package com.qdgdcm.appmine;


import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;


@Route(path = ConstantsRouter.Mine.MineHome)
public class MineFragment extends AppFragment {


    public MineFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);

    }
}
