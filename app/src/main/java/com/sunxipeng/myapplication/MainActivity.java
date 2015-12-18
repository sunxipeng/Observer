package com.sunxipeng.myapplication;

import android.app.Activity;
import android.os.Bundle;

import ainterface.Watched;
import ainterface.Watcher;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Watched girl = new ConcreteWatched();

        Watcher watcher1 = new ConcreteWatcher();

        Watcher watcher2 = new ConcreteWatcher();

        Watcher watcher3 = new ConcreteWatcher();

        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);

        girl.notifyWatchers("开心");


    }
}
