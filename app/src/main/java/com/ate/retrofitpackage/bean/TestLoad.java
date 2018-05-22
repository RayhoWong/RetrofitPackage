package com.ate.retrofitpackage.bean;
// Created by Rayho on 2018/5/21.

import io.reactivex.functions.Function;

/**
 * author: Rayho
 * date:   On 2018/5/21
 */
public class TestLoad<T> implements Function<BaseResponse<T>,T> {
    @Override
    public T apply(BaseResponse<T> tBaseResponse) throws Exception {
        if(! tBaseResponse.isSuccess()){
            throw new Exception(tBaseResponse.msg);
        }
        return tBaseResponse.data;
    }
}
