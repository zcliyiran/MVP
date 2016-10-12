package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.model;

import rx.functions.Action1;

/**
 * 用来获取数据的modle
 * Created by admin on16/10/12.
 */

public interface MyModle<T> extends MvpModle{


    void loadData(Action1<T> action1);

}
