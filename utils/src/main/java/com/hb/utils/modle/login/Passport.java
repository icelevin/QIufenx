package com.hb.utils.modle.login;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by txl on 2018/3/16 0016.
 */
@Entity
public class Passport {
    @Id
    private String PassportId;
    @Property
    private String PassportName;
    @Property
    private String AuthenPhone;
    @Property
    private String AuthenIdCode;

    @Generated(hash = 2113340325)
    public Passport(String PassportId, String PassportName, String AuthenPhone, String AuthenIdCode) {
        this.PassportId = PassportId;
        this.PassportName = PassportName;
        this.AuthenPhone = AuthenPhone;
        this.AuthenIdCode = AuthenIdCode;
    }

    @Generated(hash = 735945438)
    public Passport() {
    }

    public String getPassportId() {
        return PassportId;
    }

    public void setPassportId(String passportId) {
        PassportId = passportId;
    }

    public String getPassportName() {
        return PassportName;
    }

    public void setPassportName(String passportName) {
        PassportName = passportName;
    }

    public String getAuthenPhone() {
        return AuthenPhone;
    }

    public void setAuthenPhone(String authenPhone) {
        AuthenPhone = authenPhone;
    }

    public String getAuthenIdCode() {
        return AuthenIdCode;
    }

    public void setAuthenIdCode(String authenIdCode) {
        AuthenIdCode = authenIdCode;
    }

    @Override
    public String toString() {
        return "Passport{" + "PassportId='" + PassportId + '\'' + ", PassportName='" + PassportName + '\'' + ", AuthenPhone='" + AuthenPhone +
                '\'' + ", AuthenIdCode='" + AuthenIdCode + '\'' + '}';
    }
}
