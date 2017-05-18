package com.learn.designpattern.builder;

public class SoldierBuilder {

	private Soldier soldier;

	public SoldierBuilder(String name, Profession profession) {
		soldier = new Soldier();
		soldier.setName(name);
		soldier.setProfession(profession);
	}

	public SoldierBuilder addWeapon(Weapon weapon) {
		this.soldier.setWeapon(weapon);
		return this;
	}

	public SoldierBuilder addEquipment(Equipment equipment) {
		this.soldier.setEquipment(equipment);
		return this;
	}

	public SoldierBuilder addUniform(Uniform uniform) {
		this.soldier.setUniform(uniform);
		return this;
	}

	public Soldier getSoldier() {
		return this.soldier;
	}

}
