package com.lk.robin.commonlibrary.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.lk.robin.commonlibrary.R;
import com.lk.robin.commonlibrary.model.CommentBean;
import com.lk.robin.commonlibrary.tools.DateTimeTool;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder;
import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

/**
 * author: li xiao
 * created on: 2019/11/27
 */
public class CommentAdapter extends BaseRecyclerAdapter<CommentBean> implements BaseRecyclerHolder.OnAdapterItemClick {

    private Context context;
    private GSYVideoOptionBuilder gsyVideoOptionBuilder;
    public static final String TAG = "VideoListAdapter";

    public CommentAdapter(Context context) {
        super(context);
        this.context = context;
        gsyVideoOptionBuilder = new GSYVideoOptionBuilder();
    }

    @Override
    public BaseRecyclerHolder<CommentBean> getViewholder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_comment_layout, parent, false), this);
    }

    @Override
    public void bind(BaseRecyclerHolder<CommentBean> holder, int position) {
        holder.bindData(items.get(position));
    }

    @Override
    public void onItemClick(View v, int position) {
        if (onItemClickListener != null)
            if (v.getId() == R.id.rv_logo) {
                onItemClickListener.onClick(0, position, items.get(position));
            } else {
                onItemClickListener.onClick(1, position, items.get(position));
            }
    }


    class ViewHolder extends BaseRecyclerHolder<CommentBean> {
        private SampleCoverVideo videoCover;
        private RoundedImageView rvLogo;
        private RoundedImageView rvImg;
        private TextView tvContent;
        private TextView tvTime;
        private TextView tvName;
        private Context context;

        ViewHolder(@NonNull View itemView, OnAdapterItemClick onAdapterItemClick) {
            super(itemView);
            context = itemView.getContext();
            videoCover = itemView.findViewById(R.id.video_cover);
            rvLogo = itemView.findViewById(R.id.rv_logo);
            rvImg = itemView.findViewById(R.id.rv_img);
            tvContent = itemView.findViewById(R.id.tv_content);
            tvName = itemView.findViewById(R.id.tv_name);
            tvTime = itemView.findViewById(R.id.tv_publish_time);
            itemView.setOnClickListener(v -> onAdapterItemClick.onItemClick(itemView, getAdapterPosition()));

        }

        @Override
        public void bindData(CommentBean bean) {
            videoCover.setVisibility(View.GONE);
            tvContent.setVisibility(View.GONE);
            rvImg.setVisibility(View.GONE);
            if(!TextUtils.isEmpty(bean.videoUrl)){
                videoCover.setVisibility(View.VISIBLE);
                gsyVideoOptionBuilder
                        .setIsTouchWiget(false)
                        .setUrl(bean.videoUrl)
                        .setCacheWithPlay(true)
                        .setRotateViewAuto(true)
                        .setLockLand(true)
                        .setPlayTag(TAG)
                        .setVideoTitle("")
                        .setShowFullAnimation(true)
                        .setNeedLockFull(true)
                        .setPlayPosition(this.getAdapterPosition())
                        .setVideoAllCallBack(new GSYSampleCallBack() {
                            @Override
                            public void onPrepared(String url, Object... objects) {
                                super.onPrepared(url, objects);
                                if (!videoCover.isIfCurrentIsFullscreen()) {
                                    //静音
                                    GSYVideoManager.instance().setNeedMute(false);
                                }
                            }
                            @Override
                            public void onQuitFullscreen(String url, Object... objects) {
                                super.onQuitFullscreen(url, objects);
                                //全屏不静音
                                GSYVideoManager.instance().setNeedMute(false);
                            }
                            @Override
                            public void onEnterFullscreen(String url, Object... objects) {
                                super.onEnterFullscreen(url, objects);
                                GSYVideoManager.instance().setNeedMute(false);
                                videoCover.getCurrentPlayer().getTitleTextView().setText((String) objects[0]);
                            }
                        }).build(videoCover);
                //增加title
                videoCover.getTitleTextView().setVisibility(View.GONE);
                //设置返回键
                videoCover.getBackButton().setVisibility(View.GONE);
                videoCover.getFullscreenButton().setVisibility(View.VISIBLE);
                //设置全屏按键功能
                videoCover.getFullscreenButton().setOnClickListener(v -> resolveFullBtn(videoCover, context));
                videoCover.loadCoverImage(bean.videoImageUrl, R.drawable.ic_placeholder_11);
            }

            if(!TextUtils.isEmpty(bean.picUrl)){
                rvImg.setVisibility(View.VISIBLE);
                Glide.with(context).load(bean.picUrl)
                        .apply(new RequestOptions().placeholder(R.drawable.ic_placeholder_11))
                        .into(rvImg);
            }

            if(!TextUtils.isEmpty(bean.content)){
                tvContent.setVisibility(View.VISIBLE);
                tvContent.setText(bean.content);
            }
            tvTime.setText(DateTimeTool.longToStr(bean.createTime,"MM月dd日 HH:mm"));
            tvName.setText(bean.userName);
            Glide.with(context).load(bean.userPic)
                    .apply(new RequestOptions().placeholder(R.drawable.ic_placeholder_11))
                    .into(rvLogo);
        }
    }

    /**
     * 全屏幕按键处理
     */
    private void resolveFullBtn(final StandardGSYVideoPlayer standardGSYVideoPlayer, Context context) {
        standardGSYVideoPlayer.startWindowFullscreen(context, true, true);
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(int type, int position, CommentBean model);
    }

    @Override
    public int getItemCount() {
        return super.getItemCount();
    }
}