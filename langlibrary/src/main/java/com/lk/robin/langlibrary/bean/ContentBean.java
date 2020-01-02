package com.lk.robin.langlibrary.bean;

import androidx.annotation.IdRes;

import java.io.Serializable;

public class ContentBean implements Serializable {
    public String title;
    public String info;
    public String type;
    public int id;
    @IdRes
    public int resId;
    public String countRead;
    public String albumNum;
    public String ReadioMan;
    public String upDataTime;
    public String duration;

    public String playUrl;
}
