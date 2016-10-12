package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.adapter;

import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by admin on 16/10/12.
 */

public abstract class MyBaseAdapter<T> extends BaseAdapter {
    private List<T> list;
    private @LayoutRes int id;

    public MyBaseAdapter(int id,List<T> list) {
        this.id=id;
        this.list=list;
    }

    @Override
    public int getCount() {

        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyHolder holder = MyHolder.getHolder(convertView, id, parent.getContext(), parent);
        fillData(position, holder);
        return holder.getConvertView();
    }

    public abstract void fillData(int position, MyHolder holder);
}
