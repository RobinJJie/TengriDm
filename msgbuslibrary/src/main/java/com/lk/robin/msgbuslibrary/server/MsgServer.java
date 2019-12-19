package com.lk.robin.msgbuslibrary.server;

import android.util.Log;

import com.lk.robin.msgbuslibrary.contract.MsgManager;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lubin
 * @version 1.0
 * 数据管理者
 */
public class MsgServer implements MsgManager {
    private static MsgServer newInstance;

    static {
        newInstance = new MsgServer();
    }

    /**
     * 观察者的集合
     * Class<?>： 观察的表
     * Set<ChangedListener>：每一个表对应的观察者有很多
     */
    private final Map<Class<?>, Set<ChangedListener>> changedListeners = new HashMap<>();

    /**
     * 添加一个监听
     *
     * @param tClass   对某个表关注
     * @param listener 监听者
     * @param <Model>  表的范型
     */
    public static <Model> void addChangedListener(final Class<Model> tClass, ChangedListener<Model> listener) {
        Set<ChangedListener> changedListeners = newInstance.getListeners(tClass);
        if (changedListeners == null) {
            // 初始化某一类型的容器
            changedListeners = new HashSet<>();
            // 添加到中的Map
            newInstance.changedListeners.put(tClass, changedListeners);
        }
        changedListeners.add(listener);
        Log.e("Listener-new", changedListeners.toString());
    }

    /**
     * 删除某一个表的某一个监听器
     *
     * @param tClass   表
     * @param listener 监听器
     * @param <Model>  表的范型
     */
    public static <Model> void removeChangedListener(final Class<Model> tClass, ChangedListener<Model> listener) {
        Set<ChangedListener> changedListeners = newInstance.getListeners(tClass);
        if (changedListeners == null) {
            // 容器本身为null，代表根本就没有
            return;
        }
        // 从容器中删除你这个监听者
        changedListeners.remove(listener);
    }

    /**
     * 从所有的监听者中，获取某一个表的所有监听者
     *
     * @param modelClass 表对应的Class信息
     * @param <Model>    范型
     * @return Set<ChangedListener>
     */
    private <Model> Set<ChangedListener> getListeners(Class<Model> modelClass) {
        if (changedListeners.containsKey(modelClass)) {
            return changedListeners.get(modelClass);
        }
        return null;
    }

    /**
     * 通知
     *
     * @param tClass
     * @param models
     * @param <Model>
     */
    private final <Model> void notifySave(final Class<Model> tClass, final Model models) {
        // 找监听器
        final Set<ChangedListener> listeners = getListeners(tClass);
        if (listeners != null && listeners.size() > 0) {
            // 通用的通知
            for (ChangedListener<Model> listener : listeners) {
                listener.onDataPush(models);
            }
        }
    }

    public static MsgServer init() {
        return newInstance;
    }

    @Override
    public void save(MsgRsp data) {
        if (data == null) return;
        if (data.code == MsgCodeConfig.MSG_TURN_TO_FRAGMENT) {
            TurnToFrag bean = (TurnToFrag) data.data;
            newInstance.notifySave(TurnToFrag.class, bean);
        }

    }

    /**
     * 通知监听器
     */
    public interface ChangedListener<Data> {
        void onDataPush(Data list);
    }
}
