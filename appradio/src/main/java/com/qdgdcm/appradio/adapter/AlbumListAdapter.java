package com.qdgdcm.appradio.adapter;

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
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;

import butterknife.BindView;

/**
 * author: li xiao
 * created on: 2019/12/19
 */
public class AlbumListAdapter extends BaseRecyclerAdapter<ContentBean> {

    private Context context;

    public AlbumListAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseRecyclerHolder<ContentBean> getViewholder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.common_item_album_layout, parent, false));
    }

    @Override
    public void bind(BaseRecyclerHolder<ContentBean> holder, int position) {
        holder.bindData(items.get(position));
    }

    static class ViewHolder extends BaseRecyclerHolder<ContentBean> {
        @BindView(R2.id.rv_album_cover)
        RoundedImageView rvAlbumCover;
        @BindView(R2.id.tv_album_title)
        TextView tvAlbumTitle;
        @BindView(R2.id.tv_album_info)
        TextView tvAlbumInfo;
        @BindView(R2.id.tv_album_listener)
        TextView tvAlbumListener;
        @BindView(R2.id.tv_album_num)
        TextView tvAlbumNum;
        private Context context;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
        }

        @SuppressLint("ResourceType")
        @Override
        public void bindData(ContentBean bean) {
            tvAlbumTitle.setText(bean.title);
            tvAlbumInfo.setText(bean.info);
            Glide.with(context).load(bean.resId).into(rvAlbumCover);
        }
    }
}