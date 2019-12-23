package com.qdgdcm.appmine.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import com.lk.robin.commonlibrary.widget.BaseRecyclerAdapter;
import com.lk.robin.commonlibrary.widget.BaseRecyclerHolder;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;

import butterknife.BindView;

/**
 * author: li xiao
 * created on: 2019/12/3
 */
public class MyScoreAdapter extends BaseRecyclerAdapter<String> implements BaseRecyclerHolder.OnAdapterItemClick {

    private Context context;

    public MyScoreAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseRecyclerHolder<String> getViewholder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.mm_item_my_score_layout, parent, false),this);
    }

    @Override
    public void bind(BaseRecyclerHolder<String> holder, int position) {
        holder.bindData("");
    }

    @Override
    public void onItemClick(View v, int position) {
        if(onItemClickListener != null)
            onItemClickListener.onClick(0,position,"");
    }

    static class ViewHolder extends BaseRecyclerHolder<String> {
        @BindView(R2.id.tv_info)
        TextView tvInfo;
        @BindView(R2.id.tv_date)
        TextView tvDate;
        @BindView(R2.id.tv_score)
        TextView tvScore;
        private Context context;

        ViewHolder(@NonNull View itemView, OnAdapterItemClick onAdapterItemClick) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(v -> onAdapterItemClick.onItemClick(itemView,getAdapterPosition()));
        }

        @Override
        public void bindData(String bean) {
            tvInfo.setText("大冒险随机积分");
            tvDate.setText(new StringBuffer("2020-01-10"));
            int score = (int) (Math.random()*100);
            if(score%2 == 0){
                tvScore.setTextColor(ContextCompat.getColor(context,R.color.red_main));
                tvScore.setText(new StringBuffer("-" + score + "积分"));
            }else {
                tvScore.setTextColor(ContextCompat.getColor(context,R.color.txtColorBlack));
                tvScore.setText(new StringBuffer("+"+ score +"积分"));
            }
        }
    }

    private OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener{
        void onClick(int type, int position, String model);
    }

    @Override
    public int getItemCount() {
        return 15;
    }
}