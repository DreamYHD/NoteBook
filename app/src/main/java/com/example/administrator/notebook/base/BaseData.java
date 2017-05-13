package com.example.administrator.notebook.base;

import org.greenrobot.greendao.AbstractDao;

import java.util.List;

/**
 * Created by dreamY on 2017/5/13.
 */

public abstract class BaseData<T,V extends AbstractDao> {


    protected abstract V getBeanDao();
    protected abstract void update(long id,T mT);
    protected abstract T findById(long id);

    protected void insert(T mT){
        getBeanDao().insert(mT);
    }
    protected void remove(T mT){
        getBeanDao().delete(mT);
    }
    protected List<T> queryData(){
       return getBeanDao().loadAll();
    }


}
