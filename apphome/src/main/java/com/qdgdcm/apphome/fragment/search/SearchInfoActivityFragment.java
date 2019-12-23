package com.qdgdcm.apphome.fragment.search;

import android.annotation.SuppressLint;
import android.os.Bundle;
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
import com.lk.robin.commonlibrary.app.FragmentPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.langlibrary.GuangboDataHelper;
import com.lk.robin.langlibrary.HomDataHelper;
import com.lk.robin.langlibrary.XiangShengDataHelper;
import com.lk.robin.langlibrary.XiangchangDataHelper;
import com.lk.robin.langlibrary.ZhuanJiDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = ConstantsRouter.Home.HomeMainSearchInfoActivityFragment)
public class SearchInfoActivityFragment extends FragmentPresenter {
    @BindView(R2.id.root_zhuangji)
    View rootZhuangji;
    @BindView(R2.id.root_danqu)
    View rootDanqu;
    @BindView(R2.id.root_guangbo)
    View rootGuangbo;
    @BindView(R2.id.root_xianchang)
    View rootXianchang;

    @BindView(R2.id.root_all)
    View barAll;
    @BindView(R2.id.root_dq)
    View barDq;
    @BindView(R2.id.root_zj)
    View barZj;
    @BindView(R2.id.root_gb)
    View barGb;
    @BindView(R2.id.root_xc)
    View barXc;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_search_info;
    }

    @Override
    protected void initData() {
        super.initData();
        initDq(2);
        initGb(2);
        initXc(2);
        initZj(2);
        setBar(R.id.root_all);
    }

    @OnClick({R2.id.root_all, R2.id.root_dq, R2.id.root_zj, R2.id.root_gb, R2.id.root_xc})
    void onClicks(View view) {
        int id = view.getId();
        if (id == R.id.root_all) {
            rootZhuangji.setVisibility(View.VISIBLE);
            rootDanqu.setVisibility(View.VISIBLE);
            rootGuangbo.setVisibility(View.VISIBLE);
            rootXianchang.setVisibility(View.VISIBLE);
            initDq(2);
            initGb(2);
            initXc(2);
            initZj(2);
        } else if (id == R.id.root_dq) {
            rootZhuangji.setVisibility(View.GONE);
            rootDanqu.setVisibility(View.VISIBLE);
            rootGuangbo.setVisibility(View.GONE);
            rootXianchang.setVisibility(View.GONE);
            initDq(HomDataHelper.getXiangsheng().size());
        } else if (id == R.id.root_zj) {
            rootZhuangji.setVisibility(View.VISIBLE);
            rootDanqu.setVisibility(View.GONE);
            rootGuangbo.setVisibility(View.GONE);
            rootXianchang.setVisibility(View.GONE);
            initZj(ZhuanJiDataHelper.getZhuanji().size());
        } else if (id == R.id.root_gb) {
            rootZhuangji.setVisibility(View.GONE);
            rootDanqu.setVisibility(View.GONE);
            rootGuangbo.setVisibility(View.VISIBLE);
            rootXianchang.setVisibility(View.GONE);
            initGb(GuangboDataHelper.getYYSList().size());
        } else if (id == R.id.root_xc) {
            rootZhuangji.setVisibility(View.GONE);
            rootDanqu.setVisibility(View.GONE);
            rootGuangbo.setVisibility(View.GONE);
            rootXianchang.setVisibility(View.VISIBLE);
            initXc(XiangchangDataHelper.getLiveHD().size());
        }
        setBar(id);
    }

    @OnClick(R2.id.btn_close)
    void onClose(){
        onHomeBack();
    }

    private void setBar(int id) {
        barAll.setSelected(id == R.id.root_all);
        barDq.setSelected(id == R.id.root_dq);
        barZj.setSelected(id == R.id.root_zj);
        barGb.setSelected(id == R.id.root_gb);
        barXc.setSelected(id == R.id.root_xc);
    }

    private void initZj(int count) {
        TextView txtTitle = rootZhuangji.findViewById(R.id.txt_title);
        rootZhuangji.findViewById(R.id.txt_more).setVisibility(View.GONE);
        txtTitle.setText("专辑");
        RecyclerView mRecyclerView = rootZhuangji.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = ZhuanJiDataHelper.getZhuanji();
        SearchAdapterV2 adapterV2 = new SearchAdapterV2(dataLsit);
        adapterV2.setSetCount(count);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    private void initDq(int count) {
        TextView txtTitle = rootDanqu.findViewById(R.id.txt_title);
        rootDanqu.findViewById(R.id.txt_more).setVisibility(View.GONE);
        txtTitle.setText("单曲");
        RecyclerView mRecyclerView = rootDanqu.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = ZhuanJiDataHelper.getDanqu();
        SearchAdapterV2 adapterV2 = new SearchAdapterV2(dataLsit);
        adapterV2.setSetCount(count);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    private void initGb(int count) {
        TextView txtTitle = rootGuangbo.findViewById(R.id.txt_title);
        rootGuangbo.findViewById(R.id.txt_more).setVisibility(View.GONE);
        txtTitle.setText("广播");
        RecyclerView mRecyclerView = rootGuangbo.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = GuangboDataHelper.getYYSList();
        SearchAdapterV2 adapterV2 = new SearchAdapterV2(dataLsit);
        adapterV2.setSetCount(count);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    private void initXc(int count) {
        TextView txtTitle = rootXianchang.findViewById(R.id.txt_title);
        rootXianchang.findViewById(R.id.txt_more).setVisibility(View.GONE);
        txtTitle.setText("现场");
        RecyclerView mRecyclerView = rootXianchang.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = XiangchangDataHelper.getLiveHD();
        SearchAdapterV1 adapterV2 = new SearchAdapterV1(dataLsit);
        adapterV2.setSetCount(count);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    @Override
    protected BaseContract.Presenter initPersenter() {
        return null;
    }


    class SearchAdapterV2 extends RecyclerView.Adapter<SearchAdapterV2.ViewHolder> {
        List<ContentBean> list;
        private int setCount;

        public SearchAdapterV2(List<ContentBean> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_item_album_layout, parent, false);
            return new ViewHolder(inflate);
        }

        @SuppressLint("ResourceType")
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txtJi.setText(list.get(position).albumNum);
            holder.txtInfo.setText(list.get(position).info);
            holder.txtTitle.setText(list.get(position).title);
            holder.readCount.setText(list.get(position).countRead);
            Glide.with(Factory.app()).load(list.get(position).resId).into(holder.ic);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
                    TurnToFrag frag = new TurnToFrag();
                    Bundle bundle = new Bundle();
                    bundle.putString("title", list.get(position).title);
                    bundle.putString("info", list.get(position).info);
                    bundle.putInt("ic", list.get(position).resId);
                    frag.launchMode = TurnToFrag.FRAG_OPEN;
                    frag.fragHoust = ConstantsRouter.Home.HomeMainProgramInfoFragment;
                    frag.bundle = bundle;
                    rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
                    rsp.data = frag;

                    MsgServer.init().save(rsp);
                }
            });
        }

        @Override
        public int getItemCount() {
            if (setCount > 0) {
                return setCount;
            }
            return list.size();
        }

        public void setSetCount(int setCount) {
            this.setCount = setCount;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private TextView txtTitle, txtInfo, readCount, txtJi;
            private ImageView ic;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                txtTitle = itemView.findViewById(R.id.tv_album_title);
                txtInfo = itemView.findViewById(R.id.tv_album_info);
                readCount = itemView.findViewById(R.id.tv_album_listener);
                ic = itemView.findViewById(R.id.rv_album_cover);
                txtJi = itemView.findViewById(R.id.tv_album_num);
            }
        }
    }

    class SearchAdapterV1 extends RecyclerView.Adapter<SearchAdapterV1.ViewHolder> {

        List<ContentBean> list;
        private int setCount;

        public SearchAdapterV1(List<ContentBean> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.frag_item_live_view_layout, parent, false);
            return new ViewHolder(inflate);
        }

        @SuppressLint("ResourceType")
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txtTitle.setText(list.get(position).title);
            Glide.with(Factory.app()).load(list.get(position).resId).into(holder.ic);
        }

        @Override
        public int getItemCount() {
            if (setCount > 0) {
                return setCount;
            }
            return list.size();
        }

        public void setSetCount(int setCount) {
            this.setCount = setCount;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private TextView txtTitle, txtInfo, readCount, txtJi;
            private ImageView ic;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                txtTitle = itemView.findViewById(R.id.tv_album_title);
                txtInfo = itemView.findViewById(R.id.tv_album_info);
                readCount = itemView.findViewById(R.id.tv_album_listener);
                ic = itemView.findViewById(R.id.rv_album_cover);
                txtJi = itemView.findViewById(R.id.tv_album_num);
            }
        }
    }

}
