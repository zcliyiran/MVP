package com.tianxi.mvp.retrofit_rxandroid_mvp_demo.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by admin on 16/10/12.
 */

public class MyHolder {

    private View convertView;
    private SparseArray<View> sparseArray= new SparseArray<>();;

//    public MyHolder(Context context,int id,ViewGroup viewGroup) {
//
//        convertView= LayoutInflater.from(context).inflate(id,viewGroup,false);
//        convertView.setTag(this);
//    }
    public MyHolder(Context context,int id) {

        convertView= LayoutInflater.from(context).inflate(id,null);
        convertView.setTag(this);
    }
    public View getConvertView() {
        return convertView;
    }



    public static  MyHolder getHolder(View convertView, @LayoutRes int id, Context context, ViewGroup viewGroup){

        MyHolder holder=null;
        if (convertView==null){
//           holder=new MyHolder(context,id,viewGroup);
            holder=new MyHolder(context,id);
        }else {
            holder= (MyHolder) convertView.getTag();
        }

        return holder;
    }

    public  View findView(int id){
        View view=sparseArray.get(id);
        if (view == null) {
        view=convertView.findViewById(id);
            sparseArray.put(id,view);
        }
        return view;
    }
}
