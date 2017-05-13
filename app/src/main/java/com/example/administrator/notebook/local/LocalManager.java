package com.example.administrator.notebook.local;

import com.example.administrator.notebook.MyApp;
import com.example.administrator.notebook.function.planFunction.local.DaoMaster;
import com.example.administrator.notebook.function.planFunction.local.DaoSession;

/**
 * Created by dreamY on 2017/5/12.
 */

public class LocalManager {
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    private LocalManager(){
        if (mDaoMaster == null) {

            DaoMaster.DevOpenHelper mDevOpenHelper=new DaoMaster.DevOpenHelper(MyApp.getInstance(),"local_db",null);
            mDaoMaster=new DaoMaster(mDevOpenHelper.getWritableDb());
            mDaoSession=mDaoMaster.newSession();
        }
    }

    public static LocalManager getInstance(){
        return Single.INSTANCE;
    }
    private static class Single{
        private static final LocalManager INSTANCE=new LocalManager();
    }

    public DaoMaster getDaoMaster() {
        return mDaoMaster;
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
