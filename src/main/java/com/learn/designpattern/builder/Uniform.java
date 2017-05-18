package com.learn.designpattern.builder;

/**
 * 制服
 * 
 * @author chenrg
 * @date 2017年5月18日
 */
public enum Uniform {
	BDU, WHITE_CLOAK, ANTIEXPOSURE_SUIT;

	public String toString() {
		return this.name().toLowerCase();
	}
}
