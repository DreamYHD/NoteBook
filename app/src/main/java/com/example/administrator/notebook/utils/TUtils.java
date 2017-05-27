package com.example.administrator.notebook.utils;

import android.support.annotation.Nullable;

import java.lang.reflect.ParameterizedType;

/**
 * Created by dreamY on 2017/5/7.
 */

public class TUtils {
  @Nullable
  public static <T>T getT(Object mO, int id){

      try {
          return ((Class<T>)((ParameterizedType)mO.getClass().getGenericSuperclass())
                  .getActualTypeArguments()[id])
                  .newInstance();
      } catch (InstantiationException mE) {
          mE.printStackTrace();
      } catch (IllegalAccessException mE) {
          mE.printStackTrace();
      }

      return null;
  }


}

