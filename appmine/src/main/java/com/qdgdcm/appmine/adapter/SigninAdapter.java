package com.qdgdcm.appmine.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.widget.BaseRecyclerAdapter;
import com.lk.robin.commonlibrary.widget.BaseRecyclerHolder;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;
import butterknife.BindView;

/**
 * author: li xiao
 * created on: 2019/12/24
 */
public class SigninAdapter  extends BaseRecyclerAdapter<String>{

    private Context context;

    public SigninAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseRecyclerHolder<String> getViewholder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.mm_item_signin_layout, parent, false));
    }

    @Override
    public void bind(BaseRecyclerHolder<String> holder, int position) {
        holder.bindData("");
    }

    class ViewHolder extends BaseRecyclerHolder<String> {
        
        @BindView(R2.id.tv_date)
        TextView tvDate;
        @BindView(R2.id.iv_tag)
        ImageView ivTag;
        
        private Context context;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
        }

        @SuppressLint("ResourceType")
        @Override
        public void bindData(String bean) {
            tvDate.setText(String.valueOf(getAdapterPosition()+1));
            ivTag.setVisibility(getAdapterPosition()>3&&getAdapterPosition()<12?View.VISIBLE:View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return 31;
    }

}