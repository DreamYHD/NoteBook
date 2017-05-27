package com.example.administrator.notebook.base;

import org.greenrobot.greendao.AbstractDao;

import java.util.List;

/**
 * Created by dreamY on 2017/5/13.
 */

public abstract class BaseData<T,V extends AbstractDao> {


    public abstract V getBeanDao();
    public abstract void update(long id,T mT);
    public abstract T findById(long id);

    public void insert(T mT){
        getBeanDao().insert(mT);
    }
    public void remove(T mT){
        getBeanDao().delete(mT);
    }
    public List<T> queryData(){
       return getBeanDao().loadAll();
    }


}
