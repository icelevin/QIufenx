package com.hb.utils.modle;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 *
 * 缓存模型
 * Created by txl on 2017/5/14 0014.
 */
@Entity
public class CacheModle {
    @Id
    private String url;
    @Property
    private String response;

    @Generated(hash = 710985397)
    public CacheModle(String url, String response) {
        this.url = url;
        this.response = response;
    }

    @Generated(hash = 408714645)
    public CacheModle() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "CacheModle{" +
                "url='" + url + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
