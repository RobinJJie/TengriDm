package com.qdgdcm.appradio.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.qdgdcm.appradio.fragment.FMLiveFragment;

import java.util.List;

/**
 * author: li xiao
 * created on: 2019/12/19
 */
public class FMLivePageAdapter extends FragmentPagerAdapter {

    private String[] titles;

    public void setTitles(String[] title) {
        this.titles = title;
    }

    private List<Fragment> list;

    public FMLivePageAdapter(@NonNull FragmentManager fm, int behavior, List<Fragment> list) {
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(titles == null){
            return super.getPageTitle(position);
        }else {
            return titles[position];
        }
    }
}