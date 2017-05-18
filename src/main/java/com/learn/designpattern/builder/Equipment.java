package com.learn.designpattern.builder;

/**
 * 装备
 * 
 * @author chenrg
 * @date 2017年5月17日
 */
public enum Equipment {
	FIRST_AID_KIT, INTERPHONE, SIDEARM, MACHINERY;

	public String toString() {
		return name().toLowerCase();
	}
}
