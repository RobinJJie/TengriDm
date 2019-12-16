package com.lk.robin.commonlibrary.tools;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Objects;

/**
 * @author lubin
 * @version 1.0
 */
public class RecyclerViewLoaderTool {
    public static void initLoading(RecyclerView recyclerView, final OnRvLoader onRvLoader, int dataCount) {
        if (recyclerView == null || onRvLoader == null) return;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                Factory.LogE("recyclerView", newState + " " + Objects.requireNonNull(recyclerView.getLayoutManager()).getItemCount());
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    if (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset() >= recyclerView.computeVerticalScrollRange()) {
                        Factory.LogE("RecyclerView", "到达底部");
                        onRvLoader.onLoading();
                    }
                }

                super.onScrollStateChanged(recyclerView, newState);
            }
        });
    }

    public interface OnRvLoader {
        void onLoading();
    }
}
