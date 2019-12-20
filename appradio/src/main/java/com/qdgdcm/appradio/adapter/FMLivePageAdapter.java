package com.qdgdcm.appradio.adapter;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.qdgdcm.appradio.FMLiveFragment;

import java.util.List;

/**
 * author: li xiao
 * created on: 2019/12/19
 */
public class FMLivePageAdapter extends FragmentPagerAdapter {

    private List<FMLiveFragment> list;
    public FMLivePageAdapter(@NonNull FragmentManager fm, int behavior, List<FMLiveFragment> list) {
        super(fm, behavior);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }
}