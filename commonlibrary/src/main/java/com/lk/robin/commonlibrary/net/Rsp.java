package com.lk.robin.commonlibrary.net;

/**
 * @author lubin
 * @version 1.0
 * <p>
 * 网络 数据 包装类
 */
public class Rsp<T> {
    /**
     * data :
     * msg : 请输入手机号
     * status : false
     * code : 200
     */
    private T data;
    private String msg;
    private boolean status;
    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DtoBean{" +
                "data=" + data +
                ", msg='" + msg + '\'' +
                ", status=" + status +
                ", code=" + code +
                '}';
    }
}
