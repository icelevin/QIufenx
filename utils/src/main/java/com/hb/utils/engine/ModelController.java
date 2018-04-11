package com.hb.utils.engine;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by txl on 2017/10/19 0019.
 */

public class ModelController {

    private static final HashMap<String,Runnable> map = new HashMap<>();
    private static final ModelController controller = new ModelController();

    private ModelController(){}

    public static ModelController getInstance(){
        return controller;
    }

    public void add(String key, Runnable run){
        map.put(key,run);
    }

    public synchronized void run(String key, Objects[] objs){
        Runnable runnable = map.get(key);
        runnable.run();
    }
}
