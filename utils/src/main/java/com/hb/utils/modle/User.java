package com.hb.utils.modle;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by txl on 2017/2/17 0017.
 */
@Entity
public class User {
    @Id
    private String PassportId;
    @Property
    private String LoginName;
    @Property
    private String UserName;
    @Property
    private String UserToken;
    @Property
    private boolean isLogin;


    @Generated(hash = 914455115)
    public User(String PassportId, String LoginName, String UserName,
            String UserToken, boolean isLogin) {
        this.PassportId = PassportId;
        this.LoginName = LoginName;
        this.UserName = UserName;
        this.UserToken = UserToken;
        this.isLogin = isLogin;
    }

    @Generated(hash = 586692638)
    public User() {
    }


    public String getPassportId() {
        return PassportId;
    }

    public void setPassportId(String passportId) {
        PassportId = passportId;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserToken() {
        return UserToken;
    }

    public void setUserToken(String userToken) {
        UserToken = userToken;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "PassportId='" + PassportId + '\'' +
                ", LoginName='" + LoginName + '\'' +
                ", UserName='" + UserName + '\'' +
                ", UserToken='" + UserToken + '\'' +
                ", isLogin=" + isLogin +
                '}';
    }

    public boolean getIsLogin() {
        return this.isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
}
