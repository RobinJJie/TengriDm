package com.qdgdcm.appmine.activity;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.qdgdcm.appmine.NewsItemFragment;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class NewsActivity extends ActivityPresenter {
    @BindView(R2.id.root_xtxx)
    View rootXtxx;
    @BindView(R2.id.root_tz)
    View rootTz;
    @BindView(R2.id.view_pager)
    ViewPager viewPager;
    @BindView(R2.id.ic_bm_top_back)
    View back;
    @BindView(R2.id.txt_bm_top_title)
    TextView txt;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_news;
    }

    public void setBar(int id) {
        rootXtxx.setSelected(id == R.id.root_xtxx);
        rootTz.setSelected(id == R.id.root_tz);
    }

    @Override
    protected void initData() {
        super.initData();
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(v -> finish());
        txt.setText("消息中心");
        list.add(new NewsItemFragment());
        list.add(new NewsItemFragment());

        viewPager.setAdapter(new FragAdapter(getSupportFragmentManager(), 0));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    setBar(R.id.root_xtxx);
                } else {
                    setBar(R.id.root_tz);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setBar(R.id.root_xtxx);
    }

    @OnClick(R2.id.root_xtxx)
    void Xtxx() {
        setBar(R.id.root_xtxx);
    }

    @OnClick(R2.id.root_tz)
    void tz() {
        setBar(R.id.root_tz);
    }

    private List<Fragment> list = new ArrayList<>();

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
