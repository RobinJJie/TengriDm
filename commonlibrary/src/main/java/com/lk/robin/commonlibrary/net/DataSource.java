package com.lk.robin.commonlibrary.net;

/**
 * @author lubin
 * @version 1.0
 */
public interface DataSource {

    interface CallBack<D> extends Success<D>, Failed {

    }

    interface CallTypeBack<D> extends Success<D> {
        void onMsg(int errorCode, String msg);
    }

    interface Success<D> {
        void onSuccess(D data);
    }

    interface Failed {
        void onError(int errorCode);
    }
}
