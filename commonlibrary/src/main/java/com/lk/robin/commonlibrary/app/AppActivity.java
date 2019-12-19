package com.lk.robin.commonlibrary.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lk.robin.commonlibrary.R;
import com.lk.robin.commonlibrary.tools.DpTool;

import java.util.List;

import butterknife.ButterKnife;

/**
 * @author wjunjie
 * @version 1.0
 */
public abstract class AppActivity extends AppCompatActivity {

    protected FrameLayout playBar;
    protected ARouter mRouter =ARouter.getInstance();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 在界面未初始化之前调用的初始化窗口
        initWidows();

        if (initArgs(getIntent().getExtras())) {
            // 得到界面Id并设置到Activity界面中
            int layId = getContentLayoutId();
            setContentView(layId);

            initBefore();
            initWidget();
            initData();
        } else {
            finish();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * 初始化控件调用之前
     */
    protected void initBefore() {

    }

    /**
     * 初始化窗口
     */
    protected void initWidows() {

    }

    /**
     * 初始化相关参数
     *
     * @param bundle 参数Bundle
     * @return 如果参数正确返回True，错误返回False
     */
    protected boolean initArgs(Bundle bundle) {
        return true;
    }

    /**
     * 得到当前界面的资源文件Id
     *
     * @return 资源文件Id
     */
    protected abstract int getContentLayoutId();

    /**
     * EventBus是否可用
     * @return Boolean
     */
//    protected abstract boolean isEventBusEnable();

    /**
     * 初始化控件
     */
    protected void initWidget() {
        playBar= (FrameLayout) LayoutInflater.from(this).inflate(R.layout.app_player_bottom_layout,null,false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DpTool.DpToPx(this, 60), DpTool.DpToPx(this, 60));
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;
        this.addContentView(playBar,layoutParams);
        ButterKnife.bind(this);
    }

    /**
     * 初始化数据
     */
    protected void initData() {

    }

    @Override
    public boolean onSupportNavigateUp() {
        // 当点击界面导航返回时，Finish当前界面
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        // 得到当前Activity下的所有Fragment
        @SuppressLint("RestrictedApi")
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        // 判断是否为空
        if (fragments != null && fragments.size() > 0) {
            for (Fragment fragment : fragments) {
                // 判断是否为我们能够处理的Fragment类型
                if (fragment instanceof AppFragment) {
                    // 判断是否拦截了返回按钮
                    if (((AppFragment) fragment).onBackPressed()) {
                        // 如果有直接Return
                        return;
                    }
                }
            }
        }

        super.onBackPressed();
        finish();
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    protected void onDestroy() {
//        if(isEventBusEnable())
        super.onDestroy();
    }

}
