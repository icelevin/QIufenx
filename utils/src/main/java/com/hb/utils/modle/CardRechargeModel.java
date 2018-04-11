package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2018/3/23.
 */

public class CardRechargeModel extends BaseModel<CardRechargeModel.Result> {
    public static class Result implements Serializable {
        private String OrderId;

        private String OrderNum;

        private String PayNet;

        public void setOrderId(String OrderId) {
            this.OrderId = OrderId;
        }

        public String getOrderId() {
            return this.OrderId;
        }

        public void setOrderNum(String OrderNum) {
            this.OrderNum = OrderNum;
        }

        public String getOrderNum() {
            return this.OrderNum;
        }

        public void setPayNet(String PayNet) {
            this.PayNet = PayNet;
        }

        public String getPayNet() {
            return this.PayNet;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "OrderId='" + OrderId + '\'' +
                    ", OrderNum='" + OrderNum + '\'' +
                    ", PayNet='" + PayNet + '\'' +
                    '}';
        }
    }
}
