package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/22.
 */

public class InspectSearchDetailModel extends BaseModel<InspectSearchDetailModel.InspectSearchDetail> {
    public static class InspectSearchDetail implements Serializable {
        /// 报告医师

        public String ReportDoctor;

        /// 审核医师

        public String AuditDoctor;

        /// 检查部位

        public String InspectBody;

        /// 检查时间

        public String InspectTime;

        /// 影响所见

        public String InspectImage;

        /// 诊断

        public String InspectDiagnoses;

        /// 诊断建议

        public String InspectAdvise;

        public String getReportDoctor() {
            return ReportDoctor;
        }

        public void setReportDoctor(String reportDoctor) {
            ReportDoctor = reportDoctor;
        }

        public String getAuditDoctor() {
            return AuditDoctor;
        }

        public void setAuditDoctor(String auditDoctor) {
            AuditDoctor = auditDoctor;
        }

        public String getInspectBody() {
            return InspectBody;
        }

        public void setInspectBody(String inspectBody) {
            InspectBody = inspectBody;
        }

        public String getInspectTime() {
            return InspectTime;
        }

        public void setInspectTime(String inspectTime) {
            InspectTime = inspectTime;
        }

        public String getInspectImage() {
            return InspectImage;
        }

        public void setInspectImage(String inspectImage) {
            InspectImage = inspectImage;
        }

        public String getInspectDiagnoses() {
            return InspectDiagnoses;
        }

        public void setInspectDiagnoses(String inspectDiagnoses) {
            InspectDiagnoses = inspectDiagnoses;
        }

        public String getInspectAdvise() {
            return InspectAdvise;
        }

        public void setInspectAdvise(String inspectAdvise) {
            InspectAdvise = inspectAdvise;
        }

        @Override
        public String toString() {
            return "InspectSearchDetail{" +
                    "ReportDoctor='" + ReportDoctor + '\'' +
                    ", AuditDoctor='" + AuditDoctor + '\'' +
                    ", InspectBody='" + InspectBody + '\'' +
                    ", InspectTime='" + InspectTime + '\'' +
                    ", InspectImage='" + InspectImage + '\'' +
                    ", InspectDiagnoses='" + InspectDiagnoses + '\'' +
                    ", InspectAdvise='" + InspectAdvise + '\'' +
                    '}';
        }
    }
}
