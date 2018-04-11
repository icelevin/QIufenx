package com.hb.utils.engine.observable;

import java.util.Observable;

/**
 *
 * 首页刷新
 * Created by txl on 2017/5/31 0031.
 */
public class MainRefreshObservable extends Observable {
    private static MainRefreshObservable observable;

    public static MainRefreshObservable getInstance() {
        if (observable == null) {
            observable = new MainRefreshObservable();
        }
        return observable;
    }

    public void update() {
        setChanged();
        notifyObservers();
    }
}
