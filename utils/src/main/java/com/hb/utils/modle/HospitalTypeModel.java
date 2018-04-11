package com.hb.utils.modle;

import java.util.List;

/**
 * Created by ice on 2018/3/15.
 */

public class HospitalTypeModel extends BaseModel<List<HospitalTypeModel.Type>>{
    public static class Type{
        private String key;

        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}