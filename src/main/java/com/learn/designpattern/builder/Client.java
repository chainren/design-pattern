package com.learn.designpattern.builder;

/**
 * 建造者模式:
 * <p>
 * 建造者模式是为了解决复杂对象的构建问题，这类对象通常会有多组不同参数的构造函数还满足不同对象构建需求。
 * 建造者承担了复杂对象的构造过程，它可以通过一步步为复杂对象设置参数最终完成对象构建，而且对于有参数设置顺序的对象构建要求更加灵活。
 * 
 * @author chenrg
 * @date 2017年5月18日
 */
public class Client {
	public static void main(String[] args) {
		SoldierBuilder sb = new SoldierBuilder("Joes", Profession.ARTILLERYMAN);
		Soldier artilleryman = sb.addWeapon(Weapon.ROCKET_GUN).addEquipment(Equipment.SIDEARM).addUniform(Uniform.ANTIEXPOSURE_SUIT).getSoldier();
		System.out.println(artilleryman);
		Soldier medic = new SoldierBuilder("Tom", Profession.MEDIC).addEquipment(Equipment.FIRST_AID_KIT).addUniform(Uniform.WHITE_CLOAK).addWeapon(Weapon.GUN)
				.getSoldier();
		System.out.println(medic);
	}
}
