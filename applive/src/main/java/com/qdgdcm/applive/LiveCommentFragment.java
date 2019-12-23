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

import com.lk.robin.commonlibrary.widget.CommentAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class LiveCommentFragment extends Fragment {


    public LiveCommentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_live_comment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.rv_comment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        CommentAdapter adapter = new CommentAdapter(getContext());
        adapter.refresh(LiveDataHelper.getComment());
        recyclerView.setAdapter(adapter);
    }
}
