package com.zbm.lovehealth.search;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SearchListItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SearchListItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        //不是第一个的格子都设一个左边和底部的间距
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;
        outRect.top=space;
//        //由于每行都只有2个，所以第一个都是2的倍数，把左边距设为0
        if (parent.getChildLayoutPosition(view)==0) {
            outRect.top=space/2;
            outRect.left=0;
            outRect.right=0;
        }

    }
}
