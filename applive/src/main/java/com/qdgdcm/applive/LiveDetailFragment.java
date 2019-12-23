package com.qdgdcm.applive;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lk.robin.commonlibrary.tools.MediaJsInterface;


/**
 * A simple {@link Fragment} subclass.
 */
public class LiveDetailFragment extends Fragment {

    public static final String webData = "<p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">与祖国同行，看濠江盛景。即将迎来回归祖国20周年纪念日的澳门，一路欢歌，生机勃发。澳门回归祖国20年来，开创了历史上最好的发展局面。事实充分证明，“一国两制”是完全行得通、办得到、得人心的！</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\"><img src=\"http://5b0988e595225.cdn.sohucs.com/images/20191216/b4b7a841425e4496befcde0b5ba605e9.jpeg\"/></p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">▲2018年11月12日，国家主席习近平在北京人民大会堂会见香港澳门各界庆祝国家改革开放40周年访问团。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">中国特色社会主义进入了新时代，意味着 “一国两制”事业也进入了新时代。党的十八大以来，习近平总书记高瞻远瞩、运筹帷幄，心系国家、情系人民，胸怀实现中华民族伟大复兴中国梦的远大目标，坚定不移推进“一国两制”实践在香港、澳门行稳致远，坚定不移推进祖国和平统一进程，擘画新时代“一国两制”事业的宏伟蓝图。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\"><img src=\"http://5b0988e595225.cdn.sohucs.com/images/20191216/2e49c53183e64261959e31431c0d1bff.png\"/></p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">“一国两制”，中国特色社会主义的伟大创举。这是一项前无古人的开创性事业，在过往的人类政治实践中还从未有过。香港、澳门回归祖国后，重新纳入国家治理体系，走上同祖国共同发展、永不分离的宽广道路。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">党的十八大以来，习近平总书记发表一系列重要讲话，鲜明表达继续坚持“一国两制”基本方针的坚定立场。2017年6月30日，习近平在出席香港特别行政区政府欢迎晚宴时发表重要讲话强调，<span style=\"font-weight: 700; border: 0px; margin: 0px; padding: 0px;\">我们实行“一国两制”的初心不会改变，决心不会动摇，要以“长风破浪会有时，直挂云帆济沧海”的信心，以“千淘万漉虽辛苦，吹尽狂沙始到金”的恒心，推动“一国两制”在香港的实践取得更大成就。</span></p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">庆祝改革开放40周年之际，中央邀请香港、澳门各界代表组团来内地参观访问。习近平总书记亲切会见访问团，充分肯定大家对国家改革开放的高度认同，对“一国两制”方针的高度认同，对香港、澳门与祖国共命运、同发展关系的高度认同。习近平对大家提出4点希望：更加积极主动助力国家全面开放、更加积极主动融入国家发展大局、更加积极主动参与国家治理实践、更加积极主动促进国际人文交流。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">“无论遇到什么样的困难和挑战，我们对‘一国两制’方针的信心和决心都绝不会动摇，我们推进‘一国两制’实践的信心和决心都绝不会动摇。”五年前，习近平主席在庆祝澳门回归祖国15周年大会暨澳门特别行政区第四届政府就职典礼上的铿锵话语，激励着包括港澳同胞在内的全体中华儿女奋力谱写“一国两制”新篇章。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\"><img src=\"http://5b0988e595225.cdn.sohucs.com/images/20191216/cb4ab9f59fc64b25a74c42388811f355.jpeg\"/></p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\"><img src=\"http://5b0988e595225.cdn.sohucs.com/images/20191216/aac33b54433f4be08a15935da3322fc0.png\"/></p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">不能“左脚穿着右脚鞋——错打错处来”，习近平总书记曾用形象的比喻强调要把路走对走稳。他指出，继续推进“一国两制”事业，必须牢牢把握“一国两制”的根本宗旨，共同维护国家主权、安全、发展利益，保持香港、澳门长期繁荣稳定；必须坚持依法治港、依法治澳，依法保障“一国两制”实践；必须把坚持一国原则和尊重两制差异、维护中央权力和保障特别行政区高度自治权、发挥祖国内地坚强后盾作用和提高港澳自身竞争力有机结合起来，任何时候都不能偏废。只有这样，才能把路走对了走稳了，否则就会左脚穿着右脚鞋——错打错处来。" +
            "</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">贯彻“一国两制”方针，必须坚持两点：一是坚定不移，不会变、不动摇；二是全面准确，确保“一国两制”在香港、澳门的实践不走样、不变形，始终沿着正确方向前进。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">“一国两制”是一个完整的概念。“一国”是实行“两制”的前提和基础，“两制”从属和派生于“一国”，并统一于“一国”之内。“一国”是根，根深才能叶茂；“一国”是本，本固才能枝荣。必须把坚持“一国”原则和尊重“两制”差异有机结合起来，做到坚守“一国”之本，实现“两制”和谐相处、相互促进。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">以习近平同志为核心的党中央心系港澳同胞，将“一国两制”实践有机融入实现中华民族伟大复兴中国梦的宏图伟业之中，推动“一国两制”事业不断取得新进展。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">在“一国两制”之下，香港、澳门特别行政区享有的高度自治权受到充分保障，港澳同胞当家作主、依法享有广泛自由和民主权利。香港、澳门经济平稳增长，对外交往日益活跃，各项事业取得全面进步，同祖国内地的联系越来越紧密。各界人士积极投身国家改革开放和现代化建设，作出独特而重要的贡献。港澳同胞对国家发展和民族复兴的信心不断增强，对国家的认同感和向心力不断加强。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255,255);\"><img src=\"http://5b0988e595225.cdn.sohucs.com/images/20191216/3cb6666ae6654f359b6ccb5dfdaf77bf.jpeg\"/></p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">民族复兴、国家统一是大势所趋、大义所在、民心所向。祖国必须统一，也必然统一。这是两岸关系发展历程的历史定论，也是新时代中华民族伟大复兴的必然要求。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">2019年1月2日，习近平总书记在《告台湾同胞书》发表40周年纪念会上发表题为《为实现民族伟大复兴 推进祖国和平统一而共同奋斗》的重要讲话。讲话科学回答了在民族复兴新征程中如何推进祖国和平统一的时代命题，郑重宣示了新时代坚持“一国两制”和推进祖国和平统一的五项重大主张：携手推动民族复兴，实现和平统一目标；探索“两制”台湾方案，丰富和平统一实践；坚持一个中国原则，维护和平统一前景；深化两岸融合发展，夯实和平统一基础；实现同胞心灵契合，增进和平统一认同。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">习近平总书记在讲话中指出，“和平统一、一国两制”是实现国家统一的最佳方式，体现了海纳百川、有容乃大的中华智慧，既充分考虑台湾现实情况，又有利于统一后台湾长治久安。制度不同，不是统一的障碍，更不是分裂的借口。“一国两制”的提出，本来就是为了照顾台湾现实情况，维护台湾同胞利益福祉。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">“亲望亲好，中国人要帮中国人。”习近平总书记在讲话中提出两岸应通尽通的主张，充分体现了对台湾现实情况和社情民意的深入了解和对广大台湾同胞的关心关怀，其言也恳，其情也切。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">习近平总书记强调，长期以来，香港同胞、澳门同胞和海外侨胞关心支持祖国统一大业，作出了积极贡献。希望香港同胞、澳门同胞和海外侨胞一如既往，为推动两岸关系和平发展,实现祖国和平统一再立新功。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">历史不能选择，现在可以把握，未来可以开创！新时代是中华民族大发展大作为的时代，也是两岸同胞大发展大作为的时代。习近平总书记关于对台工作的重要论述，为新时代推进祖国和平统一进程指明了方向。全体中华儿女和衷共济、共同奋斗，就一定能够共创中华民族伟大复兴美好未来，就一定能够完成祖国统一大业。</p><p style=\"border: 0px; margin-top: 0.63em; margin-bottom: 1.8em; padding: 0px; counter-reset: list-1 0 list-2 0 list-3 0 list-4 0 list-5 0 list-6 0 list-7 0 list-8 0 list-9 0; color: rgb(25, 25, 25); font-family: &quot;PingFang SC&quot;, Arial, 微软雅黑, 宋体, simsun, sans-serif; white-space: normal; background-color: rgb(255, 255, 255);\">“任重而道远者，不择地而息。” 中华民族前所未有地接近实现伟大复兴的目标。全体中华儿女当同心协力、坚忍不拔，风雨无阻、勇往直前，不断开创“一国两制”事业新局面，为实现中华民族伟大复兴的中国梦而团结奋斗！</p><p><br/></p>";
    private WebView webView;

    public LiveDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_live_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        webView = view.findViewById(R.id.web_view);
        initWebView();
        String htmlStr = "<html><head><meta charset='utf-8' /><meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no\" /></head><body> " + webData + "</body></html>";
        webView.loadDataWithBaseURL(null, htmlStr, "text/html", "UTF-8", null);
    }

    /**
     * 初始化webview
     */
    @SuppressLint("SetJavaScriptEnabled")
    private void initWebView() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setDomStorageEnabled(true);//设置适应HTML5的一些方法
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE); // 不加载缓存内容
        //webView.getSettings().setTextZoom(spUtils.getFontSize());
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //取消滚动条白边效果
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        //图片点击事件
        webView.addJavascriptInterface(new MediaJsInterface(getContext()), "imagelistener");
        webView.getSettings().setDefaultTextEncodingName("UTF-8");
        webView.getSettings().setBlockNetworkImage(false);
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {//这个方法必须重写。否则会出现优酷视频周末无法播放。周一-周五可以播放的问题
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                addImageClickListener();
                textPaddingReset();
                aLinkReset();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //注意安卓5.0以上的权限
            webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }
    }

    /**
     * 图片点击事件
     */
    private void addImageClickListener() {
        webView.loadUrl("javascript:(function(){" +
                "var objs = document.getElementsByTagName('img'); " +
                "for(var i=0;i<objs.length;i++)  " +
                "{"
                + "    var image = objs[i];\n  "
                + "    image.style.width = '100%'; image.style.height = 'auto'; image.style.hspace='0.0'; image.style.vspace='0';\n  "
                + "    objs[i].onclick=function()  " +
                "    {  "
                + "        window.imagelistener.showImage(this.src);  " +//通过js代码找到标签为img的代码块，设置点击的监听方法与本地的openImage方法进行连接
                "    }  " +
                "}" +
                "})()");
    }

    /**
     * <a></a>点击事件
     */
    private void aLinkReset() {
        webView.loadUrl("javascript:(function(){" +
                "var objs = document.getElementsByTagName('a'); " +
                "for(var i = 0 ; i < objs.length ; i++) " +
                "{ "
                + "   var link = objs[i].href;"
                + "   if(link !== null & link !== '' & link.length > 0 ) "
                + " { "
                + "    objs[i].onclick=function()  " +
                "    {  "
                + "        window.imagelistener.clickLink(link);  "
                + "    } "
                + " } "
                + "}"
                + "})()");
    }

    private void textPaddingReset() {
        webView.loadUrl("javascript:(function(){" +
                "var objs = document.getElementsByTagName('p'); " +
                "for(var i=0;i<objs.length;i++)  " +
                "{"
                + "var pObj = objs[i];   " +
                "    pObj.style.paddingLeft = '6px'; pObj.style.paddingRight = '6px'; " +
                "}" +
                "})()");
    }
}
