package com.learn.designpattern.adapter;

/**
 * <p>
 * adapter pattern
 * <p>
 * 使用中国标准电压的电源
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public interface IChinaStandardPower {

	/**
	 * 使用220V电压充电
	 * 
	 * @author chenrg
	 * @date 2017年5月5日
	 */
	public void chargeBy220Volt();
}
