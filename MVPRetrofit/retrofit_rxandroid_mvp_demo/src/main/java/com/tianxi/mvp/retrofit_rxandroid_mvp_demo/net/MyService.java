package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.net;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by admin on 16/10/11.
 */

public class MyService {
    public static final String BASEURL="http://www.tngou.net/";
    public static final Retrofit retrofit=new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();

    public static <T>T getAPI(Class<T> tClass){

        return retrofit.create(tClass);
    }
}
