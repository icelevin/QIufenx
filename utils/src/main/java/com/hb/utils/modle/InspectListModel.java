package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/12/22.
 */

public class InspectListModel extends BaseModel<InspectListModel.InspectList> {

    public static class InspectList implements Serializable{
        /// 检查结果列表

        public List<InspectSearchResponse> InspectList;

        /// 总数据量

        public int TotalCount;

        public List<InspectSearchResponse> getInspectList() {
            return InspectList;
        }

        public void setInspectList(List<InspectSearchResponse> inspectList) {
            InspectList = inspectList;
        }

        public int getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(int totalCount) {
            TotalCount = totalCount;
        }

        @Override
        public String toString() {
            return "InspectList{" +
                    "InspectList=" + InspectList +
                    ", TotalCount=" + TotalCount +
                    '}';
        }
    }


}
