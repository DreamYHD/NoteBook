package com.example.administrator.notebook.function.writingFunction;

import android.os.Bundle;
import android.view.View;

import com.example.administrator.notebook.R;
import com.example.administrator.notebook.base.BaseMvpFragment;
import com.example.administrator.notebook.function.writingFunction.local.WritingBean;

/**
 * Created by dreamY on 2017/5/12.
 */

public class WritingFragment  extends BaseMvpFragment<WritingPresenter,WritingModel> implements WritingContract.View{
    @Override
    protected void fragmentLogic() {


    }

    @Override
    protected void initChildView(View mView, Bundle mSavedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.writing_all_layout;
    }

    @Override
    public void showTitle(WritingBean mWritingBean) {

    }

    @Override
    public void showContent(WritingBean mWritingBean) {

    }
}
