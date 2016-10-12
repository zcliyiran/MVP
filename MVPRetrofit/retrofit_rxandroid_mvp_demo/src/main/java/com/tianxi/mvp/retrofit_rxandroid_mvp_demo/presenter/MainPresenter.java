package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.presenter;

import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.bean.TgouData;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.model.MainAcModle;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.model.MyModle;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.view.iview.MainView;

import rx.functions.Action1;

/**
 * Created by admin on 16/10/12.
 */

public class MainPresenter extends BasePresenter<MainView> {
    private MyModle<TgouData> myModle;


    public MainPresenter() {
        myModle = new MainAcModle();

    }

//    public MainPresenter setMyModle(ModleName modle) {
//
//        switch (modle) {
//            case MyModle:
////                myModle=new My
//                return this;
//
//        }
//        return this;
//    }


    public void load() {

        myModle.loadData(new Action1<TgouData>() {
            @Override
            public void call(TgouData tgouData) {
                getView().showView(tgouData);
            }
        });
    }

}
