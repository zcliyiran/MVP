package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.net;


import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.bean.TgouData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by admin on 16/10/11.
 * http://www.tngou.net/api/cook/list
 */

public interface Server {
    @GET("api/cook/list")
    Observable<TgouData> getDataobs(@Query("id")int id, @Query("page")int page, @Query("rows")int rows);




}
