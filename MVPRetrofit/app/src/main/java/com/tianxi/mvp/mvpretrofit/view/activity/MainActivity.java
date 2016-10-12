package com.tianxi.mvp.mvpretrofit.view.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tianxi.mvp.mvpretrofit.R;
import com.tianxi.mvp.mvpretrofit.myenum.HttpModel;
import com.tianxi.mvp.mvpretrofit.presenter.MainPresenter;
import com.tianxi.mvp.mvpretrofit.view.iview.MVPView;

import java.util.List;

public class MainActivity extends BaseActivity<MVPView, MainPresenter> implements MVPView {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.list);
        presenter.setModel(HttpModel.Main1Modle).load();
    }

    @Override
    public MainPresenter getBasePresenter() {
        return new MainPresenter();
    }


    /**
     * 这里获取数据
     *
     * @param list
     */
    @Override
    public void showView(List<String> list) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }

}
