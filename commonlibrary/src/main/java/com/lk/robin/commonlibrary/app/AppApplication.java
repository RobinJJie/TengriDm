package com.lk.robin.commonlibrary.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lk.robin.commonlibrary.tools.MyFMUtils;

/**
 * @author lubin
 * 全局application
 */
public class AppApplication extends Application {
    private static AppApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        ARouter.openDebug();
        ARouter.openLog();

        //路由初始化
        ARouter.init(this);

        //启动音频服务
        MyFMUtils.getInstance(this).startSingletonService();
    }

    public static AppApplication getInstance() {
        return instance;
    }
}
