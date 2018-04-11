package com.hb.utils.modle.diagnos.table;

import java.io.Serializable;

/**
 * 疾病
 * @author xianlai
 *
 */
public class ILL implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer key_no;
	private String tit;
	private String dept;
	private String cvocable;
	private String symlink;
	private String nosymlink;
	private String xml;
	public int number;

	public ILL(Integer key_no, String tit, String dept, String cvocable, String symlink, String nosymlink, String xml, int number) {
		this.key_no = key_no;
		this.tit = tit;
		this.dept = dept;
		this.cvocable = cvocable;
		this.symlink = symlink;
		this.nosymlink = nosymlink;
		this.xml = xml;
		this.number = number;
	}
	public ILL() {
	}
	
	public Integer getKey_no() {
		return key_no;
	}
	public void setKey_no(Integer key_no) {
		this.key_no = key_no;
	}
	public String getTit() {
		return tit;
	}
	public void setTit(String tit) {
		this.tit = tit;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCvocable() {
		return cvocable;
	}
	public void setCvocable(String cvocable) {
		this.cvocable = cvocable;
	}
	public String getSymlink() {
		return symlink;
	}
	public void setSymlink(String symlink) {
		this.symlink = symlink;
	}
	public String getNosymlink() {
		return nosymlink;
	}
	public void setNosymlink(String nosymlink) {
		this.nosymlink = nosymlink;
	}
	
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	@Override
	public String toString() {
		return "ILL [key_no=" + key_no + ", tit=" + tit + ", dept=" + dept + ", cvocable=" + cvocable + ", symlink=" + symlink + ", nosymlink=" + nosymlink + ", xml=" + xml + ", number=" + number
				+ "]";
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
