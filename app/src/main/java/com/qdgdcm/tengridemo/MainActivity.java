package com.qdgdcm.tengridemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().build(ConstantsRouter.Home.HomeMainActivity).navigation();
    }
}
