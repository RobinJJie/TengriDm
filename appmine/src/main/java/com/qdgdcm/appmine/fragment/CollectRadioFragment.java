package com.qdgdcm.appmine.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.qdgdcm.appmine.MineDataHelper;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.adapter.CollectRadioAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CollectRadioFragment extends Fragment {


    public CollectRadioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_collect_radio, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CollectRadioAdapter adapter = new CollectRadioAdapter(getContext());
        adapter.setOnItemClickListener((type, position, bean) ->
                ARouter.getInstance().build(ConstantsRouter.Home.PlayFMActivity).navigation());
        recyclerView.setAdapter(adapter);
        adapter.refresh(MineDataHelper.getCollectRadio());
    }
}
