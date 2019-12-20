package com.lk.robin.commonlibrary.widget;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.lk.robin.commonlibrary.R;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;

public class SampleCoverVideo extends StandardGSYVideoPlayer {

    private boolean isVoice = false;
    RoundedImageView mCoverImage;

    String mCoverOriginUrl;

    int mDefaultRes;
    private GSYPlaterInterface gsyPlaterInterface;

    public SampleCoverVideo(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public SampleCoverVideo(Context context) {
        super(context);
    }

    public SampleCoverVideo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setGsyPlaterInterface(GSYPlaterInterface gsyPlaterInterface) {
        this.gsyPlaterInterface = gsyPlaterInterface;
    }

    @Override
    protected void init(Context context) {
        super.init(context);
        mCoverImage = findViewById(R.id.thumbImage);

        if (mThumbImageViewLayout != null &&
                (mCurrentState == -1 || mCurrentState == CURRENT_STATE_NORMAL || mCurrentState == CURRENT_STATE_ERROR)) {
            mThumbImageViewLayout.setVisibility(VISIBLE);
        }
    }

    public void setIsVoice(boolean isVoice) {
        this.isVoice = isVoice;
    }

    @Override
    public int getLayoutId() {
        return R.layout.im_video_layout_cover;
    }

    public void loadCoverImage(String url, int res) {
        mCoverOriginUrl = url;
        mDefaultRes = res;
        Glide.with(getContext().getApplicationContext())
                .setDefaultRequestOptions(
                        new RequestOptions()
                                .frame(1000000)
                                .centerCrop()
                                .error(res)
                                .placeholder(res))
                .load(url)
                .into(mCoverImage);
    }

    /**
     * 视频播放
     */
    @Override
    protected void clickStartIcon() {
        super.clickStartIcon();
        if (gsyPlaterInterface != null) {
            gsyPlaterInterface.vedioPlayerStopAudio();
        }

    }

    public void setBottomShow(boolean isBottomShow) {
        if (isBottomShow) {
            findViewById(com.shuyu.gsyvideoplayer.R.id.layout_bottom).setAlpha(1);
            findViewById(com.shuyu.gsyvideoplayer.R.id.current).setVisibility(VISIBLE);
            findViewById(com.shuyu.gsyvideoplayer.R.id.progress).setVisibility(VISIBLE);
            findViewById(com.shuyu.gsyvideoplayer.R.id.total).setVisibility(VISIBLE);
            findViewById(com.shuyu.gsyvideoplayer.R.id.fullscreen).setVisibility(VISIBLE);
        } else {
            findViewById(com.shuyu.gsyvideoplayer.R.id.layout_bottom).setAlpha(0);
            findViewById(com.shuyu.gsyvideoplayer.R.id.current).setVisibility(GONE);
            findViewById(com.shuyu.gsyvideoplayer.R.id.progress).setVisibility(GONE);
            findViewById(com.shuyu.gsyvideoplayer.R.id.total).setVisibility(GONE);
            findViewById(com.shuyu.gsyvideoplayer.R.id.fullscreen).setVisibility(GONE);
        }
    }

    @Override
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean actionBar, boolean statusBar) {
        GSYBaseVideoPlayer gsyBaseVideoPlayer = super.startWindowFullscreen(context, actionBar, statusBar);
        SampleCoverVideo sampleCoverVideo = (SampleCoverVideo) gsyBaseVideoPlayer;
        sampleCoverVideo.loadCoverImage(mCoverOriginUrl, mDefaultRes);
        return gsyBaseVideoPlayer;
    }

    public interface GSYPlaterInterface {
        void vedioPlayerStopAudio();
    }

    @Override
    public GSYBaseVideoPlayer showSmallVideo(Point size, boolean actionBar, boolean statusBar) {
        //下面这里替换成你自己的强制转化
        SampleCoverVideo sampleCoverVideo = (SampleCoverVideo) super.showSmallVideo(size, actionBar, statusBar);
        sampleCoverVideo.mStartButton.setVisibility(GONE);
        sampleCoverVideo.mStartButton = null;
        return sampleCoverVideo;
    }


    /******************* 下方两个重载方法，在播放开始前不屏蔽封面，不需要可屏蔽 ********************/
    @Override
    public void onSurfaceUpdated(Surface surface) {
        super.onSurfaceUpdated(surface);
    }

    @Override
    protected void setViewShowState(View view, int visibility) {
        super.setViewShowState(view, visibility);
        handleCover();
    }

    /******************* 下方重载方法，在播放开始不显示底部进度和按键，不需要可屏蔽 ********************/

    protected boolean byStartedClick;

    @Override
    protected void onClickUiToggle() {
        if (mIfCurrentIsFullscreen && mLockCurScreen && mNeedLockFull) {
            setViewShowState(mLockScreen, VISIBLE);
            return;
        }
        byStartedClick = true;
        super.onClickUiToggle();

    }

    @Override
    protected void changeUiToNormal() {
        super.changeUiToNormal();
        byStartedClick = false;
    }

    @Override
    protected void changeUiToPreparingShow() {
        super.changeUiToPreparingShow();
        Debuger.printfLog("Sample changeUiToPreparingShow");
        setViewShowState(mBottomContainer, INVISIBLE);
        setViewShowState(mStartButton, INVISIBLE);
    }

    @Override
    protected void changeUiToPlayingShow() {
        super.changeUiToPlayingShow();
        Debuger.printfLog("Sample changeUiToPlayingShow");
        if (!byStartedClick) {
            setViewShowState(mBottomContainer, INVISIBLE);
            setViewShowState(mStartButton, INVISIBLE);
        }
    }

    @Override
    protected void changeUiToPlayingBufferingShow() {
        super.changeUiToPlayingBufferingShow();
        Debuger.printfLog("Sample changeUiToPlayingBufferingShow");
        if (!byStartedClick) {
            setViewShowState(mBottomContainer, INVISIBLE);
            setViewShowState(mStartButton, INVISIBLE);
        }
    }

    @Override
    protected void hideAllWidget() {
        super.hideAllWidget();
    }

    @Override
    protected void updateStartImage() {
        if (mStartButton instanceof ImageView) {
            ImageView imageView = (ImageView) mStartButton;
            if (mCurrentState == CURRENT_STATE_PLAYING) {
                imageView.setImageResource(R.drawable.im_selector_video_pause_click);
            } else if (mCurrentState == CURRENT_STATE_ERROR) {
                imageView.setImageResource(R.drawable.im_selector_video_play_click);
            } else {
                imageView.setImageResource(R.drawable.im_selector_video_play_click);
            }
        }
    }

    @Override
    public void startAfterPrepared() {
        super.startAfterPrepared();
        Debuger.printfLog("Sample startAfterPrepared");
        setViewShowState(mBottomContainer, INVISIBLE);
        setViewShowState(mStartButton, INVISIBLE);
        setViewShowState(mBottomProgressBar, VISIBLE);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        byStartedClick = true;
        super.onStartTrackingTouch(seekBar);
    }

    public void hideProgressTime() {
        if (mProgressBar != null) {
            mProgressBar.setVisibility(INVISIBLE);
        }
        if (mTotalTimeTextView != null) {
            mTotalTimeTextView.setVisibility(INVISIBLE);
        }
        if (mCurrentTimeTextView != null) {
            mCurrentTimeTextView.setVisibility(INVISIBLE);
        }
    }

    private void handleCover() {
        if (isVoice) {
            if (mThumbImageViewLayout != null && mThumbImageViewLayout.getVisibility() != VISIBLE) {
                mThumbImageViewLayout.setVisibility(VISIBLE);
            }
            if (mStartButton != null && mStartButton.getVisibility() != VISIBLE) {
                mStartButton.setVisibility(VISIBLE);
            }
        }
    }
}
