package com.qdgdcm.apphome.fragment.homeitem;


import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.lk.robin.commonlibrary.app.AppFragment;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends AppFragment {
    @BindView(R2.id.view_pager)
    ViewPager mViewPager;

    private List<Fragment> list=new ArrayList<>();
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        list.add(new TengriNewsHomeFragment());
//        list.add(new TengriNewsHomeFragment());
//        list.add(new TengriNewsHomeFragment());

        mViewPager.setAdapter(new FragAdapter(getChildFragmentManager(),0));
    }

    class FragAdapter extends FragmentPagerAdapter {

        public FragAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }



}
