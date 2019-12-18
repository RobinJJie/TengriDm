package com.qdgdcm.appradio;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = ConstantsRouter.Radio.RadioHome)
public class BroadcastFragment extends AppFragment {


    public BroadcastFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_broadcast;
    }

}
