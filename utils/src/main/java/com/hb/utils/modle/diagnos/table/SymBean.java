package com.hb.utils.modle.diagnos.table;

import java.io.Serializable;

public class SymBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer key_no;
	private String cvocable;
	private String description;
	private Integer conid;
	private Integer iszz;
	private Integer istz;
	private Integer isjy;
	private Integer isfb;
	private Integer isbs;
	private Integer iszs;

	private boolean isChecked;

	public SymBean(Integer key_no, String cvocable, String description, Integer conid, Integer iszz, Integer istz, Integer isjy, Integer isfb, Integer isbs, Integer iszs, boolean isChecked) {
		this.key_no = key_no;
		this.cvocable = cvocable;
		this.description = description;
		this.conid = conid;
		this.iszz = iszz;
		this.istz = istz;
		this.isjy = isjy;
		this.isfb = isfb;
		this.isbs = isbs;
		this.iszs = iszs;
		this.isChecked = isChecked;
	}

	public SymBean() {
	}

	public String getKey_no() {
		// 先将补足key_no为5位
		int x = 5 - (key_no+"").length();
		StringBuilder builder = new StringBuilder();
		for (; x > 0; x--) {
			builder.append("0");
		}
		return builder.toString() + key_no;
	}

	public void setKey_no(Integer key_no) {
		this.key_no = key_no;
	}

	public String getCvocable() {
		return cvocable;
	}

	public void setCvocable(String cvocable) {
		this.cvocable = cvocable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getConid() {
		return conid;
	}

	public void setConid(Integer conid) {
		this.conid = conid;
	}

	public Integer getIszz() {
		return iszz;
	}

	public void setIszz(Integer iszz) {
		this.iszz = iszz;
	}

	public Integer getIstz() {
		return istz;
	}

	public void setIstz(Integer istz) {
		this.istz = istz;
	}

	public Integer getIsjy() {
		return isjy;
	}

	public void setIsjy(Integer isjy) {
		this.isjy = isjy;
	}

	public Integer getIsfb() {
		return isfb;
	}

	public void setIsfb(Integer isfb) {
		this.isfb = isfb;
	}

	public Integer getIsbs() {
		return isbs;
	}

	public void setIsbs(Integer isbs) {
		this.isbs = isbs;
	}

	public Integer getIszs() {
		return iszs;
	}

	public void setIszs(Integer iszs) {
		this.iszs = iszs;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	@Override
	public String toString() {
		return "SymBean [key_no=" + key_no + ", cvocable=" + cvocable + ", description=" + description + ", conid=" + conid + ", iszz=" + iszz + ", istz=" + istz + ", isjy=" + isjy + ", isfb=" + isfb
				+ ", isbs=" + isbs + ", iszs=" + iszs + ", isChecked=" + isChecked + "]";
	}

	public boolean getIsChecked() {
		return this.isChecked;
	}

	public void setIsChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
}
