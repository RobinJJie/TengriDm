package com.qdgdcm.appmine.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.langlibrary.XiangchangDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.appmine.R;
import com.qdgdcm.appmine.R2;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MyActionActivity extends ActivityPresenter {
    @BindView(R2.id.ic_bm_top_back)
    View back;
    @BindView(R2.id.txt_bm_top_title)
    TextView txt;
    @BindView(R2.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R2.id.root_xtxx)
    View rootJxz;
    @BindView(R2.id.root_tz)
    View rootYjs;

    @Override
    protected BaseContract.Presenter initPresenter() {
        return null;
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_my_action;
    }

    public void setBar(int id) {
        rootJxz.setSelected(id == R.id.root_xtxx);
        rootYjs.setSelected(id == R.id.root_tz);
    }

    @Override
    protected void initData() {
        super.initData();
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(v -> finish());
        txt.setText("活动");
        setBar(R.id.root_xtxx);
        setList(true);
    }

    @OnClick(R2.id.root_xtxx)
    void Xtxx() {
        setBar(R.id.root_xtxx);
        setList(true);
    }

    @OnClick(R2.id.root_tz)
    void tz() {
        setBar(R.id.root_tz);
        setList(false);
    }

    private void setList(boolean isIng) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ReAdapter reAdapter = new ReAdapter(this,XiangchangDataHelper.getLiveHD());
        reAdapter.setIng(isIng);
        recyclerView.setAdapter(reAdapter);
    }

    class ReAdapter extends RecyclerView.Adapter<ReAdapter.Vh> {
        private Context context;
        private List<ContentBean> list;

        public ReAdapter(List<ContentBean> list) {
            this.list = list;
        }

        public ReAdapter(Context context, List<ContentBean> list) {
            this.context = context;
            this.list = list;
        }

        private boolean isIng = true;

        public void setIng(boolean ing) {
            isIng = ing;
        }

        @NonNull
        @Override
        public Vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.mm_item_active_list_layout, parent, false);
            return new Vh(inflate);
        }

        @SuppressLint("ResourceType")
        @Override
        public void onBindViewHolder(@NonNull Vh holder, int position) {
            if (isIng) {
                holder.txtTag.setTextColor(Color.WHITE);
                holder.txtTag.setBackgroundColor(Color.parseColor("#359FFF"));
                holder.txtTag.setText("报名中");
            } else {
                holder.txtTag.setTextColor(Color.BLACK);
                holder.txtTag.setBackgroundColor(Color.GRAY);
                holder.txtTag.setText("已结束");
            }
            holder.txtTitle.setText(list.get(position).title);
            Glide.with(getApplicationContext()).load(list.get(position).resId).into(holder.ic);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isIng) {
                        context.startActivity(new Intent(context, ActionBaomingActivity.class));
                    } else {
                        Factory.toast("活动已结束");
                    }
                }
            });

        }

        @Override
        public int getItemCount() {
            return list == null ? 0 : list.size();
        }

        class Vh extends RecyclerView.ViewHolder {
            private TextView txtTitle, txtTag;
            private ImageView ic;

            public Vh(@NonNull View itemView) {
                super(itemView);
                txtTitle = itemView.findViewById(R.id.title);
                txtTag = itemView.findViewById(R.id.tag);
                ic = itemView.findViewById(R.id.image);
            }
        }
    }
}
