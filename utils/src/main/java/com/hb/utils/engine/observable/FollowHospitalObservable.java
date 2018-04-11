package com.hb.utils.engine.observable;

import java.util.Observable;

/**
 * Created by txl on 2018/3/19 0019.
 */

public class FollowHospitalObservable extends Observable {
    private static FollowHospitalObservable observable;

    public static FollowHospitalObservable getInstance(){
        if(observable == null){
            observable = new FollowHospitalObservable();
        }
        return observable;
    }

    public void update() {
        setChanged();
        notifyObservers();
    }
}
