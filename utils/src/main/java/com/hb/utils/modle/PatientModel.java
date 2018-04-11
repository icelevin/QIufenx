package com.hb.utils.modle;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 就诊人
 * Created by txl on 2017/4/27 0027.
 */
public class PatientModel extends BaseModel<PatientModel.ResultData> {


    public static class ResultData {
        private List<Patient> Datas;

        public List<Patient> getDatas() {
            return Datas;
        }

        public void setDatas(List<Patient> datas) {
            Datas = datas;
        }

        @Override
        public String toString() {
            return "ResultData{" +
                    "Datas=" + Datas +
                    '}';
        }
    }

    /**
     * 证件类型枚举
     */
    public static enum IdType{
        IDCard(0,"身份证"),
        OfficersCard(1,"军官证"),
        PasportCard(2,"护照"),
        BirthCard(3,"出生证"),
        Other(5,"其他");
        private int id;
        private String typrName;
        private IdType(int id,String typrName){
            this.id = id;
            this.typrName = typrName;
        }

        public int getId(){
            return id;
        };
        public String getTyprName(){
            return typrName;
        }

        public static IdType getIdTypeById(int id){
            switch (id){
                case 0:
                    return IDCard;
                case 1:
                    return OfficersCard;
                case 2:
                    return PasportCard;
                case 3:
                    return BirthCard;
                default:
                    return Other;
            }
        }
    }

    /**
     * 性别枚举
     */
    public static enum Sex{
        man(1,"男"),woman(2,"女");

        private int id;
        private String sexText;

        private Sex(int id,String sexText){
            this.id = id;
            this.sexText = sexText;
        }

        public int getId(){
            return id;
        }

        public String getSexText(){
            return sexText;
        }

        public static String getSexTextById(int id){
            return id==1?"男":"女";
        }
    }

    /**
     * 成人枚举
     */
    public static enum PatientType{
        person(0,"成人"),child(1,"儿童");

        private int id;
        private String typeText;

        private PatientType(int id,String typeText){
            this.id = id;
            this.typeText = typeText;
        }

        public int getId(){
            return id;
        }

        public String getTypeText(){
            return typeText;
        }

        public static String getTypeTextById(int id){
            return id == 0?"成人":"儿童";
        }
    }

    public static class Patient implements Serializable{
        public static final int requestCode = 0x31;

        public Patient(){}

        public Patient(String id, String name) {
            Id = id;
            Name = name;
        }

        private int Age;
        @SerializedName(value = "birthDay", alternate = {"BirthDay"})
        private String birthDay;
        private String CellPhone;
        private String CellPhoneEncypt;
        private String IDTypeName;
        private String Id;
        private String IdCode;
        private String IdCodeEncypt;
        private int IdType;
        private String IdTypeName;
        private boolean IsDefault;
        private String Name;
        private int PatientType;   //就诊人类型 0 成人 1儿童
        private int Sex;
        private String SexName;
        private int TreadmentCards;

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            this.Age = age;
        }

        public String getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }

        public String getCellPhone() {
            return CellPhone;
        }

        public void setCellPhone(String cellPhone) {
            CellPhone = cellPhone;
        }

        public String getCellPhoneEncypt() {
            return CellPhoneEncypt;
        }

        public void setCellPhoneEncypt(String cellPhoneEncypt) {
            CellPhoneEncypt = cellPhoneEncypt;
        }

        public void setIDTypeName(String IDTypeName) {
            this.IDTypeName = IDTypeName;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getIdCode() {
            return IdCode;
        }

        public void setIdCode(String idCode) {
            IdCode = idCode;
        }

        public String getIdCodeEncypt() {
            return IdCodeEncypt;
        }

        public void setIdCodeEncypt(String idCodeEncypt) {
            IdCodeEncypt = idCodeEncypt;
        }

        public int getIdType() {
            return IdType;
        }

        public void setIdType(int idType) {
            IdType = idType;
        }

        public String getIdTypeName() {
            return IdTypeName;
        }

        public void setIdTypeName(String idTypeName) {
            IdTypeName = idTypeName;
        }

        public boolean isDefault() {
            return IsDefault;
        }

        public void setDefault(boolean aDefault) {
            IsDefault = aDefault;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getPatientType() {
            return PatientType;
        }

        public void setPatientType(int patientType) {
            PatientType = patientType;
        }

        public int getSex() {
            return Sex;
        }

        public void setSex(int sex) {
            Sex = sex;
        }

        public String getSexName() {
            return SexName;
        }

        public void setSexName(String sexName) {
            SexName = sexName;
        }

        public int getTreadmentCards() {
            return TreadmentCards;
        }

        public void setTreadmentCards(int treadmentCards) {
            TreadmentCards = treadmentCards;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "age='" + Age + '\'' +
                    ", birthDay='" + birthDay + '\'' +
                    ", CellPhone='" + CellPhone + '\'' +
                    ", CellPhoneEncypt='" + CellPhoneEncypt + '\'' +
                    ", IDTypeName='" + IDTypeName + '\'' +
                    ", Id='" + Id + '\'' +
                    ", IdCode='" + IdCode + '\'' +
                    ", IdCodeEncypt='" + IdCodeEncypt + '\'' +
                    ", IdType=" + IdType +
                    ", IdTypeName='" + IdTypeName + '\'' +
                    ", IsDefault='" + IsDefault + '\'' +
                    ", Name='" + Name + '\'' +
                    ", PatientType=" + PatientType +
                    ", Sex=" + Sex +
                    ", SexName='" + SexName + '\'' +
                    ", TreadmentCards=" + TreadmentCards +
                    '}';
        }

        @Override
        public int hashCode() {
            return Id.hashCode()+Name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null){
                return false;
            }
            if(!(obj instanceof Patient)){
                return false;
            }

            Patient pat = (Patient) obj;
            if(Id.equals(pat.getId()) && Name.equals(pat.getName())){
                return true;
            }
            return super.equals(obj);
        }
    }
}
