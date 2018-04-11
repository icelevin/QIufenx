package com.hb.utils.modle;

import com.google.gson.annotations.SerializedName;

/**
 *
 * 预约详情
 * Created by txl on 2017/5/16 0016.
 */
public class ClinicOrderInfoModle extends BaseModel<ClinicOrderInfoModle.ClinicOrderInfo> {

    public static class ClinicOrderInfo{
        private String OrderNo;
        private String OrderCreateDate;
        private String OrderCreateDateText;
        private String ChannelName;
        private String PayChannel;
        private int PayMethod;
        private String PayMethodText;
        private String PayChannelName;
        private int PatientType;
        private String PatientTypeText;
        private String PatientIdCode;
        private String PatientCellPhone;
        private String PatientCardNo;
        private int DiagnosisType;
        private String DiagnosisTypeText;
        private String Remark;
        private int PaymentStatus;
        private String PaymentStatusText;
        private String Remind;
        private String PayLockTime;
        private String PayLockNotice;
        private boolean CanPay;
        private String ClinicMode;
        private String DoctorName;
        private int OrderStatus;
        private String OrderStatusText;
        private String DoctorId;
        private String OrderRefundStatus;
        private String OrderRefundStatusText;
        private String RequestDate;
        private String RequestDateText;
        private String OrderId;
        private String OrderLockTime;
        private String DepartmentId;
        private String HisUseSn;
        private String Id;
        private String AppointmentCode;
        private int AppointmentType;
        @SerializedName(value = "AppointmentTypeText", alternate = {"OrderTypeName"})
        private String AppointmentTypeText;
        private String CreateTime;
        private String ClinicName;
        private String DoctorCode;
        private String OrganizationId;
        private String OrganizationName;
        private String OrganizationCode;
        private String DepartmentName;
        private String DepartmentCode;
        private String AppointmentDate;
        private String AppointmentDateText;
        private String IsClinic;
        private int Noon;
        private String NoonText;
        private String StartTime;
        private String EndTime;
        private String PatientName;
        private int Price;
        private String PriceText;
        private int OrderAppointmentStatus;
        private String OrderAppointmentStatusText;
        private int RemainingDay;
        private String RemainingDayText;
        private String ClinicId;
        private String WeekDayText;
        private String OrderAmountText;
        private String OrderAmount;


        public String getOrderAmount() {
            return OrderAmount;
        }

        public void setOrderAmount(String orderAmount) {
            OrderAmount = orderAmount;
        }

        public String getOrderAmountText() {
            return OrderAmountText;
        }

        public void setOrderAmountText(String orderAmountText) {
            OrderAmountText = orderAmountText;
        }

        public String getOrderNo() {
            return OrderNo;
        }

        public void setOrderNo(String orderNo) {
            OrderNo = orderNo;
        }

        public String getOrderCreateDate() {
            return OrderCreateDate;
        }

        public void setOrderCreateDate(String orderCreateDate) {
            OrderCreateDate = orderCreateDate;
        }

        public String getOrderCreateDateText() {
            return OrderCreateDateText;
        }

        public void setOrderCreateDateText(String orderCreateDateText) {
            OrderCreateDateText = orderCreateDateText;
        }

        public String getChannelName() {
            return ChannelName;
        }

        public void setChannelName(String channelName) {
            ChannelName = channelName;
        }

        public String getPayChannel() {
            return PayChannel;
        }

        public void setPayChannel(String payChannel) {
            PayChannel = payChannel;
        }

        public int getPayMethod() {
            return PayMethod;
        }

        public void setPayMethod(int payMethod) {
            PayMethod = payMethod;
        }

        public String getPayMethodText() {
            return PayMethodText;
        }

        public void setPayMethodText(String payMethodText) {
            PayMethodText = payMethodText;
        }

        public String getPayChannelName() {
            return PayChannelName;
        }

        public void setPayChannelName(String payChannelName) {
            PayChannelName = payChannelName;
        }

        public int getPatientType() {
            return PatientType;
        }

        public void setPatientType(int patientType) {
            PatientType = patientType;
        }

        public String getPatientTypeText() {
            return PatientTypeText;
        }

        public void setPatientTypeText(String patientTypeText) {
            PatientTypeText = patientTypeText;
        }

        public String getPatientIdCode() {
            return PatientIdCode;
        }

        public void setPatientIdCode(String patientIdCode) {
            PatientIdCode = patientIdCode;
        }

        public String getPatientCellPhone() {
            return PatientCellPhone;
        }

        public void setPatientCellPhone(String patientCellPhone) {
            PatientCellPhone = patientCellPhone;
        }

        public String getPatientCardNo() {
            return PatientCardNo;
        }

        public void setPatientCardNo(String patientCardNo) {
            PatientCardNo = patientCardNo;
        }

        public int getDiagnosisType() {
            return DiagnosisType;
        }

        public void setDiagnosisType(int diagnosisType) {
            DiagnosisType = diagnosisType;
        }

        public String getDiagnosisTypeText() {
            return DiagnosisTypeText;
        }

        public void setDiagnosisTypeText(String diagnosisTypeText) {
            DiagnosisTypeText = diagnosisTypeText;
        }

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String remark) {
            Remark = remark;
        }

        public int getPaymentStatus() {
            return PaymentStatus;
        }

        public void setPaymentStatus(int paymentStatus) {
            PaymentStatus = paymentStatus;
        }

        public String getPaymentStatusText() {
            return PaymentStatusText;
        }

        public void setPaymentStatusText(String paymentStatusText) {
            PaymentStatusText = paymentStatusText;
        }

        public String getRemind() {
            return Remind;
        }

        public void setRemind(String remind) {
            Remind = remind;
        }

        public String getPayLockTime() {
            return PayLockTime;
        }

        public void setPayLockTime(String payLockTime) {
            PayLockTime = payLockTime;
        }

        public String getPayLockNotice() {
            return PayLockNotice;
        }

        public void setPayLockNotice(String payLockNotice) {
            PayLockNotice = payLockNotice;
        }

        public boolean isCanPay() {
            return CanPay;
        }

        public void setCanPay(boolean canPay) {
            CanPay = canPay;
        }

        public String getClinicMode() {
            return ClinicMode;
        }

        public void setClinicMode(String clinicMode) {
            ClinicMode = clinicMode;
        }

        public String getDoctorName() {
            return DoctorName;
        }

        public void setDoctorName(String doctorName) {
            DoctorName = doctorName;
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

        public String getDoctorId() {
            return DoctorId;
        }

        public void setDoctorId(String doctorId) {
            DoctorId = doctorId;
        }

        public String getOrderRefundStatus() {
            return OrderRefundStatus;
        }

        public void setOrderRefundStatus(String orderRefundStatus) {
            OrderRefundStatus = orderRefundStatus;
        }

        public String getOrderRefundStatusText() {
            return OrderRefundStatusText;
        }

        public void setOrderRefundStatusText(String orderRefundStatusText) {
            OrderRefundStatusText = orderRefundStatusText;
        }

        public String getRequestDate() {
            return RequestDate;
        }

        public void setRequestDate(String requestDate) {
            RequestDate = requestDate;
        }

        public String getRequestDateText() {
            return RequestDateText;
        }

        public void setRequestDateText(String requestDateText) {
            RequestDateText = requestDateText;
        }

        public String getOrderId() {
            return OrderId;
        }

        public void setOrderId(String orderId) {
            OrderId = orderId;
        }

        public String getOrderLockTime() {
            return OrderLockTime;
        }

        public void setOrderLockTime(String orderLockTime) {
            OrderLockTime = orderLockTime;
        }

        public String getDepartmentId() {
            return DepartmentId;
        }

        public void setDepartmentId(String departmentId) {
            DepartmentId = departmentId;
        }

        public String getHisUseSn() {
            return HisUseSn;
        }

        public void setHisUseSn(String hisUseSn) {
            HisUseSn = hisUseSn;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getAppointmentCode() {
            return AppointmentCode;
        }

        public void setAppointmentCode(String appointmentCode) {
            AppointmentCode = appointmentCode;
        }

        public int getAppointmentType() {
            return AppointmentType;
        }

        public void setAppointmentType(int appointmentType) {
            AppointmentType = appointmentType;
        }

        public String getAppointmentTypeText() {
            return AppointmentTypeText;
        }

        public void setAppointmentTypeText(String appointmentTypeText) {
            AppointmentTypeText = appointmentTypeText;
        }

        public String getCreateTime() {
            return CreateTime;
        }

        public void setCreateTime(String createTime) {
            CreateTime = createTime;
        }

        public String getClinicName() {
            return ClinicName;
        }

        public void setClinicName(String clinicName) {
            ClinicName = clinicName;
        }

        public String getDoctorCode() {
            return DoctorCode;
        }

        public void setDoctorCode(String doctorCode) {
            DoctorCode = doctorCode;
        }

        public String getOrganizationId() {
            return OrganizationId;
        }

        public void setOrganizationId(String organizationId) {
            OrganizationId = organizationId;
        }

        public String getOrganizationName() {
            return OrganizationName;
        }

        public void setOrganizationName(String organizationName) {
            OrganizationName = organizationName;
        }

        public String getOrganizationCode() {
            return OrganizationCode;
        }

        public void setOrganizationCode(String organizationCode) {
            OrganizationCode = organizationCode;
        }

        public String getDepartmentName() {
            return DepartmentName;
        }

        public void setDepartmentName(String departmentName) {
            DepartmentName = departmentName;
        }

        public String getDepartmentCode() {
            return DepartmentCode;
        }

        public void setDepartmentCode(String departmentCode) {
            DepartmentCode = departmentCode;
        }

        public String getAppointmentDate() {
            return AppointmentDate;
        }

        public void setAppointmentDate(String appointmentDate) {
            AppointmentDate = appointmentDate;
        }

        public String getAppointmentDateText() {
            return AppointmentDateText;
        }

        public void setAppointmentDateText(String appointmentDateText) {
            AppointmentDateText = appointmentDateText;
        }

        public String getIsClinic() {
            return IsClinic;
        }

        public void setIsClinic(String isClinic) {
            IsClinic = isClinic;
        }

        public int getNoon() {
            return Noon;
        }

        public void setNoon(int noon) {
            Noon = noon;
        }

        public String getNoonText() {
            return NoonText;
        }

        public void setNoonText(String noonText) {
            NoonText = noonText;
        }

        public String getStartTime() {
            return StartTime;
        }

        public void setStartTime(String startTime) {
            StartTime = startTime;
        }

        public String getEndTime() {
            return EndTime;
        }

        public void setEndTime(String endTime) {
            EndTime = endTime;
        }

        public String getPatientName() {
            return PatientName;
        }

        public void setPatientName(String patientName) {
            PatientName = patientName;
        }

        public int getPrice() {
            return Price;
        }

        public void setPrice(int price) {
            Price = price;
        }

        public String getPriceText() {
            return PriceText;
        }

        public void setPriceText(String priceText) {
            PriceText = priceText;
        }

        public int getOrderAppointmentStatus() {
            return OrderAppointmentStatus;
        }

        public void setOrderAppointmentStatus(int orderAppointmentStatus) {
            OrderAppointmentStatus = orderAppointmentStatus;
        }

        public String getOrderAppointmentStatusText() {
            return OrderAppointmentStatusText;
        }

        public void setOrderAppointmentStatusText(String orderAppointmentStatusText) {
            OrderAppointmentStatusText = orderAppointmentStatusText;
        }

        public int getRemainingDay() {
            return RemainingDay;
        }

        public void setRemainingDay(int remainingDay) {
            RemainingDay = remainingDay;
        }

        public String getRemainingDayText() {
            return RemainingDayText;
        }

        public void setRemainingDayText(String remainingDayText) {
            RemainingDayText = remainingDayText;
        }

        public String getClinicId() {
            return ClinicId;
        }

        public void setClinicId(String clinicId) {
            ClinicId = clinicId;
        }

        public String getWeekDayText() {
            return WeekDayText;
        }

        public void setWeekDayText(String weekDayText) {
            WeekDayText = weekDayText;
        }

        @Override
        public String toString() {
            return "ClinicOrderInfo{" +
                    "OrderNo='" + OrderNo + '\'' +
                    ", OrderCreateDate='" + OrderCreateDate + '\'' +
                    ", OrderCreateDateText='" + OrderCreateDateText + '\'' +
                    ", ChannelName='" + ChannelName + '\'' +
                    ", PayChannel='" + PayChannel + '\'' +
                    ", PayMethod=" + PayMethod +
                    ", PayMethodText='" + PayMethodText + '\'' +
                    ", PayChannelName='" + PayChannelName + '\'' +
                    ", PatientType=" + PatientType +
                    ", PatientTypeText='" + PatientTypeText + '\'' +
                    ", PatientIdCode='" + PatientIdCode + '\'' +
                    ", PatientCellPhone='" + PatientCellPhone + '\'' +
                    ", PatientCardNo='" + PatientCardNo + '\'' +
                    ", DiagnosisType=" + DiagnosisType +
                    ", DiagnosisTypeText='" + DiagnosisTypeText + '\'' +
                    ", Remark='" + Remark + '\'' +
                    ", PaymentStatus=" + PaymentStatus +
                    ", PaymentStatusText='" + PaymentStatusText + '\'' +
                    ", Remind='" + Remind + '\'' +
                    ", PayLockTime='" + PayLockTime + '\'' +
                    ", PayLockNotice='" + PayLockNotice + '\'' +
                    ", CanPay=" + CanPay +
                    ", ClinicMode='" + ClinicMode + '\'' +
                    ", DoctorName='" + DoctorName + '\'' +
                    ", OrderStatus=" + OrderStatus +
                    ", OrderStatusText='" + OrderStatusText + '\'' +
                    ", DoctorId='" + DoctorId + '\'' +
                    ", OrderRefundStatus='" + OrderRefundStatus + '\'' +
                    ", OrderRefundStatusText='" + OrderRefundStatusText + '\'' +
                    ", RequestDate='" + RequestDate + '\'' +
                    ", RequestDateText='" + RequestDateText + '\'' +
                    ", OrderId='" + OrderId + '\'' +
                    ", OrderLockTime='" + OrderLockTime + '\'' +
                    ", DepartmentId='" + DepartmentId + '\'' +
                    ", HisUseSn='" + HisUseSn + '\'' +
                    ", Id='" + Id + '\'' +
                    ", AppointmentCode='" + AppointmentCode + '\'' +
                    ", AppointmentType=" + AppointmentType +
                    ", AppointmentTypeText='" + AppointmentTypeText + '\'' +
                    ", CreateTime='" + CreateTime + '\'' +
                    ", ClinicName='" + ClinicName + '\'' +
                    ", DoctorCode='" + DoctorCode + '\'' +
                    ", OrganizationId='" + OrganizationId + '\'' +
                    ", OrganizationName='" + OrganizationName + '\'' +
                    ", OrganizationCode='" + OrganizationCode + '\'' +
                    ", DepartmentName='" + DepartmentName + '\'' +
                    ", DepartmentCode='" + DepartmentCode + '\'' +
                    ", AppointmentDate='" + AppointmentDate + '\'' +
                    ", AppointmentDateText='" + AppointmentDateText + '\'' +
                    ", IsClinic='" + IsClinic + '\'' +
                    ", Noon=" + Noon +
                    ", NoonText='" + NoonText + '\'' +
                    ", StartTime='" + StartTime + '\'' +
                    ", EndTime='" + EndTime + '\'' +
                    ", PatientName='" + PatientName + '\'' +
                    ", Price=" + Price +
                    ", PriceText='" + PriceText + '\'' +
                    ", OrderAppointmentStatus=" + OrderAppointmentStatus +
                    ", OrderAppointmentStatusText='" + OrderAppointmentStatusText + '\'' +
                    ", RemainingDay=" + RemainingDay +
                    ", RemainingDayText='" + RemainingDayText + '\'' +
                    ", ClinicId='" + ClinicId + '\'' +
                    ", WeekDayText='" + WeekDayText + '\'' +
                    ", OrderAmountText='" + OrderAmountText + '\'' +
                    ", OrderAmount='" + OrderAmount + '\'' +
                    '}';
        }
    }
}
