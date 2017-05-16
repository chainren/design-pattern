package com.learn.designpattern.templatemethod;

public class HandWash extends AbstractWashing {

	@Override
	public void dryClothes() {
		System.out.println("拧干，晾晒");
	}

	@Override
	public void washing() {
		System.out.println("step1:洗衣粉浸泡");
		System.out.println("step2:手动揉搓");
		System.out.println("step3:漂洗");
	}

}
