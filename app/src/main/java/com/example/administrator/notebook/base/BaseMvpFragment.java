package com.example.administrator.notebook.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.administrator.notebook.utils.TUtils;

/**
 * Created by dreamY on 2017/5/6.
 */

public abstract class BaseMvpFragment<P extends BasePresenter,M extends BaseModel > extends BaseFragment implements BaseView {
    protected P mPresenter;
    protected M mModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter= TUtils.getT(this,0);
        mModel=TUtils.getT(this,1);
        if (mPresenter == null) {
            mPresenter.attach(this,mModel);
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.deatch();
        }
    }
}
