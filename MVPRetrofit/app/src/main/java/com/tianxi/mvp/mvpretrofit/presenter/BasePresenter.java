package com.tianxi.mvp.mvpretrofit.presenter;

import com.tianxi.mvp.mvpretrofit.view.iview.MVPView;

import java.lang.ref.WeakReference;

/**
 * Created by admin on 16/10/11.
 */

public class BasePresenter<V extends MVPView> {
    private WeakReference<V> weakReference;

    public void attch(V iview) {

        weakReference = new WeakReference(iview);

    }

    public void destoryAttch() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    public V getView() {

        return weakReference.get();
    }
}
