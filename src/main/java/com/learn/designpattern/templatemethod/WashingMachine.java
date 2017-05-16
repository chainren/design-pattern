package com.learn.designpattern.templatemethod;

/**
 * 洗衣机洗衣
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public class WashingMachine extends AbstractWashing {

	@Override
	public void dryClothes() {
		System.out.println("烘干，晾晒");
	}

	@Override
	public void washing() {
		System.out.println("step1:添加洗衣粉，放入衣服");
		System.out.println("step2:自动清洗，脱水");
	}

}
