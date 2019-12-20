package com.qdgdcm.appradio;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.commonlibrary.widget.PickHorizontalView;
import com.lk.robin.langlibrary.bean.ContentBean;
import com.qdgdcm.appradio.activity.FMDetailActivity;
import com.qdgdcm.appradio.activity.FMListActivity;
import com.qdgdcm.appradio.activity.PlayFMActivity;
import com.qdgdcm.appradio.adapter.FMListAdapter;
import com.qdgdcm.appradio.adapter.PickableFmAdapter;

import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = ConstantsRouter.Radio.RadioHome)
public class BroadcastFragment extends AppFragment {


    @BindView(R2.id.rl_current_fm)
    RelativeLayout currentFM;
    @BindView(R2.id.pv_bg)
    ImageView pvBg;
    @BindView(R2.id.im_syj)
    ImageView imSyj;
    @BindView(R2.id.txt_syj_name)
    TextView txtSyjName;
    @BindView(R2.id.txt_syj_content)
    TextView txtSyjContent;
    @BindView(R2.id.iv_play)
    ImageView ivPlay;
    @BindView(R2.id.txt_title)
    TextView txtTitle;//推荐列表标题
    @BindView(R2.id.title)
    TextView title;//主标题
    @BindView(R2.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R2.id.pv_fm_list)
    PickHorizontalView pvFmList;

    public BroadcastFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_broadcast;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        currentFM.setOnClickListener(view -> {
            startActivity(new Intent(getContext(), FMDetailActivity.class));
        });
        setStyle("广播","音乐随身听");
        ivPlay.setOnClickListener(view -> {
            startActivity(new Intent(getContext(), PlayFMActivity.class));
        });
        int index = 1;
        pvFmList.setItemCount(4);
        pvFmList.setInitPos(index);
        txtSyjName.setText(FMDataHelper.getYYSList().get(index).title);
        PickableFmAdapter fmAdapter = new PickableFmAdapter(getContext());
        fmAdapter.setItemSelectedListener((position, bean) -> {
            txtSyjName.setText(bean.title);
            txtSyjContent.setText("正在直播:大力水手");
        });
        pvFmList.setAdapter(fmAdapter);
        fmAdapter.refresh(FMDataHelper.getYYSList());
        Glide.with(Objects.requireNonNull(getContext())).load(R.mipmap.ic_bg_broadcast).into(pvBg);

        FMListAdapter fmListAdapter = new FMListAdapter(getContext());
        fmListAdapter.setShowDeleteOrPlay(false,true);
        fmListAdapter.setOnItemClickListener((type, position, bean) -> {
            startActivity(new Intent(getContext(), PlayFMActivity.class));
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(fmListAdapter);
        fmListAdapter.refresh(FMDataHelper.getFMList());
        recyclerView.setFocusable(false);
    }

    public void setStyle(String mainTitle,String listTitle){
        title.setText(mainTitle);
        txtTitle.setText(listTitle);
    }


    @OnClick({R2.id.iv_zhongyang, R2.id.iv_bendi, R2.id.iv_guoji, R2.id.iv_shoucang, R2.id.fl_more})
    void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_zhongyang) {
            startActivity(new Intent(getContext(), FMListActivity.class)
                    .putExtra("type",FMListActivity.ZHONGYANG));
        } else if (id == R.id.iv_bendi) {
            startActivity(new Intent(getContext(), FMListActivity.class)
                    .putExtra("type",FMListActivity.BENDI));
        } else if (id == R.id.iv_guoji) {
            startActivity(new Intent(getContext(), FMListActivity.class)
                    .putExtra("type",FMListActivity.GUOJI));
        } else if (id == R.id.iv_shoucang) {
            startActivity(new Intent(getContext(), FMListActivity.class)
                    .putExtra("type",FMListActivity.SHOUCANG));
        } else if (id == R.id.fl_more) {
            startActivity(new Intent(getContext(), FMListActivity.class)
                    .putExtra("type",FMListActivity.SUISHENTING));
        }
    }

}
