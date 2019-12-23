package com.lk.robin.commonlibrary.tools;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

import com.lk.robin.commonlibrary.app.PictureShowActivity;

import java.util.ArrayList;

public class JsInteration {
    private Context context;

    public JsInteration(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void showImage(String url) {
        ArrayList<String> urlList =  new ArrayList<>();
        urlList.add(url);
        Intent intent = new Intent(context, PictureShowActivity.class);
        intent.putExtra(PictureShowActivity.TUPIANLIULAN,urlList);
        intent.putExtra(PictureShowActivity.TUPIANINDEX, 0);
        context.startActivity(intent);
    }
//    @JavascriptInterface
//    public void showImage(int position ,String url) {
//        ArrayList<String> urlList =  new ArrayList<String>();
//        urlList.add(url);
//        Intent intent = new Intent(context, BrowseBigImgActivity.class);
//        intent.putExtra(BrowseBigImgActivity.TUPIANLIULAN,urlList);
//        intent.putExtra(BrowseBigImgActivity.TUPIANINDEX, 0);
//        context.startActivity(intent);
//    }
}
