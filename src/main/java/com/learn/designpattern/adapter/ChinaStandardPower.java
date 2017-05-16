package com.learn.designpattern.adapter;

/**
 * 中国标准电压的电源实现
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public class ChinaStandardPower implements IChinaStandardPower {

	public void chargeBy220Volt() {
		System.out.println("used china standard volt,charge by 220 volt.");
	}

}
