package com.example.administrator.notebook.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dreamY on 2017/5/10.
 */

public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    protected int layoutId;
    protected Context mContext;
    protected List<T>mTList;

    public List<T> getTList() {
        return mTList;
    }

    public void setTList(List<T> mTList) {
        this.mTList = mTList;

    }

    public BaseRecyclerAdapter(int mLayoutId, Context mContext, List<T> mTList) {
        layoutId = mLayoutId;
        this.mContext = mContext;
        this.mTList = mTList;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.getHolder(mContext,parent,layoutId);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

        onBind(holder,mTList.get(position),position);

    }

    protected abstract void onBind(BaseViewHolder mHolder, T mT, int mPosition);


    @Override
    public int getItemCount() {
        return mTList==null?0:mTList.size();
    }
}
