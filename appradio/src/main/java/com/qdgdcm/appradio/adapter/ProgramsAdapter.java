package com.qdgdcm.appradio.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.lk.robin.commonlibrary.widget.BaseRecyclerAdapter;
import com.lk.robin.commonlibrary.widget.BaseRecyclerHolder;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;

import butterknife.BindView;

/**
 * author: li xiao
 * created on: 2019/12/20
 */
public class ProgramsAdapter extends BaseRecyclerAdapter<ContentBean> implements BaseRecyclerHolder.OnAdapterItemClick {

    private Context context;

    public ProgramsAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseRecyclerHolder<ContentBean> getViewholder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.rm_item_programs_layout, parent, false), this);
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
        @BindView(R2.id.iv_living)
        ImageView ivLiving;
        @BindView(R2.id.tv_position)
        TextView tvPosition;
        @BindView(R2.id.tv_name)
        TextView tvName;
        @BindView(R2.id.tv_play_time)
        TextView tvPlayTime;
        @BindView(R2.id.tv_play_num)
        TextView tvPlayNum;
        @BindView(R2.id.iv_more)
        ImageView ivMore;
        private Context context;

        ViewHolder(@NonNull View itemView, OnAdapterItemClick onAdapterItemClick) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(v -> onAdapterItemClick.onItemClick(itemView, getAdapterPosition()));
        }

        @SuppressLint("ResourceType")
        @Override
        public void bindData(ContentBean bean) {
            tvName.setText(bean.title);
            if(this.getAdapterPosition() == 1){
                ivLiving.setVisibility(View.VISIBLE);
                tvPosition.setVisibility(View.GONE);
                tvName.setTextColor(ContextCompat.getColor(context,R.color.color_349eff));
            }else {
                ivLiving.setVisibility(View.GONE);
                tvPosition.setVisibility(View.VISIBLE);
                tvName.setTextColor(ContextCompat.getColor(context,R.color.txtColorBlack));
                tvPosition.setText(String.valueOf(this.getAdapterPosition() + 1));
            }
        }
    }

    private ProgramsAdapter.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(ProgramsAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(int type, int position, ContentBean bean);
    }
}