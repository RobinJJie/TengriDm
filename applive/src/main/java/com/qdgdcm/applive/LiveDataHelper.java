package com.qdgdcm.applive;

import com.lk.robin.commonlibrary.model.CommentBean;
import com.lk.robin.langlibrary.bean.ContentBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author: li xiao
 * created on: 2019/12/20
 */
public class LiveDataHelper {

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

    /**
     * 时政直播
     */
    public static List<CommentBean> getComment() {
        List<CommentBean> list = new ArrayList<>();
        CommentBean bean1 = new CommentBean("小艾","http://pic.qqtn.com/up/2019-11/201911131624402645.png",
                1576567266,"不忘初心牢记使命！",
                "http://img2.imgtn.bdimg.com/it/u=298595840,1368886200&fm=26&gp=0.jpg",
                "","");
        list.add(bean1);
        CommentBean bean2 = new CommentBean("奥斯陆","http://img5.imgtn.bdimg.com/it/u=3070585544,3060736657&fm=26&gp=0.jpg",
                1576969299,"千里之行始于足下",
                "",
                "http://ivi.bupt.edu.cn/hls/cctv1hd.m3u8","http://img4.imgtn.bdimg.com/it/u=1228662566,1255568936&fm=26&gp=0.jpg");
        list.add(bean2);
        CommentBean bean3 = new CommentBean("草上飞","http://img3.imgtn.bdimg.com/it/u=1453979179,1110909512&fm=11&gp=0.jpg",
                1576567266,"青岛啤酒节将澎湃着新时代青岛“开放、现代、活力、时尚”的城市基因，以利比里亚为起点，畅行“一带一路”沿线的新加坡、韩国、德国等15个国家。通过打造以“青岛啤酒节+城市推广+商旅文化”为主题的国际节会新模式，以响应国家“一带一路”倡议，为助力青岛打造“一带一路”国际合作新平台贡献力量。！",
                "http://www.cnr.cn/sd/ppsd/20191223/W020191223502488639736.jpg",
                "","");
        list.add(bean3);

        CommentBean bean4 = new CommentBean("不知名主播","http://img4.imgtn.bdimg.com/it/u=3926076932,4064187258&fm=26&gp=0.jpg",
                1576567266,"厉害了",
                "",
                "","");
        list.add(bean4);
        CommentBean bean5 = new CommentBean("路人甲","http://img0.imgtn.bdimg.com/it/u=639596538,2404307934&fm=11&gp=0.jpg",
                1576567266,"沙发！",
                "",
                "","");
        list.add(bean5);

        return list;
    }
}
