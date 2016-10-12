package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.presenter.BasePresenter;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.view.iview.MvpView;

/**
 * Created by admin on 16/10/12.
 */

public abstract class BaseActivity<V extends MvpView,T extends BasePresenter<V>> extends AppCompatActivity{
    public T basePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basePresenter=getBasePresenter();
        basePresenter.attch((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.destoryAttch();
    }
    public abstract T getBasePresenter();
}
