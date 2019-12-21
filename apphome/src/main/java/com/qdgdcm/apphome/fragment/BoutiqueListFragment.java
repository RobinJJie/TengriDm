package com.qdgdcm.apphome.fragment;


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
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.langlibrary.JingPinDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 精品
 */
@Route(path = ConstantsRouter.Home.HomeMainBoutiqueListFragment)
public class BoutiqueListFragment extends AppFragment {
    @BindView(R2.id.ic_bm_top_back)
    View back;
    @BindView(R2.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R2.id.txt_bm_top_title)
    TextView title;

    private List<ContentBean> list = new ArrayList<>();

    public BoutiqueListFragment() {
        // Required empty public constructor
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        back.setVisibility(View.VISIBLE);
        title.setText("精品");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHomeBack();
            }
        });
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_boutique_list;
    }

    @Override
    protected void initData() {
        super.initData();
        BoutiqueAdapter adapter = new BoutiqueAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(adapter);
        list.addAll(JingPinDataHelper.getQgHlsd());
        adapter.notifyDataSetChanged();
    }

    class BoutiqueAdapter extends RecyclerView.Adapter<BoutiqueAdapter.ViewHolder> {


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
