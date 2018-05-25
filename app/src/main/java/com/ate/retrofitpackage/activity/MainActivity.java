package com.ate.retrofitpackage.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.ate.retrofitpackage.R;
import com.ate.retrofitpackage.base.BaseApp;
import com.ate.retrofitpackage.bean.MovieDetail;
import com.ate.retrofitpackage.http.NetObserver;
import com.ate.retrofitpackage.http.RetrofitLoader;
import com.ate.retrofitpackage.http.exception.ApiException;
import com.ate.retrofitpackage.http.exception.ERROR;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "rxjava";
    private String id = "24773958";
    private String result;

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
                        //根据返回异常的状态码来判断
                      /*  switch (ex.getCode()){
                            case ERROR.HTTP_ERROR:
                                break;
                            case ERROR.NETWORD_ERROR:
                                break;
                            case ERROR.PARSE_ERROR:
                                break;
                            case ERROR.UNKNOWN:
                                break;
                            case ERROR.SSL_ERROR:
                                break;
                        }*/
                      getCache();
                      if (!TextUtils.isEmpty(result)){
                          Log.d(TAG, "content is "+result);
                        }
                    }
                });
    }

    /**
     * 读取文件内容
     */
    private void getCache(){
//        final String result;
        String fileName = "caheData";
        File file = new File(getCacheDir(),fileName);
        if(file.exists()){
            Log.d(TAG, "getCache: "+file.getAbsolutePath()+" size is"+file.length());
        }else {
            Log.d(TAG, "getCache: "+"文件不存在");
        }

        Observable.just(fileName)
                  .map(new Function<String, String>() {
                      @Override
                      public String apply(String s) throws Exception {
                          String res="";
                          try{
                              FileInputStream fin = openFileInput(s);
                              int length = fin.available();
                              byte [] buffer = new byte[length];
                              fin.read(buffer);
                              res = new String(buffer,"UTF-8");
                              fin.close();
                          }
                          catch(Exception e){
                              e.printStackTrace();
                          }
                          return res;
                      }
                  })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                result = s;
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
