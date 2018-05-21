package com.ate.retrofitpackage.bean;
// Created by Rayho on 2018/5/21.

/**
 * author: Rayho
 * date:   On 2018/5/21
 * 网络请求返回的基类
 */
public class BaseResponse <T>{
    public int code;
    public String msg;
    public T data;
    public boolean isSuccess(){
        //200=请求成功
        return code == 200;
    }
}


