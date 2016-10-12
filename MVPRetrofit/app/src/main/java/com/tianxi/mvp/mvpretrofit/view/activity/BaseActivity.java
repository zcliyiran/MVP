package com.tianxi.mvp.mvpretrofit.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tianxi.mvp.mvpretrofit.presenter.BasePresenter;
import com.tianxi.mvp.mvpretrofit.view.iview.MVPView;

/**
 * Created by admin on 16/10/11.
 */

public abstract class BaseActivity<V extends MVPView,T extends BasePresenter<V>> extends AppCompatActivity implements MVPView{
    public T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=getBasePresenter();


        presenter.attch((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destoryAttch();
    }

    public  abstract T getBasePresenter();
}
