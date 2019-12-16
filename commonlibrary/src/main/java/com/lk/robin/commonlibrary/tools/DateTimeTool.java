package com.lk.robin.commonlibrary.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author lubin
 * @version 1.0
 */
public class DateTimeTool {

    /**
     * 毫秒
     *
     * @param time   时间戳 /毫秒
     * @param format
     * @return
     */
    public static String longToStr(long time, String format) {
        String timeStr;
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.CHINA);
        timeStr = dateFormat.format(new Date(time));
        return timeStr;
    }

    /**
     * 秒
     *
     * @param time   时间戳 /秒
     * @param format
     * @return
     */
    public static String longToStrSecond(long time, String format) {
        String timeStr;
        time = time * 1000;
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.CHINA);
        timeStr = dateFormat.format(new Date(time));
        return timeStr;
    }

    /**
     * @param time   时间字符串
     * @param format 格式
     * @return long /毫秒
     */
    public static long strToLong(String time, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
            return sdf.parse(time).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
