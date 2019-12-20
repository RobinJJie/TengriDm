package com.qdgdcm.appradio;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FMLiveFragment extends Fragment {


    public FMLiveFragment() {
        // Required empty public constructor
    }

    public static FMLiveFragment newInstance(int position, boolean isLiving) {

        Bundle args = new Bundle();
        args.putInt("position",position);
        args.putBoolean("isLiving",isLiving);
        FMLiveFragment fragment = new FMLiveFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fmlive, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RoundedImageView imageView = view.findViewById(R.id.rv_live_cover);
        ImageView living = view.findViewById(R.id.iv_living);
        ImageView wait = view.findViewById(R.id.iv_wait);
        Bundle bundle = getArguments();
        if(bundle != null){
            int position = bundle.getInt("position");
            boolean isLiving = bundle.getBoolean("isLiving");
            if(isLiving){
                living.setVisibility(View.VISIBLE);
                wait.setVisibility(View.GONE);
            }else {
                living.setVisibility(View.GONE);
                wait.setVisibility(View.VISIBLE);
            }
            int[] res = new int[]{R.mipmap.ic_local_banner_1,R.mipmap.ic_local_banner_2,R.mipmap.ic_local_banner_3,
                        R.mipmap.ic_local_banner_4,R.mipmap.ic_local_banner_5,R.mipmap.ic_local_banner_6};
            Glide.with(this).load(res[position]).into(imageView);
        }
    }
}
