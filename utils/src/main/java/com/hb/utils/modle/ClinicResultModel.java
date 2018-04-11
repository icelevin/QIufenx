package com.hb.utils.modle;

import java.io.Serializable;

/**
 *
 * 预约返回的结果
 * Created by txl on 2017/5/13 0013.
 */
public class ClinicResultModel extends BaseModel<ClinicResultModel.Result> {

    public static class Result implements Serializable{
        private String AppointmentId;
        private String AppointmentCode;
        private String OrderId;
        private String PayMethod;
        private String OrderNo;

        public String getAppointmentId() {
            return AppointmentId;
        }

        public void setAppointmentId(String appointmentId) {
            AppointmentId = appointmentId;
        }

        public String getAppointmentCode() {
            return AppointmentCode;
        }

        public void setAppointmentCode(String appointmentCode) {
            AppointmentCode = appointmentCode;
        }

        public String getOrderId() {
            return OrderId;
        }

        public void setOrderId(String orderId) {
            OrderId = orderId;
        }

        public String getPayMethod() {
            return PayMethod;
        }

        public void setPayMethod(String payMethod) {
            PayMethod = payMethod;
        }

        public String getOrderNo() {
            return OrderNo;
        }

        public void setOrderNo(String orderNo) {
            OrderNo = orderNo;
        }

        @Override
        public String toString() {
            return "SerachValueResult{" +
                    "AppointmentId='" + AppointmentId + '\'' +
                    ", AppointmentCode='" + AppointmentCode + '\'' +
                    ", OrderId='" + OrderId + '\'' +
                    ", PayMethod='" + PayMethod + '\'' +
                    ", OrderNo='" + OrderNo + '\'' +
                    '}';
        }
    }
}
