package com.qdgdcm.apphome.fragment.search;

import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.ActivityPresenter;
import com.lk.robin.commonlibrary.app.FragmentPresenter;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.presenter.BaseContract;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = ConstantsRouter.Home.HomeMainSearchActivityFragment)
public class SearchActivityFragment extends FragmentPresenter {
    @BindView(R2.id.recycler_view)
    RecyclerView mRecyclerView;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_search;
    }



    @Override
    protected void initData() {
        super.initData();

    }

    @OnClick({R2.id.root_search})
    void onSearch(){
        MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
        TurnToFrag frag = new TurnToFrag();
        frag.launchMode = TurnToFrag.FRAG_OPEN;
        frag.fragHoust = ConstantsRouter.Home.HomeMainSearchInfoActivityFragment;
        rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
        rsp.data = frag;
        MsgServer.init().save(rsp);
    }
    @OnClick(R2.id.btn_close)
    void onClose(){
        onHomeBack();
    }
    @Override
    protected BaseContract.Presenter initPersenter() {
        return null;
    }
}
