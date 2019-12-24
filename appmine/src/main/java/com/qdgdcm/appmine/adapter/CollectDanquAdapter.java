package com.qdgdcm.appmine.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.widget.BaseRecyclerAdapter;
import com.lk.robin.commonlibrary.widget.BaseRecyclerHolder;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;

import butterknife.BindView;

/**
 * author: li xiao
 * created on: 2019/12/24
 */
public class CollectDanquAdapter extends BaseRecyclerAdapter<ContentBean> implements BaseRecyclerHolder.OnAdapterItemClick {

    private Context context;

    public CollectDanquAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseRecyclerHolder<ContentBean> getViewholder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.mm_item_danqu_layout, parent, false), this);
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

        @BindView(R2.id.rv_logo)
        RoundedImageView rvLogo;
        @BindView(R2.id.tv_title)
        TextView tvTitle;
        @BindView(R2.id.tv_info)
        TextView tvInfo;
        @BindView(R2.id.tv_date)
        TextView tvDate;
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
            tvInfo.setText(bean.info);
            Glide.with(context).load(bean.resId).into(rvLogo);
        }
    }

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(int type, int position, ContentBean bean);
    }
}