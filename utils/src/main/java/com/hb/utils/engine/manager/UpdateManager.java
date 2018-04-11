package com.hb.utils.engine.manager;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;

import com.hb.utils.BaseApplication;
import com.hb.utils.common.SettingPref;
import com.hb.utils.engine.NetWorkController;
import com.hb.utils.modle.UpdateModel;
import com.hb.utils.tools.Utils;
import com.hb.utils.view.activity.dialog.DialogActivity;
import com.hb.utils.view.activity.dialog.DialogMessage;
import com.hb.utils.view.activity.dialog.MyDialogClickListener;

import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 更新
 * <p/>
 * Created by txl on 2017/5/31 0031.
 */
public class UpdateManager {

    public UpdateManager() {
    }

    /**
     * 获取是否有最新更新
     */
    public void init(final boolean isShowProgressDialog) {
        if (isShowProgressDialog) {
            Toast.makeText(BaseApplication.getAppContext(), "正在获取更新...", Toast.LENGTH_SHORT).show();
        }
        String version = "" + Utils.getVersionCode(BaseApplication.getAppContext());
        NetWorkController.INSTANCE.update(version, new Callback<UpdateModel>() {
            @Override
            public void onResponse(Call<UpdateModel> call, Response<UpdateModel> response) {
                UpdateModel body = response.body();
                if (body == null) {
                    showError(isShowProgressDialog);
                    return;
                }

                if (!body.isNewVersion()) {
                    if (isShowProgressDialog) {
                        Toast.makeText(BaseApplication.getAppContext(), "当前已是最新版本", Toast.LENGTH_SHORT).show();
                    }
                    return;
                }
                update(body,isShowProgressDialog);
            }

            @Override
            public void onFailure(Call<UpdateModel> call, Throwable t) {
                showError(isShowProgressDialog);
            }
        });
    }

    private void showError(boolean isShowProgressDialog) {
        if (isShowProgressDialog) {
            Toast.makeText(BaseApplication.getAppContext(), "更新获取失败", Toast.LENGTH_SHORT).show();
        }
    }

    public void update(final UpdateModel update,boolean isShowProgressDialog) {
        if (update.getVersionInfo() == null) {
            showError(isShowProgressDialog);
            return;
        }

        if (TextUtils.isEmpty(update.getVersionInfo().getDownloadUri())) {
            showError(isShowProgressDialog);
            return;
        }

        int versionCode = Utils.getVersionCode(BaseApplication.getAppContext());
        if (versionCode >= update.getVersionInfo().getVersion()) {
            showError(isShowProgressDialog);
            return;
        }

        if (!TextUtils.isEmpty(update.getVersionInfo().getChannelId())) {
            SettingPref.getInstance().setValue("ChannelId", update.getVersionInfo().getChannelId());
        }

        //有新版本可更新
        showDialog(update);
    }

    private void showDialog(final UpdateModel update) {

        String descript = update.getVersionInfo().getDescript();
        if (!TextUtils.isEmpty(descript)) {
            descript = descript.replace("\\\\n", "");
        }
        String message = "获取到有最新版本\n" + descript + "\n是否立即更新到新版本？";

        DialogMessage dialogMessage = new DialogMessage();
        dialogMessage.setTitle("更新提示");
        if(!update.getVersionInfo().isUpdate()){
            dialogMessage.setCancelButText("稍后更新");
            dialogMessage.setCancelable(true);
            dialogMessage.setShowCancelBut(true);
        }else{
            dialogMessage.setCancelable(false);
            dialogMessage.setShowCancelBut(false);
        }
        dialogMessage.setOkButText("立即更新");
        dialogMessage.setMessage(message);

        UUID uuid = UUID.randomUUID();
        DialogActivity.map.put(uuid,new MyDialogClickListener(){
            @Override
            public void onClick(DialogActivity.DialogButEnum enumValue) {
                if(enumValue == DialogActivity.DialogButEnum.ok_but){
                    openBrowser(update.getVersionInfo().getDownloadUri());
                }
                if(update.getVersionInfo().isUpdate()){
                    //强制退出
                    System.exit(0);
                }
            }
        });

        Intent intent = new Intent(BaseApplication.getAppContext(), DialogActivity.class);
        intent.putExtra(DialogMessage.class.getName(),dialogMessage);
        intent.putExtra(UUID.class.getName(),uuid);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        BaseApplication.getAppContext().startActivity(intent);
    }

    private void openBrowser(String url) {
        // urlText是一个文本输入框，输入网站地址
        // Uri 是统一资源标识符
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        BaseApplication.getAppContext().startActivity(intent);
    }

}
