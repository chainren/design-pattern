package com.learn.designpattern.templatemethod;

/**
 * 妈妈给家里洗衣服
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public class Mother {

	private AbstractWashing washMethod;

	public Mother() {
	}

	public Mother(AbstractWashing washMethod) {
		this.washMethod = washMethod;
	}

	public void washClothes() {
		washMethod.washClothes();
	}

	public void setWashMethod(AbstractWashing washMethod) {
		this.washMethod = washMethod;
	}

}
