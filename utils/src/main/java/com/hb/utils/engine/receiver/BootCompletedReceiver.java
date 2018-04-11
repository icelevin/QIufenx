package com.hb.utils.engine.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.hb.utils.engine.observable.MessageObservable;
import com.hb.utils.modle.login.Passport;
import com.hb.utils.tools.DBUtils;
import com.hb.utils.tools.LogUtils;

public class BootCompletedReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		LogUtils.print(BootCompletedReceiver.class.getName(),"获取到广播：" + intent.getAction());

		Passport loginUser = DBUtils.getPassport();
		if(loginUser == null){
			return;
		}
		//获取一次未读消息数量
		MessageObservable.getInstance().getMessageCount();
	}
}
