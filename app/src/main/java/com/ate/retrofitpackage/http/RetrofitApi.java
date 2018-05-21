package com.ate.retrofitpackage.http;


import com.ate.retrofitpackage.bean.MovieDetail;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * 获取某部电影的详细信息
 */
public interface RetrofitApi {
    @GET("subject/24773958")
    Observable<MovieDetail> getMovie();
}
