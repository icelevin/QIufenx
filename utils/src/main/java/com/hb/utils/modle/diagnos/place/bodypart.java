package com.hb.utils.modle.diagnos.place;

import java.io.Serializable;

/**
 * 部位
 * @author xianlai
 *
 */
public class bodypart implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer isleaf;
	private Integer superid;
	private String sex;
	public boolean isChecked;


	public bodypart(Integer id, String name, Integer isleaf, Integer superid, String sex, boolean isChecked) {
		this.id = id;
		this.name = name;
		this.isleaf = isleaf;
		this.superid = superid;
		this.sex = sex;
		this.isChecked = isChecked;
	}
	public bodypart() {
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIsleaf() {
		return isleaf;
	}
	public void setIsleaf(Integer isleaf) {
		this.isleaf = isleaf;
	}
	public Integer getSuperid() {
		return superid;
	}
	public void setSuperid(Integer superid) {
		this.superid = superid;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "PartBean [id=" + id + ", name=" + name + ", isleaf=" + isleaf + ", superid=" + superid + ", sex=" + sex + "]";
	}
	public boolean getIsChecked() {
		return this.isChecked;
	}
	public void setIsChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
}
