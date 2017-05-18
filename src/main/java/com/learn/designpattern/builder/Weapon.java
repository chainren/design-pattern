package com.learn.designpattern.builder;

/**
 * 武器
 * 
 * @author chenrg
 * @date 2017年5月17日
 */
public enum Weapon {
	GUN, ROCKET_GUN, DAGGER, RIFLE;

	public String toString() {
		return this.name().toLowerCase();
	}
}
