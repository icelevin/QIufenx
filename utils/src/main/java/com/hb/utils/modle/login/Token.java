package com.hb.utils.modle.login;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by txl on 2018/3/16 0016.
 */
@Entity
public class Token {
    @Property
    private String TokenCode;
    @Property
    private String OAuthCode;


    @Generated(hash = 1059509622)
    public Token(String TokenCode, String OAuthCode) {
        this.TokenCode = TokenCode;
        this.OAuthCode = OAuthCode;
    }

    @Generated(hash = 79808889)
    public Token() {
    }


    public String getOAuthCode() {
        return OAuthCode;
    }

    public void setOAuthCode(String OAuthCode) {
        this.OAuthCode = OAuthCode;
    }

    public String getTokenCode() {
        return TokenCode;
    }

    public void setTokenCode(String tokenCode) {
        TokenCode = tokenCode;
    }

    @Override
    public String toString() {
        return "Token{" + "TokenCode='" + TokenCode + '\'' + ", OAuthCode='" + OAuthCode + '\'' + '}';
    }
}
