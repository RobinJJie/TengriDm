package com.lk.robin.commonlibrary.config;

import android.content.Context;
import android.content.SharedPreferences;

import com.lk.robin.commonlibrary.tools.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lubin
 * @version 1.0
 * 静态存储app数据
 */
public class Account {
    private static final String KEY_TOKEN = "KEY_TOKEN";
    private static final String USER_NAME = "USER_NAME";
    private static final String USER_AVATAR = "USER_AVATAR";

    //登陆token
    private static String token;
    //师傅 姓名
    private static String worker_name;
    //头像
    private static String avatar;
    //登录时间


    private static void save(Context context) {
        SharedPreferences sp = context.getSharedPreferences(Account.class.getName(), Context.MODE_PRIVATE);
        sp.edit()
                .putString(KEY_TOKEN, token)
                .putString(USER_NAME, worker_name)
                .putString(USER_AVATAR, avatar)
                .apply();
    }

    /**
     * 数据加载
     *
     * @param context context
     */
    public static void load(Context context) {
        SharedPreferences sp = context.getSharedPreferences(Account.class.getName(), Context.MODE_PRIVATE);
        token = sp.getString(KEY_TOKEN, "");
        worker_name = sp.getString(USER_NAME, "");
        avatar = sp.getString(USER_AVATAR, "");
    }

    public static void logout(Context context) {
        SharedPreferences sp = context.getSharedPreferences(Account.class.getName(), Context.MODE_PRIVATE);
        sp.edit().clear().apply();
        load(context);
    }

    public static void updateUsers(String worker_name, String headUrl) {
        Account.worker_name = worker_name;
        Account.avatar = headUrl;
        Account.save(Factory.app());
        if (onUpdateUsers != null) {
            for (int i = 0; i < onUpdateUsers.size(); i++) {
                if (onUpdateUsers.get(i) != null)
                    onUpdateUsers.get(i).onChanged();
            }
        }
    }

    public static void login(String token, String worker_name, String avatar) {
        Account.token = token;
        Account.avatar = avatar;
        Factory.LogE("head_url", avatar);
        Account.worker_name = worker_name;
        Account.save(Factory.app());
        if (onUpdateUsers != null) {
            for (int i = 0; i < onUpdateUsers.size(); i++) {
                if (onUpdateUsers.get(i) != null)
                    onUpdateUsers.get(i).onChanged();
            }
        }
    }

    public static String getToken() {
        return token;
    }

    public static String getWorker_name() {
        return worker_name;
    }

    public static String getAvatar() {
        return avatar;
    }

    public interface OnUpdateUsers {
        void onChanged();
    }

    private static List<OnUpdateUsers> onUpdateUsers = new ArrayList<>();

    public static void setOnUpdateUsers(OnUpdateUsers onUpdateUsers) {
        Account.onUpdateUsers.add(onUpdateUsers);
    }
}
