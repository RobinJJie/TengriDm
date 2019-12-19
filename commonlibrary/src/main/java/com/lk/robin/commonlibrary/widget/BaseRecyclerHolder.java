package com.lk.robin.commonlibrary.widget;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.ButterKnife;

/**
 * author: li xiao
 * created on: 2019/5/14
 */
public abstract class BaseRecyclerHolder<T> extends RecyclerView.ViewHolder {
    public BaseRecyclerHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
    public abstract void bindData(T t);

    public interface OnAdapterItemClick{
        void onItemClick(View v, int position);
    }
}