package com.hb.utils.engine.observable;


import com.hb.utils.modle.SearchItemModel;

import java.util.List;
import java.util.Observable;

/**
 *
 * 搜索关键词变化
 *
 * Created by txl on 2017/5/17 0017.
 */
public class SearchItemObservable extends Observable {
    private static SearchItemObservable observable;

    public static SearchItemObservable getInstance() {
        if (observable == null) {
            observable = new SearchItemObservable();
        }
        return observable;
    }

    public void update(List<SearchItemModel> userInfo) {
        setChanged();
        notifyObservers(userInfo);
    }

}
