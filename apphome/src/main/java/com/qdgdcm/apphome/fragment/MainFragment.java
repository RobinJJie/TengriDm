package com.qdgdcm.apphome.fragment;


import androidx.fragment.app.Fragment;

import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.qdgdcm.apphome.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends AppFragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initData() {
        super.initData();
        Object fragHomr = mRouter.build(ConstantsRouter.Live.Live_Home).navigation();
        if (fragHomr instanceof AppFragment) {
            getChildFragmentManager().beginTransaction().add(R.id.root_content_frg, (Fragment) fragHomr).commit();
        }
    }
}
