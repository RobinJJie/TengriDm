package com.lk.robin.commonlibrary.tools;

import android.content.Context;

/**
 * @author lubin
 * @version 1.0
 */
public class DpTool {
    /**
     * dp 转换 px
     *
     * @param context
     * @param dp
     * @return
     */
    public static int DpToPx(Context context, int dp) {
        return Math.round(context.getResources().getDisplayMetrics().density * dp);
    }

    /**
     * px 转换 dp
     *
     * @param context
     * @param px
     * @return
     */
    public static int PxToDp(Context context, int px) {
        return Math.round(px / context.getResources().getDisplayMetrics().density);
    }
}
