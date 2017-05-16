package com.learn.designpattern.adapter;

/**
 * 日本标准电压电源
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public class JapanStandardPower implements IJapanStandardPower {

	public void chargeBy100Volt() {
		System.out.println("used japan standard volt,charge by 100 volt.");
	}
}
