package com.lk.robin.commonlibrary.config;

/**
 * @author lubin
 * @version 1.0
 */
public interface BuildConfig {
    //全局调试配置
    boolean DeBug = true;
    String BASE_URL = DeBug ? "https://test.4008117567.com/" : "https://www.4008117567.com/";

}
