package com.lk.robin.commonlibrary.tools;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

import java.util.ArrayList;

import static android.content.Context.BIND_AUTO_CREATE;

public class MyFMUtils implements ServiceConnection, MyFMService.OnPlayStateChangedListener {

    private boolean hasLoadSource;
    private Context sContext;
    private static MyFMUtils myFMUtils;
    private Intent fmIntent;
    private MyFMService.MyFMBinder fmBinder;
    private ArrayList<MyFMService.OnPlayStateChangedListener> stateChangedListeners;

    private boolean isBindService;

    private MyFMUtils(Context context){
        sContext = context.getApplicationContext();
        //绑定耳机插拔过滤器
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        HeadsetReceiver headsetReceiver = new HeadsetReceiver();
        sContext.registerReceiver(headsetReceiver, intentFilter);
        stateChangedListeners =  new ArrayList<>();
    }

    /**
     * 获取实例
     */
    public static synchronized MyFMUtils getInstance(Context context){
        if(myFMUtils == null){
            myFMUtils = new MyFMUtils(context);
        }
        return myFMUtils;
    }

    /**
     * 绑定和启动一个新的服务
     * 注意服务闲置后需要调用 {@link MyFMUtils#stopService()}方法
     */
    public void bindAndStartService(){
        try {
            fmIntent = new Intent(sContext, MyFMService.class);
            startService();
            sContext.bindService(fmIntent,this,BIND_AUTO_CREATE);
        }catch (Exception e){
            Log.e("myFM服务", e.toString());
        }
    }

    /**
     * 绑定和启动一个单例服务
     */
    public void startSingletonService(){
        if(fmIntent == null){
            bindAndStartService();
        }
    }

    public void stopService(){
        if(fmIntent != null){
            sContext.stopService(fmIntent);
            unBindService();
        }
    }

    public void startService(){
        sContext.startService(fmIntent);
    }

    public void unBindService(){
        if(fmBinder!=null){
            sContext.unbindService(this);
            fmBinder = null;
        }
    }

    public int getDuration(){
        if(fmBinder!=null){
            return fmBinder.getDuration();
        }
        return 0;
    }

    public int getProgress(){
        if(fmBinder!=null){
            return fmBinder.getCurrenPostion();
        }
        return 0;
    }

    public void setProgress(int progress){
        if(fmBinder!=null && hasLoadSource)
            fmBinder.seekTo(progress);
    }

    public boolean hasLoadSource() {
        return hasLoadSource;
    }

    public void playFM(String name, String source){
        if(fmBinder!=null){
            fmBinder.startPlay(name,source);
        }else {
            Log.e("myFM服务", "fmBinder为空");
        }
    }

    public void pause(){
        if(fmBinder!=null)
        fmBinder.play();
    }

    public void stop(){
        if(fmBinder!=null)
        fmBinder.stop();
    }

    public boolean isPlaying(){
        if(fmBinder!=null){
            return fmBinder.isPlaying();
        }
        return false;
    }

    private void onHeadsetChanged(int state){
        if(fmBinder!=null)
            if(state == 0 && fmBinder.isPlaying()){
                fmBinder.play();
        }
    }

    /**
     * 添加播放状态监听
     * @param listener
     */
    public void addPlayListener(MyFMService.OnPlayStateChangedListener listener){
        if(!stateChangedListeners.contains(listener)){
            stateChangedListeners.add(listener);
        }
    }

    /**
     * 移除播放状态监听
     * @param listener
     */
    public void removePlayListener(MyFMService.OnPlayStateChangedListener listener){
        stateChangedListeners.remove(listener);
    }

    public void setPreparedListener(OnBindPreparedListener preparedListener) {
        this.preparedListener = preparedListener;
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        fmBinder = (MyFMService.MyFMBinder) service;
        isBindService = true;
        fmBinder.setPlayStateChangedListener(this);
        if(preparedListener != null){
            preparedListener.onPrepare();
        }
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        fmIntent = null;
        fmBinder = null;
        stateChangedListeners.clear();
    }

    //耳机插拔广播接收器
    public class HeadsetReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.hasExtra("state")) {
                onHeadsetChanged(intent.getIntExtra("state", 0));
            }
        }
    }

    public boolean isBindService() {
        return isBindService;
    }

    private OnBindPreparedListener preparedListener;
    public interface OnBindPreparedListener{
        void onPrepare();
    }

    //=======================播放状态监听======================
    @Override
    public void onPrepare(String name) {
        hasLoadSource = true;
        if(stateChangedListeners.size()>0)
            for (int i = 0; i < stateChangedListeners.size(); i++) {
                stateChangedListeners.get(i).onPrepare(name);
            }
    }

    @Override
    public void onStart(String name, int duration) {
        if(stateChangedListeners.size()>0)
            for (int i = 0; i < stateChangedListeners.size(); i++) {
                stateChangedListeners.get(i).onStart(name,duration);
            }
    }

    @Override
    public void onProgress(int progress, int duration) {
        if(stateChangedListeners.size()>0)
            for (int i = 0; i < stateChangedListeners.size(); i++) {
                stateChangedListeners.get(i).onProgress(progress,duration);
            }
    }

    @Override
    public void onPauseOrPlay(boolean isPlay) {
        if(stateChangedListeners.size()>0)
            for (int i = 0; i < stateChangedListeners.size(); i++) {
                stateChangedListeners.get(i).onPauseOrPlay(isPlay);
            }
    }

    @Override
    public void onComplete() {
        if(stateChangedListeners.size()>0)
            for (int i = 0; i < stateChangedListeners.size(); i++) {
                stateChangedListeners.get(i).onComplete();
            }
    }

    @Override
    public void onError(String error) {
        hasLoadSource = false;
        if(stateChangedListeners.size()>0)
            for (int i = 0; i < stateChangedListeners.size(); i++) {
                stateChangedListeners.get(i).onError(error);
            }
    }

}
