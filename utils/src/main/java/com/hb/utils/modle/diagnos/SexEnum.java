package com.hb.utils.modle.diagnos;

import java.io.Serializable;

/**
 * 性别
 * @author xianlai
 *
 */
public enum SexEnum  implements Serializable{
	man(1),woman(2),child(3);
	
	
	private int sex;
	 SexEnum(int sex){
		this.sex = sex;
	}
	public int getSex() {
		return sex;
	}
}
