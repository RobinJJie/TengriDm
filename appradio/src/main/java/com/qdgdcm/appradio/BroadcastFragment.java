package com.qdgdcm.appradio;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lk.robin.commonlibrary.app.AppFragment;
import com.lk.robin.commonlibrary.config.ConstantsRouter;
import com.qdgdcm.appradio.activity.PlayFMActivity;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = ConstantsRouter.Radio.RadioHome)
public class BroadcastFragment extends AppFragment {


    @BindView(R2.id.im_syj)
    ImageView imSyj;
    @BindView(R2.id.txt_syj_name)
    TextView txtSyjName;
    @BindView(R2.id.txt_syj_content)
    TextView txtSyjContent;
    @BindView(R2.id.iv_play)
    ImageView ivPlay;
    @BindView(R2.id.txt_title)
    TextView txtTitle;
    @BindView(R2.id.recycler_view)
    RecyclerView recyclerView;

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
        ivPlay.setOnClickListener(view -> {
            startActivity(new Intent(getContext(), PlayFMActivity.class));
        });
    }

}
