package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/12/25.
 */

public class PriceItemSearchModel extends BaseModel<List<PriceItemSearchModel.PriceItemSearch>>{
    public static class PriceItemSearch implements Serializable{
        
        /// 收费项目ID
        
        public String Id ;
        
        /// 收费名目
        
        public String ItemName ;
        
        /// 是否医保
        
        public boolean IsInsurance ;
        
        /// 费用类型
        
        public String PriceType ;
        
        /// 检查提醒
        
        public String CheckRemind ;
        
        /// 收费价格
        
        public String Price ;
        
        /// 单位
        
        public String Unit ;
        
        /// 规格
        
        public String Spec ;

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getItemName() {
            return ItemName;
        }

        public void setItemName(String itemName) {
            ItemName = itemName;
        }

        public boolean isInsurance() {
            return IsInsurance;
        }

        public void setInsurance(boolean insurance) {
            IsInsurance = insurance;
        }

        public String getPriceType() {
            return PriceType;
        }

        public void setPriceType(String priceType) {
            PriceType = priceType;
        }

        public String getCheckRemind() {
            return CheckRemind;
        }

        public void setCheckRemind(String checkRemind) {
            CheckRemind = checkRemind;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String price) {
            Price = price;
        }

        public String getUnit() {
            return Unit;
        }

        public void setUnit(String unit) {
            Unit = unit;
        }

        public String getSpec() {
            return Spec;
        }

        public void setSpec(String spec) {
            Spec = spec;
        }

        @Override
        public String toString() {
            return "PriceItemSearch{" +
                    "Id='" + Id + '\'' +
                    ", ItemName='" + ItemName + '\'' +
                    ", IsInsurance=" + IsInsurance +
                    ", PriceType='" + PriceType + '\'' +
                    ", CheckRemind='" + CheckRemind + '\'' +
                    ", Price='" + Price + '\'' +
                    ", Unit='" + Unit + '\'' +
                    ", Spec='" + Spec + '\'' +
                    '}';
        }
    }
}
