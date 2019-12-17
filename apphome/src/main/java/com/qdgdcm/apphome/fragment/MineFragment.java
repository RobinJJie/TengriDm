package com.qdgdcm.apphome.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.qdgdcm.apphome.R;


/**
 * A simple {@link Fragment} subclass.
 */
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
