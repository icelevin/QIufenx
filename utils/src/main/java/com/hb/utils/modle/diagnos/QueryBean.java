package com.hb.utils.modle.diagnos;


import com.hb.utils.modle.diagnos.table.BDA;
import com.hb.utils.modle.diagnos.table.SymBean;

import java.io.Serializable;
import java.util.List;


/**
 * 传递的数据
 * @author xianlai
 *
 */
public class QueryBean implements Serializable{
	private SexEnum sex;
	private String partid;
	private BDA zz;
	private SymBean qb;
	private List<SymBean> fz;
	
	public SexEnum getSex() {
		return sex;
	}
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	public String getPartid() {
		return partid;
	}
	public void setPartid(String partid) {
		this.partid = partid;
	}
	public BDA getZz() {
		return zz;
	}
	public void setZz(BDA zz) {
		this.zz = zz;
	}
	public SymBean getQb() {
		return qb;
	}
	public void setQb(SymBean qb) {
		this.qb = qb;
	}
	public List<SymBean> getFz() {
		return fz;
	}
	public void setFz(List<SymBean> fz) {
		this.fz = fz;
	}
	@Override
	public String toString() {
		return "QueryBean [sex=" + sex + ", partid=" + partid + ", zz=" + zz + ", qb=" + qb + ", fz=" + fz + "]";
	}
}
