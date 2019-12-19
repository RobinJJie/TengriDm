package com.lk.robin.msgbuslibrary.mag;

/**
 * @author lubin
 * @version 1.0
 */
public class MsgRsp<T> {
    public T data;
    public int code;

    @Override
    public String toString() {
        return "MsgRsp{" +
                "data=" + data +
                ", code=" + code +
                '}';
    }
}
