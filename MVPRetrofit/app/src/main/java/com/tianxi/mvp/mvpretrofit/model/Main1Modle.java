package com.tianxi.mvp.mvpretrofit.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 16/10/11.
 */

public class Main1Modle implements MVPModel{
    @Override
    public void getData(OnLoadCompleteListener onLoadCompleteListener) {
        //获取数据
        List<String>list=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add("这是第"+i+"条数据");
        }
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.onLoadComplete(list);
        }
    }
}
