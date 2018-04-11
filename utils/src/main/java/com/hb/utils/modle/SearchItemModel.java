package com.hb.utils.modle;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * 搜索词
 *
 * Created by txl on 2017/5/17 0017.
 *
 *
 *
 */
@Entity
public class SearchItemModel {

    @Id(autoincrement = true)
    private Long id = null;
    @Property
    private String text;
    @Property
    private int type;   //目前暂为0

    @Generated(hash = 508048800)
    public SearchItemModel(Long id, String text, int type) {
        this.id = id;
        this.text = text;
        this.type = type;
    }

    @Generated(hash = 892365029)
    public SearchItemModel() {
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SearchItemModel{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", type=" + type +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(int type) {
        this.type = type;
    }
}
