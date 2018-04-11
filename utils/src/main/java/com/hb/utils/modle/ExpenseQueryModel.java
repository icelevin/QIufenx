package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/12/20.
 */

public class ExpenseQueryModel extends BaseModel<List<ExpenseQueryModel.ExpenseQuery>> implements Serializable {
    public static class ExpenseQuery implements Serializable {
        private String ConsumerDate;
        private String Total;
        private String GroupPrice;
        private List<ExpenseLogModel> Details;

        public String getGroupPrice() {
            return GroupPrice;
        }

        public void setGroupPrice(String groupPrice) {
            GroupPrice = groupPrice;
        }

        public String getConsumerDate() {
            return ConsumerDate;
        }

        public void setConsumerDate(String consumerDate) {
            ConsumerDate = consumerDate;
        }

        public String getTotal() {
            return Total;
        }

        public void setTotal(String total) {
            Total = total;
        }

        public List<ExpenseLogModel> getDetails() {
            return Details;
        }

        public void setDetails(List<ExpenseLogModel> details) {
            Details = details;
        }

        @Override
        public String toString() {
            return "ExpenseQuery{" + "ConsumerDate='" + ConsumerDate + '\'' + ", Total='" + Total + '\'' + ", GroupPrice='" + GroupPrice + '\'' +
                    ", Details=" + Details + '}';
        }

        public static class ExpenseLogModel implements Serializable {
            /// 处方ID
            /// </summary>
            private String ProjectId;
            /// <summary>
            /// 项目ID
            /// </summary>
            private String ItemId;
            /// <summary>
            /// 项目名称
            /// </summary>
            private String ItemName;
            /// <summary>
            /// 项目单价
            /// </summary>
            private String ItemPrice;
            /// <summary>
            /// 项目单位
            /// </summary>
            private String ItemUnit;
            /// <summary>
            /// 项目数量
            /// </summary>
            private String ItemCount;
            /// <summary>
            /// 项目小计
            /// </summary>
            private String TotalPrice;

            public String getProjectId() {
                return ProjectId;
            }

            public void setProjectId(String projectId) {
                ProjectId = projectId;
            }

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

            public String getItemPrice() {
                return ItemPrice;
            }

            public void setItemPrice(String itemPrice) {
                ItemPrice = itemPrice;
            }

            public String getItemUnit() {
                return ItemUnit;
            }

            public void setItemUnit(String itemUnit) {
                ItemUnit = itemUnit;
            }

            public String getItemCount() {
                return ItemCount;
            }

            public void setItemCount(String itemCount) {
                ItemCount = itemCount;
            }

            public String getTotalPrice() {
                return TotalPrice;
            }

            public void setTotalPrice(String totalPrice) {
                TotalPrice = totalPrice;
            }

            @Override
            public String toString() {
                return "ExpenseLogModel{" +
                        "ProjectId='" + ProjectId + '\'' +
                        ", ItemId='" + ItemId + '\'' +
                        ", ItemName='" + ItemName + '\'' +
                        ", ItemPrice='" + ItemPrice + '\'' +
                        ", ItemUnit='" + ItemUnit + '\'' +
                        ", ItemCount='" + ItemCount + '\'' +
                        ", TotalPrice='" + TotalPrice + '\'' +
                        '}';
            }
        }
    }


}