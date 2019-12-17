package com.qdgdcm.apphome.fragment.homeitem;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qdgdcm.apphome.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TengriNewsHomeFragment extends Fragment {


    public TengriNewsHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tengri_news_home, container, false);
    }

}
