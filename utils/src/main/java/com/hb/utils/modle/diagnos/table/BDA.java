package com.hb.utils.modle.diagnos.table;

import java.io.Serializable;

/**
 * 疾病
 * @author xianlai
 *
 */
public class BDA implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer partid;
	private Integer sex;
	private String key_no;
	private String cvo;
	private String py;


	public BDA(Integer partid, Integer sex, String key_no, String cvo, String py) {
		this.partid = partid;
		this.sex = sex;
		this.key_no = key_no;
		this.cvo = cvo;
		this.py = py;
	}
	public BDA() {
	}


	public Integer getPartid() {
		return partid;
	}
	public void setPartid(Integer partid) {
		this.partid = partid;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getKey_no() {
		return key_no;
	}
	public void setKey_no(String key_no) {
		this.key_no = key_no;
	}
	public String getCvo() {
		return cvo;
	}
	public void setCvo(String cvo) {
		this.cvo = cvo;
	}
	public String getPy() {
		return py;
	}
	public void setPy(String py) {
		this.py = py;
	}
	@Override
	public String toString() {
		return "DiagonsBean [partid=" + partid + ", sex=" + sex + ", key_no=" + key_no + ", cvo=" + cvo + ", py=" + py + "]";
	}
}
