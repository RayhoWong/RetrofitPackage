package com.ate.retrofitpackage.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ate.retrofitpackage.R;
import com.ate.retrofitpackage.bean.MovieDetail;
import com.ate.retrofitpackage.http.RetrofitLoader;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "rxjava";
    private String id = "24773958";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMovie();
    }

    private void getMovie(){
        RetrofitLoader.getInstance().getMovie()
                .subscribe(new Observer<MovieDetail>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG, "开始连接");
                    }

                    @Override
                    public void onNext(MovieDetail movieDetail) {
                        Log.d(TAG, "评分人数:"+movieDetail.ratings_count);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: "+e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }



}
