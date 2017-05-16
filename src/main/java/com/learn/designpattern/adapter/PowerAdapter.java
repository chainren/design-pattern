package com.learn.designpattern.adapter;

/**
 * 中国制造的电源适配器，以转换日产电源，使其符合中国电压标准
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public class PowerAdapter extends JapanStandardPower implements IChinaStandardPower {

	public void chargeBy220Volt() {
		super.chargeBy100Volt();
		System.out.println("do something for convert adapter,now it can be used 220 volt");
	}

}
