package com.learn.designpattern.templatemethod;

/**
 * 模板方法模式：模板方法一般由粗象类定义一组算法的框架，算法的实现类实现该算法的粗象方法
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public class Client {

	public static void main(String[] args) {
		Mother mother = new Mother();
		AbstractWashing washMethod = new HandWash();
		mother.setWashMethod(washMethod);
		System.out.println("以前，妈妈用手洗衣服，很辛苦");
		mother.washClothes();
		System.out.println("后来，家里买了台洗衣服，减轻了妈妈的负担");
		washMethod = new WashingMachine();
		mother.setWashMethod(washMethod);
		mother.washClothes();
	}

}
