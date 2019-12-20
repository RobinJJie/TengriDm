package com.qdgdcm.apphome.fragment;


import android.content.Context;
import android.view.View;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.lk.robin.commonlibrary.tools.Factory;
import com.lk.robin.commonlibrary.tools.StatusBarUtil;
import com.qdgdcm.apphome.R;
import com.qdgdcm.apphome.R2;
import com.qdgdcm.apphome.fragment.homeitem.HomeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = ConstantsRouter.Home.HomeMainFragment)
public class MainFragment extends AppFragment {
    @BindView(R2.id.root_bar_home)
    View barHome;
    @BindView(R2.id.root_bar_radio)
    View barRadio;
    @BindView(R2.id.root_bar_live)
    View barLive;
    @BindView(R2.id.root_bar_mine)
    View barMine;
    private FragmentManager manager;


    public MainFragment() {
        // Required empty public constructor
    }

    private AppFragment fragmentHome;
    private AppFragment fragmentRadio;
    private AppFragment fragmentLive;
    private AppFragment fragmentMine;

    private List<Fragment> fragmentList=new ArrayList<>();

    @Override
    protected int getContentLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initWidget(View root) {
        super.initWidget(root);
        StatusBarUtil.StatusBarLightMode(getActivity(),true);
    }

    @Override
    protected void initData() {
        super.initData();
        manager = getChildFragmentManager();

        if (fragmentHome == null) {
            fragmentHome = new HomeFragment();
            fragmentList.add(fragmentHome);

        }
        if (fragmentRadio==null){
            Object fragRadio = mRouter.build(ConstantsRouter.Radio.RadioHome).navigation();
            if (fragRadio instanceof AppFragment) {
                fragmentRadio= (AppFragment) fragRadio;
                fragmentList.add(fragmentRadio);
            }
        }
        if (fragmentLive==null){
            Object fragLive = mRouter.build(ConstantsRouter.Live.Live_Home).navigation();
            if (fragLive instanceof AppFragment) {
                fragmentLive= (AppFragment) fragLive;
                fragmentList.add(fragmentLive);
            }
        }
        if (fragmentMine==null){
            Object fragMine = mRouter.build(ConstantsRouter.Mine.MineHome).navigation();
            if (fragMine instanceof AppFragment) {
                fragmentMine= (AppFragment) fragMine;
                fragmentList.add(fragmentMine);
            }
        }

        for (int i = 0; i < fragmentList.size(); i++) {
            manager.beginTransaction().add(R.id.root_content_frg,fragmentList.get(i),String.valueOf("Frag_"+i)).commit();
        }
        selectedBar(R.id.root_bar_home);
        cheange(0);
    }

    @OnClick({R2.id.root_bar_home, R2.id.root_bar_radio, R2.id.root_bar_live, R2.id.root_bar_mine})
    void onClsick(View view) {
        int id = view.getId();
        if (id == R.id.root_bar_home) {
            selectedBar(id);
            cheange(0);
        } else if (id == R.id.root_bar_radio) {
            selectedBar(id);
            cheange(1);
        } else if (id == R.id.root_bar_live) {
            selectedBar(id);
            cheange(2);
        } else if (id == R.id.root_bar_mine) {
            selectedBar(id);
            cheange(3);
        }
    }

    private void selectedBar(@IdRes int id) {
        barHome.setSelected(id == R.id.root_bar_home);
        barRadio.setSelected(id == R.id.root_bar_radio);
        barLive.setSelected(id == R.id.root_bar_live);
        barMine.setSelected(id == R.id.root_bar_mine);
    }

    private void cheange(int pos) {

        for (int i = 0; i < fragmentList.size(); i++) {
            if (pos==i){
                manager.beginTransaction().show(fragmentList.get(pos)).commit();
            }else {
                manager.beginTransaction().hide(fragmentList.get(i)).commit();
            }

        }
    }


    @Override
    public void onHiddenChanged(boolean hidden) {

            Factory.LogE("frag_context",getContext()+" * "+getActivity()+" "+hidden);

        super.onHiddenChanged(hidden);
    }

    @Override
    public void onAttach(Context context) {
        Factory.LogE("frag_context",getContext()+" * "+getActivity()+" ");
        super.onAttach(context);
    }
}
