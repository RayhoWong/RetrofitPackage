package com.ate.retrofitpackage.http;


import com.ate.retrofitpackage.bean.MovieDetail;

import io.reactivex.Observable;

public class RetrofitLoader{
    private RetrofitApi helper;

    public RetrofitLoader(){
        helper = RetrofitServiceHelper.getInstance().create(RetrofitApi.class);
    }

    private static class SingleHolder{
        private static RetrofitLoader loader = new RetrofitLoader();
    }

    public static RetrofitLoader getInstance(){
        return SingleHolder.loader;
    }

//    private <T> Observable<T> observable(Observable<T> observable){
//        return observable.subscribeOn(Schedulers.io())
//                         .observeOn(AndroidSchedulers.mainThread());
//    }

    /**
     * 获取某部电影的详细信息
     * @return
     */
    public Observable<MovieDetail> getMovie(){
        return helper.getMovie()
                     //进行数据类型转换 返回将RespondBody类型转成具体的类对象
                     .map(RxUtil.jsonTransform(MovieDetail.class))
                      //捕获异常 并且分发到观察者的onError中处理
                     .onErrorResumeNext(RxUtil.<MovieDetail>throwableFunc())
                     //进行线程切换
                     .compose(RxUtil.<MovieDetail>rxSchedulerHelper());
    }
}
