package com.lk.robin.commonlibrary.presenter;

/**
 * @author lubin
 * @version 1.0
 * 基础契约
 */
public interface BaseContract {

    interface View<P extends Presenter> {

        void showLoading();

        void hideLoading();

        void showLoading(String msg, boolean cancelOut);

        /**
         * 设置presenter
         *
         * @param presenter presenter
         */
        void setPresenter(P presenter);
    }

    interface Presenter {
        /**
         * 公用的开始（初始化）
         */
        void start();

        /**
         * 公用的销毁
         */
        void destroy();
    }

}
