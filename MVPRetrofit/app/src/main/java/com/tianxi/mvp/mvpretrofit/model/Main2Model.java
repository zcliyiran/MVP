package com.tianxi.mvp.mvpretrofit.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 1/10/11.
 */

public class Main2Model implements MVPModel{
    @Override
    public void getData(OnLoadCompleteListener onLoadCompleteListener) {
        //获取数据
        List<String> list=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add("这是更新后的第"+i+"条数据");
        }
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.onLoadComplete(list);
        }
    }

}
