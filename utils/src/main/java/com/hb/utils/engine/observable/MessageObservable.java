package com.hb.utils.engine.observable;


import com.hb.utils.BaseApplication;
import com.hb.utils.engine.NetWorkController;
import com.hb.utils.modle.BaseModel;
import com.hb.utils.net.listener.OnResultListener;
import com.hb.utils.tools.LogUtils;

import java.util.Observable;

import me.leolin.shortcutbadger.ShortcutBadger;

/**
 * Created by txl on 2017/7/20 0020.
 */
public class MessageObservable extends Observable{
    private static MessageObservable observable;

    public static MessageObservable getInstance(){
        if(observable == null){
            observable = new MessageObservable();
        }
        return observable;
    }

    public void update(BaseModel baseModel){
        setChanged();
        notifyObservers(baseModel);
        setBadge(baseModel.getTotalCount());
    }

    /**
     * 设置角标
     * @param count
     */
    private void setBadge(int count){
        boolean success = ShortcutBadger.applyCount(BaseApplication.getAppContext(), count);
        LogUtils.print(MessageObservable.class.getName(),"设置app角标消息数量："+success);
    }

    private void removeBadge(){

    }

    /**
     * 获取未读消息数量
     */
    public void getMessageCount(){
        NetWorkController.INSTANCE.getmsgcountbyuser(new OnResultListener<BaseModel>() {
            @Override
            public void onResult(BaseModel baseModel) {
                if(baseModel == null){
                    return ;
                }

                if(baseModel.getResultCode() != 1){
                    return;
                }

                update(baseModel);
            }
        });
    }
}
