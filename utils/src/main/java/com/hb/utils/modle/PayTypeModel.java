package com.hb.utils.modle;

import java.util.List;

/**
 *
 * 支付方式
 * Created by txl on 2017/5/12 0012.
 */
public class PayTypeModel extends BaseModel<List<PayTypeModel.PayType>> {

    public static class PayType{
        private String Name;
        private String Value;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getValue() {
            return Value;
        }

        public void setValue(String value) {
            Value = value;
        }

        @Override
        public String toString() {
            return "PayType{" +
                    "Name='" + Name + '\'' +
                    ", Value='" + Value + '\'' +
                    '}';
        }
    }
}
