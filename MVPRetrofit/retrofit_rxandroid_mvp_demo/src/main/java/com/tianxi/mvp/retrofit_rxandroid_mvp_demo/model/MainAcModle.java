package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.model;

import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.bean.TgouData;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.net.MyService;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.net.Server;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 16/10/12.
 */

public class MainAcModle implements MyModle<TgouData> {


    @Override
    public void loadData(final Action1<TgouData> action1) {
        //获得到数据
        Observable<TgouData> dataObs = MyService.getAPI(Server.class).getDataobs(1, 1, 20);
        dataObs.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread())
                .subscribe(action1);


    }
}
