package com.lk.robin.commonlibrary.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

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

    }

    public static AppApplication getInstance() {
        return instance;
    }
}
