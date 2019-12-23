package com.lk.robin.commonlibrary.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lk.robin.commonlibrary.R;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.StatusBarUtil;
import com.lk.robin.commonlibrary.widget.ViewPagerFixed;

import java.util.List;

public class PictureShowActivity extends ActivityPresenter implements View.OnClickListener, ViewPager.OnPageChangeListener {
    private TextView tvIndex;
    private List<String> imageList;

    //图片浏览
    public static final String TUPIANLIULAN = "tpll";
    public static final String TUPIANINDEX = "tpindex";

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_picture_show;
    } @Override
    protected void initWidget() {
        super.initWidget();
        try {
            StatusBarUtil.StatusBarDarkMode(this, true);
            RelativeLayout rlBack = findViewById(R.id.rl_back);
            ViewPagerFixed mViewPager = findViewById(R.id.mViewPager);
            tvIndex = findViewById(R.id.tv_index);
            rlBack.setOnClickListener(this);

            imageList = getIntent().getStringArrayListExtra(TUPIANLIULAN);
            int index = getIntent().getIntExtra(TUPIANINDEX, 0);
            tvIndex.setText(((index + 1) + "/" + imageList.size()));

            if (imageList != null && imageList.size() > 0) {
                mViewPager.setAdapter(new PictureShowAdapter(imageList, this));
                mViewPager.addOnPageChangeListener(this);
                mViewPager.setCurrentItem(index);
            }
        }catch (Exception e){
            Log.e("",e.toString());
        }
    }

    @Override
    protected boolean statusBarLightMode() {
        return false;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        String pos = ((position % imageList.size()) + 1) + "/" + imageList.size();
        tvIndex.setText(pos);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
        finish();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
