package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2018/3/23.
 */

public class SettingModel extends BaseModel<List<SettingModel.Model>> {
    public static class Model implements Serializable {
        private String Id;

        private String Title;

        private String Key;

        private String Value;

        private String Groupkey;

        private String Appid;

        private String Targettype;

        private String Targetid;

        private String Parentid;

        private String Icon;

        private String Action;

        private int Status;

        private String Createdate;

        private String Createuser;

        private String Updatedate;

        private String Updateuser;

        private String Remark;

        private int Sorting;

        private String Description;

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getId() {
            return this.Id;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getTitle() {
            return this.Title;
        }

        public void setKey(String Key) {
            this.Key = Key;
        }

        public String getKey() {
            return this.Key;
        }

        public void setValue(String Value) {
            this.Value = Value;
        }

        public String getValue() {
            return this.Value;
        }

        public void setGroupkey(String Groupkey) {
            this.Groupkey = Groupkey;
        }

        public String getGroupkey() {
            return this.Groupkey;
        }

        public void setAppid(String Appid) {
            this.Appid = Appid;
        }

        public String getAppid() {
            return this.Appid;
        }

        public void setTargettype(String Targettype) {
            this.Targettype = Targettype;
        }

        public String getTargettype() {
            return this.Targettype;
        }

        public void setTargetid(String Targetid) {
            this.Targetid = Targetid;
        }

        public String getTargetid() {
            return this.Targetid;
        }

        public void setParentid(String Parentid) {
            this.Parentid = Parentid;
        }

        public String getParentid() {
            return this.Parentid;
        }

        public void setIcon(String Icon) {
            this.Icon = Icon;
        }

        public String getIcon() {
            return this.Icon;
        }

        public void setAction(String Action) {
            this.Action = Action;
        }

        public String getAction() {
            return this.Action;
        }

        public void setStatus(int Status) {
            this.Status = Status;
        }

        public int getStatus() {
            return this.Status;
        }

        public void setCreatedate(String Createdate) {
            this.Createdate = Createdate;
        }

        public String getCreatedate() {
            return this.Createdate;
        }

        public void setCreateuser(String Createuser) {
            this.Createuser = Createuser;
        }

        public String getCreateuser() {
            return this.Createuser;
        }

        public void setUpdatedate(String Updatedate) {
            this.Updatedate = Updatedate;
        }

        public String getUpdatedate() {
            return this.Updatedate;
        }

        public void setUpdateuser(String Updateuser) {
            this.Updateuser = Updateuser;
        }

        public String getUpdateuser() {
            return this.Updateuser;
        }

        public void setRemark(String Remark) {
            this.Remark = Remark;
        }

        public String getRemark() {
            return this.Remark;
        }

        public void setSorting(int Sorting) {
            this.Sorting = Sorting;
        }

        public int getSorting() {
            return this.Sorting;
        }

        public void setDescription(String Description) {
            this.Description = Description;
        }

        public String getDescription() {
            return this.Description;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "Id='" + Id + '\'' +
                    ", Title='" + Title + '\'' +
                    ", Key='" + Key + '\'' +
                    ", Value='" + Value + '\'' +
                    ", Groupkey='" + Groupkey + '\'' +
                    ", Appid='" + Appid + '\'' +
                    ", Targettype='" + Targettype + '\'' +
                    ", Targetid='" + Targetid + '\'' +
                    ", Parentid='" + Parentid + '\'' +
                    ", Icon='" + Icon + '\'' +
                    ", Action='" + Action + '\'' +
                    ", Status=" + Status +
                    ", Createdate='" + Createdate + '\'' +
                    ", Createuser='" + Createuser + '\'' +
                    ", Updatedate='" + Updatedate + '\'' +
                    ", Updateuser='" + Updateuser + '\'' +
                    ", Remark='" + Remark + '\'' +
                    ", Sorting=" + Sorting +
                    ", Description='" + Description + '\'' +
                    '}';
        }
    }
}
