package com.lk.robin.langlibrary;

import com.lk.robin.langlibrary.bean.ContentBean;

import java.util.ArrayList;
import java.util.List;

public class ZhuanJiDataHelper {

    public static final int LVYEZHISHENG = 1001;//绿野之声
    public static final int DALIAOGONGZHU = 1002;//大辽公主
    public static final int KONGFEIZHUAN = 1003;//孔飞传
    public static final int RILUOHEICHENG = 1004;//日落黑城
    public static final int PAJIECHUANQI = 1005;//琶杰传奇
    public static final int HONGLANGDU = 1006;//红狼毒
    public static final int YUANGU = 1007;//远古的呼唤
    public static final int ZHUIMENG = 1008;//追梦中原
    public static final int XUNLU = 1009;//驯鹿角上的丝带
    public static final int HUANGHE = 1010;//黄河那道弯
    public static final int BEIFANGJIAREN = 1011;//北方佳人

    public static List<ContentBean> getPlayList(int id){
        switch (id){
            case LVYEZHISHENG:
                return getLvYe();
            case DALIAOGONGZHU:
                return getDaliao();
            case KONGFEIZHUAN:
                return getKongfei();
            case RILUOHEICHENG:
                return getRiluo();
            case PAJIECHUANQI:
                return getPajie();
            case HONGLANGDU:
                return getHonglang();
            case YUANGU:
                return getYuangudehuhuan();
            case ZHUIMENG:
                return getZhuiMeng();
            case XUNLU:
                return getXunLu();
            case HUANGHE:
                return getHuanghe();
            default:
            case BEIFANGJIAREN:
                return getBeifang();
        }
    }

    public static List<ContentBean> getZhuanji() {
        List<ContentBean> list = new ArrayList<>();

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "大师相声精选";
        bean2.info = "说学逗唱精妙绝伦，吹棒嘲讽寓教育人。我们本着不是经典不选、不笑掉大牙不选、不让人回味无穷不选的原则，精选出马三立、侯宝林、刘宝瑞、马季等大师们呕心沥血的看家之作，为用户献上一段段百听不厌的相声好段子。";
        bean2.countRead = "32.9万";
        bean2.albumNum = "";
        bean2.ReadioMan = "小猪佩奇";
        bean2.duration = " 59:59";
        bean2.upDataTime = "2019-01-25";
        bean2.resId = R.mipmap.ic_local_zhuangji_01;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "《相声有新人》";
        bean3.info = "全国首档相声类综艺竞演节目。全国相声新人集结角逐，究竟谁将C位出道？";
        bean3.countRead = "32.9万";
        bean3.albumNum = "";
        bean3.ReadioMan = "小猪佩奇";
        bean3.duration = " 59:59";
        bean3.upDataTime = "2019-01-25";
        bean3.resId = R.mipmap.ic_local_zhuangji_02;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "京剧·于魁智专辑";
        bean4.info = "著名京剧老生演员，对京剧艺术执著追求，努力继承传统，不断开拓创新，形成自己严谨规范、忠于传统、清新流畅、自然洒脱的表演风格。";
        bean4.countRead = "32.9万";
        bean4.albumNum = "";
        bean4.ReadioMan = "小猪佩奇";
        bean4.duration = " 59:59";
        bean4.upDataTime = "2019-01-25";
        bean4.resId = R.mipmap.ic_local_zhuangji_03;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "马季相声典藏专辑";
        bean5.info = "马季，他是新相声的代表人物，近现代相声艺术承前继后的关键人物，继承发展了侯派风格，为中国相声做出了不可磨灭的贡献。";
        bean5.countRead = "32.9万";
        bean5.albumNum = "";
        bean5.ReadioMan = "小猪佩奇";
        bean5.duration = " 59:59";
        bean5.upDataTime = "2019-01-25";
        bean5.resId = R.mipmap.ic_local_zhuangji_04;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "京剧·张火丁专辑";
        bean6.info = "张火丁，女，1971年1月24日生于吉林省白城，汉族。国家一级演员，中国戏曲学院教授，文化部青联委员。著名京剧程派艺术家赵荣琛的关门弟子，属程派第三代传人。代表剧目有《荒山泪》《锁麟囊》《红鬃烈马》《春闺梦》《秋江》《北国红菇娘》《绝路问苍天》《江姐》等。";
        bean6.countRead = "32.9万";
        bean6.albumNum = "";
        bean6.ReadioMan = "小猪佩奇";
        bean6.duration = " 59:59";
        bean6.upDataTime = "2019-01-25";
        bean6.resId = R.mipmap.ic_local_zhuangji_05;
        list.add(bean6);

        ContentBean bean7 = new ContentBean();
        bean7.id = 0;
        bean7.title = "京剧·梅兰芳专辑";
        bean7.info = "梅兰芳八岁学艺，11岁登台。梅兰芳是近代杰出的京昆旦行演员，“四大名旦”之首，“梅派”艺术创始的人；同时也是享有国际盛誉的表演艺术大师，其表演被推为“世界三大表演体系”之一。";
        bean7.countRead = "32.9万";
        bean7.albumNum = "";
        bean7.ReadioMan = "小猪佩奇";
        bean7.duration = " 59:59";
        bean7.upDataTime = "2019-01-25";
        bean7.resId = R.mipmap.ic_local_zhuangji_06;
        list.add(bean7);

        return list;
    }

    /**
     * 单曲
     *
     * @return
     */
    public static List<ContentBean> getDanqu() {
        List<ContentBean> list = new ArrayList<>();

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "（节目）达尔文之旅—志达书店讲座";
        bean2.info = "科学史评话";
        bean2.countRead = " 4.6万";
        bean2.albumNum = "";
        bean2.ReadioMan = "小猪佩奇";
        bean2.duration = " 59:59";
        bean2.upDataTime = " 2天前";
        bean2.resId = R.mipmap.ic_local_danqu_01;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "永遇乐 落日熔金 李清照";
        bean3.info = "宋词鉴赏";
        bean3.countRead = "3.5万";
        bean3.albumNum = "";
        bean3.ReadioMan = "妍婷姝";
        bean3.duration = " 59:59";
        bean3.upDataTime = "2018-05-03";
        bean3.resId = R.mipmap.ic_local_danqu_02;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "鲁豫有约：彪悍的人生也需要解释";
        bean4.info = "罗永浩演讲精选";
        bean4.countRead = "79.0万";
        bean4.albumNum = "";
        bean4.ReadioMan = " 罗永浩";
        bean4.duration = " 59:59";
        bean4.upDataTime = "2019-01-25";
        bean4.resId = R.mipmap.ic_local_danqu_03;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "1225期：朱军 鲁豫 马东 十五年岁月流变";
        bean5.info = " 杨澜访谈录";
        bean5.countRead = "32.9万";
        bean5.albumNum = "";
        bean5.ReadioMan = "杨澜";
        bean5.duration = " 59:59";
        bean5.upDataTime = "2019-01-25";
        bean5.resId = R.mipmap.ic_local_danqu_04;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "非常静距离—张杰";
        bean6.info = "张杰专区";
        bean6.countRead = "19.9万";
        bean6.albumNum = "";
        bean6.ReadioMan = "小猪佩奇";
        bean6.duration = " 59:59";
        bean6.upDataTime = "2019-01-25";
        bean6.resId = R.mipmap.ic_local_danqu_05;
        list.add(bean6);

        ContentBean bean7 = new ContentBean();
        bean7.id = 0;
        bean7.title = "《声声相息》";
        bean7.info = " 四川文化艺术学院川文艺之声";
        bean7.countRead = "1959次";
        bean7.albumNum = "";
        bean7.ReadioMan = "小猪佩奇";
        bean7.duration = " 59:59";
        bean7.upDataTime = "2017-11-23";
        bean7.resId = R.mipmap.ic_local_danqu_06;
        list.add(bean7);

        return list;
    }


    /**
     * 驯鹿角上的彩带
     * @return
     */
    public static List<ContentBean> getXunLu(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "第01集";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/1.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "第02集";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/2.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "第03集";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/3.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "第04集";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/4.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "第05集";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/5.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "第06集";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/6.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "第07集";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/7.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "第08集";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/8.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "第09集";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/9.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "第10集";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/10.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "第11集";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/11.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "第12集";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/12.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "第13集";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/13.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "第14集";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/14.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "第15集";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/15.mp3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "第16集";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/16.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "第17集";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/17.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "第18集";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/18.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "第19集";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/19.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "第20集";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/20.mp3";list.add(bean20);
        ContentBean bean21=new ContentBean(); bean21.title = "第21集";bean21.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/21.mp3";list.add(bean21);
        ContentBean bean22=new ContentBean(); bean22.title = "第22集";bean22.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/22.mp3";list.add(bean22);
        ContentBean bean23=new ContentBean(); bean23.title = "第23集";bean23.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/23.mp3";list.add(bean23);
        ContentBean bean24=new ContentBean(); bean24.title = "第24集";bean24.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/24.mp3";list.add(bean24);
        ContentBean bean25=new ContentBean(); bean25.title = "第25集";bean25.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/25.mp3";list.add(bean25);
        ContentBean bean26=new ContentBean(); bean26.title = "第26集";bean26.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/26.mp3";list.add(bean26);
        ContentBean bean27=new ContentBean(); bean27.title = "第27集";bean27.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/27.mp3";list.add(bean27);
        ContentBean bean28=new ContentBean(); bean28.title = "第28集";bean28.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/28.mp3";list.add(bean28);
        ContentBean bean29=new ContentBean(); bean29.title = "第29集";bean29.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/29.mp3";list.add(bean29);
        ContentBean bean30=new ContentBean(); bean30.title = "第30集";bean30.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/30.mp3";list.add(bean30);
        ContentBean bean31=new ContentBean(); bean31.title = "第31集";bean31.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/31.mp3";list.add(bean31);
        ContentBean bean32=new ContentBean(); bean32.title = "第32集";bean32.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%A9%AF%E9%B9%BF%E8%A7%92%E4%B8%8A%E7%9A%84%E5%BD%A9%E5%B8%A6%E3%80%8B/32.mp3";list.add(bean32);
        return list;
    }

    /**
     * 日落黑城
     * @return
     */
    public static List<ContentBean> getRiluo(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "日落黑城 01";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%201.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "日落黑城 02";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%202.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "日落黑城 03";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%203.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "日落黑城 04";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%204.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "日落黑城 05";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%205.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "日落黑城 06";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%206.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "日落黑城 07";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%207.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "日落黑城 08";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%208.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "日落黑城 09";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%209.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "日落黑城 10";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%210.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "日落黑城 11";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%211.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "日落黑城 12";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%212.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "日落黑城 13";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%213.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "日落黑城 14";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%214.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "日落黑城 15";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%215.mp3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "日落黑城 16";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%216.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "日落黑城 17";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%217.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "日落黑城 18";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%218.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "日落黑城 19";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%219.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "日落黑城 20";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%E3%80%8B/%E6%97%A5%E8%90%BD%E9%BB%91%E5%9F%8E%20%220.mp3";list.add(bean20);
        return list;
    }

    /**
     * 黄河那道弯
     * @return
     */
    public static List<ContentBean> getHuanghe(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "第01集";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC1%E9%9B%86.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "第02集";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC2%E9%9B%86.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "第03集";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC3%E9%9B%86.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "第04集";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC4%E9%9B%86.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "第05集";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC5%E9%9B%86.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "第06集";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC6%E9%9B%86.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "第07集";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC7%E9%9B%86.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "第08集";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC8%E9%9B%86.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "第09集";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC9%E9%9B%86.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "第10集";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC10%E9%9B%86.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "第11集";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC11%E9%9B%86.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "第12集";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC12%E9%9B%86.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "第13集";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC13%E9%9B%86.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "第14集";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC14%E9%9B%86.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "第15集";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC15%E9%9B%86.mp3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "第16集";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC16%E9%9B%86.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "第17集";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC17%E9%9B%86.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "第18集";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC18%E9%9B%86.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "第19集";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC19%E9%9B%86.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "第20集";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC20%E9%9B%86.mp3";list.add(bean20);
        ContentBean bean21=new ContentBean(); bean21.title = "第21集";bean21.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC21%E9%9B%86.mp3";list.add(bean21);
        ContentBean bean22=new ContentBean(); bean22.title = "第22集";bean22.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC22%E9%9B%86.mp3";list.add(bean22);
        ContentBean bean23=new ContentBean(); bean23.title = "第23集";bean23.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC23%E9%9B%86.mp3";list.add(bean23);
        ContentBean bean24=new ContentBean(); bean24.title = "第24集";bean24.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC24%E9%9B%86.mp3";list.add(bean24);
        ContentBean bean25=new ContentBean(); bean25.title = "第25集";bean25.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC25%E9%9B%86.mp3";list.add(bean25);
        ContentBean bean26=new ContentBean(); bean26.title = "第26集";bean26.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC26%E9%9B%86.mp3";list.add(bean26);
        ContentBean bean27=new ContentBean(); bean27.title = "第27集";bean27.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC27%E9%9B%86.mp3";list.add(bean27);
        ContentBean bean28=new ContentBean(); bean28.title = "第28集";bean28.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC28%E9%9B%86.mp3";list.add(bean28);
        ContentBean bean29=new ContentBean(); bean29.title = "第29集";bean29.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC29%E9%9B%86.mp3";list.add(bean29);
        ContentBean bean30=new ContentBean(); bean30.title = "第30集";bean30.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC30%E9%9B%86.mp3";list.add(bean30);
        ContentBean bean31=new ContentBean(); bean31.title = "第31集";bean31.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC31%E9%9B%86.mp3";list.add(bean31);
        ContentBean bean32=new ContentBean(); bean32.title = "第32集";bean32.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC32%E9%9B%86.mp3";list.add(bean32);
        ContentBean bean33=new ContentBean(); bean33.title = "第33集";bean33.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC33%E9%9B%86.mp3";list.add(bean33);
        ContentBean bean34=new ContentBean(); bean34.title = "第34集";bean34.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC34%E9%9B%86.mp3";list.add(bean34);
        ContentBean bean35=new ContentBean(); bean35.title = "第35集";bean35.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC35%E9%9B%86.mp3";list.add(bean35);
        ContentBean bean36=new ContentBean(); bean36.title = "第36集";bean36.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC36%E9%9B%86.mp3";list.add(bean36);
        ContentBean bean37=new ContentBean(); bean37.title = "第37集";bean37.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC37%E9%9B%86.mp3";list.add(bean37);
        ContentBean bean38=new ContentBean(); bean38.title = "第38集";bean38.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC38%E9%9B%86.mp3";list.add(bean38);
        ContentBean bean39=new ContentBean(); bean39.title = "第39集";bean39.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC39%E9%9B%86.mp3";list.add(bean39);
        ContentBean bean40=new ContentBean(); bean40.title = "第40集";bean40.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC40%E9%9B%86.mp3";list.add(bean40);
        ContentBean bean41=new ContentBean(); bean41.title = "第41集";bean41.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC41%E9%9B%86.mp3";list.add(bean41);
        ContentBean bean42=new ContentBean(); bean42.title = "第42集";bean42.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC42%E9%9B%86.mp3";list.add(bean42);
        ContentBean bean43=new ContentBean(); bean43.title = "第43集";bean43.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E9%BB%84%E6%B2%B3%E9%82%A3%E9%81%93%E5%BC%AF%E3%80%8B/%E7%AC%AC43%E9%9B%86.mp3";list.add(bean43);
        return list;
    }


    /**
     * 绿野之声
     * @return
     */
    public static List<ContentBean> getLvYe(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title ="《宁舍一顿饭，不舍二人转》";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E3%80%8A%E5%AE%81%E8%88%8D%E4%B8%80%E9%A1%BF%E9%A5%AD%EF%BC%8C%E4%B8%8D%E8%88%8D%E4%BA%8C%E4%BA%BA%E8%BD%AC%E3%80%8B.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title ="一座城市的末班车";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E4%B8%80%E5%BA%A7%E5%9F%8E%E5%B8%82%E7%9A%84%E6%9C%AB%E7%8F%AD%E8%BD%A6.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title ="他的歌希望你听不懂";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E4%BB%96%E7%9A%84%E6%AD%8C%E5%B8%8C%E6%9C%9B%E4%BD%A0%E5%90%AC%E4%B8%8D%E6%87%82.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title ="你孤独吗？不，你只是懒";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E4%BD%A0%E5%AD%A4%E7%8B%AC%E5%90%97%EF%BC%9F%E4%B8%8D%EF%BC%8C%E4%BD%A0%E5%8F%AA%E6%98%AF%E6%87%92.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title ="卸下伪装 肆意生长";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%8D%B8%E4%B8%8B%E4%BC%AA%E8%A3%85%20%E8%82%86%E6%84%8F%E7%94%9F%E9%95%BF.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title ="压力大坚持不下去我该怎么办";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%8E%8B%E5%8A%9B%E5%A4%A7%E5%9D%9A%E6%8C%81%E4%B8%8D%E4%B8%8B%E5%8E%BB%E6%88%91%E8%AF%A5%E6%80%8E%E4%B9%88%E5%8A%9E%EF%BC%9F.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title ="夜晚我变成了诗人";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%A4%9C%E6%99%9A%E6%88%91%E5%8F%98%E6%88%90%E4%BA%86%E8%AF%97%E4%BA%BA.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title ="崩溃与自愈";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%B4%A9%E6%BA%83%E4%B8%8E%E8%87%AA%E6%84%88.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title ="往事清零 岁月可期";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%BE%80%E4%BA%8B%E6%B8%85%E9%9B%B6%20%E5%B2%81%E6%9C%88%E5%8F%AF%E6%9C%9F.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title ="愿世间美好与你环环相扣";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%84%BF%E4%B8%96%E9%97%B4%E7%BE%8E%E5%A5%BD%E4%B8%8E%E4%BD%A0%E7%8E%AF%E7%8E%AF%E7%9B%B8%E6%89%A3.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title ="戏里戏外《喜上喜》.mp3";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%8F%E9%87%8C%E6%88%8F%E5%A4%96%E3%80%8A%E5%96%9C%E4%B8%8A%E5%96%9C%E3%80%8B.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title ="成熟的生存 幼稚的生活.m";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%90%E7%86%9F%E7%9A%84%E7%94%9F%E5%AD%98%20%E5%B9%BC%E7%A8%9A%E7%9A%84%E7%94%9F%E6%B4%BB.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title ="我们始终要学会告别";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%91%E4%BB%AC%E5%A7%8B%E7%BB%88%E8%A6%81%E5%AD%A6%E4%BC%9A%E5%91%8A%E5%88%AB.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title ="我们记住的样子才是我们活过";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%91%E4%BB%AC%E8%AE%B0%E4%BD%8F%E7%9A%84%E6%A0%B7%E5%AD%90%E6%89%8D%E6%98%AF%E6%88%91%E4%BB%AC%E6%B4%BB%E8%BF%87%E7%9A%84%E6%A0%B7%E5%AD%90.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title ="我曾经那么渴望热闹";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%91%E6%9B%BE%E7%BB%8F%E9%82%A3%E4%B9%88%E6%B8%B4%E6%9C%9B%E7%83%AD%E9%97%B9.MP3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title ="戒掉情绪的你更优秀了吗？";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%92%E6%8E%89%E6%83%85%E7%BB%AA%E7%9A%84%E4%BD%A0%E6%9B%B4%E4%BC%98%E7%A7%80%E4%BA%86%E5%90%97%EF%BC%9F.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title ="日子苦涩 逃避有效.mp3";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%97%A5%E5%AD%90%E8%8B%A6%E6%B6%A9%20%E9%80%83%E9%81%BF%E6%9C%89%E6%95%88.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title ="是的，我从不擅长告别";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%98%AF%E7%9A%84%EF%BC%8C%E6%88%91%E4%BB%8E%E4%B8%8D%E6%93%85%E9%95%BF%E5%91%8A%E5%88%AB.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title ="曾经的约定实现了吗？";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%9B%BE%E7%BB%8F%E7%9A%84%E7%BA%A6%E5%AE%9A%E5%AE%9E%E7%8E%B0%E4%BA%86%E5%90%97%EF%BC%9F.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title ="爱过的人不曾真的离去";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E7%88%B1%E8%BF%87%E7%9A%84%E4%BA%BA%E4%B8%8D%E6%9B%BE%E7%9C%9F%E7%9A%84%E7%A6%BB%E5%8E%BB.mp3";list.add(bean20);
        ContentBean bean21=new ContentBean(); bean21.title ="玉米秸秆制作饲料技术";bean21.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E7%8E%89%E7%B1%B3%E7%A7%B8%E7%A7%86%E5%88%B6%E4%BD%9C%E9%A5%B2%E6%96%99%E6%8A%80%E6%9C%AF.mp3";list.add(bean21);
        ContentBean bean22=new ContentBean(); bean22.title ="生活那么难，谢谢你的出现.";bean22.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E7%94%9F%E6%B4%BB%E9%82%A3%E4%B9%88%E9%9A%BE%EF%BC%8C%E8%B0%A2%E8%B0%A2%E4%BD%A0%E7%9A%84%E5%87%BA%E7%8E%B0.mp3";list.add(bean22);
        ContentBean bean23=new ContentBean(); bean23.title ="相逢的人会再相逢";bean23.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E7%9B%B8%E9%80%A2%E7%9A%84%E4%BA%BA%E4%BC%9A%E5%86%8D%E7%9B%B8%E9%80%A2.mp3";list.add(bean23);
        ContentBean bean24=new ContentBean(); bean24.title ="秋日阳光斑驳";bean24.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E7%A7%8B%E6%97%A5%E9%98%B3%E5%85%89%E6%96%91%E9%A9%B3.mp3";list.add(bean24);
        ContentBean bean25=new ContentBean(); bean25.title ="羊微量元素缺乏症";bean25.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E7%BE%8A%E5%BE%AE%E9%87%8F%E5%85%83%E7%B4%A0%E7%BC%BA%E4%B9%8F%E7%97%87.MP3";list.add(bean25);
        ContentBean bean26=new ContentBean(); bean26.title ="肉羊品种介绍";bean26.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E8%82%89%E7%BE%8A%E5%93%81%E7%A7%8D%E4%BB%8B%E7%BB%8D.MP3";list.add(bean26);
        ContentBean bean27=new ContentBean(); bean27.title ="谢谢你，成为我的朋友";bean27.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E8%B0%A2%E8%B0%A2%E4%BD%A0%EF%BC%8C%E6%88%90%E4%B8%BA%E6%88%91%E7%9A%84%E6%9C%8B%E5%8F%8B.MP3";list.add(bean27);
        ContentBean bean28=new ContentBean(); bean28.title ="越难越要自己撑过去";bean28.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E8%B6%8A%E9%9A%BE%E8%B6%8A%E8%A6%81%E8%87%AA%E5%B7%B1%E6%92%91%E8%BF%87%E5%8E%BB.mp3";list.add(bean28);
        ContentBean bean29=new ContentBean(); bean29.title ="这个城市的孤独，一直在那里";bean29.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E8%BF%99%E4%B8%AA%E5%9F%8E%E5%B8%82%E7%9A%84%E5%AD%A4%E7%8B%AC%EF%BC%8C%E4%B8%80%E7%9B%B4%E5%9C%A8%E9%82%A3%E9%87%8C.mp3";list.add(bean29);
        return list;
    }

    /**
     * 大辽公主
     * @return
     */
    public static List<ContentBean> getDaliao(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "第01集";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC1%E9%9B%86.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "第02集";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC2%E9%9B%86.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "第03集";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC3%E9%9B%86.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "第04集";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC4%E9%9B%86.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "第05集";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC5%E9%9B%86.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "第06集";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC6%E9%9B%86.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "第07集";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC7%E9%9B%86.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "第08集";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC8%E9%9B%86.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "第09集";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC9%E9%9B%86.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "第10集";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC10%E9%9B%86.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "第11集";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC11%E9%9B%86.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "第12集";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC12%E9%9B%86.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "第13集";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC13%E9%9B%86.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "第14集";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC14%E9%9B%86.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "第15集";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC15%E9%9B%86.mp3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "第16集";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC16%E9%9B%86.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "第17集";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC17%E9%9B%86.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "第18集";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC18%E9%9B%86.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "第19集";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC19%E9%9B%86.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "第20集";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%A4%A7%E8%BE%BD%E5%85%AC%E4%B8%BB%E3%80%8B/%E7%AC%AC20%E9%9B%86.mp3";list.add(bean20);
        return list;
    }

    /**
     * 孔飞传
     * @return
     */
    public static List<ContentBean> getKongfei(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "孔飞01";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E1.wma";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "孔飞02";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E2.wma";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "孔飞03";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E3.wma";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "孔飞04";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E4.wma";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "孔飞05";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E5.wma";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "孔飞06";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E6.wma";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "孔飞07";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E7.wma";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "孔飞08";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E8.wma";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "孔飞09";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E9.wma";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "孔飞10";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E10.wma";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "孔飞11";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E11.wma";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "孔飞12";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E12.wma";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "孔飞13";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E13.wma";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "孔飞14";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E14.wma";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "孔飞15";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E15.wma";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "孔飞16";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E16.wma";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "孔飞17";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E17.wma";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "孔飞18";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E18.wma";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "孔飞19";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E19.wma";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "孔飞20";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E20.wma";list.add(bean20);
        ContentBean bean21=new ContentBean(); bean21.title = "孔飞21";bean21.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E21.wma";list.add(bean21);
        ContentBean bean22=new ContentBean(); bean22.title = "孔飞22";bean22.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E22.wma";list.add(bean22);
        ContentBean bean23=new ContentBean(); bean23.title = "孔飞23";bean23.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E23.wma";list.add(bean23);
        ContentBean bean24=new ContentBean(); bean24.title = "孔飞24";bean24.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E24.wma";list.add(bean24);
        ContentBean bean25=new ContentBean(); bean25.title = "孔飞25";bean25.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E25.wma";list.add(bean25);
        ContentBean bean26=new ContentBean(); bean26.title = "孔飞26";bean26.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E26.wma";list.add(bean26);
        ContentBean bean27=new ContentBean(); bean27.title = "孔飞27";bean27.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E27.wma";list.add(bean27);
        ContentBean bean28=new ContentBean(); bean28.title = "孔飞28";bean28.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E28.wma";list.add(bean28);
        ContentBean bean29=new ContentBean(); bean29.title = "孔飞29";bean29.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E29.wma";list.add(bean29);
        ContentBean bean30=new ContentBean(); bean30.title = "孔飞30";bean30.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E30.wma";list.add(bean30);
        ContentBean bean31=new ContentBean(); bean31.title = "孔飞31";bean31.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E31.wma";list.add(bean31);
        ContentBean bean32=new ContentBean(); bean32.title = "孔飞32";bean32.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E32.wma";list.add(bean32);
        ContentBean bean33=new ContentBean(); bean33.title = "孔飞33";bean33.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E33.wma";list.add(bean33);
        ContentBean bean34=new ContentBean(); bean34.title = "孔飞34";bean34.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E34.wma";list.add(bean34);
        ContentBean bean35=new ContentBean(); bean35.title = "孔飞35";bean35.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E35.wma";list.add(bean35);
        ContentBean bean36=new ContentBean(); bean36.title = "孔飞36";bean36.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E36.wma";list.add(bean36);
        ContentBean bean37=new ContentBean(); bean37.title = "孔飞37";bean37.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E37.wma";list.add(bean37);
        ContentBean bean38=new ContentBean(); bean38.title = "孔飞38";bean38.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E38.wma";list.add(bean38);
        ContentBean bean39=new ContentBean(); bean39.title = "孔飞39";bean39.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E39.wma";list.add(bean39);
        ContentBean bean40=new ContentBean(); bean40.title = "孔飞40";bean40.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E40.wma";list.add(bean40);
        ContentBean bean41=new ContentBean(); bean41.title = "孔飞41";bean41.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E41.wma";list.add(bean41);
        ContentBean bean42=new ContentBean(); bean42.title = "孔飞42";bean42.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E42.wma";list.add(bean42);
        ContentBean bean43=new ContentBean(); bean43.title = "孔飞43";bean43.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E5%AD%94%E9%A3%9E%E4%BC%A0%E3%80%8B/%E5%AD%94%E9%A3%9E43.wma";list.add(bean43);
        return list;
    }

    /**
     * 琶杰传奇
     * @return
     */
    public static List<ContentBean> getPajie(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "第01集";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/1.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "第02集";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/2.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "第03集";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/3.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "第04集";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/4.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "第05集";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/5.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "第06集";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/6.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "第07集";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/7.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "第08集";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/8.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "第09集";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/9.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "第10集";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/10.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "第11集";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/11.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "第12集";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/12.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "第13集";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/13.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "第14集";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/14.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "第15集";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/15.mp3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "第16集";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/16.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "第17集";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/17.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "第18集";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/18.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "第19集";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/19.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "第20集";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/20.mp3";list.add(bean20);
        ContentBean bean21=new ContentBean(); bean21.title = "第21集";bean21.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/21.mp3";list.add(bean21);
        ContentBean bean22=new ContentBean(); bean22.title = "第22集";bean22.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/22.mp3";list.add(bean22);
        ContentBean bean23=new ContentBean(); bean23.title = "第23集";bean23.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/23.mp3";list.add(bean23);
        ContentBean bean24=new ContentBean(); bean24.title = "第24集";bean24.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/24.mp3";list.add(bean24);
        ContentBean bean25=new ContentBean(); bean25.title = "第25集";bean25.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/25.mp3";list.add(bean25);
        ContentBean bean26=new ContentBean(); bean26.title = "第26集";bean26.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/26.mp3";list.add(bean26);
        ContentBean bean27=new ContentBean(); bean27.title = "第27集";bean27.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/27.mp3";list.add(bean27);
        ContentBean bean28=new ContentBean(); bean28.title = "第28集";bean28.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/28.mp3";list.add(bean28);
        ContentBean bean29=new ContentBean(); bean29.title = "第29集";bean29.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/29.mp3";list.add(bean29);
        ContentBean bean30=new ContentBean(); bean30.title = "第30集";bean30.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/30.mp3";list.add(bean30);
        ContentBean bean31=new ContentBean(); bean31.title = "第31集";bean31.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/31.mp3";list.add(bean31);
        ContentBean bean32=new ContentBean(); bean32.title = "第32集";bean32.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/32.mp3";list.add(bean32);
        ContentBean bean33=new ContentBean(); bean33.title = "第33集";bean33.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/33.mp3";list.add(bean33);
        ContentBean bean34=new ContentBean(); bean34.title = "第34集";bean34.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/34.mp3";list.add(bean34);
        ContentBean bean35=new ContentBean(); bean35.title = "第35集";bean35.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/35.mp3";list.add(bean35);
        ContentBean bean36=new ContentBean(); bean36.title = "第36集";bean36.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/36.mp3";list.add(bean36);
        ContentBean bean37=new ContentBean(); bean37.title = "第37集";bean37.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/37.mp3";list.add(bean37);
        ContentBean bean38=new ContentBean(); bean38.title = "第38集";bean38.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/38.mp3";list.add(bean38);
        ContentBean bean39=new ContentBean(); bean39.title = "第39集";bean39.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/39.mp3";list.add(bean39);
        ContentBean bean40=new ContentBean(); bean40.title = "第40集";bean40.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/40.mp3";list.add(bean40);
        ContentBean bean41=new ContentBean(); bean41.title = "第41集";bean41.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/41.mp3";list.add(bean41);
        ContentBean bean42=new ContentBean(); bean42.title = "第42集";bean42.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/42.mp3";list.add(bean42);
        ContentBean bean43=new ContentBean(); bean43.title = "第43集";bean43.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/43.mp3";list.add(bean43);
        ContentBean bean44=new ContentBean(); bean44.title = "第44集";bean44.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/44.mp3";list.add(bean44);
        ContentBean bean45=new ContentBean(); bean45.title = "第45集";bean45.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/45.mp3";list.add(bean45);
        ContentBean bean46=new ContentBean(); bean46.title = "第46集";bean46.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/46.mp3";list.add(bean46);
        ContentBean bean47=new ContentBean(); bean47.title = "第47集";bean47.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/47.mp3";list.add(bean47);
        ContentBean bean48=new ContentBean(); bean48.title = "第48集";bean48.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/48.mp3";list.add(bean48);
        ContentBean bean49=new ContentBean(); bean49.title = "第49集";bean49.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/49.mp3";list.add(bean49);
        ContentBean bean50=new ContentBean(); bean50.title = "第50集";bean50.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/50.mp3";list.add(bean50);
        ContentBean bean51=new ContentBean(); bean51.title = "第51集";bean51.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/51.mp3";list.add(bean51);
        ContentBean bean52=new ContentBean(); bean52.title = "第52集";bean52.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/52.mp3";list.add(bean52);
        ContentBean bean53=new ContentBean(); bean53.title = "第53集";bean53.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/53.mp3";list.add(bean53);
        ContentBean bean54=new ContentBean(); bean54.title = "第54集";bean54.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/54.mp3";list.add(bean54);
        ContentBean bean55=new ContentBean(); bean55.title = "第55集";bean55.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/55.mp3";list.add(bean55);
        ContentBean bean56=new ContentBean(); bean56.title = "第56集";bean56.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%90%B6%E6%9D%B0%E4%BC%A0%E5%A5%87%E3%80%8B/56.mp3";list.add(bean56);
        return list;
    }

    /**
     * 红狼毒
     * @return
     */
    public static List<ContentBean> getHonglang(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "红狼毒01";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%921.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "红狼毒02";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%922.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "红狼毒03";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%923.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "红狼毒04";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%924.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "红狼毒05";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%925.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "红狼毒06";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%926.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "红狼毒07";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%927.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "红狼毒08";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%928.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "红狼毒09";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%929.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "红狼毒10";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9210.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "红狼毒11";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9211.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "红狼毒12";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9212.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "红狼毒13";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9213.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "红狼毒14";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9214.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "红狼毒15";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9215.mp3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "红狼毒16";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9216.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "红狼毒17";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9217.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "红狼毒18";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9218.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "红狼毒19";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9219.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "红狼毒20";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9220.mp3";list.add(bean20);
        ContentBean bean21=new ContentBean(); bean21.title = "红狼毒21";bean21.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9221.mp3";list.add(bean21);
        ContentBean bean22=new ContentBean(); bean22.title = "红狼毒22";bean22.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9222.mp3";list.add(bean22);
        ContentBean bean23=new ContentBean(); bean23.title = "红狼毒23";bean23.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9223.mp3";list.add(bean23);
        ContentBean bean24=new ContentBean(); bean24.title = "红狼毒24";bean24.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9224.mp3";list.add(bean24);
        ContentBean bean25=new ContentBean(); bean25.title = "红狼毒25";bean25.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9225.mp3";list.add(bean25);
        ContentBean bean26=new ContentBean(); bean26.title = "红狼毒26";bean26.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9226.mp3";list.add(bean26);
        ContentBean bean27=new ContentBean(); bean27.title = "红狼毒27";bean27.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9227.mp3";list.add(bean27);
        ContentBean bean28=new ContentBean(); bean28.title = "红狼毒28";bean28.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9228.mp3";list.add(bean28);
        ContentBean bean29=new ContentBean(); bean29.title = "红狼毒29";bean29.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9229.mp3";list.add(bean29);
        ContentBean bean30=new ContentBean(); bean30.title = "红狼毒30";bean30.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9230.mp3";list.add(bean30);
        ContentBean bean31=new ContentBean(); bean31.title = "红狼毒31";bean31.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9231.mp3";list.add(bean31);
        ContentBean bean32=new ContentBean(); bean32.title = "红狼毒32";bean32.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9232.mp3";list.add(bean32);
        ContentBean bean33=new ContentBean(); bean33.title = "红狼毒33";bean33.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9233.mp3";list.add(bean33);
        ContentBean bean34=new ContentBean(); bean34.title = "红狼毒34";bean34.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9234.mp3";list.add(bean34);
        ContentBean bean35=new ContentBean(); bean35.title = "红狼毒35";bean35.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9235.mp3";list.add(bean35);
        ContentBean bean36=new ContentBean(); bean36.title = "红狼毒36";bean36.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9236.mp3";list.add(bean36);
        ContentBean bean37=new ContentBean(); bean37.title = "红狼毒37";bean37.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9237.mp3";list.add(bean37);
        ContentBean bean38=new ContentBean(); bean38.title = "红狼毒38";bean38.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9238.mp3";list.add(bean38);
        ContentBean bean39=new ContentBean(); bean39.title = "红狼毒39";bean39.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9239.mp3";list.add(bean39);
        ContentBean bean40=new ContentBean(); bean40.title = "红狼毒40";bean40.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9240.mp3";list.add(bean40);
        ContentBean bean41=new ContentBean(); bean41.title = "红狼毒41";bean41.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9241.mp3";list.add(bean41);
        ContentBean bean42=new ContentBean(); bean42.title = "红狼毒42";bean42.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9242.mp3";list.add(bean42);
        ContentBean bean43=new ContentBean(); bean43.title = "红狼毒43";bean43.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9243.mp3";list.add(bean43);
        ContentBean bean44=new ContentBean(); bean44.title = "红狼毒44";bean44.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9244.mp3";list.add(bean44);
        ContentBean bean45=new ContentBean(); bean45.title = "红狼毒45";bean45.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9245.mp3";list.add(bean45);
        ContentBean bean46=new ContentBean(); bean46.title = "红狼毒46";bean46.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9246.mp3";list.add(bean46);
        ContentBean bean47=new ContentBean(); bean47.title = "红狼毒47";bean47.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9247.mp3";list.add(bean47);
        ContentBean bean48=new ContentBean(); bean48.title = "红狼毒48";bean48.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9248.mp3";list.add(bean48);
        ContentBean bean49=new ContentBean(); bean49.title = "红狼毒49";bean49.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9249.mp3";list.add(bean49);
        ContentBean bean50=new ContentBean(); bean50.title = "红狼毒50";bean50.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9250.mp3";list.add(bean50);
        ContentBean bean51=new ContentBean(); bean51.title = "红狼毒51";bean51.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9251.mp3";list.add(bean51);
        ContentBean bean52=new ContentBean(); bean52.title = "红狼毒52";bean52.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9252.mp3";list.add(bean52);
        ContentBean bean53=new ContentBean(); bean53.title = "红狼毒53";bean53.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9253.mp3";list.add(bean53);
        ContentBean bean54=new ContentBean(); bean54.title = "红狼毒54";bean54.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9254.mp3";list.add(bean54);
        ContentBean bean55=new ContentBean(); bean55.title = "红狼毒55";bean55.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9255.mp3";list.add(bean55);
        ContentBean bean56=new ContentBean(); bean56.title = "红狼毒56";bean56.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9256.mp3";list.add(bean56);
        ContentBean bean57=new ContentBean(); bean57.title = "红狼毒57";bean57.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9257.mp3";list.add(bean57);
        ContentBean bean58=new ContentBean(); bean58.title = "红狼毒58";bean58.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9258.mp3";list.add(bean58);
        ContentBean bean59=new ContentBean(); bean59.title = "红狼毒59";bean59.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9259.mp3";list.add(bean59);
        ContentBean bean60=new ContentBean(); bean60.title = "红狼毒60";bean60.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9260.mp3";list.add(bean60);
        ContentBean bean61=new ContentBean(); bean61.title = "红狼毒61";bean61.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9261.mp3";list.add(bean61);
        ContentBean bean62=new ContentBean(); bean62.title = "红狼毒62";bean62.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9262.mp3";list.add(bean62);
        ContentBean bean63=new ContentBean(); bean63.title = "红狼毒63";bean63.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9263.mp3";list.add(bean63);
        ContentBean bean64=new ContentBean(); bean64.title = "红狼毒64";bean64.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9264.mp3";list.add(bean64);
        ContentBean bean65=new ContentBean(); bean65.title = "红狼毒65";bean65.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9265.mp3";list.add(bean65);
        ContentBean bean66=new ContentBean(); bean66.title = "红狼毒66";bean66.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9266.mp3";list.add(bean66);
        ContentBean bean67=new ContentBean(); bean67.title = "红狼毒67";bean67.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9267.mp3";list.add(bean67);
        ContentBean bean68=new ContentBean(); bean68.title = "红狼毒68";bean68.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9268.mp3";list.add(bean68);
        ContentBean bean69=new ContentBean(); bean69.title = "红狼毒69";bean69.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9269.mp3";list.add(bean69);
        ContentBean bean70=new ContentBean(); bean70.title = "红狼毒70";bean70.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9270.mp3";list.add(bean70);
        ContentBean bean71=new ContentBean(); bean71.title = "红狼毒71";bean71.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9271.mp3";list.add(bean71);
        ContentBean bean72=new ContentBean(); bean72.title = "红狼毒72";bean72.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9272.mp3";list.add(bean72);
        ContentBean bean73=new ContentBean(); bean73.title = "红狼毒73";bean73.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9273.mp3";list.add(bean73);
        ContentBean bean74=new ContentBean(); bean74.title = "红狼毒74";bean74.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9274.mp3";list.add(bean74);
        ContentBean bean75=new ContentBean(); bean75.title = "红狼毒75";bean75.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9275.mp3";list.add(bean75);
        ContentBean bean76=new ContentBean(); bean76.title = "红狼毒76";bean76.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9276.mp3";list.add(bean76);
        ContentBean bean77=new ContentBean(); bean77.title = "红狼毒77";bean77.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9277.mp3";list.add(bean77);
        ContentBean bean78=new ContentBean(); bean78.title = "红狼毒78";bean78.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9278.mp3";list.add(bean78);
        ContentBean bean79=new ContentBean(); bean79.title = "红狼毒79";bean79.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9279.mp3";list.add(bean79);
        ContentBean bean80=new ContentBean(); bean80.title = "红狼毒80";bean80.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9280.mp3";list.add(bean80);
        ContentBean bean81=new ContentBean(); bean81.title = "红狼毒81";bean81.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9281.mp3";list.add(bean81);
        ContentBean bean82=new ContentBean(); bean82.title = "红狼毒82";bean82.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9282.mp3";list.add(bean82);
        ContentBean bean83=new ContentBean(); bean83.title = "红狼毒83";bean83.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9283.mp3";list.add(bean83);
        ContentBean bean84=new ContentBean(); bean84.title = "红狼毒84";bean84.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9284.mp3";list.add(bean84);
        ContentBean bean85=new ContentBean(); bean85.title = "红狼毒85";bean85.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9285.mp3";list.add(bean85);
        ContentBean bean86=new ContentBean(); bean86.title = "红狼毒86";bean86.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9286.mp3";list.add(bean86);
        ContentBean bean87=new ContentBean(); bean87.title = "红狼毒87";bean87.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9287.mp3";list.add(bean87);
        ContentBean bean88=new ContentBean(); bean88.title = "红狼毒88";bean88.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9288.mp3";list.add(bean88);
        ContentBean bean89=new ContentBean(); bean89.title = "红狼毒89";bean89.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9289.mp3";list.add(bean89);
        ContentBean bean90=new ContentBean(); bean90.title = "红狼毒90";bean90.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9290.mp3";list.add(bean90);
        ContentBean bean91=new ContentBean(); bean91.title = "红狼毒91";bean91.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9291.mp3";list.add(bean91);
        ContentBean bean92=new ContentBean(); bean92.title = "红狼毒92";bean92.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9292.mp3";list.add(bean92);
        ContentBean bean93=new ContentBean(); bean93.title = "红狼毒93";bean93.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9293.mp3";list.add(bean93);
        ContentBean bean94=new ContentBean(); bean94.title = "红狼毒94";bean94.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9294.mp3";list.add(bean94);
        ContentBean bean95=new ContentBean(); bean95.title = "红狼毒95";bean95.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9295.mp3";list.add(bean95);
        ContentBean bean96=new ContentBean(); bean96.title = "红狼毒96";bean96.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9296.mp3";list.add(bean96);
        ContentBean bean97=new ContentBean(); bean97.title = "红狼毒97";bean97.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9297.mp3";list.add(bean97);
        ContentBean bean98=new ContentBean(); bean98.title = "红狼毒98";bean98.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9298.mp3";list.add(bean98);
        ContentBean bean99=new ContentBean(); bean99.title = "红狼毒99";bean99.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%9299.mp3";list.add(bean99);
        ContentBean bean100=new ContentBean(); bean100.title = "红狼毒100";bean100.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%92100.mp3";list.add(bean100);
        ContentBean bean101=new ContentBean(); bean101.title = "红狼毒101";bean101.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%92101.mp3";list.add(bean101);
        ContentBean bean102=new ContentBean(); bean102.title = "红狼毒102";bean102.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%92102.mp3";list.add(bean102);
        ContentBean bean103=new ContentBean(); bean103.title = "红狼毒103";bean103.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%92103.mp3";list.add(bean103);
        ContentBean bean104=new ContentBean(); bean104.title = "红狼毒104";bean104.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E7%BA%A2%E7%8B%BC%E6%AF%92%E3%80%8B/%E7%BA%A2%E7%8B%BC%E6%AF%92104.mp3";list.add(bean104);
        return list;
    }

    /**
     * 《远古的呼唤——鄂尔多斯青铜器》
     * @return
     */
    public static List<ContentBean> getYuangudehuhuan(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "鄂尔多斯青铜器01";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A81.wma";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "鄂尔多斯青铜器02";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A82.wma";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "鄂尔多斯青铜器03";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A83.wma";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "鄂尔多斯青铜器04";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A84.wma";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "鄂尔多斯青铜器05";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A85.wma";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "鄂尔多斯青铜器06";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A86.wma";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "鄂尔多斯青铜器07";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A87.wma";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "鄂尔多斯青铜器08";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A88.wma";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "鄂尔多斯青铜器09";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A89.wma";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "鄂尔多斯青铜器10";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A810.wma";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "鄂尔多斯青铜器11";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A811.wma";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "鄂尔多斯青铜器12";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A812.wma";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "鄂尔多斯青铜器13";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A813.wma";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "鄂尔多斯青铜器14";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A814.wma";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "鄂尔多斯青铜器15";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A815.wma";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "鄂尔多斯青铜器16";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A816.wma";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "鄂尔多斯青铜器17";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A817.wma";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "鄂尔多斯青铜器18";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A818.wma";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "鄂尔多斯青铜器19";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A819.wma";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "鄂尔多斯青铜器20";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%9C%E5%8F%A4%E7%9A%84%E5%91%BC%E5%94%A4%E2%80%94%E2%80%94%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A8%E3%80%8B/%E9%84%82%E5%B0%94%E5%A4%9A%E6%96%AF%E9%9D%92%E9%93%9C%E5%99%A820.wma";list.add(bean20);
        return list;
    }


    /**
     * 追梦中原
     * @return
     */
    public static List<ContentBean> getZhuiMeng(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean01=new ContentBean(); bean01.title = "第01集";bean01.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC1%E9%9B%86.mp3";list.add(bean01);
        ContentBean bean02=new ContentBean(); bean02.title = "第02集";bean02.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC2%E9%9B%86.mp3";list.add(bean02);
        ContentBean bean03=new ContentBean(); bean03.title = "第03集";bean03.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC3%E9%9B%86.mp3";list.add(bean03);
        ContentBean bean04=new ContentBean(); bean04.title = "第04集";bean04.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC4%E9%9B%86.mp3";list.add(bean04);
        ContentBean bean05=new ContentBean(); bean05.title = "第05集";bean05.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC5%E9%9B%86.mp3";list.add(bean05);
        ContentBean bean06=new ContentBean(); bean06.title = "第06集";bean06.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC6%E9%9B%86.mp3";list.add(bean06);
        ContentBean bean07=new ContentBean(); bean07.title = "第07集";bean07.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC7%E9%9B%86.mp3";list.add(bean07);
        ContentBean bean08=new ContentBean(); bean08.title = "第08集";bean08.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC8%E9%9B%86.mp3";list.add(bean08);
        ContentBean bean09=new ContentBean(); bean09.title = "第09集";bean09.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC9%E9%9B%86.mp3";list.add(bean09);
        ContentBean bean10=new ContentBean(); bean10.title = "第10集";bean10.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC10%E9%9B%86.mp3";list.add(bean10);
        ContentBean bean11=new ContentBean(); bean11.title = "第11集";bean11.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC11%E9%9B%86.mp3";list.add(bean11);
        ContentBean bean12=new ContentBean(); bean12.title = "第12集";bean12.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC12%E9%9B%86.mp3";list.add(bean12);
        ContentBean bean13=new ContentBean(); bean13.title = "第13集";bean13.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC13%E9%9B%86.mp3";list.add(bean13);
        ContentBean bean14=new ContentBean(); bean14.title = "第14集";bean14.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC14%E9%9B%86.mp3";list.add(bean14);
        ContentBean bean15=new ContentBean(); bean15.title = "第15集";bean15.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC15%E9%9B%86.mp3";list.add(bean15);
        ContentBean bean16=new ContentBean(); bean16.title = "第16集";bean16.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC16%E9%9B%86.mp3";list.add(bean16);
        ContentBean bean17=new ContentBean(); bean17.title = "第17集";bean17.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC17%E9%9B%86.mp3";list.add(bean17);
        ContentBean bean18=new ContentBean(); bean18.title = "第18集";bean18.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC18%E9%9B%86.mp3";list.add(bean18);
        ContentBean bean19=new ContentBean(); bean19.title = "第19集";bean19.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC19%E9%9B%86.mp3";list.add(bean19);
        ContentBean bean20=new ContentBean(); bean20.title = "第20集";bean20.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC20%E9%9B%86.mp3";list.add(bean20);
        ContentBean bean21=new ContentBean(); bean21.title = "第21集";bean21.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC21%E9%9B%86.mp3";list.add(bean21);
        ContentBean bean22=new ContentBean(); bean22.title = "第22集";bean22.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC22%E9%9B%86.mp3";list.add(bean22);
        ContentBean bean23=new ContentBean(); bean23.title = "第23集";bean23.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC23%E9%9B%86.mp3";list.add(bean23);
        ContentBean bean24=new ContentBean(); bean24.title = "第24集";bean24.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC24%E9%9B%86.mp3";list.add(bean24);
        ContentBean bean25=new ContentBean(); bean25.title = "第25集";bean25.playUrl="https://staticfile.haimifm.com/2020_NMG/%E3%80%8A%E8%BF%BD%E6%A2%A6%E4%B8%AD%E5%8E%9F%E3%80%8B/%E7%AC%AC25%E9%9B%86.mp3";list.add(bean25);
        return list;
    }

    /**
     * 北方佳人
     * @return
     */
    public static List<ContentBean> getBeifang(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean001=new ContentBean(); bean001.title = "第001集";bean001.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/1.mp3";list.add(bean001);
        ContentBean bean002=new ContentBean(); bean002.title = "第002集";bean002.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/2.mp3";list.add(bean002);
        ContentBean bean003=new ContentBean(); bean003.title = "第003集";bean003.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/3.mp3";list.add(bean003);
        ContentBean bean004=new ContentBean(); bean004.title = "第004集";bean004.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/4.mp3";list.add(bean004);
        ContentBean bean005=new ContentBean(); bean005.title = "第005集";bean005.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/5.mp3";list.add(bean005);
        ContentBean bean006=new ContentBean(); bean006.title = "第006集";bean006.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/6.mp3";list.add(bean006);
        ContentBean bean007=new ContentBean(); bean007.title = "第007集";bean007.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/7.mp3";list.add(bean007);
        ContentBean bean008=new ContentBean(); bean008.title = "第008集";bean008.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/8.mp3";list.add(bean008);
        ContentBean bean009=new ContentBean(); bean009.title = "第009集";bean009.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/9.mp3";list.add(bean009);
        ContentBean bean010=new ContentBean(); bean010.title = "第010集";bean010.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/10.mp3";list.add(bean010);
        ContentBean bean011=new ContentBean(); bean011.title = "第011集";bean011.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/11.mp3";list.add(bean011);
        ContentBean bean012=new ContentBean(); bean012.title = "第012集";bean012.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/12.mp3";list.add(bean012);
        ContentBean bean013=new ContentBean(); bean013.title = "第013集";bean013.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/13.mp3";list.add(bean013);
        ContentBean bean014=new ContentBean(); bean014.title = "第014集";bean014.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/14.mp3";list.add(bean014);
        ContentBean bean015=new ContentBean(); bean015.title = "第015集";bean015.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/15.mp3";list.add(bean015);
        ContentBean bean016=new ContentBean(); bean016.title = "第016集";bean016.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/16.mp3";list.add(bean016);
        ContentBean bean017=new ContentBean(); bean017.title = "第017集";bean017.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/17.mp3";list.add(bean017);
        ContentBean bean018=new ContentBean(); bean018.title = "第018集";bean018.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/18.mp3";list.add(bean018);
        ContentBean bean019=new ContentBean(); bean019.title = "第019集";bean019.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/19.mp3";list.add(bean019);
        ContentBean bean020=new ContentBean(); bean020.title = "第020集";bean020.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/20.mp3";list.add(bean020);
        ContentBean bean021=new ContentBean(); bean021.title = "第021集";bean021.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/21.mp3";list.add(bean021);
        ContentBean bean022=new ContentBean(); bean022.title = "第022集";bean022.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/22.mp3";list.add(bean022);
        ContentBean bean023=new ContentBean(); bean023.title = "第023集";bean023.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/23.mp3";list.add(bean023);
        ContentBean bean024=new ContentBean(); bean024.title = "第024集";bean024.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/24.mp3";list.add(bean024);
        ContentBean bean025=new ContentBean(); bean025.title = "第025集";bean025.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/25.mp3";list.add(bean025);
        ContentBean bean026=new ContentBean(); bean026.title = "第026集";bean026.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/26.mp3";list.add(bean026);
        ContentBean bean027=new ContentBean(); bean027.title = "第027集";bean027.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/27.mp3";list.add(bean027);
        ContentBean bean028=new ContentBean(); bean028.title = "第028集";bean028.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/28.mp3";list.add(bean028);
        ContentBean bean029=new ContentBean(); bean029.title = "第029集";bean029.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/29.mp3";list.add(bean029);
        ContentBean bean030=new ContentBean(); bean030.title = "第030集";bean030.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/30.mp3";list.add(bean030);
        ContentBean bean031=new ContentBean(); bean031.title = "第031集";bean031.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/31.mp3";list.add(bean031);
        ContentBean bean032=new ContentBean(); bean032.title = "第032集";bean032.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/32.mp3";list.add(bean032);
        ContentBean bean033=new ContentBean(); bean033.title = "第033集";bean033.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/33.mp3";list.add(bean033);
        ContentBean bean034=new ContentBean(); bean034.title = "第034集";bean034.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/34.mp3";list.add(bean034);
        ContentBean bean035=new ContentBean(); bean035.title = "第035集";bean035.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/35.mp3";list.add(bean035);
        ContentBean bean036=new ContentBean(); bean036.title = "第036集";bean036.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/36.mp3";list.add(bean036);
        ContentBean bean037=new ContentBean(); bean037.title = "第037集";bean037.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/37.mp3";list.add(bean037);
        ContentBean bean038=new ContentBean(); bean038.title = "第038集";bean038.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/38.mp3";list.add(bean038);
        ContentBean bean039=new ContentBean(); bean039.title = "第039集";bean039.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/39.mp3";list.add(bean039);
        ContentBean bean040=new ContentBean(); bean040.title = "第040集";bean040.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/40.mp3";list.add(bean040);
        ContentBean bean041=new ContentBean(); bean041.title = "第041集";bean041.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/41.mp3";list.add(bean041);
        ContentBean bean042=new ContentBean(); bean042.title = "第042集";bean042.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/42.mp3";list.add(bean042);
        ContentBean bean043=new ContentBean(); bean043.title = "第043集";bean043.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/43.mp3";list.add(bean043);
        ContentBean bean044=new ContentBean(); bean044.title = "第044集";bean044.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/44.mp3";list.add(bean044);
        ContentBean bean045=new ContentBean(); bean045.title = "第045集";bean045.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/45.mp3";list.add(bean045);
        ContentBean bean046=new ContentBean(); bean046.title = "第046集";bean046.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/46.mp3";list.add(bean046);
        ContentBean bean047=new ContentBean(); bean047.title = "第047集";bean047.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/47.mp3";list.add(bean047);
        ContentBean bean048=new ContentBean(); bean048.title = "第048集";bean048.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/48.mp3";list.add(bean048);
        ContentBean bean049=new ContentBean(); bean049.title = "第049集";bean049.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/49.mp3";list.add(bean049);
        ContentBean bean050=new ContentBean(); bean050.title = "第050集";bean050.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/50.mp3";list.add(bean050);
        ContentBean bean051=new ContentBean(); bean051.title = "第051集";bean051.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/51.mp3";list.add(bean051);
        ContentBean bean052=new ContentBean(); bean052.title = "第052集";bean052.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/52.mp3";list.add(bean052);
        ContentBean bean053=new ContentBean(); bean053.title = "第053集";bean053.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/53.mp3";list.add(bean053);
        ContentBean bean054=new ContentBean(); bean054.title = "第054集";bean054.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/54.mp3";list.add(bean054);
        ContentBean bean055=new ContentBean(); bean055.title = "第055集";bean055.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/55.mp3";list.add(bean055);
        ContentBean bean056=new ContentBean(); bean056.title = "第056集";bean056.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/56.mp3";list.add(bean056);
        ContentBean bean057=new ContentBean(); bean057.title = "第057集";bean057.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/57.mp3";list.add(bean057);
        ContentBean bean058=new ContentBean(); bean058.title = "第058集";bean058.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/58.mp3";list.add(bean058);
        ContentBean bean059=new ContentBean(); bean059.title = "第059集";bean059.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/59.mp3";list.add(bean059);
        ContentBean bean060=new ContentBean(); bean060.title = "第060集";bean060.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/60.mp3";list.add(bean060);
        ContentBean bean061=new ContentBean(); bean061.title = "第061集";bean061.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/61.mp3";list.add(bean061);
        ContentBean bean062=new ContentBean(); bean062.title = "第062集";bean062.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/62.mp3";list.add(bean062);
        ContentBean bean063=new ContentBean(); bean063.title = "第063集";bean063.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/63.mp3";list.add(bean063);
        ContentBean bean064=new ContentBean(); bean064.title = "第064集";bean064.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/64.mp3";list.add(bean064);
        ContentBean bean065=new ContentBean(); bean065.title = "第065集";bean065.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/65.mp3";list.add(bean065);
        ContentBean bean066=new ContentBean(); bean066.title = "第066集";bean066.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/66.mp3";list.add(bean066);
        ContentBean bean067=new ContentBean(); bean067.title = "第067集";bean067.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/67.mp3";list.add(bean067);
        ContentBean bean068=new ContentBean(); bean068.title = "第068集";bean068.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/68.mp3";list.add(bean068);
        ContentBean bean069=new ContentBean(); bean069.title = "第069集";bean069.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/69.mp3";list.add(bean069);
        ContentBean bean070=new ContentBean(); bean070.title = "第070集";bean070.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/70.mp3";list.add(bean070);
        ContentBean bean071=new ContentBean(); bean071.title = "第071集";bean071.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/71.mp3";list.add(bean071);
        ContentBean bean072=new ContentBean(); bean072.title = "第072集";bean072.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/72.mp3";list.add(bean072);
        ContentBean bean073=new ContentBean(); bean073.title = "第073集";bean073.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/73.mp3";list.add(bean073);
        ContentBean bean074=new ContentBean(); bean074.title = "第074集";bean074.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/74.mp3";list.add(bean074);
        ContentBean bean075=new ContentBean(); bean075.title = "第075集";bean075.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/75.mp3";list.add(bean075);
        ContentBean bean076=new ContentBean(); bean076.title = "第076集";bean076.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/76.mp3";list.add(bean076);
        ContentBean bean077=new ContentBean(); bean077.title = "第077集";bean077.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/77.mp3";list.add(bean077);
        ContentBean bean078=new ContentBean(); bean078.title = "第078集";bean078.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/78.mp3";list.add(bean078);
        ContentBean bean079=new ContentBean(); bean079.title = "第079集";bean079.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/79.mp3";list.add(bean079);
        ContentBean bean080=new ContentBean(); bean080.title = "第080集";bean080.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/80.mp3";list.add(bean080);
        ContentBean bean081=new ContentBean(); bean081.title = "第081集";bean081.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/81.mp3";list.add(bean081);
        ContentBean bean082=new ContentBean(); bean082.title = "第082集";bean082.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/82.mp3";list.add(bean082);
        ContentBean bean083=new ContentBean(); bean083.title = "第083集";bean083.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/83.mp3";list.add(bean083);
        ContentBean bean084=new ContentBean(); bean084.title = "第084集";bean084.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/84.mp3";list.add(bean084);
        ContentBean bean085=new ContentBean(); bean085.title = "第085集";bean085.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/85.mp3";list.add(bean085);
        ContentBean bean086=new ContentBean(); bean086.title = "第086集";bean086.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/86.mp3";list.add(bean086);
        ContentBean bean087=new ContentBean(); bean087.title = "第087集";bean087.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/87.mp3";list.add(bean087);
        ContentBean bean088=new ContentBean(); bean088.title = "第088集";bean088.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/88.mp3";list.add(bean088);
        ContentBean bean089=new ContentBean(); bean089.title = "第089集";bean089.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/89.mp3";list.add(bean089);
        ContentBean bean090=new ContentBean(); bean090.title = "第090集";bean090.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/90.mp3";list.add(bean090);
        ContentBean bean091=new ContentBean(); bean091.title = "第091集";bean091.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/91.mp3";list.add(bean091);
        ContentBean bean092=new ContentBean(); bean092.title = "第092集";bean092.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/92.mp3";list.add(bean092);
        ContentBean bean093=new ContentBean(); bean093.title = "第093集";bean093.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/93.mp3";list.add(bean093);
        ContentBean bean094=new ContentBean(); bean094.title = "第094集";bean094.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/94.mp3";list.add(bean094);
        ContentBean bean095=new ContentBean(); bean095.title = "第095集";bean095.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/95.mp3";list.add(bean095);
        ContentBean bean096=new ContentBean(); bean096.title = "第096集";bean096.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/96.mp3";list.add(bean096);
        ContentBean bean097=new ContentBean(); bean097.title = "第097集";bean097.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/97.mp3";list.add(bean097);
        ContentBean bean098=new ContentBean(); bean098.title = "第098集";bean098.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/98.mp3";list.add(bean098);
        ContentBean bean099=new ContentBean(); bean099.title = "第099集";bean099.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/99.mp3";list.add(bean099);
        ContentBean bean100=new ContentBean(); bean100.title = "第100集";bean100.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/100.mp3";list.add(bean100);
        ContentBean bean101=new ContentBean(); bean101.title = "第101集";bean101.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/101.mp3";list.add(bean101);
        ContentBean bean102=new ContentBean(); bean102.title = "第102集";bean102.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/102.mp3";list.add(bean102);
        ContentBean bean103=new ContentBean(); bean103.title = "第103集";bean103.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/103.mp3";list.add(bean103);
        ContentBean bean104=new ContentBean(); bean104.title = "第104集";bean104.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/104.mp3";list.add(bean104);
        ContentBean bean105=new ContentBean(); bean105.title = "第105集";bean105.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/105.mp3";list.add(bean105);
        ContentBean bean106=new ContentBean(); bean106.title = "第106集";bean106.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/106.mp3";list.add(bean106);
        ContentBean bean107=new ContentBean(); bean107.title = "第107集";bean107.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/107.mp3";list.add(bean107);
        ContentBean bean108=new ContentBean(); bean108.title = "第108集";bean108.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/108.mp3";list.add(bean108);
        ContentBean bean109=new ContentBean(); bean109.title = "第109集";bean109.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/109.mp3";list.add(bean109);
        ContentBean bean110=new ContentBean(); bean110.title = "第110集";bean110.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/110.mp3";list.add(bean110);
        ContentBean bean111=new ContentBean(); bean111.title = "第111集";bean111.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/111.mp3";list.add(bean111);
        ContentBean bean112=new ContentBean(); bean112.title = "第112集";bean112.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/112.mp3";list.add(bean112);
        ContentBean bean113=new ContentBean(); bean113.title = "第113集";bean113.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/113.mp3";list.add(bean113);
        ContentBean bean114=new ContentBean(); bean114.title = "第114集";bean114.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/114.mp3";list.add(bean114);
        ContentBean bean115=new ContentBean(); bean115.title = "第115集";bean115.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/115.mp3";list.add(bean115);
        ContentBean bean116=new ContentBean(); bean116.title = "第116集";bean116.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/116.mp3";list.add(bean116);
        ContentBean bean117=new ContentBean(); bean117.title = "第117集";bean117.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/117.mp3";list.add(bean117);
        ContentBean bean118=new ContentBean(); bean118.title = "第118集";bean118.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/118.mp3";list.add(bean118);
        ContentBean bean119=new ContentBean(); bean119.title = "第119集";bean119.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/119.mp3";list.add(bean119);
        ContentBean bean120=new ContentBean(); bean120.title = "第120集";bean120.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/120.mp3";list.add(bean120);
        ContentBean bean121=new ContentBean(); bean121.title = "第121集";bean121.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/121.mp3";list.add(bean121);
        ContentBean bean122=new ContentBean(); bean122.title = "第122集";bean122.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/122.mp3";list.add(bean122);
        ContentBean bean123=new ContentBean(); bean123.title = "第123集";bean123.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/123.mp3";list.add(bean123);
        ContentBean bean124=new ContentBean(); bean124.title = "第124集";bean124.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/124.mp3";list.add(bean124);
        ContentBean bean125=new ContentBean(); bean125.title = "第125集";bean125.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/125.mp3";list.add(bean125);
        ContentBean bean126=new ContentBean(); bean126.title = "第126集";bean126.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/126.mp3";list.add(bean126);
        ContentBean bean127=new ContentBean(); bean127.title = "第127集";bean127.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/127.mp3";list.add(bean127);
        ContentBean bean128=new ContentBean(); bean128.title = "第128集";bean128.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/128.mp3";list.add(bean128);
        ContentBean bean129=new ContentBean(); bean129.title = "第129集";bean129.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/129.mp3";list.add(bean129);
        ContentBean bean130=new ContentBean(); bean130.title = "第130集";bean130.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/130.mp3";list.add(bean130);
        ContentBean bean131=new ContentBean(); bean131.title = "第131集";bean131.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/131.mp3";list.add(bean131);
        ContentBean bean132=new ContentBean(); bean132.title = "第132集";bean132.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/132.mp3";list.add(bean132);
        ContentBean bean133=new ContentBean(); bean133.title = "第133集";bean133.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/133.mp3";list.add(bean133);
        ContentBean bean134=new ContentBean(); bean134.title = "第134集";bean134.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/134.mp3";list.add(bean134);
        ContentBean bean135=new ContentBean(); bean135.title = "第135集";bean135.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/135.mp3";list.add(bean135);
        ContentBean bean136=new ContentBean(); bean136.title = "第136集";bean136.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/136.mp3";list.add(bean136);
        ContentBean bean137=new ContentBean(); bean137.title = "第137集";bean137.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/137.mp3";list.add(bean137);
        ContentBean bean138=new ContentBean(); bean138.title = "第138集";bean138.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/138.mp3";list.add(bean138);
        ContentBean bean139=new ContentBean(); bean139.title = "第139集";bean139.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/139.mp3";list.add(bean139);
        ContentBean bean140=new ContentBean(); bean140.title = "第140集";bean140.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/140.mp3";list.add(bean140);
        ContentBean bean141=new ContentBean(); bean141.title = "第141集";bean141.playUrl="https://staticfile.haimifm.com/2020_NMG/%E5%8C%97%E6%96%B9%E4%BD%B3%E4%BA%BA/141.mp3";list.add(bean141);
        return list;
    }
}
