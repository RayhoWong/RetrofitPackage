package com.ate.retrofitpackage.http;

import com.ate.retrofitpackage.bean.BaseResponse;
import com.ate.retrofitpackage.bean.MovieDetail;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

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

    private <T> Observable<T> observable(Observable<T> observable){
        return observable.subscribeOn(Schedulers.io())
                         .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 获取某部电影的详细信息
     * @return
     */
    public Observable<ResponseBody> getMovie(){
        return observable(helper.getMovie());
    }
}
