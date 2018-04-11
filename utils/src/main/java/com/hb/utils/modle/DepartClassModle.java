package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 标准科室分类
 * Created by txl on 2017/5/14 0014.
 */
public class DepartClassModle extends BaseModel<List<DepartClassModle.DepartClass>> {

    public static class DepartClass implements Serializable{
        private String Id;
        private String Name;
        private String Description;
        private String Code;
        private String Type;
        private int Status;
        private String CreateUser;
        private String CreateDate;
        private String Icon;
        private String Sort;

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getCode() {
            return Code;
        }

        public void setCode(String code) {
            Code = code;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        public int getStatus() {
            return Status;
        }

        public void setStatus(int status) {
            Status = status;
        }

        public String getCreateUser() {
            return CreateUser;
        }

        public void setCreateUser(String createUser) {
            CreateUser = createUser;
        }

        public String getCreateDate() {
            return CreateDate;
        }

        public void setCreateDate(String createDate) {
            CreateDate = createDate;
        }

        public String getIcon() {
            return Icon;
        }

        public void setIcon(String icon) {
            Icon = icon;
        }

        public String getSort() {
            return Sort;
        }

        public void setSort(String sort) {
            Sort = sort;
        }

        @Override
        public String toString() {
            return "DepartClass{" +
                    ", Id='" + Id + '\'' +
                    ", Name='" + Name + '\'' +
                    ", Description='" + Description + '\'' +
                    ", Code='" + Code + '\'' +
                    ", Type='" + Type + '\'' +
                    ", Status=" + Status +
                    ", CreateUser='" + CreateUser + '\'' +
                    ", CreateDate='" + CreateDate + '\'' +
                    ", Icon='" + Icon + '\'' +
                    ", Sort='" + Sort + '\'' +
                    '}';
        }
    }
}
