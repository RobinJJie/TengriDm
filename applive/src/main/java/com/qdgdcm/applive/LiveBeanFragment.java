package com.qdgdcm.applive;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LiveBeanFragment extends Fragment {

    private int type;

    public LiveBeanFragment(int type) {
        this.type = type;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_live_bean, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rvLive = view.findViewById(R.id.rv_live);
        rvLive.setLayoutManager(new LinearLayoutManager(getContext()));
        MainLiveAdapter adapter = new MainLiveAdapter(getContext());
        rvLive.setAdapter(adapter);
        if(type == 0){
            adapter.refresh(LiveDataHelper.getLiveHD());
        }else {
            adapter.refresh(LiveDataHelper.getShizheng());
        }
    }
}
