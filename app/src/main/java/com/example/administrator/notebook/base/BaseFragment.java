package com.example.administrator.notebook.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by dreamY on 2017/5/9.
 */

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View mView=inflater.inflate(getLayoutId(),container,false);
        initChildView(mView,savedInstanceState);
        ButterKnife.bind(this,mView);
        fragmentLogic();
        return mView;
    }

    protected abstract void fragmentLogic();

    protected abstract void initChildView(View mView, Bundle mSavedInstanceState);

    protected abstract int getLayoutId();

}
