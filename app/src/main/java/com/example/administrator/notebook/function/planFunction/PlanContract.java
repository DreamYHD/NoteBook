package com.example.administrator.notebook.function.planFunction;

import com.example.administrator.notebook.base.BaseModel;
import com.example.administrator.notebook.base.BasePresenter;
import com.example.administrator.notebook.base.BaseView;

/**
 * Created by dreamY on 2017/5/9.
 */

public interface PlanContract  {
    interface View extends BaseView {

    }

    interface Model extends BaseModel{

    }
    class Presenter extends BasePresenter<View,Model>{

    }

}
