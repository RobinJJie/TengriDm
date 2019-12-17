package com.lk.robin.commonlibrary.tools;

import android.os.CountDownTimer;

/**
 * @author wjunjie
 * @version 1.0
 * @E-mail wang_junjie007@163.com
 * @company ZZYD
 * @createTime 2018/9/17 11:07
 * @类注释: 倒计时
 */
public class TimerTool extends CountDownTimer {
    private OnTimer timer;

    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public TimerTool(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }


    @Override
    public void onTick(long millisUntilFinished) {
        if (timer != null) {
            timer.OnTick(millisUntilFinished);
        }
    }

    @Override
    public void onFinish() {
        if (timer != null) {
            timer.OnFinish();
        }
    }

    public interface OnTimer {
        void OnTick(long millisUntilFinished);

        void OnFinish();
    }

    public void setOnTimer(OnTimer timer) {
        this.timer = timer;
    }

}
