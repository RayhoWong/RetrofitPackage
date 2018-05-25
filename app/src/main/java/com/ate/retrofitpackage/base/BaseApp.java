package com.ate.retrofitpackage.base;
// Created by Rayho on 2018/5/24.

import android.app.Application;
import android.content.Context;

/**
 * author: Rayho
 * date:   On 2018/5/24
 * 全局的application
 */
public class BaseApp extends Application {

    private static Context mContext;

    public BaseApp(){}

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

//    private static class SingleHolder{
//        private static BaseApp app = new BaseApp();
//    }
//
//    public static BaseApp getInstance(){
//        return SingleHolder.app;
//    }

    public static Context getContext(){
        return mContext;
    }
}
