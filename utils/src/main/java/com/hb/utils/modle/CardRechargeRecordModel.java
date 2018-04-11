package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by txl on 2017/12/26 0026.
 */

public class CardRechargeRecordModel extends BaseModel<List<CardRechargeRecordModel.CardRechargRecord>> {

    public static final class CardRechargRecord implements Serializable{
        /// 组织机构名称
        public String ShortName;

        /// 就诊卡号
        public String RechargeTarget;

        /// 就诊人姓名
        public String Name;

        /// 充值状态
        public long PaymentStatus;

        /// 支付状态
        public String PaymentstatusText;
        /// 充值金额
        public long PayMoney;

        public String PayMoneyText;

        /// 订单号
        public String OrderNo;

        /// 支付时间
        public String OrderTime;

        public String getShortName() {
            return ShortName;
        }

        public void setShortName(String shortName) {
            ShortName = shortName;
        }

        public String getRechargeTarget() {
            return RechargeTarget;
        }

        public void setRechargeTarget(String rechargeTarget) {
            RechargeTarget = rechargeTarget;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public long getPaymentStatus() {
            return PaymentStatus;
        }

        public void setPaymentStatus(long paymentStatus) {
            PaymentStatus = paymentStatus;
        }

        public String getPaymentstatusText() {
            return PaymentstatusText;
        }

        public void setPaymentstatusText(String paymentstatusText) {
            PaymentstatusText = paymentstatusText;
        }

        public long getPayMoney() {
            return PayMoney;
        }

        public void setPayMoney(long payMoney) {
            PayMoney = payMoney;
        }

        public String getPayMoneyText() {
            return PayMoneyText;
        }

        public void setPayMoneyText(String payMoneyText) {
            PayMoneyText = payMoneyText;
        }

        public String getOrderNo() {
            return OrderNo;
        }

        public void setOrderNo(String orderNo) {
            OrderNo = orderNo;
        }

        public String getOrderTime() {
            return OrderTime;
        }

        public void setOrderTime(String orderTime) {
            OrderTime = orderTime;
        }

        @Override
        public String toString() {
            return "CardRechargRecord{" + "ShortName='" + ShortName + '\'' + ", RechargeTarget='" + RechargeTarget + '\'' + ", Name='" + Name +
                    '\'' + ", PaymentStatus=" + PaymentStatus + ", PaymentstatusText='" + PaymentstatusText + '\'' + ", PayMoney=" + PayMoney + ", " +
                    "PayMoneyText='" + PayMoneyText + '\'' + ", OrderNo='" + OrderNo + '\'' + ", OrderTime='" + OrderTime + '\'' + '}';
        }
    }

}
