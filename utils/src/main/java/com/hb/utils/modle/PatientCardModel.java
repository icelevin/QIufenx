package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 就诊卡
 * Created by txl on 2017/4/28 0028.
 */
public class PatientCardModel extends BaseModel<PatientCardModel.ResultData> {

    public static class ResultData{
        private List<Card> Datas;

        public List<Card> getDatas() {
            return Datas;
        }

        public void setDatas(List<Card> Datas) {
            this.Datas = Datas;
        }

        @Override
        public String toString() {
            return "ResultData{" +
                    "datas=" + Datas +
                    '}';
        }
    }

    public static class Card implements Serializable{
        private String CardNum;
        private String Id;
        private String OrganizationName;
        private String PatientId;
        private String PatientName;
        private String OrganizationLogoUrl;
        private int Sex;
        private String SexText;

        public int getSex() {
            return Sex;
        }

        public void setSex(int sex) {
            Sex = sex;
        }

        public String getSexText() {
            return SexText;
        }

        public void setSexText(String sexText) {
            SexText = sexText;
        }

        public String getOrganizationLogoUrl() {
            return OrganizationLogoUrl;
        }

        public void setOrganizationLogoUrl(String organizationLogoUrl) {
            OrganizationLogoUrl = organizationLogoUrl;
        }

        public String getCardNum() {
            return CardNum;
        }

        public void setCardNum(String cardNum) {
            CardNum = cardNum;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getOrganizationName() {
            return OrganizationName;
        }

        public void setOrganizationName(String organizationName) {
            OrganizationName = organizationName;
        }

        public String getPatientId() {
            return PatientId;
        }

        public void setPatientId(String patientId) {
            PatientId = patientId;
        }

        public String getPatientName() {
            return PatientName;
        }

        public void setPatientName(String patientName) {
            PatientName = patientName;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "CardNum='" + CardNum + '\'' +
                    ", Id='" + Id + '\'' +
                    ", OrganizationName='" + OrganizationName + '\'' +
                    ", PatientId='" + PatientId + '\'' +
                    ", PatientName='" + PatientName + '\'' +
                    ", OrganizationLogoUrl='" + OrganizationLogoUrl + '\'' +
                    ", Sex=" + Sex +
                    ", SexText='" + SexText + '\'' +
                    '}';
        }
    }
}
