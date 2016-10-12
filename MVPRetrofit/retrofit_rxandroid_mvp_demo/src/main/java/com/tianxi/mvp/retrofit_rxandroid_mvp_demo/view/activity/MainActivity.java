package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.view.activity;

import android.os.Bundle;
import android.widget.ListView;

import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.R;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.adapter.MyAdapter;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.bean.TgouData;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.presenter.MainPresenter;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.view.iview.MainView;

public class MainActivity extends BaseActivity<MainView, MainPresenter> implements MainView {
    ListView listView;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        basePresenter.load();
    }

    @Override
    public MainPresenter getBasePresenter() {
        return new MainPresenter();
    }


    @Override
    public void showView(TgouData data) {
        adapter=new MyAdapter(R.layout.item,data.getTngou());
        listView.setAdapter(adapter);

    }
}
