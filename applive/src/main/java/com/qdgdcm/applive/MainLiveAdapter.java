package com.qdgdcm.applive;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.widget.BaseRecyclerAdapter;
import com.lk.robin.commonlibrary.widget.BaseRecyclerHolder;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.lk.robin.langlibrary.bean.ContentBean;

import butterknife.BindView;

/**
 * author: li xiao
 * created on: 2019/12/20
 */
public class MainLiveAdapter extends BaseRecyclerAdapter<ContentBean> implements BaseRecyclerHolder.OnAdapterItemClick {

    private Context context;

    public MainLiveAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseRecyclerHolder<ContentBean> getViewholder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.lm_item_live_layout, parent, false), this);
    }

    @Override
    public void bind(BaseRecyclerHolder<ContentBean> holder, int position) {
        holder.bindData(items.get(position));
    }

    @Override
    public void onItemClick(View v, int position) {
        if (onItemClickListener != null)
            onItemClickListener.onClick(0, position, items.get(position));
    }

    class ViewHolder extends BaseRecyclerHolder<ContentBean> {

        @BindView(R2.id.rv_cover)
        RoundedImageView rvCover;
        @BindView(R2.id.iv_status)
        ImageView ivStatus;
        @BindView(R2.id.tv_title)
        TextView tvTitle;
        private Context context;

        ViewHolder(@NonNull View itemView, OnAdapterItemClick onAdapterItemClick) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(v -> onAdapterItemClick.onItemClick(itemView, getAdapterPosition()));
        }

        @SuppressLint("ResourceType")
        @Override
        public void bindData(ContentBean bean) {
            tvTitle.setText(bean.title);
            switch (bean.id){
                case 0:
                    ivStatus.setImageResource(R.drawable.ic_live_living);
                    break;
                case 1:
                    ivStatus.setImageResource(R.drawable.ic_live_yugao);
                    break;
                case 2:
                default:
                    ivStatus.setImageResource(R.drawable.ic_live_huigu);
                    break;
            }
            Glide.with(context).load(bean.resId).into(rvCover);
        }
    }

    private MainLiveAdapter.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(MainLiveAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(int type, int position, ContentBean bean);
    }
}