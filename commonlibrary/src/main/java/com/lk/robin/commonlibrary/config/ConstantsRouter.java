package com.lk.robin.commonlibrary.config;

public interface ConstantsRouter {
    // LaunchMode
    int STANDARD = 0;
    int SINGLETOP = 1;
    int SINGLETASK = 2;

    // ResultCode
    int RESULT_CANCELED = 0;
    int RESULT_OK = -1;
    interface Live{
        String Live_Home="/applive/LiveFragment";
    }

    interface Home{
        String HomeMainActivity="/apphome/MainActivity";
    }
}
