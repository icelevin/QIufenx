package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2018/3/23.
 */

public class PayOrderStatusModel extends BaseModel<PayOrderStatusModel.Order> {
    public static class Order implements Serializable {
        private String OrderId;//id

        private String OrderNumber;//单号

        private int OrderStatus;//

        private String OrderStatusText;//

        private String OrderDate;

        private int PayMethod;

        private String PayMethodText;

        private String PayChannel;

        private String PayChannelText;

        private List<String> OrderDetails;

        public void setOrderId(String OrderId) {
            this.OrderId = OrderId;
        }

        public String getOrderId() {
            return this.OrderId;
        }

        public void setOrderNumber(String OrderNumber) {
            this.OrderNumber = OrderNumber;
        }

        public String getOrderNumber() {
            return this.OrderNumber;
        }

        public void setOrderStatus(int OrderStatus) {
            this.OrderStatus = OrderStatus;
        }

        public int getOrderStatus() {
            return this.OrderStatus;
        }

        public void setOrderStatusText(String OrderStatusText) {
            this.OrderStatusText = OrderStatusText;
        }

        public String getOrderStatusText() {
            return this.OrderStatusText;
        }

        public void setOrderDate(String OrderDate) {
            this.OrderDate = OrderDate;
        }

        public String getOrderDate() {
            return this.OrderDate;
        }

        public void setPayMethod(int PayMethod) {
            this.PayMethod = PayMethod;
        }

        public int getPayMethod() {
            return this.PayMethod;
        }

        public void setPayMethodText(String PayMethodText) {
            this.PayMethodText = PayMethodText;
        }

        public String getPayMethodText() {
            return this.PayMethodText;
        }

        public void setPayChannel(String PayChannel) {
            this.PayChannel = PayChannel;
        }

        public String getPayChannel() {
            return this.PayChannel;
        }

        public void setPayChannelText(String PayChannelText) {
            this.PayChannelText = PayChannelText;
        }

        public String getPayChannelText() {
            return this.PayChannelText;
        }

        public void setOrderDetails(List<String> OrderDetails) {
            this.OrderDetails = OrderDetails;
        }

        public List<String> getOrderDetails() {
            return this.OrderDetails;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "OrderId='" + OrderId + '\'' +
                    ", OrderNumber='" + OrderNumber + '\'' +
                    ", OrderStatus=" + OrderStatus +
                    ", OrderStatusText='" + OrderStatusText + '\'' +
                    ", OrderDate='" + OrderDate + '\'' +
                    ", PayMethod=" + PayMethod +
                    ", PayMethodText='" + PayMethodText + '\'' +
                    ", PayChannel='" + PayChannel + '\'' +
                    ", PayChannelText='" + PayChannelText + '\'' +
                    ", OrderDetails=" + OrderDetails +
                    '}';
        }
    }
}
