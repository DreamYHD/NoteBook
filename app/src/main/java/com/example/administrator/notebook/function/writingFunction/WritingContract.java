package com.example.administrator.notebook.function.writingFunction;

import com.example.administrator.notebook.base.BaseModel;
import com.example.administrator.notebook.base.BasePresenter;
import com.example.administrator.notebook.base.BaseView;
import com.example.administrator.notebook.function.writingFunction.local.WritingBean;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by dreamY on 2017/5/9.
 */

public interface WritingContract {

    interface View extends BaseView{
        /**
         * 展示标题
         */
        void showTitle(List<WritingBean> mWritingBeanList);
        /**
         *展示内容
         */
        void showContent(List<WritingBean> mWritingBeanList);

    }
    interface Model extends BaseModel{
        /**
         *  获取数据库内容
         */
        Observable<List<WritingBean>>getWriting();

    }
    abstract class Presenter extends BasePresenter<View,Model>{

        /**
         * 写文章
         */
        abstract void writingFunction(WritingBean mWritingBean);
        /**
         * 读文章
         */
        abstract void readingFunction();
    }
}
