package com.lk.robin.commonlibrary.tools;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

public class MediaJsInterface extends JsInteration {

    private boolean isVoiceFloatPlaying = false;
    private Context mContext;

    public MediaJsInterface(Context context) {
        super(context);
        this.mContext = context;
    }

    @JavascriptInterface
    public void playVideo(String id) {
    }

    @JavascriptInterface
    public void pauseVideo(String id) {
    }

    @JavascriptInterface
    public void clickLink(String link) {
        if (!TextUtils.isEmpty(link)) {
//                String linkUrl = link + "?phone=" + Account.getPhone() + "&userId=" + Account.getId();
            Bundle bundle = new Bundle();
//                bundle.putString("url", linkUrl);
            bundle.putString("documentId", "0");
            bundle.putInt("isComment", 0);
            bundle.putInt("commentStatus", 0);
            bundle.putString("title", "详情");
            //IntentUtils.toNewsWebLinkActivity(NewsDetailActivity.this, bundle);
        }
    }
}