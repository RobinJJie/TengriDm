package com.qdgdcm.appradio.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qdgdcm.appradio.FMDataHelper;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.adapter.AlbumListAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class TuijianFragment extends Fragment {


    public TuijianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tuijian, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rvAlbum = view.findViewById(R.id.rv_album);
        AlbumListAdapter albumListAdapter = new AlbumListAdapter(getContext());
        rvAlbum.setLayoutManager(new LinearLayoutManager(getContext()));
        rvAlbum.setNestedScrollingEnabled(false);
        rvAlbum.setFocusable(false);
        rvAlbum.setAdapter(albumListAdapter);
        albumListAdapter.refresh(FMDataHelper.getXiangsheng());
    }
}
