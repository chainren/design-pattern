package com.learn.designpattern.templatemethod;

/**
 * 洗衣服功能粗象类
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public abstract class AbstractWashing {

	/**
	 * 定义洗衣流程
	 * 
	 * @author chenrg
	 * @date 2017年5月11日
	 */
	public void washClothes() {
		this.washing();
		this.dryClothes();
	}

	/**
	 * 把衣服弄干
	 * 
	 * @param cleanClothes
	 * @author chenrg
	 * @date 2017年5月11日
	 */
	public abstract void dryClothes();

	/**
	 * 清洗衣服
	 * 
	 * @param clothes
	 * @return
	 * @author chenrg
	 * @date 2017年5月11日
	 */
	public abstract void washing();

}
