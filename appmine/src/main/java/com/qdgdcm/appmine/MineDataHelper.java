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
}
