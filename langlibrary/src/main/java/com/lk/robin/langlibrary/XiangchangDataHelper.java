package com.lk.robin.langlibrary;

import com.lk.robin.langlibrary.bean.ContentBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author: li xiao
 * created on: 2019/12/20
 */
public class XiangchangDataHelper {

    /**
     * 活动直播
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
     * 时政直播
     */
    public static List<ContentBean> getShizheng() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "【直播】第二届中国国际进口博览会开幕式";
        bean1.resId = R.mipmap.ic_local_shizheng01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "直播|“健康内蒙古我们在行动”全媒体报道启动仪式";
        bean2.resId = R.mipmap.ic_local_shizheng02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "直播|“庆丰收、颂祖国”——第二届全区农牧民文艺汇演";
        bean3.resId = R.mipmap.ic_local_shizheng03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "直播|“庆丰收、颂祖国”——第二届全区农牧民文艺汇演";
        bean4.resId = R.mipmap.ic_local_shizheng04;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "“直播|中蒙国际文化交流活动周开幕式晚会";
        bean5.resId = R.mipmap.ic_local_shizheng05;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "直播|好记者讲好故事”";
        bean6.resId = R.mipmap.ic_local_shizheng06;
        list.add(bean6);
        return list;
    }
}
