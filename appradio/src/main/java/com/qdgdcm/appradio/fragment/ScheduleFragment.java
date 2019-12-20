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
import com.qdgdcm.appradio.adapter.ScheduleAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment {
    private boolean isToday;
    public ScheduleFragment(boolean isToday) {
        // Required empty public constructor
        this.isToday = isToday;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rvSchedule = view.findViewById(R.id.rv_schedule);
        rvSchedule.setLayoutManager(new LinearLayoutManager(getContext()));
        ScheduleAdapter adapter = new ScheduleAdapter(getContext());
        adapter.setLive(isToday);
        rvSchedule.setAdapter(adapter);
        adapter.refresh(FMDataHelper.getPrograms());
    }
}
