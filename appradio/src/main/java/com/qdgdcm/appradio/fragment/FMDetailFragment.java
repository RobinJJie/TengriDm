package com.qdgdcm.appradio.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qdgdcm.appradio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FMDetailFragment extends Fragment {

    public FMDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fmdetail, container, false);
    }

}
