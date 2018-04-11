package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/12/21.
 */

public class ExamineListModel extends BaseModel<ExamineListModel.ExamineList> {
    public static class ExamineList implements Serializable {
        /// 检验结果列表
        public List<ExamineSearchResponse> ExamineSearchList;
        /// 数据总条数
        public int TotalCount;

        public List<ExamineSearchResponse> getExamineSearchList() {
            return ExamineSearchList;
        }

        public void setExamineSearchList(List<ExamineSearchResponse> examineSearchList) {
            ExamineSearchList = examineSearchList;
        }

        public int getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(int totalCount) {
            TotalCount = totalCount;
        }

        @Override
        public String toString() {
            return "ExamineList{" +
                    "ExamineSearchList=" + ExamineSearchList +
                    ", TotalCount=" + TotalCount +
                    '}';
        }



    }


}
