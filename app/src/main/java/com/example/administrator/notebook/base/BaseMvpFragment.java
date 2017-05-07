package com.example.administrator.notebook.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.notebook.utils.TUtils;

/**
 * Created by dreamY on 2017/5/6.
 */

public abstract class BaseMvpFragment<P extends BasePresenter,M extends BaseModel > extends Fragment implements BaseView {
    protected P mPresenter;
    protected M mModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView=inflater.inflate(getLayoutId(),container,false);

        mPresenter= TUtils.getT(this,0);
        mModel=TUtils.getT(this,1);
        initChildView(mView,savedInstanceState);
        return mView;
    }

    protected abstract void initChildView(View mView, Bundle mSavedInstanceState);

    protected abstract int getLayoutId();

    @Override
    public void onResume() {
        super.onResume();
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
