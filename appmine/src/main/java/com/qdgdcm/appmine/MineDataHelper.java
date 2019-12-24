package com.qdgdcm.appmine;

import com.lk.robin.langlibrary.bean.ContentBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author: li xiao
 * created on: 2019/12/23
 */
public class MineDataHelper {
    /**
     * 下载/订阅
     */
    public static List<ContentBean> getDownLoadList() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.info = "从海量信息中，获取你最关心的财经资讯。";
        bean1.title = "财经早知道";
        bean1.resId = R.mipmap.ic_local_gxsc_01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.info = "头条新闻，给你不一样的新头条";
        bean2.title = "头条新闻";
        bean2.resId = R.mipmap.ic_local_gxsc_02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.info = "企业家们如何思考？";
        bean3.title = "新时代商业大考";
        bean3.resId = R.mipmap.ic_local_gxsc_03;
        list.add(bean3);
        return list;
    }

    /**
     * 收藏直播
     */
    public static List<ContentBean> getLiveHD() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 2;
        bean1.title = "【预告】智力比拼";
        bean1.resId = R.mipmap.ic_loacl_livehd01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 1;
        bean2.title = "学生代表在表演情景剧《希望的曙光》";
        bean2.resId = R.mipmap.ic_loacl_livehd02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "【现场】奶茶香飘满校园 民族文化代代传";
        bean3.resId = R.mipmap.ic_loacl_livehd03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 2;
        bean4.title = "第三届鄂尔多斯冰雪嘉年华开幕";
        bean4.resId = R.mipmap.ic_loacl_livehd05;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 2;
        bean5.title = "“普惠杯”职工羽毛球赛开赛";
        bean5.resId = R.mipmap.ic_loacl_livehd06;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 2;
        bean6.title = "【相约十四冬 魅力内蒙古】巧手剪纸迎“十四冬”";
        bean6.resId = R.mipmap.ic_loacl_livehd07;
        list.add(bean6);
        return list;
    }

    /**
     * 收藏电台
     */
    public static List<ContentBean> getCollectRadio() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.info = "正在直播：今日大盘解析";
        bean1.title = "财经早知道";
        bean1.resId = R.mipmap.ic_local_gxsc_01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.info = "正在直播：早间30分";
        bean2.title = "头条新闻";
        bean2.resId = R.mipmap.ic_local_gxsc_02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.info = "暂无节目单";
        bean3.title = "新时代商业大考";
        bean3.resId = R.mipmap.ic_local_gxsc_03;
        list.add(bean3);
        return list;
    }

    /**
     * 收藏单曲
     */
    public static List<ContentBean> getCollectDanqu() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.info = "十年 陈奕迅";
        bean1.title = "音乐早餐";
        bean1.resId = R.mipmap.ic_loacl_bibd_zb_4;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.info = "新鸳鸯蝴蝶梦 黄安";
        bean2.title = "经典之声";
        bean2.resId = R.mipmap.ic_loacl_jp_03;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.info = "爱河";
        bean3.title = "路边无名电台";
        bean3.resId = R.mipmap.ic_loacl_jp_01;
        list.add(bean3);
        return list;
    }
}
