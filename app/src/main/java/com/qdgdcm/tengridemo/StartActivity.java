package com.qdgdcm.tengridemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.tools.TimerTool;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_main);

        //去除灰色遮罩
        //Android5.0以上
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//Android4.4以上,5.0以下
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }


//        ImageView imageView = findViewById(R.id.image);
//        Glide.with(this).load(R.mipmap.ic_app_start_page).into(imageView);
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
