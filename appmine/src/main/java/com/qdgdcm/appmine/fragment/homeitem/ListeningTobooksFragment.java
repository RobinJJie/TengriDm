package com.qdgdcm.appmine.fragment.homeitem;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qdgdcm.appmine.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListeningTobooksFragment extends Fragment {


    public ListeningTobooksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listening_tobooks, container, false);
    }

}
