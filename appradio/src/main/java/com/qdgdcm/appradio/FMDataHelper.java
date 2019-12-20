package com.qdgdcm.appradio;

import com.lk.robin.langlibrary.bean.ContentBean;

import java.util.ArrayList;
import java.util.List;

public class FMDataHelper {
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

    public static List<ContentBean> getYizhouShudan(){
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "蒋勋细说红楼梦";
        bean1.info = "【关注公众号：蒋勋（ID：jiangxunfm），获取更多蒋勋独家内容】 这是蒋勋老师在长达半个世纪的时间中反复阅读《红楼梦》三十多遍后的系列讲座录音集，蒋勋从美的角度，从情感出发梳理《红楼梦》文本中渗透出的细微感觉。 主播介绍 蒋勋——当代华人世界的文化教父，他是美学大师、诗人、小说家、演讲者、画家、名校教授。 课程大纲 每天能阅读一点就阅读一点,是读《红楼梦》最好的方法，一起跟随蒋勋老师的声音，在阅读《红楼梦》的日夜里慢慢修行！ 你将获得 1、理解每一个红楼人物，看不同形式的生命 2、从红楼中看到自己，看透中国人情社会，启发智慧 3、像大师一样欣赏红楼，读懂红楼，观照自身 4、蒋勋质感声音陪伴，夜晚暖心伴读";
        bean1.type = Type_YizhouShudian;
        bean1.countRead="3.8";
        bean1.resId = R.mipmap.ic_local_yzsd_01;
        list.add(bean1);

        ContentBean bean2 = new ContentBean();
        bean2.id = 1;
        bean2.title = "齐俊杰的财经读书圈";
        bean2.info = "每天十分钟，轻松解读财商经典 主播介绍 齐俊杰：新一代财经专栏作家，投资人，获得2016年今日头条评选的十大财经自媒体称号，是头条、百度、新浪、腾讯企鹅号、阿里大鱼号的年度签约财经作者，曾获得克劳锐金融自媒体第三名，清博指数财经网红全国排名第五位。 课程大纲 1、腾讯传 2、战胜华尔街 3、不良少年巴菲特 4、历代经济变革得失 5、投资中最简单的事 6、为什么中国人勤劳而不富有 你将获得 1、视角：投资人和专业财经作家，媒体人的视角； 2、实用：理论联系实际 把经典内容带入节目； 3、帮忙：个人视野和能力得到提升； 4、帮闲：丰富自己的财经知识，以及历史案例。";
        bean2.type = Type_YizhouShudian;
        bean2.countRead="3.1";
        bean2.resId = R.mipmap.ic_local_yzsd_02;
        list.add(bean2);

        ContentBean bean3 = new ContentBean();
        bean3.id = 0;
        bean3.title = "雷军亲述独家创业心法";
        bean3.info = "一次get雷布斯的19个核心技能";
        bean3.type = Type_YizhouShudian;
        bean3.countRead="2.3";
        bean3.resId = R.mipmap.ic_local_yzsd_03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "超高效时间管理课";
        bean4.info = "吴晓波力荐的时间管理课";
        bean4.type = Type_YizhouShudian;
        bean4.countRead="4.6";
        bean4.resId = R.mipmap.ic_local_yzsd_04;
        list.add(bean4);

        ContentBean bean5 = new ContentBean();
        bean5.id = 0;
        bean5.title = "团队管理每日谈";
        bean5.info = "什么最难管？管人啊！管理重在管，还是理？ 一起读大咖观点，每天学习管理之道。";
        bean5.type = Type_YizhouShudian;
        bean5.countRead="5.3";
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


    public static List<ContentBean> getZongyiList(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean1=new ContentBean();
        bean1.id = 0;
        bean1.title = "老梁说电影";
        bean1.info = "";
        bean1.type = Type_Zongyi;
        bean1.resId = R.mipmap.ic_loacl_zy_01;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "宋小宝综艺小品爆笑合集";
        bean2.info = "宋小宝近年火爆全国，受邀各大综艺，参加《欢乐喜剧人》、《食在囧途》、《笑声传奇》、《欢乐总动员》等，给更多观众带来欢乐。";
        bean2.type = Type_Zongyi;
        bean2.resId = R.mipmap.ic_loacl_zy_02;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "《相声有新人》";
        bean3.info = "全国首档相声类综艺竞演节目。全国相声新人集结角逐，究竟谁将C位出道？";
        bean3.type = Type_Zongyi;
        bean3.resId = R.mipmap.ic_loacl_zy_03;
        list.add(bean3);

        ContentBean bean4=new ContentBean();
        bean4.id = 0;
        bean4.title = "我是唱作人";
        bean4.info = "最近很火的一档音乐类综艺，里面有很多优秀的华语音乐人，介绍给大家。\n";
        bean4.type = Type_Zongyi;
        bean4.resId = R.mipmap.ic_loacl_zy_04;
        list.add(bean4);

        ContentBean bean5=new ContentBean();
        bean5.id = 0;
        bean5.title = "蔡康永演讲集";
        bean5.info = "蔡康永，中国台湾节目主持人、作家、编剧，与徐熙娣搭档主持综艺访谈节目《康熙来了》深受观众喜爱，曾夺得金钟奖最佳综艺节目主持人奖，7度主持金马奖颁奖典礼。2014年正式进入内地，参与中国首档说话达人秀《奇葩说》。出版过《那些男孩教我的事》、《蔡康永的说话之道》等多本著作。";
        bean5.type = Type_Zongyi;
        bean5.resId = R.mipmap.ic_loacl_zy_05;
        list.add(bean5);

        ContentBean bean6=new ContentBean();
        bean6.id = 0;
        bean6.title = "东北F4欢乐集结号";
        bean6.info = "东北F4（东北天团）是由莱昂纳多·小沈阳、约翰尼·宋小宝、克里斯蒂安·刘能、尼古拉斯·赵四四个人物组成。四个人在戏剧界有着举足轻重的地位，他们的出现给中国喜剧界带来更多精彩的作品。";
        bean6.type = Type_Zongyi;
        bean6.resId = R.mipmap.ic_loacl_zy_06;
        list.add(bean6);

        ContentBean bean7=new ContentBean();
        bean7.id = 0;
        bean7.title = "中国梦中国路";
        bean7.info = "聆听中南海的声音，追随习大大的身影，演绎中国故事，讲述中国道路，彰显中国精神，汇聚中国力量，坚守共同的中国梦。";
        bean7.type = Type_Zongyi;
        bean7.resId = R.mipmap.ic_loacl_zy_01;
        list.add(bean7);

        ContentBean bean8=new ContentBean();
        bean8.id = 0;
        bean8.title = "中国好声音";
        bean8.info = "浙江卫视&灿星制作联合出品原创音乐评论类节目《中国好声音》";
        bean8.type = Type_Zongyi;
        bean8.resId = R.mipmap.ic_loacl_zy_01;
        list.add(bean8);

        return list;
    }

    public static List<ContentBean> getQingGanList(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean1=new ContentBean();
        bean1.id = 0;
        bean1.title = "原来你也在这里";
        bean1.info = "个人公号“晓慧主播”。于千万人中，刚巧遇见了你……";
        bean1.type = Type_Qingan;
        bean1.resId = R.mipmap.ic_local_qg_01;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "我要活得无可取代";
        bean2.info = "女性心理健康，积极应对工作与生活，探讨人生价值等 新浪微博:妍妍淼 微信：yanyan2lg qq:83408201";
        bean2.type = Type_Qingan;
        bean2.resId = R.mipmap.ic_local_qg_02;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "程一电台";
        bean3.info = "声音是有温度的，夜晚的声音会发光。睡前一段优美文字，一首暖心歌曲。程一电台，用声音温暖每个有你的夜晚，在你耳边伴你入眠。新浪微博：DJ程一，微信公众号：DJ程一（ID : djchengyi），QQ群：348166503（①群），384016829（②群）。";
        bean3.type = Type_Qingan;
        bean3.resId = R.mipmap.ic_local_qg_03;
        list.add(bean3);

        ContentBean bean4=new ContentBean();
        bean4.id = 0;
        bean4.title = "一程有你";
        bean4.info = "［一程有你］是程一电台联合蜻蜓FM打造的一档全新名人音频访谈栏目，由国内顶级网络电台主播程一主持，歌手、作家、自媒体红人等各界名人都是我们的座上客。 一程有你，倒过来是“你有程一”，感谢一程有你，也希望程一能够为你带来新的惊喜。";
        bean4.type = Type_Qingan;
        bean4.resId = R.mipmap.ic_local_qg_04;
        list.add(bean4);

        ContentBean bean5=new ContentBean();
        bean5.id = 0;
        bean5.title = "北辰在找你";
        bean5.info = "CNR中国交通广播FM99.6精品节目《北辰在找你》，公 众 号:北辰在找你。";
        bean5.type = Type_Qingan;
        bean5.resId = R.mipmap.ic_local_qg_05;
        list.add(bean5);

        ContentBean bean6=new ContentBean();
        bean6.id = 0;
        bean6.title = "偶遇鲁小胖";
        bean6.info = "关注鲁豫有约微信公众号，把你的故事写给我，每周与你偶遇。 【偶遇】新板块【鲁小胖和你一起看电影】已上线。 如果你也喜欢电影，如果你也想通过电影去满足对未知生活的好奇，欢迎关注鲁豫有约微信公众号，每周鲁小胖和你一起，聊聊与电影相关的故事，感受不一样的人生，遇见另一个自己。 如何加入【偶遇观影团】：关注【鲁豫有约】公众号，底部菜单点击【偶遇观影团】 收听方式：每周三【鲁豫有约】公众号首发。";
        bean6.type = Type_Qingan;
        bean6.resId = R.mipmap.ic_local_qg_06;
        list.add(bean6);

        return list;
    }

    public static List<ContentBean> getXiangsheng(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean1=new ContentBean();
        bean1.id = 0;
        bean1.title = "大师相声精选";
        bean1.info = "说学逗唱精妙绝伦，吹棒嘲讽寓教育人。我们本着不是经典不选、不笑掉大牙不选、不让人回味无穷不选的原则，精选出马三立、侯宝林、刘宝瑞、马季等大师们呕心沥血的看家之作，为用户献上一段段百听不厌的相声好段子。";
        bean1.type = Type_Xiangsheng;
        bean1.countRead="2.3万";
        bean1.albumNum="32集";
        bean1.resId = R.mipmap.ic_local_xs_01;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "《相声有新人》";
        bean2.info = "全国首档相声类综艺竞演节目。全国相声新人集结角逐，究竟谁将C位出道？";
        bean2.type = Type_Xiangsheng;
        bean2.countRead="1.6万";
        bean2.albumNum="12集";
        bean2.resId = R.mipmap.ic_local_xs_02;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "唐杰忠相声集";
        bean3.info = "唐杰忠（1932—2017），著名相声表演艺术家。少年就读沈阳时，即学演相声。1949年参军做部队文工团团员，曾涉猎多种表演艺术，具有多才多艺的全面修养。1958年编、演相声《医生》、《探社》，分获广州军区文艺会演创作奖。1959年晋京深造，成为前辈相声艺术家刘宝瑞入室弟子，颇受教益。长期与马季、姜昆等相声名家合作，代表作品有《虎口遐想》、《新兵小传》、《找舅舅》等。";
        bean3.type = Type_Xiangsheng;
        bean3.countRead="1.6万";
        bean3.albumNum="30集";
        bean3.resId = R.mipmap.ic_local_xs_03;
        list.add(bean3);

        ContentBean bean4=new ContentBean();
        bean4.id = 0;
        bean4.title = "马三立相声集";
        bean4.info = "马三立 ，著名相声表演大师，是一位德艺双馨的人民艺术家，擅演“贯口”和文哏段子。马三立在长期的艺术实践中潜心探索，创立了独具特色的“马氏相声”，是当时相声界年龄最长、辈分最高、资历最老、造诣最深的“相声泰斗”，深受社会各界及广大观众的热爱与尊敬。";
        bean4.type = Type_Xiangsheng;
        bean4.countRead="3.6万";
        bean4.albumNum="22集";
        bean4.resId = R.mipmap.ic_local_xs_04;
        list.add(bean4);

        ContentBean bean5=new ContentBean();
        bean5.id = 0;
        bean5.title = "徐德亮王文林相声精选";
        bean5.info = "徐德亮 被誉为曲艺界极传统与极现结合的另类，“新文哏”相声的尝试者和风格树立者。 王文林 从艺40余年，捧逗皆佳，并能创作。";
        bean5.type = Type_Xiangsheng;
        bean5.countRead="1.3万";
        bean5.albumNum="32集";
        bean5.resId = R.mipmap.ic_local_xs_05;
        list.add(bean5);

        ContentBean bean6=new ContentBean();
        bean6.id = 0;
        bean6.title = "大逗相声社";
        bean6.info = "大逗相声社，极具北京当地特色的相声社团。以“北京孩子讲北京话”为创作演出宗旨，演出自带京味儿，成团四年，已经是北京当地极具知名度的相声表演社团之一。";
        bean6.type = Type_Xiangsheng;
        bean6.countRead="1.3万";
        bean6.albumNum="32集";
        bean6.resId = R.mipmap.ic_local_xs_06;
        list.add(bean6);

        return list;
    }


    public static List<ContentBean> getFMList(){
        List<ContentBean> list=new ArrayList<>();
        ContentBean bean1=new ContentBean();
        bean1.id = 0;
        bean1.title = "内蒙古交通之声";
        bean1.info = "内蒙古交通之声定位于专业交通广播，立足交通、服务大众，以“资讯•路况•短信•话题•热线”为主线，努力营造“快乐交通 • 快乐广播”的氛围。交通之声以FM105.6同频覆盖内蒙古全境，收听率、市场占有率、覆盖率及忠诚度均位居同行业前列。" ;
        bean1.type = Type_Xiangsheng;
        bean1.countRead="2.3万";
        bean1.albumNum="32集";
        bean1.resId = R.mipmap.ic_local_fmdf_02;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "内蒙古新闻广播";
        bean2.info = "这里是内蒙古新闻广播。";
        bean2.type = Type_Xiangsheng;
        bean2.countRead="1.6万";
        bean2.albumNum="12集";
        bean2.resId = R.mipmap.ic_local_xs_01;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "赤峰蒙古语综合广播";
        bean3.info = "赤峰广播电视台蒙古语综合节目是面向国内外广大蒙古族听众，以新闻节目为龙头，以社教文艺节目为两翼的综合性广播。";
        bean3.type = Type_Xiangsheng;
        bean3.countRead="1.6万";
        bean3.albumNum="30集";
        bean3.resId = R.mipmap.ic_local_fmdf_03;
        list.add(bean3);

        ContentBean bean4=new ContentBean();
        bean4.id = 0;
        bean4.title = "内蒙古草原之声广播";
        bean4.info = "";
        bean4.type = Type_Xiangsheng;
        bean4.countRead="3.6万";
        bean4.albumNum="22集";
        bean4.resId = R.mipmap.ic_local_fmdf_04;
        list.add(bean4);
        return list;
    }


    public static List<ContentBean> getYYSList(){
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "CNR经典音乐广播";
        bean1.info = "中央广播电视总台经典音乐广播（Golden Radio）是国家级专业音乐广播，主要播出交响乐、民族音乐、经典流行音乐 。";
        bean1.type = Type_Xiangsheng;
        bean1.countRead="2.3万";
        bean1.albumNum="32集";
        bean1.resId = R.mipmap.ic_local_fm_01;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "CNR音乐之声";
        bean2.info = "\"有一种快乐，在空中听见，Music Radio旋律在蔓延......感动让你听见——我要我的音乐\"，音乐之声是全华语市场最专业流行音乐频率，中国知名类型化流行音乐频率，覆盖全国，打破以往音乐广播板块型播出形态.";
        bean2.type = Type_Xiangsheng;
        bean2.countRead="1.6万";
        bean2.albumNum="12集";
        bean2.resId = R.mipmap.ic_local_fm_02;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "摇滚天空台";
        bean3.info = "爱摇人群的时尚爬，奔放的电吉他SOLO、热血的青春鼓点、让你体验重金属嗓音带来声音快感。";
        bean3.type = Type_Xiangsheng;
        bean3.countRead="1.6万";
        bean3.albumNum="30集";
        bean3.resId = R.mipmap.ic_local_fm_03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "80后音悦台";
        bean4.info = "80后男人的聚集地，我们一起选择高品质、懂生活的声音，我们一起享受上班下班寂寞的时光。";
        bean4.type = Type_Xiangsheng;
        bean4.countRead="3.6万";
        bean4.albumNum="22集";
        bean4.resId = R.mipmap.ic_local_fm_04;
        list.add(bean4);

        ContentBean bean5=new ContentBean();
        bean5.id = 0;
        bean5.title = "包头汽车音乐广播";
        bean5.info = "包头人民广播电台城乡音乐广播FM100.1于2008年的2月28日开播，是全区首个24小时不间断播出的专业音乐电台";
        bean5.type = Type_Xiangsheng;
        bean5.countRead="3.6万";
        bean5.albumNum="22集";
        bean5.resId = R.mipmap.ic_local_fm_05;
        list.add(bean5);

        ContentBean bean6=new ContentBean();
        bean6.id = 0;
        bean6.title = "猫巷有声广播";
        bean6.info = "用声音为你的耳朵取暖,聆听猫巷有声，带给您喧嚣城市中的片刻安宁！";
        bean6.type = Type_Xiangsheng;
        bean6.countRead="3.6万";
        bean6.albumNum="22集";
        bean6.resId = R.mipmap.ic_local_fm_06;
        list.add(bean6);

        ContentBean bean7=new ContentBean();
        bean7.id = 0;
        bean7.title = "CRI HIT FM";
        bean7.info = "Hit FM是中国国际广播电台旗下的国际流行音乐频率，2003年4月16日开始在北京试播。";
        bean7.type = Type_Xiangsheng;
        bean7.countRead="3.6万";
        bean7.albumNum="22集";
        bean7.resId = R.mipmap.ic_local_fm_07;
        list.add(bean7);

        return list;
    }

    public static List<ContentBean> getYangShiList(){
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "CNR中国之声";
        bean1.info = "中国之声――中央人民广播电台最悠久的第一套节目，中国国家电台最具权威的新闻综合广播；全天24小时不间断播音，遍布海内外数百家电台、与上千名记者全面合作。";
        bean1.type = Type_Guangbo;
        bean1.countRead="2.3万";
        bean1.albumNum="32集";
        bean1.resId = R.mipmap.ic_loacl_ys01;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "CNR经济之声";
        bean2.info = "中央人民广播电台经济之声是中国最有影响力的财经广播，也是唯一一套覆盖全国的财经专业媒体，覆盖全国3亿多以城市为主体的广播听众。经济之声立足于“国家级现代传媒机构”的定位，传播全球最新财经资讯，引领经济话语，是中国最具成长性的专业财经媒体。";
        bean2.type = Type_Guangbo;
        bean2.countRead="1.6万";
        bean2.albumNum="12集";
        bean2.resId = R.mipmap.ic_loacl_ys02;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "CNR音乐之声";
        bean3.info = "\"有一种快乐，在空中听见，Music Radio旋律在蔓延......感动让你听见——我要我的音乐\"，音乐之声是全华语市场最专业流行音乐频率，中国知名类型化流行音乐频率，覆盖全国，打破以往音乐广播板块型播出形态.";
        bean3.type = Type_Guangbo;
        bean3.countRead="1.6万";
        bean3.albumNum="30集";
        bean3.resId = R.mipmap.ic_loacl_ys03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "全球华语音乐之声";
        bean4.info = "打造全国首家音乐榜单电台 集结百家广播电台音乐力量 制作流行 创造奇迹 FM99.9M-Radio全球华语音乐之声 来自火星的音乐广播 Music Master From Mars M-Radio全球华语音乐之声是KMG旗下优质音乐电台，多档优秀节目深受全国听众喜欢。";
        bean4.type = Type_Guangbo;
        bean4.countRead="3.6万";
        bean4.albumNum="22集";
        bean4.resId = R.mipmap.ic_loacl_ys04;
        list.add(bean4);

        ContentBean bean5=new ContentBean();
        bean5.id = 0;
        bean5.title = "CNR中华之声";
        bean5.info = "中央人民广播电台对台湾广播有两套专门为台湾及海外听众服务的节目，累计播音37小时50分钟，两套节目覆盖祖国大陆东南沿海、台湾地区以及东南亚、南太平洋和日本等国家";
        bean5.type = Type_Guangbo;
        bean5.countRead="3.6万";
        bean5.albumNum="22集";
        bean5.resId = R.mipmap.ic_loacl_ys05;
        list.add(bean5);

        ContentBean bean6=new ContentBean();
        bean6.id = 0;
        bean6.title = "CNR神州之声";
        bean6.info = "中央人民广播电台对台湾广播有两套专门为台湾及海外听众服务的节目，累计播音37小时50分钟，两套节目覆盖祖国大路东南沿海、台湾地区以及东南亚、南太平洋和日本等国家";
        bean6.type = Type_Guangbo;
        bean6.countRead="3.6万";
        bean6.albumNum="22集";
        bean6.resId = R.mipmap.ic_loacl_ys06;
        list.add(bean6);

        ContentBean bean7=new ContentBean();
        bean7.id = 0;
        bean7.title = "大湾区之声";
        bean7.info = "中央人民广播电台第七套节目，打理您工作生活的方方面面，衣食住行，事无巨细。呈现南北文化，引领生活潮流；资讯、娱乐、休闲、时尚，引导消费，服务大众。";
        bean7.type = Type_Guangbo;
        bean7.countRead="3.6万";
        bean7.albumNum="22集";
        bean7.resId = R.mipmap.ic_loacl_ys07;
        list.add(bean7);

        ContentBean bean8=new ContentBean();
        bean8.id = 0;
        bean8.title = "中国校园之声";
        bean8.info = "全球首家致力打造校园场景化伴随性电台。 中国校园之声电台，中国大学生第一台。";
        bean8.type = Type_Guangbo;
        bean8.countRead="3.6万";
        bean8.albumNum="22集";
        bean8.resId = R.mipmap.ic_loacl_ys08;
        list.add(bean8);

        ContentBean bean9=new ContentBean();
        bean9.id = 0;
        bean9.title = "CNR文艺之声";
        bean9.info = "生活里的文艺，文艺里的生活。中央人民广播电台文艺之声，中国主流文化传播第一权威广播媒体。";
        bean9.type = Type_Guangbo;
        bean9.countRead="3.6万";
        bean9.albumNum="22集";
        bean9.resId = R.mipmap.ic_loacl_ys09;
        list.add(bean9);

        ContentBean bean10=new ContentBean();
        bean10.id = 0;
        bean10.title = "China Plus Radio";
        bean10.info = "中国国际广播电台英语环球，中国最权威的英语资讯广播电台。学英语，听中国，知世界！Follow China Plus, follow China's changing pace!";
        bean10.type = Type_Guangbo;
        bean10.countRead="3.6万";
        bean10.albumNum="22集";
        bean10.resId = R.mipmap.ic_loacl_ys10;
        list.add(bean10);

        return list;
    }

    public static List<ContentBean> getGuoJiList(){
        List<ContentBean> list = new ArrayList<>();
        ContentBean bean1 = new ContentBean();
        bean1.id = 0;
        bean1.title = "国际关系学院广播台";
        bean1.info = "国关之声下设动漫游戏，文艺欣赏，社会话题，旅游美食以及外语五个板块定期放送";
        bean1.type = Type_Guangbo;
        bean1.countRead="2.3万";
        bean1.albumNum="32集";
        bean1.resId = R.mipmap.ic_loacl_guoji01;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "国际旅游岛之声";
        bean2.info = "国际旅游岛之声（海南旅游广播），完美旅行、一路惊喜！为您打造海南国际旅游岛独一无二的旅游、生活聆听方式。";
        bean2.type = Type_Guangbo;
        bean2.countRead="1.6万";
        bean2.albumNum="12集";
        bean2.resId = R.mipmap.ic_loacl_guoji02;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "CRI HIT FM";
        bean3.info = "Hit FM是中国国际广播电台旗下的国际流行音乐频率，2003年4月16日开始在北京试播。";
        bean3.type = Type_Guangbo;
        bean3.countRead="1.6万";
        bean3.albumNum="30集";
        bean3.resId = R.mipmap.ic_loacl_guoji03;
        list.add(bean3);

        ContentBean bean4 = new ContentBean();
        bean4.id = 0;
        bean4.title = "CRI中文环球广播";
        bean4.info = "中国国际广播电台（CRI）创办于1941年12月3日，是中国向全世界广播的国家广播电台。其宗旨是“向世界介绍中国，向中国介绍世界，向世界报道世界，增进中国人民与世界人民之间的了解和友谊”。";
        bean4.type = Type_Guangbo;
        bean4.countRead="3.6万";
        bean4.albumNum="22集";
        bean4.resId = R.mipmap.ic_loacl_guoji04;
        list.add(bean4);

        ContentBean bean5=new ContentBean();
        bean5.id = 0;
        bean5.title = "CRI南海之声";
        bean5.info = "中国国际广播电台“南海之声”于2013年4月9日正式开播，是中国首个为南海海域及周边国家和地区服务的多语种广播。";
        bean5.type = Type_Guangbo;
        bean5.countRead="3.6万";
        bean5.albumNum="22集";
        bean5.resId = R.mipmap.ic_loacl_guoji05;
        list.add(bean5);

        ContentBean bean6=new ContentBean();
        bean6.id = 0;
        bean6.title = "CRI环球资讯";
        bean6.info = "中国国际广播电台环球资讯广播CRI NewsRadio，集合国际台独特的资源优势和语言优势，四大新闻板块，辅以整点、半点快递，实现新闻的24小时滚动播出。";
        bean6.type = Type_Guangbo;
        bean6.countRead="3.6万";
        bean6.albumNum="22集";
        bean6.resId = R.mipmap.ic_loacl_guoji06;
        list.add(bean6);

        return list;
    }

    public static List<ContentBean> getShouCangList(){

        List<ContentBean> list=new ArrayList<>();
        ContentBean bean1=new ContentBean();
        bean1.id = 0;
        bean1.title = "内蒙古交通之声";
        bean1.info = "内蒙古交通之声定位于专业交通广播，立足交通、服务大众，以“资讯•路况•短信•话题•热线”为主线，努力营造“快乐交通 • 快乐广播”的氛围。交通之声以FM105.6同频覆盖内蒙古全境，收听率、市场占有率、覆盖率及忠诚度均位居同行业前列。" ;
        bean1.type = Type_Xiangsheng;
        bean1.countRead="2.3万";
        bean1.albumNum="32集";
        bean1.resId = R.mipmap.ic_local_fmdf_02;
        list.add(bean1);

        ContentBean bean2=new ContentBean();
        bean2.id = 0;
        bean2.title = "CNR音乐之声";
        bean2.info = "\"有一种快乐，在空中听见，Music Radio旋律在蔓延......感动让你听见——我要我的音乐\"，音乐之声是全华语市场最专业流行音乐频率，中国知名类型化流行音乐频率，覆盖全国，打破以往音乐广播板块型播出形态.";
        bean2.type = Type_Xiangsheng;
        bean2.countRead="1.6万";
        bean2.albumNum="12集";
        bean2.resId = R.mipmap.ic_local_fm_02;
        list.add(bean2);

        ContentBean bean3=new ContentBean();
        bean3.id = 0;
        bean3.title = "CRI HIT FM";
        bean3.info = "Hit FM是中国国际广播电台旗下的国际流行音乐频率，2003年4月16日开始在北京试播。";
        bean3.type = Type_Guangbo;
        bean3.countRead="1.6万";
        bean3.albumNum="30集";
        bean3.resId = R.mipmap.ic_loacl_guoji03;
        list.add(bean3);

        return list;
    }
}
