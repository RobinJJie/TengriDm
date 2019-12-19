package com.qdgdcm.apphome.fragment.homeitem;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.langlibrary.HomDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


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

    private void initZy(){
        TextView txtTitle = rootYzSd.findViewById(R.id.txt_title);
        txtTitle.setText("综艺");
        RecyclerView mRecyclerView = rootZy.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = HomDataHelper.getZongyiList();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(dataLsit);
        adapterV1.setSetCount(6);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }

    private void initQg(){
        TextView txtTitle = rootYzSd.findViewById(R.id.txt_title);
        txtTitle.setText("情感");
        RecyclerView mRecyclerView = rootQg.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = HomDataHelper.getQingGanList();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(dataLsit);
        adapterV1.setSetCount(3);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }


    private void initErT(){
        TextView txtTitle = rootYzSd.findViewById(R.id.txt_title);
        txtTitle.setText("儿童");
        RecyclerView mRecyclerView = rootErT.findViewById(R.id.recycler_view);
        List<ContentBean> dataLsit = HomDataHelper.getErTongList();
        HomeAdapterV1 adapterV1 = new HomeAdapterV1(dataLsit);
        adapterV1.setSetCount(6);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mRecyclerView.setAdapter(adapterV1);
        mRecyclerView.setNestedScrollingEnabled(false);
    }
    class HomeAdapterV1 extends RecyclerView.Adapter<HomeAdapterV1.ViewHolder> {
        List<ContentBean> list ;

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
            holder.ic.setImageResource(list.get(position).resId);
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
