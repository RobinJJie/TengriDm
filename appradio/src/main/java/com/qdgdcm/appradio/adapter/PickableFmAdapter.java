package com.qdgdcm.appradio.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.widget.BaseRecyclerAdapter;
import com.lk.robin.commonlibrary.widget.BaseRecyclerHolder;
import com.lk.robin.commonlibrary.widget.PickHorizontalView;
import com.lk.robin.commonlibrary.widget.round.RoundedImageView;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.appradio.R;
import com.qdgdcm.appradio.R2;
import butterknife.BindView;

/**
 * author: li xiao
 * created on: 2019/12/19
 */
public class PickableFmAdapter extends BaseRecyclerAdapter<ContentBean> implements PickHorizontalView.IAutoLocateHorizontalView{

    private Context context;
    private View itemView;

    public PickableFmAdapter(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public BaseRecyclerHolder<ContentBean> getViewholder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.rm_item_pick_fm, parent, false);
        this.itemView = itemView;
        return new ViewHolder(itemView);
    }

    @Override
    public void bind(BaseRecyclerHolder<ContentBean> holder, int position) {
        holder.bindData(items.get(position));
    }

    @Override
    public View getItemView() {
        return itemView;
    }

    @Override
    public void onViewSelected(boolean isSelected, int pos, RecyclerView.ViewHolder holder, int itemWidth) {
//        ViewHolder holder1 = (ViewHolder) holder;
//        ViewGroup.LayoutParams params = holder1.bar.getLayoutParams();
//        params.height = (int) (ages.get(pos)*1f / maxValue * maxHeight);
//        params.width = itemWidth/3;
//        holder1.bar.setLayoutParams(params);
//        if(isSelected){
//            holder1.bar.setBackgroundColor(Color.RED);
//        }else{
//            holder1.bar.setBackgroundColor(Color.BLUE);
//        }
        if(itemSelectedListener != null && isSelected) {
            itemSelectedListener.onSelected(pos,items.get(pos));
        }
    }

    static class ViewHolder extends BaseRecyclerHolder<ContentBean> {
        @BindView(R2.id.rv_fms_cover)
        RoundedImageView rvFmsCover;
        private Context context;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
        }

        @SuppressLint("ResourceType")
        @Override
        public void bindData(ContentBean bean) {
            Glide.with(context).load(bean.resId).into(rvFmsCover);
        }
    }
    private OnItemSelectedListener itemSelectedListener;
    public void setItemSelectedListener(OnItemSelectedListener itemSelectedListener) {
        this.itemSelectedListener = itemSelectedListener;
    }
    public interface OnItemSelectedListener{
        void onSelected(int position,ContentBean bean);
    }
}