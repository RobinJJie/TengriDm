package com.qdgdcm.apphome.fragment.homeitem;


import android.view.View;

import androidx.fragment.app.Fragment;

import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.qdgdcm.apphome.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends AppFragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);

    }
}
