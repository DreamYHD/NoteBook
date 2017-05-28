package com.example.administrator.notebook.function.writingFunction;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.notebook.R;
import com.example.administrator.notebook.base.BaseMvpFragment;
import com.example.administrator.notebook.function.writingFunction.local.WritingBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dreamY on 2017/5/12.
 */

public class WritingFragment  extends BaseMvpFragment<WritingPresenter,WritingModel> implements WritingContract.View{

    private RecyclerView mRecyclerView;
    private WritingAdapter mWritingAdapter;
    private List<WritingBean>mWritingBeenList=new ArrayList<>();
    private LinearLayoutManager mLinearLayoutManager;
    @Override
    protected void fragmentLogic() {
        mPresenter.readingFunction();
    }

    @Override
    protected void initChildView(View mView, Bundle mSavedInstanceState) {
        mRecyclerView= (RecyclerView) mView.findViewById(R.id.writing_recyclerView);
        mWritingAdapter=new WritingAdapter(R.layout.writing_item_layout,getContext(),mWritingBeenList);
        mLinearLayoutManager=new LinearLayoutManager(getContext());
        mRecyclerView.setAdapter(mWritingAdapter);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.writing_all_layout;
    }

    @Override
    public void showTitle(List<WritingBean> mWritingBean) {
        mWritingBeenList.addAll(mWritingBean);
        mWritingAdapter.notifyDataSetChanged();
    }

    @Override
    public void showContent(List<WritingBean> mWritingBean) {
        mWritingBeenList.addAll(mWritingBean);
        mWritingAdapter.notifyDataSetChanged();
    }
}
