package com.example.administrator.notebook;

import android.app.Application;
import android.content.Context;

import com.example.administrator.notebook.local.LocalManager;

/**
 * Created by dreamY on 2017/5/13.
 */

public class MyApp extends Application {


    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
        LocalManager.getInstance();
    }
     public static Context getInstance() {
        return  mContext;
    }
}
