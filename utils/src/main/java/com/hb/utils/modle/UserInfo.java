package com.hb.utils.modle;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by txl on 2017/4/26 0026.
 */
@Entity
public class UserInfo {
    @Id
    private String PassportId;
    @Property
    private String RealName;
    @Property
    private String CellPhone;
    @Property
    private String Sex;
    @Property
    private String SexName;
    @Property
    private String Icon;
    @Property
    private String IsAuthen;
    @Property
    private String NickName;
    @Property
    private String Email;
    @Property
    private String LoginName;
    @Property
    private String RegisterTime;
    @Property
    private String IdType;
    @Property
    private String IdTypeText;
    @Property
    private String IdNum;
    @Property
    private String PatientId;
    @Property
    private String AuthenPhone;
    @Property
    private String AuthenEmail;
    @Property
    private String BirthDay;

    @Generated(hash = 1087908604)
    public UserInfo(String PassportId, String RealName, String CellPhone,
            String Sex, String SexName, String Icon, String IsAuthen,
            String NickName, String Email, String LoginName, String RegisterTime,
            String IdType, String IdTypeText, String IdNum, String PatientId,
            String AuthenPhone, String AuthenEmail, String BirthDay) {
        this.PassportId = PassportId;
        this.RealName = RealName;
        this.CellPhone = CellPhone;
        this.Sex = Sex;
        this.SexName = SexName;
        this.Icon = Icon;
        this.IsAuthen = IsAuthen;
        this.NickName = NickName;
        this.Email = Email;
        this.LoginName = LoginName;
        this.RegisterTime = RegisterTime;
        this.IdType = IdType;
        this.IdTypeText = IdTypeText;
        this.IdNum = IdNum;
        this.PatientId = PatientId;
        this.AuthenPhone = AuthenPhone;
        this.AuthenEmail = AuthenEmail;
        this.BirthDay = BirthDay;
    }

    @Generated(hash = 1279772520)
    public UserInfo() {
    }

    public String getPassportId() {
        return PassportId;
    }

    public void setPassportId(String passportId) {
        PassportId = passportId;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(String cellPhone) {
        CellPhone = cellPhone;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getSexName() {
        return SexName;
    }

    public void setSexName(String sexName) {
        SexName = sexName;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getIsAuthen() {
        return IsAuthen;
    }

    public void setIsAuthen(String isAuthen) {
        IsAuthen = isAuthen;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getRegisterTime() {
        return RegisterTime;
    }

    public void setRegisterTime(String registerTime) {
        RegisterTime = registerTime;
    }

    public String getIdType() {
        return IdType;
    }

    public void setIdType(String idType) {
        IdType = idType;
    }

    public String getIdTypeText() {
        return IdTypeText;
    }

    public void setIdTypeText(String idTypeText) {
        IdTypeText = idTypeText;
    }

    public String getIdNum() {
        return IdNum;
    }

    public void setIdNum(String idNum) {
        IdNum = idNum;
    }

    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String patientId) {
        PatientId = patientId;
    }

    public String getAuthenPhone() {
        return AuthenPhone;
    }

    public void setAuthenPhone(String authenPhone) {
        AuthenPhone = authenPhone;
    }

    public String getAuthenEmail() {
        return AuthenEmail;
    }

    public void setAuthenEmail(String authenEmail) {
        AuthenEmail = authenEmail;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "PassportId='" + PassportId + '\'' +
                ", RealName='" + RealName + '\'' +
                ", CellPhone='" + CellPhone + '\'' +
                ", Sex='" + Sex + '\'' +
                ", SexName='" + SexName + '\'' +
                ", Icon='" + Icon + '\'' +
                ", IsAuthen='" + IsAuthen + '\'' +
                ", NickName='" + NickName + '\'' +
                ", Email='" + Email + '\'' +
                ", LoginName='" + LoginName + '\'' +
                ", RegisterTime='" + RegisterTime + '\'' +
                ", IdType='" + IdType + '\'' +
                ", IdTypeText='" + IdTypeText + '\'' +
                ", IdNum='" + IdNum + '\'' +
                ", PatientId='" + PatientId + '\'' +
                ", AuthenPhone='" + AuthenPhone + '\'' +
                ", AuthenEmail='" + AuthenEmail + '\'' +
                ", BirthDay='" + BirthDay + '\'' +
                '}';
    }
}
