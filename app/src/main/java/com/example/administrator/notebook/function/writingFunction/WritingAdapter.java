package com.example.administrator.notebook.function.writingFunction;

import android.content.Context;

import com.example.administrator.notebook.R;
import com.example.administrator.notebook.base.BaseRecyclerAdapter;
import com.example.administrator.notebook.base.BaseViewHolder;

import java.util.List;

/**
 * Created by dreamY on 2017/5/9.
 */

public class WritingAdapter extends BaseRecyclerAdapter {
    public WritingAdapter(int mLayoutId, Context mContext, List mList) {
        super(mLayoutId, mContext, mList);
    }

    @Override
    protected void onBind(BaseViewHolder mHolder, Object mO, int mPosition, BaseRecyclerAdapter.OnClickerListener mOnClickerListener) {
        mHolder.getView(R.id.writing_textView);
    }


}
