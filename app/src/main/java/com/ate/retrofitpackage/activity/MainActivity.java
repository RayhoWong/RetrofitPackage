package com.ate.retrofitpackage.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ate.retrofitpackage.R;
import com.ate.retrofitpackage.bean.MovieDetail;
import com.ate.retrofitpackage.http.NetObserver;
import com.ate.retrofitpackage.http.RetrofitLoader;
import com.ate.retrofitpackage.http.exception.ApiException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "rxjava";
    private String id = "24773958";

    private static Gson GSON = new GsonBuilder().serializeNulls().create();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMovie();
    }

    /**
     * 得到电影的详细信息
     */
    private void getMovie() {
        RetrofitLoader.getInstance().getMovie()
                .subscribe(new NetObserver<MovieDetail>() {
                    @Override
                    public void onNext(MovieDetail movieDetail) {
                        Log.d(TAG, "评分人数:"+movieDetail.ratings_count);
                    }

                    @Override
                    public void onError(ApiException ex) {
                        Log.e(TAG, "onError: "+ex.getDisplayMessage());
                    }
                });
    }


}
