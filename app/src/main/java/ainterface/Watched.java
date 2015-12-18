package ainterface;

/**
 * Created by Administrator on 2015/12/18.
 */
public interface Watched {


    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String str);
}
