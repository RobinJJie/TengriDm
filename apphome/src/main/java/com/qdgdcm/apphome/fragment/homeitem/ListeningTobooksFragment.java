package com.qdgdcm.apphome.fragment.homeitem;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.langlibrary.HomDataHelper;
import com.lk.robin.langlibrary.XiangShengDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListeningTobooksFragment extends AppFragment {
    @BindView(R2.id.banner)
    Banner mBanner;
    @BindView(R2.id.root_xssd)
    View rootXssd;
    @BindView(R2.id.root_cxmz)
    View rootCxmz;
    public ListeningTobooksFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_listening_tobooks;
    }

    @Override
    protected void initData() {
        super.initData();
        initXlmz();
        initXssd();
        mBanner.setImageLoader(new TengriNewsHomeFragment.GlideImageLoader());
        List<ContentBean> bannerList = HomDataHelper.getBannerList();
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < bannerList.size(); i++) {
            ids.add(bannerList.get(i).resId);
        }
        mBanner.setImages(ids);
        mBanner.setDelayTime(2800);
        mBanner.start();

        mBanner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
                TurnToFrag frag = new TurnToFrag();
                Bundle bundle = new Bundle();
                bundle.putString("title", bannerList.get(position).title);
                bundle.putString("info", bannerList.get(position).info);
                bundle.putInt("ic", bannerList.get(position).resId);
                frag.launchMode = TurnToFrag.FRAG_OPEN;
                frag.fragHoust = ConstantsRouter.Home.HomeMainProgramInfoFragment;
                frag.bundle = bundle;
                rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
                rsp.data = frag;

                MsgServer.init().save(rsp);
            }
        });
    }
    private void initXssd() {
        TextView txtTitle = rootXssd.findViewById(R.id.txt_title);
        txtTitle.setText("书海盛宴");
        RecyclerView mRecyclerView = rootXssd.findViewById(R.id.recycler_view);
        List<ContentBean> shuhaiSehngyan = XiangShengDataHelper.getXsJcxs();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(shuhaiSehngyan);
        adapterV1.setSetCount(6);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }
    private void initXlmz() {
        TextView txtTitle = rootCxmz.findViewById(R.id.txt_title);
        txtTitle.setText("书海盛宴");
        RecyclerView mRecyclerView = rootCxmz.findViewById(R.id.recycler_view);
        List<ContentBean> shuhaiSehngyan = XiangShengDataHelper.getXsYmds();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(shuhaiSehngyan);
        adapterV1.setSetCount(6);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }


    class HomeAdapterV1 extends RecyclerView.Adapter<HomeAdapterV1.ViewHolder> {
        List<ContentBean> list;

        public HomeAdapterV1(List<ContentBean> list) {
            this.list = list;
        }

        private int setCount;

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_item_one_icon_01_layout, parent, false);
            return new ViewHolder(inflate);
        }

        @SuppressLint("ResourceType")
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txtTitle.setText(list.get(position).title);
            Glide.with(Objects.requireNonNull(getContext())).load(list.get(position).resId).into(holder.ic);
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

        class ViewHolder extends RecyclerView.ViewHolder {
            private TextView txtTitle;
            private ImageView ic;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                txtTitle = itemView.findViewById(R.id.txt_title);
                ic = itemView.findViewById(R.id.ic_image);
            }
        }

        public void setSetCount(int setCount) {
            this.setCount = setCount;
        }
    }

}
