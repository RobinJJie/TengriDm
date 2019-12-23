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
        String Live_Home="/app_live/LiveFragment";
    }

    interface Home{
        String HomeMainActivity="/app_home/MainActivity";
        String HomeMainFragment="/app_home/MainFragment";
        String HomeMainBitingListFragment="/app_home/WillListenListFragment";
        String HomeMainBoutiqueListFragment="/app_home/BoutiqueListFragment";
        String HomeMainGuoXueCollectionFragment="/app_home/GuoXueCollectionFragment";
        String HomeMainProgramInfoFragment="/app_home/ProgramInfoFragment";
        String HomeMainSearchActivityFragment="/app_home/SearchActivityFragment";
        String HomeMainSearchInfoActivityFragment="/app_home/SearchInfoActivityFragment";
        String LiveDetailActivity="/app_live/LiveDetailActivity";
        String HomeClassifyFragment="/app_home/ClassifyFragment";
    }

    interface Mine{
        String MineHome="/app_mine/MineFragment";
    }
    interface Radio{
        String RadioHome="/app_radio/BroadcastFragment";
    }

}
