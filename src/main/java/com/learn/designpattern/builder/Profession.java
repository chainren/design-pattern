package com.learn.designpattern.builder;

/**
 * 职业
 * 
 * @author chenrg
 * @date 2017年5月17日
 */
public enum Profession {
	RIFLEMAN("突击兵"),
	SCOUT("侦察兵"),
	ARTILLERYMAN("炮兵"),
	MEDIC("医务兵"),
	ENGINEER("工程兵");
	
	private String profession;
	
	private Profession(String profession){
		this.profession = profession;
	}
	
	@Override
	public String toString() {
		return profession;
	}

}
