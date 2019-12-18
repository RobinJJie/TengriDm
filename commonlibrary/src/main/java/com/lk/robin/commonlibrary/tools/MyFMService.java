package com.lk.robin.commonlibrary.tools;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyFMService extends Service {
    private MediaPlayer player;
    private String musicName;

    @Override
    public IBinder onBind(Intent intent) {
        Log.v("myFM服务", "onBind()");
        return new MyFMBinder();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if(player == null){
            player = new MediaPlayer();
            //资源准备监听
            player.setOnPreparedListener(this::startPlay);
            //播放完成监听
            player.setOnCompletionListener(mp -> {
                if(playStateChangedListener!=null)
                    playStateChangedListener.onComplete();
            });
            //播放错误监听
            player.setOnErrorListener((mp, what, extra) -> {
                mp.stop();
                if(playStateChangedListener!=null)
                    playStateChangedListener.onError("播放失败");
                return false;
            });
        }
        Log.v("myFM服务", "创建");
    }

    private void playFM(String name, String data){
        try {
            if(data != null){
                Log.v("myFM服务", "播放"+data);
                musicName = name;
                player.reset();
                player.setDataSource(data);
                //准备资源
                player.prepareAsync();
                if(playStateChangedListener!=null)
                    playStateChangedListener.onPrepare(musicName);
            }else {
                Log.e("myFM服务", "无效的播放链接");
            }
        } catch (Exception e) {
            Log.e("myFM服务", e.toString());
        }
    }

    private void startPlay(MediaPlayer mp){
        try {
            mp.start();
            if(playStateChangedListener!=null)
                playStateChangedListener.onStart(musicName);
        }catch (Exception e){
            Log.e("myFM服务", e.toString());
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v("myFM服务", "启动");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        if(player.isPlaying())
            player.stop();
        player.release();
        player = null;
        super.onDestroy();
    }

    /**
     * 自定义播放Binder
     */
    class MyFMBinder extends Binder {
        //判断是否处于播放状态
        public boolean isPlaying(){
            return player.isPlaying();
        }

        public void startPlay(String name, String url){
            playFM(name,url);
        }

        //播放或暂停歌曲
        public void play() {
            if (player.isPlaying()) {
                player.pause();
                if(playStateChangedListener != null)
                    playStateChangedListener.onPauseOrPlay(false);
            } else {
                player.start();
                if(playStateChangedListener != null)
                    playStateChangedListener.onPauseOrPlay(true);
            }
        }

        //返回歌曲的长度，单位为毫秒
        public int getDuration(){
            return player.getDuration();
        }

        //返回歌曲目前的进度，单位为毫秒
        public int getCurrenPostion(){
            return player.getCurrentPosition();
        }

        //设置歌曲播放的进度，单位为毫秒
        public void seekTo(int mesc){
            player.seekTo(mesc);
        }

        public void setPlayStateChangedListener(OnPlayStateChangedListener Listener) {
            playStateChangedListener = Listener;
        }

        public void stop(){
            if(player.isPlaying())
                player.stop();
        }

        public void stopAndRelease(){
            if(player.isPlaying())
                player.stop();
            player.release();
        }
    }

    private OnPlayStateChangedListener playStateChangedListener;
    public interface OnPlayStateChangedListener{
        void onPrepare(String name);
        void onStart(String name);
        void onPauseOrPlay(boolean isPlay);
        void onComplete();
        void onError(String error);
    }
}
