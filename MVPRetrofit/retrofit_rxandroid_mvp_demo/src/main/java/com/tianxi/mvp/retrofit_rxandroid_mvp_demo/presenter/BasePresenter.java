package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.presenter;

import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.model.MvpModle;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.view.iview.MvpView;

import java.lang.ref.WeakReference;

/**
 * Created by admin on 16/0/12.
 */

public class BasePresenter<V extends MvpView> {
    private WeakReference<V> weakReference;


    public BasePresenter() {
    }



    public  void  attch(V iView){

       weakReference=new WeakReference<V>(iView) ;
    }
    public void destoryAttch(){
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;

        }

    }

    public V getView() {
        return weakReference.get();
    }
}
