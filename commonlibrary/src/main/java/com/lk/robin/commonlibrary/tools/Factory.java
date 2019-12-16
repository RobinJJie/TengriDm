package com.lk.robin.commonlibrary.tools;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.lk.robin.commonlibrary.app.AppApplication;
import com.lk.robin.commonlibrary.config.BuildConfig;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author lubin
 * @version 1.0
 */
public class Factory {
    private static final Factory instance;
    private final Executor executor;
    private static Toast toast;
    private Factory() {
        executor = Executors.newFixedThreadPool(10);
    }

    static {
        instance = new Factory();
    }
    public static void toast(String msg) {
        toast(msg, Toast.LENGTH_SHORT);
    }

    public static void toast(String msg, int duration) {
        if (TextUtils.isEmpty(msg))return;
        toast = Toast.makeText(AppApplication.getInstance(), msg, duration);
        toast.show();
    }

    public static void LogE(String TAG, String msg) {
        if (!BuildConfig.DeBug|| TextUtils.isEmpty(msg)) return;
        Log.e(TAG, msg);
    }

    public static void LogD(String TAG, String msg) {
        if (!BuildConfig.DeBug|| TextUtils.isEmpty(msg)) return;
        Log.d(TAG, msg);
    }

    /**
     * 异步
     *
     * @param runnable
     */
    public static void runOnAsync(Runnable runnable) {
        instance.executor.execute(runnable);
    }

    public static AppApplication app(){
        return AppApplication.getInstance();
    }
    //提示音
    public static void startAlarm(Context context) {
        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        if (notification == null) return;
        Ringtone r = RingtoneManager.getRingtone(context, notification);
        r.play();
    }

}
