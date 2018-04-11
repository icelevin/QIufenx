package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by xianlai on 2017/1/13 0013.
 */
public class BaseModel<T> implements Serializable{
    public static final int successCode = 1;
    private int ResultCode = -1;
    private String Message = "操作失败，请检查您的网络";
    private int TotalCount;
    private String Code;
    private T ResultData;

    public T getResultData() {
        return ResultData;
    }

    public void setResultData(T resultData) {
        ResultData = resultData;
    }

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int resultCode) {
        ResultCode = resultCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int totalCount) {
        TotalCount = totalCount;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "ResultCode=" + ResultCode +
                ", Message='" + Message + '\'' +
                ", TotalCount=" + TotalCount +
                ", Code='" + Code + '\'' +
                ", ResultData=" + ResultData +
                '}';
    }
}
