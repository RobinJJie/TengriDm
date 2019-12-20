package com.lk.robin.commonlibrary.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * author: li xiao
 * created on: 2019/5/16
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private String[] titleList;
    private Fragment[] fragments;

    @SuppressLint("WrongConstant")
    public MyPagerAdapter(FragmentManager fm, Fragment[] fragments, String[] titleList) {
        super(fm,FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragments = fragments;
        this.titleList = titleList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList[position];
    }
}