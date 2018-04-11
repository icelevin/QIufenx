package com.hb.utils.engine.observable;

import java.util.Observable;

/**
 * Created by txl on 2018/3/19 0019.
 */

public class FollowDoctorObservable extends Observable {
    private static FollowDoctorObservable observable;

    public static FollowDoctorObservable getInstance(){
        if(observable == null){
            observable = new FollowDoctorObservable();
        }
        return observable;
    }

    public void update() {
        setChanged();
        notifyObservers();
    }
}
