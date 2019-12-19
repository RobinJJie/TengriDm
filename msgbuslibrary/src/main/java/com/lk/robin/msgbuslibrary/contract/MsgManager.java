package com.lk.robin.msgbuslibrary.contract;


import com.lk.robin.msgbuslibrary.mag.MsgRsp;

/**
 * @author lubin
 * @version 1.0
 * 数据管理者 契约
 */
public interface MsgManager {
    void save(MsgRsp data);
}
