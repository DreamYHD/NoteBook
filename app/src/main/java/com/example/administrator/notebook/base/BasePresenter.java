package com.example.administrator.notebook.base;

/**
 * Created by dreamY on 2017/5/6.
 */

public class BasePresenter<V extends BaseView,M extends BaseModel> {

    private static final String TAG = "BasePresenter";
    protected  V mView;
    protected  M mModel;

    protected void attach(V mV,M mM){
        if (mV == null) {
            mView=mV;
        }
        if (mM == null) {
            mModel=mM;
        }
    }
    protected void deatch(){
        if (mView != null) {
            mView=null;
        }
        if (mModel != null) {

            mModel=null;
        }
    }


}
