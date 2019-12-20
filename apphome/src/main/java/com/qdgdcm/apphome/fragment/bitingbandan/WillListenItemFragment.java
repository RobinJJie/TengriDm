package com.qdgdcm.apphome.fragment.bitingbandan;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.langlibrary.HomDataHelper;
import com.lk.robin.langlibrary.QingGanDataHelper;
import com.lk.robin.langlibrary.WenHuaDataHelper;
import com.lk.robin.langlibrary.XiangShengDataHelper;
import com.lk.robin.langlibrary.ZongYiDataHelper;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WillListenItemFragment extends AppFragment {
    @BindView(R2.id.recycler_view)
    RecyclerView mRecyclerView;
    private WillListenAdapter willListenAdapter;
    private String id="1";

    public WillListenItemFragment(String id) {
        this.id = id;
    }

    public WillListenItemFragment() {
        // Required empty public constructor
    }

    private List<ContentBean> list=new ArrayList<>();

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_will_listen_item;
    }

    @Override
    protected void initData() {
        super.initData();
        willListenAdapter = new WillListenAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(willListenAdapter);
//        Bundle arguments = getArguments();
//        if (arguments!=null)
//        id = arguments.getString("id");
        initDataList(id);
    }

    private void initDataList(String id) {
        list.clear();
        if ("1".equals(id)) {
            list.addAll(ZongYiDataHelper.getZyZb());
            willListenAdapter.notifyDataSetChanged();
        } else if ("2".equals(id)) {
            list.addAll(HomDataHelper.getTingShuXsSd());
            list.addAll(HomDataHelper.getTingShuCxs());
            willListenAdapter.notifyDataSetChanged();
        } else if ("3".equals(id)) {
            list.addAll(ZongYiDataHelper.getZyBxtk());
            list.addAll(ZongYiDataHelper.getZyDjdzt());
            willListenAdapter.notifyDataSetChanged();
        } else if ("4".equals(id)) {
            list.addAll(QingGanDataHelper.getQgHlsd());
            list.addAll(QingGanDataHelper.getQgJybjm());
            willListenAdapter.notifyDataSetChanged();
        } else if ("5".equals(id)) {
            list.addAll(WenHuaDataHelper.getWenHuaMbsy());
            list.addAll(WenHuaDataHelper.getWenHuaQzs());
            willListenAdapter.notifyDataSetChanged();
        } else if ("6".equals(id)) {
            list.addAll(XiangShengDataHelper.getXsJcxs());
            list.addAll(XiangShengDataHelper.getXsYmds());
            willListenAdapter.notifyDataSetChanged();
        } else if ("7".equals(id)) {

        }
    }

    class WillListenAdapter extends RecyclerView.Adapter<WillListenAdapter.ViewHolder> {

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_item_ranking_list_layout, parent, false);
            return new ViewHolder(inflate);
        }

        @SuppressLint("ResourceType")
        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.txtTitle.setText(list.get(position).title);
            holder.txtInfo.setText(list.get(position).info);
            holder.txtNum.setText(String.valueOf(position + 1));
            if (position <= 2) {
                holder.txtNum.setTextColor(getResources().getColor(R.color.colorMainTheme));
            } else {
                holder.txtNum.setTextColor(getResources().getColor(R.color.txtColorBlack));
            }
            String stl;
            if (TextUtils.isEmpty(list.get(position).countRead)) {
                Random random = new Random();
                double v = random.nextDouble() * 100;
                stl = String.valueOf(v + "万");
            } else {
                stl = list.get(position).countRead;
            }
            holder.txtSlt.setText(stl);
            String j;
            if (TextUtils.isEmpty(list.get(position).albumNum)) {
                Random random = new Random();
                int i = random.nextInt(66);
                j = String.valueOf(i + "集");
            } else {
                j = list.get(position).albumNum;
            }
            holder.txtHj.setText(j);
            Glide.with(Objects.requireNonNull(getContext())).load(list.get(position).resId).into(holder.ic);
        }

        @Override
        public int getItemCount() {
            return list == null ? 0 : list.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView txtNum, txtTitle, txtInfo, txtSlt, txtHj;
            ImageView ic;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                txtNum = itemView.findViewById(R.id.txt_list);
                txtTitle = itemView.findViewById(R.id.tv_album_title);
                txtInfo = itemView.findViewById(R.id.tv_album_info);
                txtSlt = itemView.findViewById(R.id.tv_album_listener);
                txtHj = itemView.findViewById(R.id.tv_album_num);
                ic = itemView.findViewById(R.id.rv_album_cover);
            }
        }
    }
}
