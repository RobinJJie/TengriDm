package com.qdgdcm.appmine;


import android.content.Intent;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.qdgdcm.appmine.activity.CollectionActivity;
import com.qdgdcm.appmine.activity.DownloadActivity;
import com.qdgdcm.appmine.activity.EditUserInfoActivity;
import com.qdgdcm.appmine.activity.MyScoreActivity;
import com.qdgdcm.appmine.activity.SignInActivity;

import butterknife.OnClick;


@Route(path = ConstantsRouter.Mine.MineHome)
public class MineFragment extends AppFragment {


    public MineFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);

    }

    @OnClick({R2.id.root_zjst, R2.id.root_wdsc, R2.id.root_hd, R2.id.root_yjfk, R2.id.root_setting,
            R2.id.iv_logo, R2.id.fl_signin, R2.id.ll_score, R2.id.ll_download, R2.id.ll_message})
    void onClick(View view) {
        int id = view.getId();
        if (id == R.id.root_zjst) {
            //最近收听
        } else if (id == R.id.root_wdsc) {
            //我的收藏
            startActivity(new Intent(getContext(), CollectionActivity.class));
        } else if (id == R.id.root_hd) {
            //活动
        } else if (id == R.id.root_yjfk) {
            //意见反馈
        } else if (id == R.id.root_setting) {
            //设置
        } else if (id == R.id.iv_logo) {
            startActivity(new Intent(getContext(), EditUserInfoActivity.class));
        } else if (id == R.id.fl_signin) {
            startActivity(new Intent(getContext(), SignInActivity.class));
        } else if (id == R.id.ll_score) {
            startActivity(new Intent(getContext(), MyScoreActivity.class));
        } else if (id == R.id.ll_download) {
            startActivity(new Intent(getContext(), DownloadActivity.class));
        } else if (id == R.id.ll_message) {
            //消息
        }
    }

}
