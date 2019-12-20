package com.qdgdcm.appradio.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.MyShareFragment;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.qdgdcm.appradio.FMDataHelper;
import com.qdgdcm.appradio.fragment.FMLiveFragment;
import com.qdgdcm.appradio.GalleryTransformer;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import com.qdgdcm.appradio.adapter.AlbumListAdapter;
import com.qdgdcm.appradio.adapter.FMLivePageAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class FMDetailActivity extends ActivityPresenter {

    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.rv_cover)
    RoundedImageView rvCover;
    @BindView(R2.id.vp_live)
    ViewPager vpLive;
    @BindView(R2.id.rv_list)
    RecyclerView rvList;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_fmdetail;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        List<Fragment> liveFragments = new ArrayList<>();
        Collections.addAll(liveFragments,FMLiveFragment.newInstance(0,false),
                FMLiveFragment.newInstance(1,false),
                FMLiveFragment.newInstance(2,true),
                FMLiveFragment.newInstance(3,false),
                FMLiveFragment.newInstance(4,false),
                FMLiveFragment.newInstance(5,false));
        FMLivePageAdapter pageAdapter = new FMLivePageAdapter(getSupportFragmentManager(),0,liveFragments);
        vpLive.setAdapter(pageAdapter);
        vpLive.setPageMargin(-40);
        vpLive.setPageTransformer(true,new GalleryTransformer());
        vpLive.setOffscreenPageLimit(3);
        vpLive.setCurrentItem(2);
        Glide.with(this).load(R.mipmap.ic_local_banner2).into(rvCover);
        AlbumListAdapter albumListAdapter = new AlbumListAdapter(this);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        rvList.setNestedScrollingEnabled(false);
        rvList.setAdapter(albumListAdapter);
        albumListAdapter.refresh(FMDataHelper.getXiangsheng());
        rvList.setFocusable(false);
    }

    @OnClick({R2.id.iv_left, R2.id.iv_right, R2.id.ll_programs})
    void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_left) {
            onBackPressed();
        } else if (id == R.id.iv_right) {
            showShare();
        } else if (id == R.id.ll_programs) {
            startActivity(new Intent(this,ScheduleActivity.class));
        }
    }

    private MyShareFragment shareFragment;
    public void showShare(){
        if(shareFragment == null)
            shareFragment = new MyShareFragment();
        shareFragment.show(getSupportFragmentManager(),
                MyShareFragment.class.getSimpleName());
    }
}
