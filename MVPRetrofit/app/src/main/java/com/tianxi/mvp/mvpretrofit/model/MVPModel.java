package com.tianxi.mvp.mvpretrofit.model;

import java.util.List;

/**
 * Created by admin on 16/10/11.
 * 用于获取数据的的模型
 */

public interface MVPModel {
    //这里专门用于获取数据
    void getData(OnLoadCompleteListener on);//(获取数据的方法,上网,异步回调)

    public interface OnLoadCompleteListener {

        void onLoadComplete(List<String> list);//数据请求完成,携带数据回来
    }

}
