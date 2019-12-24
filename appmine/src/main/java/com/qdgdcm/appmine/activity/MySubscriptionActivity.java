package com.qdgdcm.appmine.activity;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.model.CommentBean;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.langlibrary.GuangboDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;

import java.util.List;

import butterknife.BindView;

@Route(path = ConstantsRouter.Mine.MineMySubscriptionActivity)
public class MySubscriptionActivity extends ActivityPresenter {
    @BindView(R2.id.ic_bm_top_back)
    View back;
    @BindView(R2.id.txt_bm_top_title)
    TextView txt;
    @BindView(R2.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_my_subscription;
    }

    @Override
    protected void initData() {
        super.initData();
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(v -> finish());
        txt.setText("订阅");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ReAdapter(GuangboDataHelper.getZongyiList(),3));
    }

    class ReAdapter extends RecyclerView.Adapter<ReAdapter.ViewHolder> {

        public ReAdapter(List<ContentBean> list, int conunt) {
            this.list = list;
            Conunt = conunt;
        }

        private List<ContentBean> list;
        private int Conunt;

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.mm_item_subscribe_layout, parent, false);
            return new ViewHolder(inflate);
        }

        @SuppressLint("ResourceType")
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txtTitle.setText(list.get(position).title);
            holder.txtInfo.setText(list.get(position).info);
            Glide.with(getApplicationContext()).load(list.get(position).resId).into(holder.ic);
            holder.txtTag.setText(String.valueOf(position+1+"小时前"));
        }

        @Override
        public int getItemCount() {
            return list==null?0:list.size();
        }

        public void setConunt(int conunt) {
            Conunt = conunt;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView ic;
            private TextView txtTitle, txtInfo, txtTag;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                ic=itemView.findViewById(R.id.rv_logo);
                txtTitle=itemView.findViewById(R.id.tv_title);
                txtInfo=itemView.findViewById(R.id.tv_info);
                txtTag=itemView.findViewById(R.id.tv_date);
            }
        }
    }
}
