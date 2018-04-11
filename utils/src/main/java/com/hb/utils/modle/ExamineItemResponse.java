package com.hb.utils.modle;

import java.io.Serializable;

/**
 * 检验明细model
 * Created by ice on 2017/12/21.
 */

public class ExamineItemResponse implements Serializable {

    /// 结果Id

    public String ItemId;

    /// 结果名称

    public String ItemName;

    /// 结果定量说明

    public String ItemResult;

    /// 结果单位

    public String ItemUnit;

    /// 结果定性说明

    public String ItemLevel;

    /// 结果定量参考说明

    public String ItemReference;

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemResult() {
        return ItemResult;
    }

    public void setItemResult(String itemResult) {
        ItemResult = itemResult;
    }

    public String getItemUnit() {
        return ItemUnit;
    }

    public void setItemUnit(String itemUnit) {
        ItemUnit = itemUnit;
    }

    public String getItemLevel() {
        return ItemLevel;
    }

    public void setItemLevel(String itemLevel) {
        ItemLevel = itemLevel;
    }

    public String getItemReference() {
        return ItemReference;
    }

    public void setItemReference(String itemReference) {
        ItemReference = itemReference;
    }

    @Override
    public String toString() {
        return "ExamineItemResponse{" +
                "ItemId='" + ItemId + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", ItemResult='" + ItemResult + '\'' +
                ", ItemUnit='" + ItemUnit + '\'' +
                ", ItemLevel='" + ItemLevel + '\'' +
                ", ItemReference='" + ItemReference + '\'' +
                '}';
    }
}
