package com.hb.utils.modle;


import com.hb.utils.modle.enums.MyAppointmentOrderEnum;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 我的预约列表模型
 * Created by txl on 2017/5/13 0013.
 */
public class AppointmentListModel extends BaseModel<List<AppointmentListModel.Order>> {

    public static class Order implements Serializable{
        public static final int requestCode = 0x111;

        private String ID;              // 预约信息id
        private String HospitalName;
        private String DeptName; // 科室
        private String DoctorId;//医生ID
        private String DoctorName;// 医生姓名
        private String ClinicId;// 号别ID
        private String ClinicName;// 号别名称
        private String ClinicTime;// 就诊时间
        private String TimePart;// 就诊时间段
        private int AppointState;// 预约状态
        private String AppointStateText;
        private String AppointmentSerialNo;// 流水号
        private String ClinicPerson;// 就诊人
        private String OrderTime;// 订单日期
        private String AppointType;// 挂号类型（预约挂号/当日挂号）
        private int PaymentStatus;// 支付状态
        private String PaymentStatusName;// 支付状态名称
        private boolean IsDefault;// 是否默认就诊人
        private int OrderStatus;// 订单状态
        private String OrderStatusText;
        private String OrderNo;// 订单编号
        private String DatetimeText;// 格式化时间：yyyy/MM/dd week noon
        private String CardNo;// 就诊卡号
        private String AppointmentCode;// 预约编号
        private String HospitalId;// 医院ID
        private String HospitalCode;// 医院CODE
        private String PaymentMethod;// 支付方式
        private String OrderId;// 订单ID
        private String DepartmentId;// 科室ID
        private String RefundStatus;// 退款状态
        private String RefundStatusText;
        private String RefundOrderStatus;// 退款订单状态
        private String RefundOrderStatusText;
        private String Operate;// 操作描述
        private int PayMethodEnum;// 支付方式
        private String ViewStatusText;// 显示状态
        private String ClinicBookMode;// 预约方式，分时段/依次预约
        private int OrderAmount;// 订单金额 （显示与支付 以这个价格为准）
        private double PayMoney;// 金额 (单位：分)
        private String OrderAmountText;


        private MyAppointmentOrderEnum orderEnum;

        public MyAppointmentOrderEnum getOrderEnum() {
            return orderEnum;
        }

        public void setOrderEnum(MyAppointmentOrderEnum orderEnum) {
            this.orderEnum = orderEnum;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getHospitalName() {
            return HospitalName;
        }

        public void setHospitalName(String hospitalName) {
            HospitalName = hospitalName;
        }

        public String getDeptName() {
            return DeptName;
        }

        public void setDeptName(String deptName) {
            DeptName = deptName;
        }

        public String getDoctorId() {
            return DoctorId;
        }

        public void setDoctorId(String doctorId) {
            DoctorId = doctorId;
        }

        public String getDoctorName() {
            return DoctorName;
        }

        public void setDoctorName(String doctorName) {
            DoctorName = doctorName;
        }

        public String getClinicId() {
            return ClinicId;
        }

        public void setClinicId(String clinicId) {
            ClinicId = clinicId;
        }

        public String getClinicName() {
            return ClinicName;
        }

        public void setClinicName(String clinicName) {
            ClinicName = clinicName;
        }

        public String getClinicTime() {
            return ClinicTime;
        }

        public void setClinicTime(String clinicTime) {
            ClinicTime = clinicTime;
        }

        public String getTimePart() {
            return TimePart;
        }

        public void setTimePart(String timePart) {
            TimePart = timePart;
        }

        public int getAppointState() {
            return AppointState;
        }

        public void setAppointState(int appointState) {
            AppointState = appointState;
        }

        public String getAppointStateText() {
            return AppointStateText;
        }

        public void setAppointStateText(String appointStateText) {
            AppointStateText = appointStateText;
        }

        public String getAppointmentSerialNo() {
            return AppointmentSerialNo;
        }

        public void setAppointmentSerialNo(String appointmentSerialNo) {
            AppointmentSerialNo = appointmentSerialNo;
        }

        public String getClinicPerson() {
            return ClinicPerson;
        }

        public void setClinicPerson(String clinicPerson) {
            ClinicPerson = clinicPerson;
        }

        public String getOrderTime() {
            return OrderTime;
        }

        public void setOrderTime(String orderTime) {
            OrderTime = orderTime;
        }

        public String getAppointType() {
            return AppointType;
        }

        public void setAppointType(String appointType) {
            AppointType = appointType;
        }

        public int getPaymentStatus() {
            return PaymentStatus;
        }

        public void setPaymentStatus(int paymentStatus) {
            PaymentStatus = paymentStatus;
        }

        public String getPaymentStatusName() {
            return PaymentStatusName;
        }

        public void setPaymentStatusName(String paymentStatusName) {
            PaymentStatusName = paymentStatusName;
        }

        public boolean isDefault() {
            return IsDefault;
        }

        public void setDefault(boolean aDefault) {
            IsDefault = aDefault;
        }

        public double getPayMoney() {
            return PayMoney/100;
        }

        public void setPayMoney(double payMoney) {
            PayMoney = payMoney;
        }

        public int getOrderStatus() {
            return OrderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            OrderStatus = orderStatus;
        }

        public String getOrderStatusText() {
            return OrderStatusText;
        }

        public void setOrderStatusText(String orderStatusText) {
            OrderStatusText = orderStatusText;
        }

        public String getOrderNo() {
            return OrderNo;
        }

        public void setOrderNo(String orderNo) {
            OrderNo = orderNo;
        }

        public String getDatetimeText() {
            return DatetimeText;
        }

        public void setDatetimeText(String datetimeText) {
            DatetimeText = datetimeText;
        }

        public String getCardNo() {
            return CardNo;
        }

        public void setCardNo(String cardNo) {
            CardNo = cardNo;
        }

        public String getAppointmentCode() {
            return AppointmentCode;
        }

        public void setAppointmentCode(String appointmentCode) {
            AppointmentCode = appointmentCode;
        }

        public String getHospitalId() {
            return HospitalId;
        }

        public void setHospitalId(String hospitalId) {
            HospitalId = hospitalId;
        }

        public String getHospitalCode() {
            return HospitalCode;
        }

        public void setHospitalCode(String hospitalCode) {
            HospitalCode = hospitalCode;
        }

        public String getPaymentMethod() {
            return PaymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            PaymentMethod = paymentMethod;
        }

        public String getOrderId() {
            return OrderId;
        }

        public void setOrderId(String orderId) {
            OrderId = orderId;
        }

        public String getDepartmentId() {
            return DepartmentId;
        }

        public void setDepartmentId(String departmentId) {
            DepartmentId = departmentId;
        }

        public String getRefundStatus() {
            return RefundStatus;
        }

        public void setRefundStatus(String refundStatus) {
            RefundStatus = refundStatus;
        }

        public String getRefundStatusText() {
            return RefundStatusText;
        }

        public void setRefundStatusText(String refundStatusText) {
            RefundStatusText = refundStatusText;
        }

        public String getRefundOrderStatus() {
            return RefundOrderStatus;
        }

        public void setRefundOrderStatus(String refundOrderStatus) {
            RefundOrderStatus = refundOrderStatus;
        }

        public String getRefundOrderStatusText() {
            return RefundOrderStatusText;
        }

        public void setRefundOrderStatusText(String refundOrderStatusText) {
            RefundOrderStatusText = refundOrderStatusText;
        }

        public String getOperate() {
            return Operate;
        }

        public void setOperate(String operate) {
            Operate = operate;
        }

        public int getPayMethodEnum() {
            return PayMethodEnum;
        }

        public void setPayMethodEnum(int payMethodEnum) {
            PayMethodEnum = payMethodEnum;
        }

        public String getViewStatusText() {
            return ViewStatusText;
        }

        public void setViewStatusText(String viewStatusText) {
            ViewStatusText = viewStatusText;
        }

        public String getClinicBookMode() {
            return ClinicBookMode;
        }

        public void setClinicBookMode(String clinicBookMode) {
            ClinicBookMode = clinicBookMode;
        }

        public int getOrderAmount() {
            return OrderAmount;
        }

        public void setOrderAmount(int orderAmount) {
            OrderAmount = orderAmount;
        }

        public String getOrderAmountText() {
            return OrderAmountText;
        }

        public void setOrderAmountText(String orderAmountText) {
            OrderAmountText = orderAmountText;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "ID='" + ID + '\'' +
                    ", HospitalName='" + HospitalName + '\'' +
                    ", DeptName='" + DeptName + '\'' +
                    ", DoctorId='" + DoctorId + '\'' +
                    ", DoctorName='" + DoctorName + '\'' +
                    ", ClinicId='" + ClinicId + '\'' +
                    ", ClinicName='" + ClinicName + '\'' +
                    ", ClinicTime='" + ClinicTime + '\'' +
                    ", TimePart='" + TimePart + '\'' +
                    ", AppointState=" + AppointState +
                    ", AppointStateText='" + AppointStateText + '\'' +
                    ", AppointmentSerialNo='" + AppointmentSerialNo + '\'' +
                    ", ClinicPerson='" + ClinicPerson + '\'' +
                    ", OrderTime='" + OrderTime + '\'' +
                    ", AppointType='" + AppointType + '\'' +
                    ", PaymentStatus=" + PaymentStatus +
                    ", PaymentStatusName='" + PaymentStatusName + '\'' +
                    ", IsDefault=" + IsDefault +
                    ", PayMoney=" + PayMoney +
                    ", OrderStatus=" + OrderStatus +
                    ", OrderStatusText='" + OrderStatusText + '\'' +
                    ", OrderNo='" + OrderNo + '\'' +
                    ", DatetimeText='" + DatetimeText + '\'' +
                    ", CardNo='" + CardNo + '\'' +
                    ", AppointmentCode='" + AppointmentCode + '\'' +
                    ", HospitalId='" + HospitalId + '\'' +
                    ", HospitalCode='" + HospitalCode + '\'' +
                    ", PaymentMethod='" + PaymentMethod + '\'' +
                    ", OrderId='" + OrderId + '\'' +
                    ", DepartmentId='" + DepartmentId + '\'' +
                    ", RefundStatus='" + RefundStatus + '\'' +
                    ", RefundStatusText='" + RefundStatusText + '\'' +
                    ", RefundOrderStatus='" + RefundOrderStatus + '\'' +
                    ", RefundOrderStatusText='" + RefundOrderStatusText + '\'' +
                    ", Operate='" + Operate + '\'' +
                    ", PayMethodEnum=" + PayMethodEnum +
                    ", ViewStatusText='" + ViewStatusText + '\'' +
                    ", ClinicBookMode='" + ClinicBookMode + '\'' +
                    ", OrderAmount=" + OrderAmount +
                    ", OrderAmountText='" + OrderAmountText + '\'' +
                    ", orderEnum=" + orderEnum +
                    '}';
        }
    }
}
