package com.example.administrator.notebook.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by dreamY on 2017/5/7.
 */

public class ActivityUtils {
    public static void addFragmentToActivity(FragmentManager mFragmentManager,
                                             Fragment mFragment,
                                             int frameId){
        FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
        mFragmentTransaction.add(frameId,mFragment);
        mFragmentTransaction.commit();
    }

    public static void replaceFragmentToActivity(FragmentManager mFragmentManager,
                                                 Fragment mFragment,
                                                 int frameId){
        FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(frameId,mFragment);
        mFragmentTransaction.commit();
    }
}
