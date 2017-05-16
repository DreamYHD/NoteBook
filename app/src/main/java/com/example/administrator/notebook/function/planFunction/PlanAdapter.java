package com.example.administrator.notebook.function.planFunction;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.administrator.notebook.base.BaseRecyclerAdapter;
import com.example.administrator.notebook.base.BaseViewHolder;
import com.example.administrator.notebook.function.planFunction.local.PlanBean;

import java.util.List;

/**
 * Created by dreamY on 2017/5/9.
 */

public class PlanAdapter extends BaseRecyclerAdapter<PlanBean> {


    public PlanAdapter(int mLayoutId, Context mContext, List<PlanBean> mPlanBeen) {
        super(mLayoutId, mContext, mPlanBeen);
    }

    @Override
    protected void onBind(BaseViewHolder mHolder, PlanBean mPlanBean, int mPosition) {

    }


}
