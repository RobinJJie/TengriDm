package com.qdgdcm.apphome.fragment.homeitem;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.langlibrary.HomDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;
import com.youth.banner.Banner;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class TengriNewsHomeFragment extends AppFragment {
    @BindView(R2.id.root_shsy)
    LinearLayout rootShSy;
    @BindView(R2.id.root_yzsd)
    LinearLayout rootYzSd;
    @BindView(R2.id.root_zy)
    LinearLayout rootZy;
    @BindView(R2.id.root_qg)
    LinearLayout rootQg;
    @BindView(R2.id.root_xs)
    LinearLayout rootXs;
    @BindView(R2.id.root_er_tong)
    LinearLayout rootErT;
    @BindView(R2.id.banner)
    Banner mBanner;

    public TengriNewsHomeFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_tengri_news_home;
    }

    @Override
    protected void initData() {
        super.initData();
        initErT();
        initQg();
        initShSy();
        initZy();
        initYzsd();
        initXs();
        mBanner.setImageLoader(new GlideImageLoader());
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

    private void initShSy() {
        TextView txtTitle = rootShSy.findViewById(R.id.txt_title);
        txtTitle.setText("书海盛宴");
        RecyclerView mRecyclerView = rootShSy.findViewById(R.id.recycler_view);
        List<ContentBean> shuhaiSehngyan = HomDataHelper.getShuhaiSehngyan();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(shuhaiSehngyan);
        adapterV1.setSetCount(6);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    private void initZy() {
        TextView txtTitle = rootZy.findViewById(R.id.txt_title);
        txtTitle.setText("综艺");
        RecyclerView mRecyclerView = rootZy.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = HomDataHelper.getZongyiList();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(dataLsit);
        adapterV1.setSetCount(6);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    private void initQg() {
        TextView txtTitle = rootQg.findViewById(R.id.txt_title);
        txtTitle.setText("情感");
        RecyclerView mRecyclerView = rootQg.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = HomDataHelper.getQingGanList();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(dataLsit);
        adapterV1.setSetCount(3);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }


    private void initErT() {
        TextView txtTitle = rootErT.findViewById(R.id.txt_title);
        txtTitle.setText("儿童");
        RecyclerView mRecyclerView = rootErT.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = HomDataHelper.getErTongList();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(dataLsit);
        adapterV1.setSetCount(6);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    private void initYzsd() {
        TextView txtTitle = rootYzSd.findViewById(R.id.txt_title);
        txtTitle.setText("一周书单");
        LinearLayout layout = rootYzSd.findViewById(R.id.root_linear);
        layout.setPadding(20, 20, 20, 20);
        layout.setBackgroundResource(R.drawable.bg_home_yzsd_082633);
        List<ContentBean> yizhouShudan = HomDataHelper.getYizhouShudan();
        if (yizhouShudan.size() >= 3) {
            for (int i = 0; i < 3; i++) {
                View itemView = LayoutInflater.from(getContext()).inflate(R.layout.app_item_one_icon_02_layout, layout, false);
                TextView txtName = itemView.findViewById(R.id.txt_title);
                TextView txtNum = itemView.findViewById(R.id.txt_count);
                txtName.setTextColor(Color.WHITE);
                ImageView ic = itemView.findViewById(R.id.ic_image);
                txtName.setText(yizhouShudan.get(i).title);
                txtNum.setText(yizhouShudan.get(i).countRead + "万");
                Glide.with(Objects.requireNonNull(getContext())).load(yizhouShudan.get(i).resId).into(ic);
                layout.addView(itemView);
            }
        }
    }

    private void initXs() {
        TextView txtTitle = rootXs.findViewById(R.id.txt_title);
        txtTitle.setText("相声");
        RecyclerView mRecyclerView = rootXs.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = HomDataHelper.getXiangsheng();
        HomeAdapterV2 adapterV2 = new HomeAdapterV2(dataLsit);
        adapterV2.setSetCount(3);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapterV2);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    @OnClick({R2.id.root_home_biting, R2.id.root_home_jingpin, R2.id.root_home_gxsc, R2.id.root_home_ting_gb})
    void onClicks(View view) {
        int id = view.getId();
        if (id == R.id.root_home_biting) {
            MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
            TurnToFrag frag = new TurnToFrag();
            frag.launchMode = TurnToFrag.FRAG_OPEN;
            frag.fragHoust = ConstantsRouter.Home.HomeMainBitingListFragment;
            rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
            rsp.data = frag;
            MsgServer.init().save(rsp);
        } else if (id == R.id.root_home_jingpin) {
            MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
            TurnToFrag frag = new TurnToFrag();
            frag.launchMode = TurnToFrag.FRAG_OPEN;
            frag.fragHoust = ConstantsRouter.Home.HomeMainBoutiqueListFragment;
            rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
            rsp.data = frag;
            MsgServer.init().save(rsp);
        } else if (id == R.id.root_home_gxsc) {
            MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
            TurnToFrag frag = new TurnToFrag();
            frag.launchMode = TurnToFrag.FRAG_OPEN;
            frag.fragHoust = ConstantsRouter.Home.HomeMainGuoXueCollectionFragment;
            rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
            rsp.data = frag;
            MsgServer.init().save(rsp);
        } else if (id == R.id.root_home_ting_gb) {
            MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
            TurnToFrag frag = new TurnToFrag();
            Bundle bundle = new Bundle();
            bundle.putString("title", "听广播");
            bundle.putBoolean("hideTitle", false);
            frag.launchMode = TurnToFrag.FRAG_OPEN;
            frag.fragHoust = ConstantsRouter.Radio.RadioHome;
            frag.bundle = bundle;
            rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
            rsp.data = frag;

            MsgServer.init().save(rsp);
        }
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

    static class GlideImageLoader extends ImageLoader {

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {

            Glide.with(context).
                    load(path)
                    .into(imageView);
        }

        @Override
        public ImageView createImageView(Context context) {
            ImageView imageView = new ImageView(context);
            imageView.setPadding(34, 0, 34, 0);
            return imageView;
        }
    }
}
