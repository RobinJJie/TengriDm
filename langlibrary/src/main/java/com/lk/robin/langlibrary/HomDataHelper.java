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
        bean1.id = 0;
        bean1.title = "怪物大师（第二季）";
        bean1.type = Type_ErTong;
        bean1.info = "千万孩子自主选择的冒险正能量故事续集来袭！跟着布布路和他的小伙伴们继续踏上成为优秀怪物大师的历练之旅吧";
        bean1.resId = R.mipmap.ic_local_et_zwdzjs1;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 1;
        bean2.title = "植物大战僵尸之功夫世界";
        bean2.type = Type_ErTong;
        bean2.info = "【每周六，每周日更新一集】故事结合孩子们最喜欢的时空穿越与冒险元素，融入大量奇思妙想的创意，彻底放飞想象力，精彩刺激乐不听。小朋友们，和我们一起坐上时空穿越车潘妮，跟随疯狂的戴夫、勇敢的豌豆射手和其他植物伙伴们，开启一段跌宕起伏的功夫世界之旅吧！";
        bean2.resId = R.mipmap.ic_local_et_zwdzjs_gfsj;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 2;
        bean3.title = "米小圈快乐西游记";
        bean3.type = Type_ErTong;
        bean3.info = "米小圈化身孙悟空斩妖除魔";
        bean3.resId = R.mipmap.ic_local_et_mxsyj;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 3;
        bean4.title = "张杨果而·童话王国";
        bean4.type = Type_ErTong;
        bean4.info = "《张杨果而·童话王国》是著名主持人张杨果而精心策划、制作的原创童话故事专辑。果儿姐姐期望能通过这些脑洞大开又色彩丰富的童话故事，开发小宝贝们的想象力、观察力、逻辑力、判断力、感悟力等潜能，帮助孩子们打造那专属于自己的独一无二的童话故事王国。欢迎关注公众号：果酱故事（guojianggushi），在【果酱故事】里有更多精选的好故事！2019年1月1日起，每周六、日上午7:00更新。";
        bean4.resId = R.mipmap.ic_local_et_thwg;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 4;
        bean5.title = "鼓捣三字经";
        bean5.type = Type_ErTong;
        bean5.info = "鼓捣猫爸教你用说唱诵的方式 玩转国学经典";
        bean5.resId = R.mipmap.ic_local_et_gdszj;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 5;
        bean6.title = "《冒险小王子》睡前童话故事【全集】";
        bean6.type = Type_ErTong;
        bean6.info = "《冒险小王子》的故事从内容的编排到情节的跌宕起伏，每一个环节都紧扣着“励志”、“坚持”的主题，精彩的故事配合恰如其分的配乐，代入感超棒！无论是与朋友的真挚友谊，还是不屈不挠的意志和勇气，每个孩子都能找到共鸣！这正是现在的孩子迫切需要的。让孩子听到高质量的故事是我们的责任！ 【更新频率】 每天更新1集，假期节日不断更！";
        bean6.resId = R.mipmap.ic_local_et_msswz;
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
        bean1.id = 0;
        bean1.title = "沉睡的人鱼之家【东野圭吾作品】";
        bean1.info = "讲述一个关于“死亡”的故事，也是一个关于“生命”的故事";
        bean1.type = Type_ShuhaiShengyan;
        bean1.resId = R.mipmap.ic_local_shsy_1;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 1;
        bean2.title = "侯氏笔记";
        bean2.info = "10年摸爬滚打，逐层剥开茫茫名利场的现状与秘密。";
        bean2.type = Type_ShuhaiShengyan;
        bean2.resId = R.mipmap.ic_local_shsy_2;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 2;
        bean3.title = "《流浪地球》原著-刘慈欣经典作品集：最璀璨的银河";
        bean3.info = "【限时免费】吴京主演《流浪地球》原著！会员畅听";
        bean3.type = Type_ShuhaiShengyan;
        bean3.resId = R.mipmap.ic_local_shsy_3;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 3;
        bean4.title = "绝密档案";
        bean4.info = "注：近期有人在评论区冒充大碗，诸位小心提防，大碗本人不会在己方及任何其他节目的评论区现身。 悬疑案子，未解之谜，灵异事件… 是你我身边的玄幻？还是科学面纱下的伪装？ 还原事实，探索真相。 每周一下午四点，我们共同关注。 微/信/公/众/号：dawanshuogushi； 商务合作：dwjuemidangan@163.com。";
        bean4.type = Type_ShuhaiShengyan;
        bean4.resId = R.mipmap.ic_local_shsy_4;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 4;
        bean5.title = "吴晓波推荐管理必学课：团队管理40条军规";
        bean5.info = "超50万人学习的 Google 管理智慧";
        bean5.type = Type_ShuhaiShengyan;
        bean5.resId = R.mipmap.ic_local_shsy_5;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 5;
        bean6.title = "叶武滨时间管理九段";
        bean6.info = "叶武滨时间管理·2019全新升级， 首次公布时间管理九段法， 让你测到、学到、做到、得到， 10节课让你战胜拖延症，成为时间管理高手。";
        bean6.type = Type_ShuhaiShengyan;
        bean6.resId = R.mipmap.ic_local_shsy_6;
        list.add(bean6);

        ContentBean bean7 = new ContentBean();
        bean7.id = 6;
        bean7.title = "人类未解之谜";
        bean7.info = "人类未解之谜指的是人类还未解密的一些现象。在漫漫的历史长河中，人类创造了很多奇迹，又留下了很多谜团，人类至今也没能破解其中的奥秘。";
        bean7.type = Type_ShuhaiShengyan;
        bean7.resId = R.mipmap.ic_local_shsy_7;
        list.add(bean7);

        ContentBean bean8 = new ContentBean();
        bean8.id = 7;
        bean8.title = "千叶医生联盟：你的私人健康顾问";
        bean8.info = "千叶医生联盟，你的私人健康顾问 1年精心打磨，56期节目横扫健康误区 10位顶级专家，是你全程陪伴的私人顾问 100位医学博士，为常见疾病快速支招 1000篇文献数据，验证实用高效的就医攻略";
        bean8.type = Type_ShuhaiShengyan;
        bean8.resId = R.mipmap.ic_local_shsy_1;
        list.add(bean8);

        return list;
    }

    public static List<ContentBean> getYizhouShudan() {
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "蒋勋细说红楼梦";
        bean1.info = "【关注公众号：蒋勋（ID：jiangxunfm），获取更多蒋勋独家内容】 这是蒋勋老师在长达半个世纪的时间中反复阅读《红楼梦》三十多遍后的系列讲座录音集，蒋勋从美的角度，从情感出发梳理《红楼梦》文本中渗透出的细微感觉。 主播介绍 蒋勋——当代华人世界的文化教父，他是美学大师、诗人、小说家、演讲者、画家、名校教授。 课程大纲 每天能阅读一点就阅读一点,是读《红楼梦》最好的方法，一起跟随蒋勋老师的声音，在阅读《红楼梦》的日夜里慢慢修行！ 你将获得 1、理解每一个红楼人物，看不同形式的生命 2、从红楼中看到自己，看透中国人情社会，启发智慧 3、像大师一样欣赏红楼，读懂红楼，观照自身 4、蒋勋质感声音陪伴，夜晚暖心伴读";
        bean1.type = Type_YizhouShudian;
        bean1.countRead = "3.8";
        bean1.resId = R.mipmap.ic_local_yzsd_01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 1;
        bean2.title = "齐俊杰的财经读书圈";
        bean2.info = "每天十分钟，轻松解读财商经典 主播介绍 齐俊杰：新一代财经专栏作家，投资人，获得2016年今日头条评选的十大财经自媒体称号，是头条、百度、新浪、腾讯企鹅号、阿里大鱼号的年度签约财经作者，曾获得克劳锐金融自媒体第三名，清博指数财经网红全国排名第五位。 课程大纲 1、腾讯传 2、战胜华尔街 3、不良少年巴菲特 4、历代经济变革得失 5、投资中最简单的事 6、为什么中国人勤劳而不富有 你将获得 1、视角：投资人和专业财经作家，媒体人的视角； 2、实用：理论联系实际 把经典内容带入节目； 3、帮忙：个人视野和能力得到提升； 4、帮闲：丰富自己的财经知识，以及历史案例。";
        bean2.type = Type_YizhouShudian;
        bean2.countRead = "3.1";
        bean2.resId = R.mipmap.ic_local_yzsd_02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "雷军亲述独家创业心法";
        bean3.info = "一次get雷布斯的19个核心技能";
        bean3.type = Type_YizhouShudian;
        bean3.countRead = "2.3";
        bean3.resId = R.mipmap.ic_local_yzsd_03;
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
        bean1.id = 0;
        bean1.title = "老梁说电影";
        bean1.info = "国内首档以揭秘“电影里的生活,生活里的电影”为主题的漫谈式电视脱口秀日播栏目。 ";
        bean1.type = Type_Zongyi;
        bean1.resId = R.mipmap.ic_loacl_zy_01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "宋小宝综艺小品爆笑合集";
        bean2.info = "宋小宝近年火爆全国，受邀各大综艺，参加《欢乐喜剧人》、《食在囧途》、《笑声传奇》、《欢乐总动员》等，给更多观众带来欢乐。";
        bean2.type = Type_Zongyi;
        bean2.resId = R.mipmap.ic_loacl_zy_02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "《相声有新人》";
        bean3.info = "全国首档相声类综艺竞演节目。全国相声新人集结角逐，究竟谁将C位出道？";
        bean3.type = Type_Zongyi;
        bean3.resId = R.mipmap.ic_loacl_zy_03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "我是唱作人";
        bean4.info = "最近很火的一档音乐类综艺，里面有很多优秀的华语音乐人，介绍给大家。\n";
        bean4.type = Type_Zongyi;
        bean4.resId = R.mipmap.ic_loacl_zy_04;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "蔡康永演讲集";
        bean5.info = "蔡康永，中国台湾节目主持人、作家、编剧，与徐熙娣搭档主持综艺访谈节目《康熙来了》深受观众喜爱，曾夺得金钟奖最佳综艺节目主持人奖，7度主持金马奖颁奖典礼。2014年正式进入内地，参与中国首档说话达人秀《奇葩说》。出版过《那些男孩教我的事》、《蔡康永的说话之道》等多本著作。";
        bean5.type = Type_Zongyi;
        bean5.resId = R.mipmap.ic_loacl_zy_05;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "东北F4欢乐集结号";
        bean6.info = "东北F4（东北天团）是由莱昂纳多·小沈阳、约翰尼·宋小宝、克里斯蒂安·刘能、尼古拉斯·赵四四个人物组成。四个人在戏剧界有着举足轻重的地位，他们的出现给中国喜剧界带来更多精彩的作品。";
        bean6.type = Type_Zongyi;
        bean6.resId = R.mipmap.ic_loacl_zy_06;
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
        bean1.id = 0;
        bean1.title = "原来你也在这里";
        bean1.info = "个人公号“晓慧主播”。于千万人中，刚巧遇见了你……";
        bean1.type = Type_Qingan;
        bean1.resId = R.mipmap.ic_local_qg_01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 0;
        bean2.title = "我要活得无可取代";
        bean2.info = "女性心理健康，积极应对工作与生活，探讨人生价值等 新浪微博:妍妍淼 微信：yanyan2lg qq:83408201";
        bean2.type = Type_Qingan;
        bean2.resId = R.mipmap.ic_local_qg_02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "程一电台";
        bean3.info = "声音是有温度的，夜晚的声音会发光。睡前一段优美文字，一首暖心歌曲。程一电台，用声音温暖每个有你的夜晚，在你耳边伴你入眠。新浪微博：DJ程一，微信公众号：DJ程一（ID : djchengyi），QQ群：348166503（①群），384016829（②群）。";
        bean3.type = Type_Qingan;
        bean3.resId = R.mipmap.ic_local_qg_03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "一程有你";
        bean4.info = "［一程有你］是程一电台联合蜻蜓FM打造的一档全新名人音频访谈栏目，由国内顶级网络电台主播程一主持，歌手、作家、自媒体红人等各界名人都是我们的座上客。 一程有你，倒过来是“你有程一”，感谢一程有你，也希望程一能够为你带来新的惊喜。";
        bean4.type = Type_Qingan;
        bean4.resId = R.mipmap.ic_local_qg_04;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "北辰在找你";
        bean5.info = "CNR中国交通广播FM99.6精品节目《北辰在找你》，公 众 号:北辰在找你。";
        bean5.type = Type_Qingan;
        bean5.resId = R.mipmap.ic_local_qg_05;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 0;
        bean6.title = "偶遇鲁小胖";
        bean6.info = "关注鲁豫有约微信公众号，把你的故事写给我，每周与你偶遇。 【偶遇】新板块【鲁小胖和你一起看电影】已上线。 如果你也喜欢电影，如果你也想通过电影去满足对未知生活的好奇，欢迎关注鲁豫有约微信公众号，每周鲁小胖和你一起，聊聊与电影相关的故事，感受不一样的人生，遇见另一个自己。 如何加入【偶遇观影团】：关注【鲁豫有约】公众号，底部菜单点击【偶遇观影团】 收听方式：每周三【鲁豫有约】公众号首发。";
        bean6.type = Type_Qingan;
        bean6.resId = R.mipmap.ic_local_qg_06;
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
        bean1.id = 0;
        bean1.title = "英文第一季】01泥坑 Muddy Puddles";
        bean1.info = "动画1-3岁女频男频磨耳朵";
        bean1.countRead = "72.5万";
        bean1.albumNum = "";
        bean1.ReadioMan = "小猪佩奇";
        bean1.duration = " 59:59";
        bean1.upDataTime = "2019-01-25";
        bean1.resId = R.mipmap.ic_local_banner_1;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 1;
        bean2.title = "省委书记01";
        bean2.info = "会员免费女频男频会员免费有声书";
        bean2.countRead = "19.0万";
        bean2.albumNum = "30集";
        bean2.ReadioMan = "小猪佩奇";
        bean2.duration = " 59:59";
        bean2.upDataTime = "2019-01-25";
        bean2.resId = R.mipmap.ic_local_banner_2;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 2;
        bean3.title = "001-教父";
        bean3.info = "会员免费女频男频会员免费畅销书";
        bean3.countRead = "19.9万";
        bean3.albumNum = "30集";
        bean3.ReadioMan = "读客熊猫君";
        bean3.duration = "59:59";
        bean3.upDataTime = "2019-06-28";
        bean3.resId = R.mipmap.ic_local_banner_3;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 3;
        bean4.title = "我们的困难在哪里？—— 重视解决问题的人，还是发现问题的人？";
        bean4.info = "职场提升上班族沟通表达职场有声读物";
        bean4.countRead = "---";
        bean4.albumNum = "";
        bean4.upDataTime = " 4小时前";
        bean4.ReadioMan = " 爱播讲堂";
        bean4.duration = "59:59";
        bean4.resId = R.mipmap.ic_local_banner_4;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 4;
        bean5.title = "樊登：实现成长";
        bean5.info = "艺人访谈";
        bean5.countRead = "1.0万";
        bean5.albumNum = "";
        bean5.upDataTime = "3天前";
        bean5.ReadioMan = "嘉人";
        bean5.duration = "59:59";
        bean5.resId = R.mipmap.ic_local_banner_5;
        list.add(bean5);

        ContentBean bean6 = new ContentBean();
        bean6.id = 5;
        bean6.title = "朱元璋演义_1";
        bean6.info = "古代刘兰芳明清";
        bean6.countRead = "594.8万";
        bean6.albumNum = "";
        bean6.upDataTime = "2015-11-30";
        bean6.ReadioMan = "包子爱油条";
        bean6.duration = "59:59";
        bean6.resId = R.mipmap.ic_local_banner_6;
        list.add(bean6);

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
