package com.hb.utils.engine.observable;



import com.hb.utils.modle.UserInfo;
import com.hb.utils.tools.DBUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by txl on 2017/2/17 0017.
 *
 * 用户状态改变的Observable
 *
 */
public class UserInfoObservable extends Observable{
    private List<UserInfoLoadListener> loadListenerList = new ArrayList<>();
    private static UserInfoObservable observable;

    public static UserInfoObservable getInstance(){
        if(observable == null){
            observable = new UserInfoObservable();
        }
        return observable;
    }

    /**
     * 当登录用户信息变更时调用
     * @param userInfo  为null时说明登录用户身份失效
     */
    public void update(UserInfo userInfo){
        //保存到数据库
        if(userInfo != null){
            DBUtils.saveUserInfo(userInfo);
        }
        setChanged();
        notifyObservers(userInfo);
    }

    public void addLoadListener(UserInfoLoadListener loadListener){
        this.loadListenerList.add(loadListener);
    }

    public void onLoadUserInfo(UserInfo userInfo){
        if(loadListenerList == null || loadListenerList.size()< 1){
            return;
        }
        for(int i = 0; i < loadListenerList.size(); i++){
            loadListenerList.get(i).onLoadUserInfo(userInfo);
        }
    }

    public void onPostLoadUserInfo(UserInfo userInfo){
        if(loadListenerList == null || loadListenerList.size()< 1){
            return;
        }
        for(int i = 0; i < loadListenerList.size(); i++){
            loadListenerList.get(i).onPostLoadUserInfo(userInfo);
        }
    }

    public interface UserInfoLoadListener {

        /**
         * 当获取用户详细信息时调用
         */
         void onLoadUserInfo(UserInfo userInfo);

        /**
         * 当获取用户详细信息结束时调用
         */
         void onPostLoadUserInfo(UserInfo userInfo);
    }
}
