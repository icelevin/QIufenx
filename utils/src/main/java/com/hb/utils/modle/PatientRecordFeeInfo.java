package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/25.
 */

/// 费用信息

public class PatientRecordFeeInfo implements Serializable {

    /// 总费用

    public String TotalPrice;


    /// 费用类型

    public String FeeType;


    /// 保险报销金额

    public String InsuranceOffer;


    /// 自费金额

    public String PayMoney;


    /// 医院优惠费用

    public String HospitalOffer;


    /// 其它优惠

    public String ElseOffer;

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getFeeType() {
        return FeeType;
    }

    public void setFeeType(String feeType) {
        FeeType = feeType;
    }

    public String getInsuranceOffer() {
        return InsuranceOffer;
    }

    public void setInsuranceOffer(String insuranceOffer) {
        InsuranceOffer = insuranceOffer;
    }

    public String getPayMoney() {
        return PayMoney;
    }

    public void setPayMoney(String payMoney) {
        PayMoney = payMoney;
    }

    public String getHospitalOffer() {
        return HospitalOffer;
    }

    public void setHospitalOffer(String hospitalOffer) {
        HospitalOffer = hospitalOffer;
    }

    public String getElseOffer() {
        return ElseOffer;
    }

    public void setElseOffer(String elseOffer) {
        ElseOffer = elseOffer;
    }

    @Override
    public String toString() {
        return "PatientRecordFeeInfo{" +
                "TotalPrice='" + TotalPrice + '\'' +
                ", FeeType='" + FeeType + '\'' +
                ", InsuranceOffer='" + InsuranceOffer + '\'' +
                ", PayMoney='" + PayMoney + '\'' +
                ", HospitalOffer='" + HospitalOffer + '\'' +
                ", ElseOffer='" + ElseOffer + '\'' +
                '}';
    }
}
