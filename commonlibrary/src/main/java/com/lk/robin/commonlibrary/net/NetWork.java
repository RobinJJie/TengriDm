package com.lk.robin.commonlibrary.net;

import android.util.Log;


import com.lk.robin.commonlibrary.config.BuildConfig;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * @author lubin
 * @version 1.0
 * 网络初始化配置
 */
public class NetWork {
    private static NetWork instance;
    private Retrofit retrofit;
    private Retrofit retrofitStr;

    static {
        instance = new NetWork();
    }

    //Gson解析的
    public static Retrofit getRetrofit() {
        if (instance.retrofit != null) {
            return instance.retrofit;
        }
//        OkHttpClient client = new OkHttpClient.Builder()
//                .connectTimeout(10, TimeUnit.SECONDS)
//                .readTimeout(20, TimeUnit.SECONDS)
//                .build();

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HeadInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();

        Retrofit.Builder builder = new Retrofit.Builder();

        instance.retrofit = builder.baseUrl(BuildConfig.BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return instance.retrofit;
    }

    //字符串的
    public static Retrofit getRetrofitString() {
        if (instance.retrofitStr != null) {
            return instance.retrofitStr;
        }
//        OkHttpClient client = new OkHttpClient.Builder()
//                .connectTimeout(10, TimeUnit.SECONDS)
//                .readTimeout(20, TimeUnit.SECONDS)
//                .build();
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HeadInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();

        Retrofit.Builder builder = new Retrofit.Builder();
        instance.retrofitStr = builder.baseUrl(BuildConfig.BASE_URL)
                .client(client)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        return instance.retrofitStr;
    }

    /**
     * 添加请求头
     */
    public static final class HeadInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            //拿到我们的请求
            Request request = chain.request();
            //重新进行
            Request.Builder builder = request.newBuilder();
            builder.addHeader("Content-Type", "application/json");
            Request build = builder.build();
            Response proceed = chain.proceed(build);
            if (BuildConfig.DeBug) {
                assert proceed.body() != null;
                String format = "retrofit-->" + request.method() + "  \n" + request.url() + "\n ------------**";
                Log.d("retrofit", format);
            }
            return proceed;
        }
    }
}
