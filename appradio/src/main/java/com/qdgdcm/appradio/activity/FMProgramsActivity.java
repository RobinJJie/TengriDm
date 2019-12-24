package com.qdgdcm.appradio.activity;

import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.MyShareFragment;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import com.qdgdcm.appradio.fragment.FMDetailFragment;
import com.lk.robin.commonlibrary.widget.MyPagerAdapter;
import com.qdgdcm.appradio.fragment.ProgramsFragment;
import com.qdgdcm.appradio.fragment.TuijianFragment;
import butterknife.BindView;

public class FMProgramsActivity extends ActivityPresenter {

    @BindView(R2.id.iv_back)
    ImageView ivBack;
    @BindView(R2.id.iv_share)
    ImageView ivShare;
    @BindView(R2.id.rv_cover)
    RoundedImageView rvCover;
    @BindView(R2.id.rl_cover)
    RelativeLayout rlCover;
    @BindView(R2.id.tb_main)
    TabLayout tbMain;
    @BindView(R2.id.vp_programs)
    ViewPager vpPrograms;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_fmprograms;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        ivBack.setOnClickListener(view -> onBackPressed());
        ivShare.setOnClickListener(view -> showShare());
        MyPagerAdapter pageAdapter = new MyPagerAdapter(getSupportFragmentManager(),
                new Fragment[]{new FMDetailFragment(),new ProgramsFragment(),new TuijianFragment()},
                new String[]{"简介","节目","推荐"});
        vpPrograms.setAdapter(pageAdapter);
        vpPrograms.setCurrentItem(1);
        vpPrograms.setOffscreenPageLimit(3);
        tbMain.setupWithViewPager(vpPrograms);
        Glide.with(this).load(R.mipmap.ic_local_fmdf_02).into(rvCover);
    }

    private MyShareFragment shareFragment;
    public void showShare(){
        if(shareFragment == null)
            shareFragment = new MyShareFragment();
        shareFragment.show(getSupportFragmentManager(),
                MyShareFragment.class.getSimpleName());
    }
}
