package com.qdgdcm.apphome.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.FragmentPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.langlibrary.HomDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = ConstantsRouter.Home.HomeMoreMainHomeFragment)
public class MoreMainHomeFragment extends FragmentPresenter {
    @BindView(R2.id.ic_bm_top_back)
    View back;
    @BindView(R2.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R2.id.txt_bm_top_title)
    TextView title;

    private String id = "1";

    public MoreMainHomeFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_more_main_home;
    }

    @Override
    protected BaseContract.Presenter initPersenter() {
        return null;
    }


    private void initShSy() {
        title.setText("书海盛宴");
        List<ContentBean> shuhaiSehngyan = HomDataHelper.getShuhaiSehngyan();
        HomeAdapterV2 adapterV2 = new HomeAdapterV2(shuhaiSehngyan);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
    }

    private void initZy() {
        title.setText("综艺");
        List<ContentBean> dataLsit = HomDataHelper.getZongyiList();
        HomeAdapterV2 adapterV2 = new HomeAdapterV2(dataLsit);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
    }

    private void initQg() {
        title.setText("情感");
        List<ContentBean> dataLsit = HomDataHelper.getQingGanList();
        HomeAdapterV2 adapterV2 = new HomeAdapterV2(dataLsit);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
    }


    private void initErT() {
        title.setText("儿童");
        List<ContentBean> dataLsit = HomDataHelper.getErTongList();
        HomeAdapterV2 adapterV2 = new HomeAdapterV2(dataLsit);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    private void initYzsd() {
        title.setText("一周书单");
        List<ContentBean> yizhouShudan = HomDataHelper.getYizhouShudan();
        HomeAdapterV2 adapterV2 = new HomeAdapterV2(yizhouShudan);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
    }

    private void initXs() {
        title.setText("相声");
        List<ContentBean> dataLsit = HomDataHelper.getXiangsheng();
        HomeAdapterV2 adapterV2 = new HomeAdapterV2(dataLsit);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
    }

    @Override
    protected void initData() {
        super.initData();
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(v ->onHomeBack());
        Bundle arguments = getArguments();
        if (arguments != null) {
            id = arguments.getString("id");
        }

        if ("1".equals(id)) {
            initShSy();
        } else if ("2".equals(id)) {
            initYzsd();
        } else if ("3".equals(id)) {
            initZy();
        } else if ("4".equals(id)) {
            initQg();
        } else if ("5".equals(id)) {
            initXs();
        } else if ("6".equals(id)) {
            initErT();
        }
    }

    class HomeAdapterV2 extends RecyclerView.Adapter<HomeAdapterV2.ViewHolder> {
        List<ContentBean> list;
        private int setCount;

        public HomeAdapterV2(List<ContentBean> list) {
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

            return list.size();
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
