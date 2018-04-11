package com.hb.utils.modle.config;


import android.support.annotation.NonNull;

import com.hb.utils.modle.BaseModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by txl on 2018/3/7 0007.
 */

public class ConfigModel extends BaseModel<List<ConfigModel.Config>> {
    private static final String note = ":::";

    public static String getAction(String action,String operate,String parm){
        StringBuilder builder = new StringBuilder();
        if(action != null && !"".equals(action)){
            builder.append(action);
        }
        builder.append(note);
        if(operate != null && !"".equals(operate)){
            builder.append(operate);
        }
        builder.append(note);
        if(parm != null && !"".equals(parm)){
            builder.append(parm);
        }
        return builder.toString();
    }

    public static class Config implements Serializable,Comparable {
        public static final int requestCode = 0x111;
        public Config() {
        }

        public Config(String key,String title,String icon, int value, String groupKey, String targetType, String targetId, String parentId, int sorting, String remark,String Description,  ConfigActionModel
                action) {
            this.Title = title;
            this.Key = key;
            this.Value = value;
            this.Groupkey = groupKey;
            this.Targettype = targetType;
            this.Targetid = targetId;
            this.Parentid = parentId;
            this.Icon = icon;
            this.Action = action;
            this.Sorting = sorting;
            this.Remark = remark;
            this.Description = Description;
        }

        private String Id;
        private String Title;
        private String Key;
        private int Value;
        private String Groupkey;
        private String Appid;
        private String Targettype;
        private String Targetid;
        private String Parentid;
        private String Icon;
        private ConfigActionModel Action;
        private int Status;
        private int Sorting;
        private String Createdate;
        private String Createuser;
        private String Updatedate;
        private String Updateuser;
        private String Remark;
        private String Description;

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public static int getRequestCode() {
            return requestCode;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getKey() {
            return Key;
        }

        public void setKey(String key) {
            Key = key;
        }

        public int getValue() {
            return Value;
        }

        public void setValue(int value) {
            Value = value;
        }

        public String getGroupkey() {
            return Groupkey;
        }

        public void setGroupkey(String groupkey) {
            Groupkey = groupkey;
        }

        public String getAppid() {
            return Appid;
        }

        public void setAppid(String appid) {
            Appid = appid;
        }

        public String getTargettype() {
            return Targettype;
        }

        public void setTargettype(String targettype) {
            Targettype = targettype;
        }

        public String getTargetid() {
            return Targetid;
        }

        public void setTargetid(String targetid) {
            Targetid = targetid;
        }

        public String getParentid() {
            return Parentid;
        }

        public void setParentid(String parentid) {
            Parentid = parentid;
        }

        public String getIcon() {
            return Icon;
        }

        public void setIcon(String icon) {
            Icon = icon;
        }

        public ConfigActionModel getAction() {
            return Action;
        }

        public void setAction(ConfigActionModel action) {
            Action = action;
        }

        public int getStatus() {
            return Status;
        }

        public void setStatus(int status) {
            Status = status;
        }

        public int getSorting() {
            return Sorting;
        }

        public void setSorting(int sorting) {
            Sorting = sorting;
        }

        public String getCreatedate() {
            return Createdate;
        }

        public void setCreatedate(String createdate) {
            Createdate = createdate;
        }

        public String getCreateuser() {
            return Createuser;
        }

        public void setCreateuser(String createuser) {
            Createuser = createuser;
        }

        public String getUpdatedate() {
            return Updatedate;
        }

        public void setUpdatedate(String updatedate) {
            Updatedate = updatedate;
        }

        public String getUpdateuser() {
            return Updateuser;
        }

        public void setUpdateuser(String updateuser) {
            Updateuser = updateuser;
        }

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String remark) {
            Remark = remark;
        }


        @Override
        public String toString() {
            return "Config{" + "Id='" + Id + '\'' + ", Title='" + Title + '\'' + ", Key='" + Key + '\'' + ", Value=" + Value + ", Groupkey='" +
                    Groupkey + '\'' + ", Appid='" + Appid + '\'' + ", Targettype='" + Targettype + '\'' + ", Targetid='" + Targetid + '\'' + ", " +
                    "Parentid='" + Parentid + '\'' + ", Icon='" + Icon + '\'' + ", Action=" + Action + ", Status=" + Status + ", Sorting=" +
                    Sorting + ", Createdate='" + Createdate + '\'' + ", Createuser='" + Createuser + '\'' + ", Updatedate='" + Updatedate + '\'' +
                    ", Updateuser='" + Updateuser + '\'' + ", Remark='" + Remark + '\'' + ", Description='" + Description + '\'' + '}';
        }

        @Override
        public int compareTo(@NonNull Object o) {
            if(!(o instanceof ConfigModel.Config)){
                return 1;
            }

            ConfigModel.Config config = (Config) o;

            if(getSorting() > config.getSorting()){
                return 1;
            }else if(getSorting() == config.getSorting()){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
