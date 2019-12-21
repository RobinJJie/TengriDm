package com.qdgdcm.apphome.fragment;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;
import com.qdgdcm.apphome.fragment.bitingbandan.WillListenItemFragment;
import com.qdgdcm.apphome.fragment.homeitem.TengriNewsHomeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = ConstantsRouter.Home.HomeMainBitingListFragment)
public class WillListenListFragment extends AppFragment {
    @BindView(R2.id.view_pager)
    ViewPager viewPager;
    @BindView(R2.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R2.id.ic_bm_top_back)
    View back;
    @BindView(R2.id.txt_bm_top_title)
    TextView txtTitle;


    private String[] tabTitle={"总榜","听书","综艺","情感","文化","相声"};
    private List<AppFragment> fragmentList=new ArrayList<>();
    public WillListenListFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_will_listen_list;
    }

    @Override
    protected void initData() {
        super.initData();
        txtTitle.setText("必听榜单");
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHomeBack();
            }
        });
        fragmentList.add(new WillListenItemFragment("1"));
        fragmentList.add(new WillListenItemFragment("2"));
        fragmentList.add(new WillListenItemFragment("3"));
        fragmentList.add(new WillListenItemFragment("4"));
        fragmentList.add(new WillListenItemFragment("5"));
        fragmentList.add(new WillListenItemFragment("6"));

        viewPager.setAdapter(new FragAdapter(getChildFragmentManager(),0));
        tabLayout.setupWithViewPager(viewPager);

    }

    class FragAdapter extends FragmentStatePagerAdapter{

        public FragAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitle[position];
        }
    }
}
