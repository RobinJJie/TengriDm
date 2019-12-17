package com.qdgdcm.applive;


import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.app.FragmentPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = ConstantsRouter.Live.Live_Home)
public class LiveFragment extends FragmentPresenter {
    @BindView(R2.id.view_indicator)
    View indicator;
    @BindView(R2.id.txt_hd_zb)
    TextView txtHd;
    @BindView(R2.id.txt_sz_zb)
    TextView txtSz;

    public LiveFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_live;
    }

    /**
     * 指示器位置
     *
     * @param tab
     * @return
     */
    private AnimatorSet indicatorAnimator(TextView tab) {
        int tabWidth = tab.getMeasuredWidth() - indicator.getWidth();
        ObjectAnimator xAnimator = ObjectAnimator.ofFloat(indicator, "X", indicator.getX(), tab.getX() + (float) tabWidth / 2);

        final ViewGroup.LayoutParams params = indicator.getLayoutParams();
        ValueAnimator widthAnimator = ValueAnimator.ofInt(params.width, tab.getMeasuredWidth());
        widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
//                params.width = (int) animation.getAnimatedValue();
                indicator.setLayoutParams(params);
            }
        });

        AnimatorSet set = new AnimatorSet();
        set.setInterpolator(new FastOutSlowInInterpolator());
        set.playTogether(xAnimator, widthAnimator);

        return set;
    }

    private AnimatorSet indicatorTxt(TextView tab, float startSize, float endSize) {
        ValueAnimator widthAnimator = ValueAnimator.ofFloat(startSize, endSize);
        widthAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
//                params.width = (int) animation.getAnimatedValue();
                tab.setTextSize((float) animation.getAnimatedValue());
            }
        });

        AnimatorSet set = new AnimatorSet();
        set.setInterpolator(new FastOutSlowInInterpolator());
        set.setDuration(100);
        set.playTogether(widthAnimator);

        return set;
    }

    /**
     * 切换
     *
     * @param position position
     */
    private void setIndicator(int position) {
//        viewPager.setCurrentItem(position);
        if (position == 0) {
            indicatorTxt(txtHd, 12, 15).start();
            indicatorTxt(txtSz, 15, 12).start();
            txtHd.setTextColor(getResources().getColor(R.color.txtColorBlack));
            txtSz.setTextColor(getResources().getColor(R.color.txtColorGray));
            indicatorAnimator(txtHd).start();
        } else if (position == 1) {
            indicatorTxt(txtHd, 15, 12).start();
            indicatorTxt(txtSz, 12, 15).start();
            txtHd.setTextColor(getResources().getColor(R.color.txtColorGray));
            txtSz.setTextColor(getResources().getColor(R.color.txtColorBlack));
            indicatorAnimator(txtSz).start();
        }
    }


    @OnClick({R2.id.txt_hd_zb, R2.id.txt_sz_zb})
    void onTabClick(View v) {
        int id = v.getId();
        if (id == R.id.txt_hd_zb) {
            setIndicator(0);
        } else if (id == R.id.txt_sz_zb) {
            setIndicator(1);
        }
    }

    @Override
    protected BaseContract.Presenter initPersenter() {
        return null;
    }

    @Override
    protected void initData() {
        super.initData();

    }
}
