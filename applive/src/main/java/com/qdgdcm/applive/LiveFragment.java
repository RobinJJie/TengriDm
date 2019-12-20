package com.qdgdcm.applive;


import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.fragment.app.Fragment;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.app.FragmentPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.widget.MyPagerAdapter;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = ConstantsRouter.Live.Live_Home)
public class LiveFragment extends FragmentPresenter {


    @BindView(R2.id.tb_main)
    TabLayout tbMain;
    @BindView(R2.id.vp_programs)
    ViewPager vpPrograms;

    public LiveFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_live;
    }

    @Override
    protected BaseContract.Presenter initPersenter() {
        return null;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        String[] titles = new String[]{"活动直播","时政直播"};
        Fragment[] fragments = new Fragment[]{new LiveBeanFragment(0),new LiveBeanFragment(1)};
        MyPagerAdapter pageAdapter = new MyPagerAdapter(getChildFragmentManager(),fragments,titles);
        vpPrograms.setAdapter(pageAdapter);
        tbMain.setupWithViewPager(vpPrograms);
    }


}
