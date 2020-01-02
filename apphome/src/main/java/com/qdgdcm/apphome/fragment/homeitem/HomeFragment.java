package com.qdgdcm.apphome.fragment.homeitem;


import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.msgbuslibrary.mag.MsgRsp;
import com.lk.robin.msgbuslibrary.mag.TurnToFrag;
import com.lk.robin.msgbuslibrary.server.MsgCodeConfig;
import com.lk.robin.msgbuslibrary.server.MsgServer;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends AppFragment {
    @BindView(R2.id.view_pager)
    ViewPager mViewPager;
    @BindView(R2.id.tab)
    TabLayout tabLayout;
    @BindView(R2.id.ic_open)
    View pop;
    private List<Fragment> list = new ArrayList<>();
    private String[] tabTitle = {"首页", "广播", "听书", "综艺", "情感", "文化", "相声"};

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        list.add(new TengriNewsHomeFragment());
        Object fragRadio = mRouter.build(ConstantsRouter.Radio.RadioHome).navigation();
        if (fragRadio instanceof AppFragment) {
            AppFragment fragRadio1 = (AppFragment) fragRadio;
            Bundle bundle = new Bundle();
            bundle.putBoolean("hideTitle", true);
            bundle.putString("title", "title");
            fragRadio1.setArguments(bundle);
            list.add(fragRadio1);
        }
        list.add(new ListeningTobooksFragment());
        list.add(new VarietyHomeFragment("1"));
        list.add(new VarietyHomeFragment("2"));
        list.add(new VarietyHomeFragment("3"));

        mViewPager.setAdapter(new FragAdapter(getChildFragmentManager(), 0));
        tabLayout.setupWithViewPager(mViewPager);
    }

    @OnClick(R2.id.root_search)
    void onSearch() {
        MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
        TurnToFrag frag = new TurnToFrag();
        frag.launchMode = TurnToFrag.FRAG_OPEN;
        frag.fragHoust = ConstantsRouter.Home.HomeMainSearchActivityFragment;
        rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
        rsp.data = frag;
        MsgServer.init().save(rsp);
    }

    @OnClick(R2.id.btn_fenlei)
    void onFenlei() {
        MsgRsp<TurnToFrag> rsp = new MsgRsp<>();
        TurnToFrag frag = new TurnToFrag();
        frag.launchMode = TurnToFrag.FRAG_OPEN;
        frag.fragHoust = ConstantsRouter.Home.HomeClassifyFragment;
        rsp.code = MsgCodeConfig.MSG_TURN_TO_FRAGMENT;
        rsp.data = frag;
        MsgServer.init().save(rsp);
    }

    @OnClick(R2.id.ic_open)
    void onShowXh() {
        showPop(pop);
    }

    @OnClick(R2.id.tab_to_home)
    void onToHome(){
        mViewPager.setCurrentItem(0);
    }

    class FragAdapter extends FragmentPagerAdapter {

        public FragAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitle[position];
        }
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if (!hidden) {
            Factory.LogE("frag_context_h", getContext() + " * " + getActivity());
        }
        super.onHiddenChanged(hidden);
    }

    @Override
    public void onAttach(Context context) {
        Factory.LogE("frag_context", getContext() + " * " + getActivity() + " ");
        super.onAttach(context);
    }

    private PopupWindow popupWindow;

    private void showPop(View view) {
        if (popupWindow == null) {
            popupWindow = new PopupWindow(getContext());
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.am_xiaxao_lishi_layout, null, false);
        View v1 = inflate.findViewById(R.id.txt_xz);
        View v2 = inflate.findViewById(R.id.txt_ls);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ConstantsRouter.Mine.MineDownloadActivity).navigation();
                popupWindow.dismiss();

            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ConstantsRouter.Mine.MineMySubscriptionActivity).navigation();
                popupWindow.dismiss();
            }
        });

        popupWindow.setContentView(inflate);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAsDropDown(view);

    }

    @Override
    public boolean onBackPressed() {
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            Factory.toast("1");
            return true;
        } else {
            Factory.toast("2");
            return super.onBackPressed();
        }

    }

}
