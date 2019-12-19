package com.lk.robin.commonlibrary.widget;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * author: li xiao
 * created on: 2019/5/14
 */
public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<BaseRecyclerHolder<T>> {

    private Context context;
    protected List<T> items;

    public BaseRecyclerAdapter(Context context){
      this.context = context;
      items = new ArrayList<T>();
    }

    @NonNull
    @Override
    public BaseRecyclerHolder<T> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return getViewholder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseRecyclerHolder<T> holder, int position) {
        bind(holder,position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void refresh(List<T> items) {
        this.items.clear();
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    public void addList(List<T> items) {
        if(items.size()>0)
            this.items.addAll(items);
        notifyDataSetChanged();
    }

    public void addData(@IntRange(from = 0) int position, @NonNull T data) {
        items.add(position, data);
        notifyItemInserted(position);
        compatibilityDataSizeChanged(1);
    }

    public void addData( @NonNull T data) {
        items.add(data);
        notifyItemInserted(items.size());
    }

    public void remove(int position) {
        items.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, items.size() - position);
    }

    private void compatibilityDataSizeChanged(int size) {
        final int dataSize = items == null ? 0 : items.size();
        if (dataSize == size) {
            notifyDataSetChanged();
        }
    }

    public abstract BaseRecyclerHolder<T> getViewholder(ViewGroup parent, int viewType);
    public abstract void bind(BaseRecyclerHolder<T> holder, int position);

}