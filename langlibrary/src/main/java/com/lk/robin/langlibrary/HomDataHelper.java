package com.lk.robin.langlibrary;

import com.lk.robin.langlibrary.bean.ContentBean;

import java.util.ArrayList;
import java.util.List;

public class HomDataHelper {
    public static String Type_ErTong = "Type_ErTong";//儿童
    public static String Type_Qingan = "Type_Qingan";//情感
    public static String Type_ShuhaiShengyan = "Type_ShuhaiShengyan";//书海盛宴
    public static String Type_YizhouShudian = "Type_YizhouShudian";//一周书单
    public static String Type_Zongyi = "Type_Zongyi";//综艺
    public static String Type_Xiangsheng = "Type_Xiangsheng";//相声
    public static String Type_Guangbo = "Type_Guangbo";//广播

    /**
     * 儿童
     *
     * @return
     */
    public static List<ContentBean> getErTongList() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = ZhuanJiDataHelper.LVYEZHISHENG;
        bean1.title = "田父献曝";
        bean1.info = "讲述一个关于“死亡”的故事，也是一个关于“生命”的故事";
        bean1.type = Type_ShuhaiShengyan;
        bean1.resId = R.mipmap.ic_m3_et_tfxp;
        bean1.playUrl="https://staticfile.haimifm.com/2020_NMG/%E6%95%85%E4%BA%8B/2%20%E7%94%B0%E7%88%B6%E7%8C%AE%E6%9B%9D%E5%90%88%E6%88%90%E7%89%88MMM.mp3";
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = ZhuanJiDataHelper.KONGFEIZHUAN;
        bean2.title = "十法九例";
        bean2.type = Type_ErTong;
        bean2.info = "【每周六，每周日更新一集】故事结合孩子们最喜欢的时空穿越与冒险元素，融入大量奇思妙想的创意，彻底放飞想象力，精彩刺激乐不听。小朋友们，和我们一起坐上时空穿越车潘妮，跟随疯狂的戴夫、勇敢的豌豆射手和其他植物伙伴们，开启一段跌宕起伏的功夫世界之旅吧！";
        bean2.resId = R.mipmap.ic_m3_et_sfjl;
        bean2.playUrl="https://staticfile.haimifm.com/2020_NMG/%E6%95%85%E4%BA%8B/3%20%E5%8D%81%E6%B3%95%E4%B9%9D%E4%BE%8BMMM.mp3";
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = ZhuanJiDataHelper.HUANGHE;
        bean3.title = "深孚众望";
        bean3.info = "【限时免费】吴京主演《流浪地球》原著！会员畅听";
        bean3.type = Type_ShuhaiShengyan;
        bean3.resId = R.mipmap.ic_m3_et_sfzw;
        bean3.playUrl="https://staticfile.haimifm.com/2020_NMG/%E6%95%85%E4%BA%8B/6%20%E6%B7%B1%E5%AD%9A%E4%BC%97%E6%9C%9BMMM.mp3";
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = ZhuanJiDataHelper.ZHUIMENG;
        bean4.title = "人眼是秤";
        bean4.info = "注：近期有人在评论区冒充大碗，诸位小心提防，大碗本人不会在己方及任何其他节目的评论区现身。 悬疑案子，未解之谜，灵异事件… 是你我身边的玄幻？还是科学面纱下的伪装？ 还原事实，探索真相。 每周一下午四点，我们共同关注。 微/信/公/众/号：dawanshuogushi； 商务合作：dwjuemidangan@163.com。";
        bean4.type = Type_ShuhaiShengyan;
        bean4.resId = R.mipmap.ic_m3_et_rysc;
        bean4.playUrl="https://staticfile.haimifm.com/2020_NMG/%E6%95%85%E4%BA%8B/5%20%E4%BA%BA%E7%9C%BC%E6%98%AF%E7%A7%A4MMM.mp3";
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = ZhuanJiDataHelper.BEIFANGJIAREN;
        bean5.title = "人心向背";
        bean5.info = "国内首档以揭秘“电影里的生活,生活里的电影”为主题的漫谈式电视脱口秀日播栏目。 ";
        bean5.type = Type_Zongyi;
        bean5.playUrl="https://staticfile.haimifm.com/2020_NMG/%E6%95%85%E4%BA%8B/4%20%E4%BA%BA%E5%BF%83%E5%90%91%E8%83%8CMMM.mp3";
        bean5.resId = R.mipmap.ic_m3_et_rxxb;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = ZhuanJiDataHelper.DALIAOGONGZHU;
        bean6.title = "群策群力";
        bean6.info = "叶武滨时间管理·2019全新升级， 首次公布时间管理九段法， 让你测到、学到、做到、得到， 10节课让你战胜拖延症，成为时间管理高手。";
        bean6.type = Type_ShuhaiShengyan;
        bean6.playUrl="https://staticfile.haimifm.com/2020_NMG/%E6%95%85%E4%BA%8B/1%20%E7%BE%A4%E7%AD%96%E7%BE%A4%E5%8A%9B%20MMM.mp3";
        bean6.resId = R.mipmap.ic_m3_et_qcql;
        list.add(bean6);

        ContentBean bean7 = new ContentBean();
        bean7.id = 6;
        bean7.title = "赛尔号·星际大作战之太空百科";
        bean7.type = Type_ErTong;
        bean7.info = "浩渺宇宙，星际穿梭，把太空百科装进孩子的耳朵里！蜻蜓FM&淘米网官方高品质制作，改编自“赛尔号”动画，用权威的科学知识、多元化人物阵容和惊险离奇的太空大作战，为孩子带来最有趣的太空知识，和最吸引人的奇幻故事。磁场是什么？虫洞是怎样形成的？除了用眼睛看的动画片，还有用耳朵听的太空百科！快让孩子来“赛尔号·星际大作战之太空百科”中，激发神奇的想象力，燃起对太空的兴趣吧！";
        bean7.resId = R.mipmap.ic_local_et_seh_xjdzz;
        list.add(bean7);

        ContentBean bean8 = new ContentBean();
        bean8.id = 7;
        bean8.title = "天天听《小猪佩奇》，宝宝必听的趣味启蒙";
        bean8.type = Type_ErTong;
        bean8.info = "官方授权，耳朵里的《小猪佩奇》《天天听小猪佩奇》包含156集全集正版高品质原声，以每集正版《小猪佩奇》动画原音主题故事+趣味启蒙教育延伸，从孩子的视角出发，用温馨简单的语言、灵动好听的声音、轻松幽默的方式传达给小朋友一些理念和认知： 认知与启蒙——探索世界开阔眼见 宽容与情商——良好性格埋下种子 尊重与公平——再小也是独立个体 夸奖与责任——成就感中学会担当 引导与榜样——乐观积极敢于表达 陪伴与守护——呵护奇妙的想象力 这只来自英国的小猪佩奇，已经深入到全世界小孩子的心里，成为这些小不点心目中的头号“明星”。在千呼万唤后，风靡全球、红得发紫的《小猪佩奇》动画片，以听故事+趣味启蒙的全新方式登陆蜻蜓FM啦，为每位小朋友大朋友诚意送上暑期最温馨的礼物。";
        bean8.resId = R.mipmap.ic_local_et_zwdzjs1;
        list.add(bean8);

        ContentBean bean9 = new ContentBean();
        bean9.id = 8;
        bean9.title = "少儿神话广播剧《哪吒》";
        bean9.type = Type_ErTong;
        bean9.info = "▲中国传统神话“哪吒”，首次推出特意为孩子们创作的广播剧版。";
        bean9.resId = R.mipmap.ic_local_et_shgb_nz;
        list.add(bean9);
        return list;
    }

    public static List<ContentBean> getShuhaiSehngyan() {
        List<ContentBean> list = new ArrayList<>();

        ContentBean bean1 = new ContentBean();
        bean1.id = 7;
        bean1.title = "千叶医生联盟：你的私人健康顾问";
        bean1.info = "千叶医生联盟，你的私人健康顾问 1年精心打磨，56期节目横扫健康误区 10位顶级专家，是你全程陪伴的私人顾问 100位医学博士，为常见疾病快速支招 1000篇文献数据，验证实用高效的就医攻略";
        bean1.type = Type_ShuhaiShengyan;
        bean1.resId = R.mipmap.ic_local_shsy_1;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = ZhuanJiDataHelper.XUNLU;
        bean2.title = "驯鹿角上的彩带";
        bean2.info = "10年摸爬滚打，逐层剥开茫茫名利场的现状与秘密。";
        bean2.type = Type_ShuhaiShengyan;
        bean2.resId = R.mipmap.ic_local_sy02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = ZhuanJiDataHelper.HUANGHE;
        bean3.title = "黄河那道弯";
        bean3.info = "【限时免费】吴京主演《流浪地球》原著！会员畅听";
        bean3.type = Type_ShuhaiShengyan;
        bean3.resId = R.mipmap.ic_local_sy03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = ZhuanJiDataHelper.ZHUIMENG;
        bean4.title = "追梦中原";
        bean4.info = "注：近期有人在评论区冒充大碗，诸位小心提防，大碗本人不会在己方及任何其他节目的评论区现身。 悬疑案子，未解之谜，灵异事件… 是你我身边的玄幻？还是科学面纱下的伪装？ 还原事实，探索真相。 每周一下午四点，我们共同关注。 微/信/公/众/号：dawanshuogushi； 商务合作：dwjuemidangan@163.com。";
        bean4.type = Type_ShuhaiShengyan;
        bean4.resId = R.mipmap.ic_local_sy20;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = ZhuanJiDataHelper.BEIFANGJIAREN;
        bean5.title = "北方佳人";
        bean5.info = "国内首档以揭秘“电影里的生活,生活里的电影”为主题的漫谈式电视脱口秀日播栏目。 ";
        bean5.type = Type_Zongyi;
        bean5.resId = R.mipmap.ic_local_sy07;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = ZhuanJiDataHelper.DALIAOGONGZHU;
        bean6.title = "大辽公主";
        bean6.info = "叶武滨时间管理·2019全新升级， 首次公布时间管理九段法， 让你测到、学到、做到、得到， 10节课让你战胜拖延症，成为时间管理高手。";
        bean6.type = Type_ShuhaiShengyan;
        bean6.resId = R.mipmap.ic_local_sy06;
        list.add(bean6);

        ContentBean bean7 = new ContentBean();
        bean7.id = 6;
        bean7.title = "人类未解之谜";
        bean7.info = "人类未解之谜指的是人类还未解密的一些现象。在漫漫的历史长河中，人类创造了很多奇迹，又留下了很多谜团，人类至今也没能破解其中的奥秘。";
        bean7.type = Type_ShuhaiShengyan;
        bean7.resId = R.mipmap.ic_local_shsy_7;
        list.add(bean7);

//        ContentBean bean8 = new ContentBean();
//        bean8.id = 7;
//        bean8.title = "千叶医生联盟：你的私人健康顾问";
//        bean8.info = "千叶医生联盟，你的私人健康顾问 1年精心打磨，56期节目横扫健康误区 10位顶级专家，是你全程陪伴的私人顾问 100位医学博士，为常见疾病快速支招 1000篇文献数据，验证实用高效的就医攻略";
//        bean8.type = Type_ShuhaiShengyan;
//        bean8.resId = R.mipmap.ic_local_shsy_1;
//        list.add(bean8);
        ContentBean bean8 = new ContentBean();
        bean8.id = ZhuanJiDataHelper.LVYEZHISHENG;
        bean8.title = "绿野之声";
        bean8.info = "讲述一个关于“死亡”的故事，也是一个关于“生命”的故事";
        bean8.type = Type_ShuhaiShengyan;
        bean8.resId = R.mipmap.ic_local_sy19;
        list.add(bean8);

        return list;
    }

    public static List<ContentBean> getYizhouShudan() {
        List<ContentBean> list = new ArrayList<>();

        ContentBean bean1 = new ContentBean();
        bean1.id = ZhuanJiDataHelper.ZHUIMENG;
        bean1.title = "追梦中原";
        bean1.info = "注：近期有人在评论区冒充大碗，诸位小心提防，大碗本人不会在己方及任何其他节目的评论区现身。 悬疑案子，未解之谜，灵异事件… 是你我身边的玄幻？还是科学面纱下的伪装？ 还原事实，探索真相。 每周一下午四点，我们共同关注。 微/信/公/众/号：dawanshuogushi； 商务合作：dwjuemidangan@163.com。";
        bean1.type = Type_ShuhaiShengyan;
        bean1.countRead = "4.1";
        bean1.resId = R.mipmap.ic_local_sy20;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = ZhuanJiDataHelper.BEIFANGJIAREN;
        bean2.title = "北方佳人";
        bean2.info = "国内首档以揭秘“电影里的生活,生活里的电影”为主题的漫谈式电视脱口秀日播栏目。 ";
        bean2.type = Type_Zongyi;
        bean2.countRead = "2.6";
        bean2.resId = R.mipmap.ic_local_sy07;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = ZhuanJiDataHelper.DALIAOGONGZHU;
        bean3.title = "大辽公主";
        bean3.info = "叶武滨时间管理·2019全新升级， 首次公布时间管理九段法， 让你测到、学到、做到、得到， 10节课让你战胜拖延症，成为时间管理高手。";
        bean3.type = Type_ShuhaiShengyan;
        bean3.countRead = "3.8";
        bean3.resId = R.mipmap.ic_local_sy06;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "超高效时间管理课";
        bean4.info = "吴晓波力荐的时间管理课";
        bean4.type = Type_YizhouShudian;
        bean4.countRead = "4.6";
        bean4.resId = R.mipmap.ic_local_yzsd_04;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "团队管理每日谈";
        bean5.info = "什么最难管？管人啊！管理重在管，还是理？ 一起读大咖观点，每天学习管理之道。";
        bean5.type = Type_YizhouShudian;
        bean5.countRead = "5.3";
        bean5.resId = R.mipmap.ic_local_yzsd_06;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "晓书童解书|人类简史三部曲";
        bean6.info = "历史学家瓦尔·赫拉利的“简史三部曲”：《人类简史》、《未来简史》、《今日简史》。这套思想炸弹，在刚出版就引发社会巨大讨论，晓书童为你解读大部头系列，颠覆你的三观认知！";
        bean6.type = Type_YizhouShudian;
        bean6.resId = R.mipmap.ic_local_yzsd_01;
        list.add(bean6);

        return list;
    }


    public static List<ContentBean> getZongyiList() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = ZhuanJiDataHelper.BEIFANGJIAREN;
        bean1.title = "宁舍一顿饭，不舍二人转";
        bean1.info = "国内首档以揭秘“电影里的生活,生活里的电影”为主题的漫谈式电视脱口秀日播栏目。 ";
        bean1.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E3%80%8A%E5%AE%81%E8%88%8D%E4%B8%80%E9%A1%BF%E9%A5%AD%EF%BC%8C%E4%B8%8D%E8%88%8D%E4%BA%8C%E4%BA%BA%E8%BD%AC%E3%80%8B.mp3";
        bean1.type = Type_Zongyi;
        bean1.resId = R.mipmap.ic_m2_zy_ysydf_bserz;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = ZhuanJiDataHelper.RILUOHEICHENG;
        bean2.title = "他的歌声希望你听不懂";
        bean2.info = "宋小宝近年火爆全国，受邀各大综艺，参加《欢乐喜剧人》、《食在囧途》、《笑声传奇》、《欢乐总动员》等，给更多观众带来欢乐。";
        bean2.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E4%BB%96%E7%9A%84%E6%AD%8C%E5%B8%8C%E6%9C%9B%E4%BD%A0%E5%90%AC%E4%B8%8D%E6%87%82.mp3";
        bean2.type = Type_Zongyi;
        bean2.resId = R.mipmap.ic_m2_zy_tdg_tbd;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = ZhuanJiDataHelper.HUANGHE;
        bean3.title = "夜晚我变成了诗人";
        bean3.info = "【限时免费】吴京主演《流浪地球》原著！会员畅听";
        bean3.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%A4%9C%E6%99%9A%E6%88%91%E5%8F%98%E6%88%90%E4%BA%86%E8%AF%97%E4%BA%BA.mp3";
        bean3.type = Type_ShuhaiShengyan;
        bean3.resId = R.mipmap.ic_m2_zy_jybcsr;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = ZhuanJiDataHelper.ZHUIMENG;
        bean4.title = "戏里戏外《喜上喜》";
        bean4.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%8F%E9%87%8C%E6%88%8F%E5%A4%96%E3%80%8A%E5%96%9C%E4%B8%8A%E5%96%9C%E3%80%8B.mp3";
        bean4.info = "注：近期有人在评论区冒充大碗，诸位小心提防，大碗本人不会在己方及任何其他节目的评论区现身。 悬疑案子，未解之谜，灵异事件… 是你我身边的玄幻？还是科学面纱下的伪装？ 还原事实，探索真相。 每周一下午四点，我们共同关注。 微/信/公/众/号：dawanshuogushi； 商务合作：dwjuemidangan@163.com。";
        bean4.type = Type_ShuhaiShengyan;
        bean4.resId = R.mipmap.ic_m2_zy_xlxw;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = ZhuanJiDataHelper.BEIFANGJIAREN;
        bean5.title = "一座城市的末班车";
        bean5.info = "国内首档以揭秘“电影里的生活,生活里的电影”为主题的漫谈式电视脱口秀日播栏目。 ";
        bean5.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E4%B8%80%E5%BA%A7%E5%9F%8E%E5%B8%82%E7%9A%84%E6%9C%AB%E7%8F%AD%E8%BD%A6.mp3";
        bean5.type = Type_Zongyi;
        bean5.resId = R.mipmap.ic_m2_zy_yzc_mbc;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = ZhuanJiDataHelper.HONGLANGDU;
        bean6.title = "愿世间美好与你环环相扣";
        bean6.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%84%BF%E4%B8%96%E9%97%B4%E7%BE%8E%E5%A5%BD%E4%B8%8E%E4%BD%A0%E7%8E%AF%E7%8E%AF%E7%9B%B8%E6%89%A3.mp3";
        bean6.info = "东北F4（东北天团）是由莱昂纳多·小沈阳、约翰尼·宋小宝、克里斯蒂安·刘能、尼古拉斯·赵四四个人物组成。四个人在戏剧界有着举足轻重的地位，他们的出现给中国喜剧界带来更多精彩的作品。";
        bean6.type = Type_Zongyi;
        bean6.resId = R.mipmap.ic_local_sy12;
        list.add(bean6);

        ContentBean bean7 = new ContentBean();
        bean7.id = 0;
        bean7.title = "中国梦中国路";
        bean7.info = "聆听中南海的声音，追随习大大的身影，演绎中国故事，讲述中国道路，彰显中国精神，汇聚中国力量，坚守共同的中国梦。";
        bean7.type = Type_Zongyi;
        bean7.resId = R.mipmap.ic_loacl_zy_01;
        list.add(bean7);

        ContentBean bean8 = new ContentBean();
        bean8.id = 0;
        bean8.title = "中国好声音";
        bean8.info = "浙江卫视&灿星制作联合出品原创音乐评论类节目《中国好声音》";
        bean8.type = Type_Zongyi;
        bean8.resId = R.mipmap.ic_loacl_zy_01;
        list.add(bean8);

        return list;
    }

    public static List<ContentBean> getQingGanList() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = ZhuanJiDataHelper.PAJIECHUANQI;
        bean1.title = "崩溃与自愈";
        bean1.info = "个人公号“晓慧主播”。于千万人中，刚巧遇见了你……";
        bean1.type = Type_Qingan;
        bean1.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%B4%A9%E6%BA%83%E4%B8%8E%E8%87%AA%E6%84%88.mp3";
        bean1.resId = R.mipmap.ic_m3_qg_bkyzy;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = ZhuanJiDataHelper.XUNLU;
        bean2.title = "往事清零 岁月可期";
        bean2.info = "10年摸爬滚打，逐层剥开茫茫名利场的现状与秘密。";
        bean2.type = Type_ShuhaiShengyan;
        bean2.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E5%BE%80%E4%BA%8B%E6%B8%85%E9%9B%B6%20%E5%B2%81%E6%9C%88%E5%8F%AF%E6%9C%9F.mp3";
        bean2.resId = R.mipmap.ic_m3_qg_sykq;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = ZhuanJiDataHelper.YUANGU;
        bean3.title = "成熟的生存 幼稚的生活";
        bean3.info = "声音是有温度的，夜晚的声音会发光。睡前一段优美文字，一首暖心歌曲。程一电台，用声音温暖每个有你的夜晚，在你耳边伴你入眠。新浪微博：DJ程一，微信公众号：DJ程一（ID : djchengyi），QQ群：348166503（①群），384016829（②群）。";
        bean3.type = Type_Qingan;
        bean3.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%90%E7%86%9F%E7%9A%84%E7%94%9F%E5%AD%98%20%E5%B9%BC%E7%A8%9A%E7%9A%84%E7%94%9F%E6%B4%BB.mp3";
        bean3.resId = R.mipmap.ic_m3_qg_csdsc;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = ZhuanJiDataHelper.ZHUIMENG;
        bean4.title = "我们始终要学会告别";
        bean4.info = "注：近期有人在评论区冒充大碗，诸位小心提防，大碗本人不会在己方及任何其他节目的评论区现身。 悬疑案子，未解之谜，灵异事件… 是你我身边的玄幻？还是科学面纱下的伪装？ 还原事实，探索真相。 每周一下午四点，我们共同关注。 微/信/公/众/号：dawanshuogushi； 商务合作：dwjuemidangan@163.com。";
        bean4.type = Type_ShuhaiShengyan;
        bean4.resId = R.mipmap.ic_m3_qg_xhgb;
        bean4.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%91%E4%BB%AC%E5%A7%8B%E7%BB%88%E8%A6%81%E5%AD%A6%E4%BC%9A%E5%91%8A%E5%88%AB.mp3";
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = ZhuanJiDataHelper.BEIFANGJIAREN;
        bean5.title = "我们记住的样子才是我们活过的样子";
        bean5.info = "国内首档以揭秘“电影里的生活,生活里的电影”为主题的漫谈式电视脱口秀日播栏目。 ";
        bean5.type = Type_Zongyi;
        bean5.resId = R.mipmap.ic_m3_qg_wmdyz;
        bean5.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%91%E4%BB%AC%E8%AE%B0%E4%BD%8F%E7%9A%84%E6%A0%B7%E5%AD%90%E6%89%8D%E6%98%AF%E6%88%91%E4%BB%AC%E6%B4%BB%E8%BF%87%E7%9A%84%E6%A0%B7%E5%AD%90.mp3";
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = ZhuanJiDataHelper.DALIAOGONGZHU;
        bean6.title = "我曾经那么渴望热闹";
        bean6.info = "叶武滨时间管理·2019全新升级， 首次公布时间管理九段法， 让你测到、学到、做到、得到， 10节课让你战胜拖延症，成为时间管理高手。";
        bean6.type = Type_ShuhaiShengyan;
        bean6.resId = R.mipmap.ic_m3_qg_kwrn;
        bean6.playUrl="https://staticfile.haimifm.com/2020_NMG/%E7%BB%BF%E9%87%8E%E4%B9%8B%E5%A3%B0%E9%9F%B3%E9%A2%91%E4%BD%9C%E5%93%81/%E6%88%91%E6%9B%BE%E7%BB%8F%E9%82%A3%E4%B9%88%E6%B8%B4%E6%9C%9B%E7%83%AD%E9%97%B9.MP3";
        list.add(bean6);

        return list;
    }

    public static List<ContentBean> getXiangsheng() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "大师相声精选";
        bean1.info = "说学逗唱精妙绝伦，吹棒嘲讽寓教育人。我们本着不是经典不选、不笑掉大牙不选、不让人回味无穷不选的原则，精选出马三立、侯宝林、刘宝瑞、马季等大师们呕心沥血的看家之作，为用户献上一段段百听不厌的相声好段子。";
        bean1.type = Type_Xiangsheng;
        bean1.countRead = "2.3万";
        bean1.albumNum = "32集";
        bean1.resId = R.mipmap.ic_local_xs_01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "《相声有新人》";
        bean2.info = "全国首档相声类综艺竞演节目。全国相声新人集结角逐，究竟谁将C位出道？";
        bean2.type = Type_Xiangsheng;
        bean2.countRead = "1.6万";
        bean2.albumNum = "12集";
        bean2.resId = R.mipmap.ic_local_xs_02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "唐杰忠相声集";
        bean3.info = "唐杰忠（1932—2017），著名相声表演艺术家。少年就读沈阳时，即学演相声。1949年参军做部队文工团团员，曾涉猎多种表演艺术，具有多才多艺的全面修养。1958年编、演相声《医生》、《探社》，分获广州军区文艺会演创作奖。1959年晋京深造，成为前辈相声艺术家刘宝瑞入室弟子，颇受教益。长期与马季、姜昆等相声名家合作，代表作品有《虎口遐想》、《新兵小传》、《找舅舅》等。";
        bean3.type = Type_Xiangsheng;
        bean3.countRead = "1.6万";
        bean3.albumNum = "30集";
        bean3.resId = R.mipmap.ic_local_xs_03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "马三立相声集";
        bean4.info = "马三立 ，著名相声表演大师，是一位德艺双馨的人民艺术家，擅演“贯口”和文哏段子。马三立在长期的艺术实践中潜心探索，创立了独具特色的“马氏相声”，是当时相声界年龄最长、辈分最高、资历最老、造诣最深的“相声泰斗”，深受社会各界及广大观众的热爱与尊敬。";
        bean4.type = Type_Xiangsheng;
        bean4.countRead = "3.6万";
        bean4.albumNum = "22集";
        bean4.resId = R.mipmap.ic_local_xs_04;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "徐德亮王文林相声精选";
        bean5.info = "徐德亮 被誉为曲艺界极传统与极现结合的另类，“新文哏”相声的尝试者和风格树立者。 王文林 从艺40余年，捧逗皆佳，并能创作。";
        bean5.type = Type_Xiangsheng;
        bean5.countRead = "1.3万";
        bean5.albumNum = "32集";
        bean5.resId = R.mipmap.ic_local_xs_05;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "大逗相声社";
        bean6.info = "大逗相声社，极具北京当地特色的相声社团。以“北京孩子讲北京话”为创作演出宗旨，演出自带京味儿，成团四年，已经是北京当地极具知名度的相声表演社团之一。";
        bean6.type = Type_Xiangsheng;
        bean6.countRead = "1.3万";
        bean6.albumNum = "32集";
        bean6.resId = R.mipmap.ic_local_xs_06;
        list.add(bean6);

        return list;
    }

    public static List<ContentBean> getBannerList() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = ZhuanJiDataHelper.HONGLANGDU;
        bean1.title = "红狼毒";
        bean1.info = "动画1-3岁女频男频磨耳朵";
        bean1.countRead = "72.5万";
        bean1.albumNum = "";
        bean1.ReadioMan = "小猪佩奇";
        bean1.duration = " 59:59";
        bean1.upDataTime = "2019-01-25";
        bean1.resId = R.mipmap.ic_local_syb1;
        list.add(bean1);

//        ContentBean bean2 = new ContentBean();
//        bean2.id = ZhuanJiDataHelper.RILUOHEICHENG;
//        bean2.title = "日落黑城";
//        bean2.info = "会员免费女频男频会员免费有声书";
//        bean2.countRead = "19.0万";
//        bean2.albumNum = "30集";
//        bean2.ReadioMan = "小猪佩奇";
//        bean2.duration = " 59:59";
//        bean2.upDataTime = "2019-01-25";
//        bean2.resId = R.mipmap.ic_local_syb2;
//        list.add(bean2);
//
//        ContentBean bean3 = new ContentBean();
//        bean3.id = ZhuanJiDataHelper.BEIFANGJIAREN;
//        bean3.title = "北方佳人";
//        bean3.info = "会员免费女频男频会员免费畅销书";
//        bean3.countRead = "19.9万";
//        bean3.albumNum = "30集";
//        bean3.ReadioMan = "读客熊猫君";
//        bean3.duration = "59:59";
//        bean3.upDataTime = "2019-06-28";
//        bean3.resId = R.mipmap.ic_local_syb3;
//        list.add(bean3);
//
//        ContentBean bean4 = new ContentBean();
//        bean4.id = ZhuanJiDataHelper.DALIAOGONGZHU;
//        bean4.title = "大辽公主";
//        bean4.info = "职场提升上班族沟通表达职场有声读物";
//        bean4.countRead = "---";
//        bean4.albumNum = "";
//        bean4.upDataTime = " 4小时前";
//        bean4.ReadioMan = " 爱播讲堂";
//        bean4.duration = "59:59";
//        bean4.resId = R.mipmap.ic_local_syb4;
//        list.add(bean4);
//
//        ContentBean bean5 = new ContentBean();
//        bean5.id = 4;
//        bean5.title = "樊登：实现成长";
//        bean5.info = "艺人访谈";
//        bean5.countRead = "1.0万";
//        bean5.albumNum = "";
//        bean5.upDataTime = "3天前";
//        bean5.ReadioMan = "嘉人";
//        bean5.duration = "59:59";
//        bean5.resId = R.mipmap.ic_local_banner_5;
//        list.add(bean5);
//
//        ContentBean bean6 = new ContentBean();
//        bean6.id = 5;
//        bean6.title = "朱元璋演义_1";
//        bean6.info = "古代刘兰芳明清";
//        bean6.countRead = "594.8万";
//        bean6.albumNum = "";
//        bean6.upDataTime = "2015-11-30";
//        bean6.ReadioMan = "包子爱油条";
//        bean6.duration = "59:59";
//        bean6.resId = R.mipmap.ic_local_banner_6;
//        list.add(bean6);
//
        return list;
    }

    //听书 新书速速的
    public static List<ContentBean> getTingShuXsSd() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "萨满往事【唐小豪悬疑新作】";
        bean1.info = "为调查萨满灵宫的真相，他们组成的铁三角与伪满、日寇展开了一场别开生面的斗智斗勇。";
        bean1.countRead = "32.9万";
        bean1.albumNum = "";
        bean1.ReadioMan = "小猪佩奇";
        bean1.duration = " 59:59";
        bean1.upDataTime = "2019-01-25";
        bean1.resId = R.mipmap.ic_local_ts_xssd_1;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "乾隆皇帝（全集）";
        bean2.info = "纪涵邦全新演绎二月河历史经典【付费精品】";
        bean2.countRead = "72.5万";
        bean2.albumNum = "";
        bean2.ReadioMan = "小猪佩奇";
        bean2.duration = " 59:59";
        bean2.upDataTime = "2019-01-25";
        bean2.resId = R.mipmap.ic_local_ts_xssd_2;
        list.add(bean2);


        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "曾国藩：儒雅的血性";
        bean3.info = "晚清危局拯救者，功高震主能善终";
        bean3.countRead = "12.5万";
        bean3.albumNum = "";
        bean3.ReadioMan = "小猪佩奇";
        bean3.duration = " 59:59";
        bean3.upDataTime = "2019-01-25";
        bean3.resId = R.mipmap.ic_local_ts_xssd_3;
        list.add(bean3);


        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "天坑";
        bean4.info = "一切恐怖诡异之事，尽在罪恶之天坑";
        bean4.countRead = "3215万";
        bean4.albumNum = "";
        bean4.ReadioMan = "小猪佩奇";
        bean4.duration = " 59:59";
        bean4.upDataTime = "2019-01-25";
        bean4.resId = R.mipmap.ic_local_ts_xssd_4;
        list.add(bean4);


        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "朝鲜战争：尘封六十年的内幕";
        bean5.info = "这是一场触目惊心、血雨腥风的生死决战。";
        bean5.countRead = "12.5万";
        bean5.albumNum = "";
        bean5.ReadioMan = "小猪佩奇";
        bean5.duration = " 59:59";
        bean5.upDataTime = "2019-01-25";
        bean5.resId = R.mipmap.ic_local_ts_xssd_5;
        list.add(bean5);


        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "你在高原（第五部）：忆阿雅";
        bean6.info = "讲述了“高原”人们的生存方式，穿插了家族历史及祖辈父辈的悲剧人生";
        bean6.countRead = "12.5万";
        bean6.albumNum = "";
        bean6.ReadioMan = "小猪佩奇";
        bean6.duration = " 59:59";
        bean6.upDataTime = "2019-01-25";
        bean6.resId = R.mipmap.ic_local_ts_xssd_6;
        list.add(bean6);


        ContentBean bean7 = new ContentBean();
        bean7.id = 0;
        bean7.title = "高智商犯罪（1-3部合集）";
        bean7.info = "本合集收录高智商犯罪系列3部作品，包括代上帝之手、化工女王的逆袭、物理教师的时空诡计。";
        bean7.countRead = "16.5万";
        bean7.albumNum = "";
        bean7.ReadioMan = "小猪佩奇";
        bean7.duration = " 59:59";
        bean7.upDataTime = "2019-01-25";
        bean7.resId = R.mipmap.ic_local_ts_xssd_7;
        list.add(bean7);


        ContentBean bean8 = new ContentBean();
        bean8.id = 0;
        bean8.title = "最后的八旗【周建龙演播】";
        bean8.info = "周建龙新作，王朝末日下的贵族";
        bean8.countRead = "72.5万";
        bean8.albumNum = "";
        bean8.ReadioMan = "小猪佩奇";
        bean8.duration = " 59:59";
        bean8.upDataTime = "2019-01-25";
        bean8.resId = R.mipmap.ic_local_ts_xssd_8;
        list.add(bean8);

        ContentBean bean9 = new ContentBean();
        bean9.id = 0;
        bean9.title = "逃亡的苏溪·徐然新作·旭东演播";
        bean9.info = "抓获毒贩的茶社又新发现女人尸体，警察迅速介入调查。 检察官苏溪从案发现场的目击证人变成全城通缉的嫌疑人。 一连串的事情在顷刻间接踵而至。 越狱犯卫东和挚爱着简妮，那苏溪为什么疲于奔命地帮助一个从来不认识的死刑犯卫东和？ 苏溪觉得自己深陷一场游戏中，游戏的规则就是不停地做任务，她以为完成了任务一，其实只是开启了任务二的隐藏属性。 检察官，死刑犯，刑警，毒枭，72小时亡命对决。 “苏溪，快逃！活下去，才能还他清白。”";
        bean9.countRead = "72.5万";
        bean9.albumNum = "";
        bean9.ReadioMan = "小猪佩奇";
        bean9.duration = " 59:59";
        bean9.upDataTime = "2019-01-25";
        bean9.resId = R.mipmap.ic_local_ts_xssd_9;
        list.add(bean9);
        return list;
    }

    public static List<ContentBean> getTingShuCxs() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "名著系列 简爱";
        bean1.info = "简·爱是个孤女，她出生于一个穷牧师家庭。不久父母相继去世。幼小的简·爱寄养在舅父母家里。舅父里德先生去世后，简·爱过了10年倍受尽歧视和虐待的生活。舅母把她视作眼中钉，并把她和自己的孩子隔离开来，从此，她与舅母的对抗更加公开和坚决了，简被送进了罗沃德孤儿院……";
        bean1.countRead = "32.9万";
        bean1.albumNum = "";
        bean1.ReadioMan = "小猪佩奇";
        bean1.duration = " 59:59";
        bean1.upDataTime = "2019-01-25";
        bean1.resId = R.mipmap.ic_local_tingshu_cxs_1;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "永恒的畅销经典";
        bean2.info = "岁月变迁，星移物换，总有一些什么，在历史的长河里永垂不朽。 许多年过去了，这些经典之作仍然吸引着一代又一代的人……";
        bean2.countRead = "32.9万";
        bean2.albumNum = "";
        bean2.ReadioMan = "小猪佩奇";
        bean2.duration = " 59:59";
        bean2.upDataTime = "2019-01-25";
        bean2.resId = R.mipmap.ic_local_tingshu_cxs_2;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "海长江说时间管理";
        bean3.info = "海长江，海有时间教育创始人，中国顶级自律IP，连续11年5点早起者";
        bean3.countRead = "32.9万";
        bean3.albumNum = "";
        bean3.ReadioMan = "小猪佩奇";
        bean3.duration = " 59:59";
        bean3.upDataTime = "2019-01-25";
        bean3.resId = R.mipmap.ic_local_tingshu_cxs_3;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "二战讲坛【全集】";
        bean4.info = "一段残酷的人类历史，一场惨烈的世界战争，用当代视角回顾二战，用军事视角翻阅历史！";
        bean4.countRead = "32.9万";
        bean4.albumNum = "";
        bean4.ReadioMan = "小猪佩奇";
        bean4.duration = " 59:59";
        bean4.upDataTime = "2019-01-25";
        bean4.resId = R.mipmap.ic_local_tingshu_cxs_4;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "沉睡的人鱼之家【东野圭吾作品】";
        bean5.info = "讲述一个关于“死亡”的故事，也是一个关于“生命”的故事";
        bean5.countRead = "32.9万";
        bean5.albumNum = "";
        bean5.ReadioMan = "小猪佩奇";
        bean5.duration = " 59:59";
        bean5.upDataTime = "2019-01-25";
        bean5.resId = R.mipmap.ic_local_tingshu_cxs_5;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "《流浪地球》原著-刘慈欣经典作品集：最璀璨的银河";
        bean6.info = "【限时免费】吴京主演《流浪地球》原著！会员畅听";
        bean6.countRead = "32.9万";
        bean6.albumNum = "";
        bean6.ReadioMan = "小猪佩奇";
        bean6.duration = " 59:59";
        bean6.upDataTime = "2019-01-25";
        bean6.resId = R.mipmap.ic_local_tingshu_cxs_6;
        list.add(bean6);

        ContentBean bean7 = new ContentBean();
        bean7.id = 0;
        bean7.title = "侯氏笔记";
        bean7.info = "10年摸爬滚打，逐层剥开茫茫名利场的现状与秘密。";
        bean7.countRead = "32.9万";
        bean7.albumNum = "";
        bean7.ReadioMan = "小猪佩奇";
        bean7.duration = " 59:59";
        bean7.upDataTime = "2019-01-25";
        bean7.resId = R.mipmap.ic_local_tingshu_cxs_7;
        list.add(bean7);

        ContentBean bean8 = new ContentBean();
        bean8.id = 0;
        bean8.title = "绝密档案";
        bean8.info = "注：近期有人在评论区冒充大碗，诸位小心提防，大碗本人不会在己方及任何其他节目的评论区现身。 悬疑案子，未解之谜，灵异事件… 是你我身边的玄幻？还是科学面纱下的伪装？ 还原事实，探索真相。 每周一下午四点，我们共同关注。 微/信/公/众/号：dawanshuogushi； 商务合作：dwjuemidangan@163.com。";
        bean8.countRead = "32.9万";
        bean8.albumNum = "";
        bean8.ReadioMan = "小猪佩奇";
        bean8.duration = " 59:59";
        bean8.upDataTime = "2019-01-25";
        bean8.resId = R.mipmap.ic_local_tingshu_cxs_8;
        list.add(bean8);

        ContentBean bean9 = new ContentBean();
        bean9.id = 0;
        bean9.title = "残酷才是青春";
        bean9.info = "青春为何残酷、迷茫、焦虑?为何经常感到无助不安?到底情为何物?为何做人比做事重要?为何不减少欲望就会增加欲望?为何自己活得不如人?为何缺什么都不能缺信仰?如何才能得到自己想要的一切";
        bean9.countRead = "32.9万";
        bean9.albumNum = "";
        bean9.ReadioMan = "小猪佩奇";
        bean9.duration = " 59:59";
        bean9.upDataTime = "2019-01-25";
        bean9.resId = R.mipmap.ic_local_tingshu_cxs_9;
        list.add(bean9);

        return list;
    }
}
