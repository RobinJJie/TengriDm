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
import com.qdgdcm.appradio.adapter.ProgramsAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProgramsFragment extends Fragment {

    public ProgramsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_programs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView programs = view.findViewById(R.id.rv_programs);
        programs.setLayoutManager(new LinearLayoutManager(getContext()));
        programs.setFocusable(false);
        programs.setNestedScrollingEnabled(false);
        ProgramsAdapter programsAdapter = new ProgramsAdapter(getContext());
        programs.setAdapter(programsAdapter);
        programsAdapter.refresh(FMDataHelper.getPrograms());

    }
}
