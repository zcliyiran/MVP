package com.tianxi.mvp.mvpretrofit.presenter;

import com.tianxi.mvp.mvpretrofit.model.MVPModel;
import com.tianxi.mvp.mvpretrofit.model.Main1Modle;
import com.tianxi.mvp.mvpretrofit.model.Main2Model;
import com.tianxi.mvp.mvpretrofit.myenum.HttpModel;
import com.tianxi.mvp.mvpretrofit.view.iview.MVPView;

import java.util.List;

/**
 * Created by admin on 16/10/11.
 * 用于协调View 和model的中间类  这个类针对Mainactivit
 */

public class MainPresenter extends BasePresenter<MVPView>{
    private MVPModel model;
//    private MVPView view;

//    public MainPresenter(MVPView view) {
//        this.view = view;
//
//
//    }

    public MainPresenter() {
//        model = new Main1Modle();

    }

    public MainPresenter setModel(HttpModel httpModel) {
        switch (httpModel) {
            case Main1Modle:
                model = new Main1Modle();
                return this;
           case Main2Modle:
                model=new Main2Model();
               return this;

        }
            return this;
    }

    public void load() {

        model.getData(new MVPModel.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(List<String> list) {
                //加载完成后数据传递到这里
                getView().showView(list);
            }
        });

    }
}
