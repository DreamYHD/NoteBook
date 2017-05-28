package com.example.administrator.notebook.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dreamY on 2017/5/10.
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {
    protected SparseArray<View>mViews;
    View itemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        this.itemView=itemView;
        mViews=new SparseArray<>();
    }

    public static <T extends BaseViewHolder>T getHolder(Context mContext, ViewGroup mParent, int mLayoutId) {

        return (T) new BaseViewHolder(LayoutInflater.from(mContext).inflate(mLayoutId,mParent,false));
    }
    public <T extends View>T getView(int viewId) {
        View childView = mViews.get(viewId);
        if (childView == null) {
            childView = itemView.findViewById(viewId);
            mViews.put(viewId, childView);
        }
        return (T) childView;

    }
    public void setOnClickListener(int viewId,View.OnClickListener mOnClickListener){

        View mView=getView(viewId);
        mView.setOnClickListener(mOnClickListener);
    }
    public void setText(int viewId,String text){
        View mView=getView(viewId);
        if (mView instanceof TextView) {
            ((TextView) mView).setText(text);
        }
    }

}
