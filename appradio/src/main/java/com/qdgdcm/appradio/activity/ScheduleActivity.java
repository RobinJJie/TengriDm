package com.qdgdcm.appradio.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.Factory;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import com.lk.robin.commonlibrary.widget.MyPagerAdapter;
import com.qdgdcm.appradio.fragment.ScheduleFragment;
import butterknife.BindView;
import butterknife.OnClick;

public class ScheduleActivity extends ActivityPresenter {

    @BindView(R2.id.iv_left)
    ImageView ivLeft;
    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.iv_right)
    ImageView ivRight;
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
        return R.layout.activity_schedule;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        String[] titles = new String[]{"12-10","12-11","12-12","12-13","12-14","昨天","今天","明天"};
        Fragment[] fragments = new Fragment[]{
                new ScheduleFragment(false),new ScheduleFragment(false),new ScheduleFragment(false),
                new ScheduleFragment(false),new ScheduleFragment(false),new ScheduleFragment(false),
                new ScheduleFragment(true),new ScheduleFragment(false)};
        MyPagerAdapter pageAdapter = new MyPagerAdapter(getSupportFragmentManager(),fragments,titles);
        vpPrograms.setAdapter(pageAdapter);
        vpPrograms.setCurrentItem(6);
        vpPrograms.setOffscreenPageLimit(3);
        tbMain.setupWithViewPager(vpPrograms);
    }

    @OnClick({R2.id.iv_left, R2.id.iv_right})
    void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_left) {
            onBackPressed();
        } else if (id == R.id.iv_right) {
            Factory.toast("选择日期");
        }
    }
}
