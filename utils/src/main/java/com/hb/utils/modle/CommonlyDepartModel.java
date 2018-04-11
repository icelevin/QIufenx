package com.hb.utils.modle;

import java.util.List;

/**
 *
 * 常用科室
 * Created by txl on 2017/5/18 0018.
 */
public class CommonlyDepartModel extends BaseModel<List<CommonlyDepartModel.CommonlyDepart>> {

    public static class CommonlyDepart{
        private String Id;
        private String Name;
        private String FullName;

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

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String fullName) {
            FullName = fullName;
        }

        @Override
        public String toString() {
            return "CommonlyDepart{" +
                    "Id='" + Id + '\'' +
                    ", Name='" + Name + '\'' +
                    ", FullName='" + FullName + '\'' +
                    '}';
        }
    }
}
