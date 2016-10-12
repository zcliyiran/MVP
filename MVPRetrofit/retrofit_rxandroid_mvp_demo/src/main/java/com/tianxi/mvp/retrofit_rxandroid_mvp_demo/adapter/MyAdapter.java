package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.R;
import com.tianxi.mvp.retrofit_rxandroid_mvp_demo.bean.TngouBean;

import java.util.List;

/**
 * Created by admin on 16/10/12.
 */

public class MyAdapter extends MyBaseAdapter<TngouBean>{

    private List<TngouBean>list;
    public MyAdapter(int id,List<TngouBean>list){
        super(id,list);
        this.list=list;

    }
    @Override
    public void fillData(int position, MyHolder holder) {
        TngouBean bean=list.get(position);
        ((TextView)holder.findView(R.id.tv1)).setText(bean.getName());
        ((TextView)holder.findView(R.id.tv2)).setText(bean.getName());
        Glide.with(holder.getConvertView().getContext()).load("http://tnfs.tngou.net/image"+bean.getImg()).
                into((ImageView) holder.findView(R.id.image));

    }
}
