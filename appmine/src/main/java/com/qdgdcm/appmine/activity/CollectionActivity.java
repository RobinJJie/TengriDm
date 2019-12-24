package com.qdgdcm.appmine.activity;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.widget.MyPagerAdapter;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;
import com.qdgdcm.appmine.fragment.CollectDanquFragment;
import com.qdgdcm.appmine.fragment.CollectLiveFragment;
import com.qdgdcm.appmine.fragment.CollectRadioFragment;
import butterknife.BindView;

public class CollectionActivity extends ActivityPresenter {

    @BindView(R2.id.iv_left)
    ImageView ivLeft;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tb_main)
    TabLayout tbMain;
    @BindView(R2.id.vp_collect)
    ViewPager vpCollect;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_collection;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        ivLeft.setOnClickListener(view -> onBackPressed());
        MyPagerAdapter pageAdapter = new MyPagerAdapter(getSupportFragmentManager(),
                new Fragment[]{new CollectLiveFragment(),new CollectRadioFragment(),new CollectDanquFragment()},
                new String[]{"现场","直播","单曲"});
        vpCollect.setAdapter(pageAdapter);
        tbMain.setupWithViewPager(vpCollect);
        tbMain.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
