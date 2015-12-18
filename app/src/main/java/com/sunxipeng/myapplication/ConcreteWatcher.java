package com.sunxipeng.myapplication;

import android.util.Log;

import ainterface.Watcher;

/**
 * Created by Administrator on 2015/12/18.
 */
public class ConcreteWatcher implements Watcher {

    @Override
    public void update(String str) {

        Log.d("Watcher",str);

    }
}
