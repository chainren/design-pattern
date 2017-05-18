package com.learn.designpattern.builder;

/**
 * 
 * 
 * @author chenrg
 * @date 2017年5月17日
 */
public class Soldier {

	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 职业
	 */
	private Profession profession;
	/**
	 * 武器
	 */
	private Weapon weapon;
	/**
	 * 装备
	 */
	private Equipment equipment;

	private Uniform uniform;

	public Soldier() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Uniform getUniform() {
		return uniform;
	}

	public void setUniform(Uniform uniform) {
		this.uniform = uniform;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Soldier [name=");
		builder.append(name);
		builder.append(", profession=");
		builder.append(profession);
		builder.append(", weapon=");
		builder.append(weapon);
		builder.append(", equipment=");
		builder.append(equipment);
		builder.append(", uniform=");
		builder.append(uniform);
		builder.append("]");
		return builder.toString();
	}

}