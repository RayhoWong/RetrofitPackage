package com.ate.retrofitpackage.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ate.retrofitpackage.R;
import com.ate.retrofitpackage.bean.MovieDetail;
import com.ate.retrofitpackage.http.RetrofitLoader;
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
     * 看影院
     */
    private void getMovie(){
        RetrofitLoader.getInstance().getMovie()
                      .map(new Function<ResponseBody, MovieDetail>() {
                          @Override
                          public MovieDetail apply(ResponseBody responseBody) throws Exception {
                              String content = responseBody.string();
//                              JSONObject jsonObject = new JSONObject(content);
                              return GSON.fromJson(content,MovieDetail.class);
                          }
                      })
                .subscribe(new Observer<MovieDetail>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MovieDetail movieDetail) {
                        Log.d(TAG, "TEST:"+movieDetail.toString());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
