package com.example.administrator.notebook.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dreamY on 2017/5/10.
 */

public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    private int layoutId;
    private Context mContext;
    private List<T>mTList;
    private OnClickerListener mOnClickerListener;
    public interface OnClickerListener{
        void click();
    }

    public List<T> getTList() {
        return mTList;
    }

    public void setTList(List<T> mTList) {
        this.mTList = mTList;

    }
    public void setOnClickerListener(OnClickerListener mOnClickerListener){
        this.mOnClickerListener=mOnClickerListener;

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

        onBind(holder,mTList.get(position),position,mOnClickerListener);

    }

    protected abstract void onBind(BaseViewHolder mHolder, T mT, int mPosition,OnClickerListener mOnClickerListener);


    @Override
    public int getItemCount() {
        return mTList==null?0:mTList.size();
    }
}
