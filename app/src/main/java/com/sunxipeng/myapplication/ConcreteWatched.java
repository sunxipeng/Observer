package com.sunxipeng.myapplication;

import java.util.ArrayList;
import java.util.List;

import ainterface.Watched;
import ainterface.Watcher;

/**
 * Created by Administrator on 2015/12/18.
 */
public class ConcreteWatched implements Watched {


    // 存放观察者
    private List<Watcher> list = new ArrayList<Watcher>();


    @Override
    public void addWatcher(Watcher watcher) {


        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {

        list.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str) {

        // 自动调用实际上是主题进行调用的
        for (Watcher watcher : list)
        {
            watcher.update(str);
        }

    }
}
