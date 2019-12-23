package com.qdgdcm.tengridemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.tools.TimerTool;

import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class StartActivity extends AppCompatActivity {

    private Disposable mDisposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);

        ImageView imageView=findViewById(R.id.image);
        Glide.with(this).load(R.mipmap.ic_app_start_page).into(imageView);

//        mDisposable = Flowable.intervalRange(0, 3, 0, 1, TimeUnit.SECONDS)
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnNext(aLong -> {
//                    //倒计时提醒
//                })
//                .doOnComplete(() -> {
//                    mDisposable.dispose();
//                    ARouter.getInstance().build(ConstantsRouter.Home.HomeMainActivity).navigation();
//                    finish();
//                })
//                .subscribe();

//
//        TimerTool timerTool=new TimerTool(2000,900);
//        timerTool.setOnTimer(new TimerTool.OnTimer() {
//            @Override
//            public void OnTick(long millisUntilFinished) {
//
//            }
//
//            @Override
//            public void OnFinish() {
//                ARouter.getInstance().build(ConstantsRouter.Home.HomeMainActivity).navigation();
//                finish();
//            }
//        });
//        timerTool.start();
        ARouter.getInstance().build(ConstantsRouter.Home.HomeMainActivity).navigation();
        finish();
    }
}
