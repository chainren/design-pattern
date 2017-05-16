package com.learn.designpattern.adapter;

/**
 * 适配器模式：适配器使两个互不兼容的接口能够正常工作。通过适配器的功能转换，新接口能够使用一个已存在的接口实现。
 * <p>
 * 适配器的实现方式：1).适配器类继承原有实现，并实现新接口，在新接口实现中调用原有实现方法，并做相应功能转换。
 * 2).适配器通过组合原有实现，在新接口实现中调用原有实现并做相应功能转换。
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public class Client {

	public static void main(String[] args) {
		IChinaStandardPower power = new PowerAdapter();
		power.chargeBy220Volt();
	}

}
