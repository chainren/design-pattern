package com.learn.designpattern.callback;

/**
 * 回调模式：
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public class Client {

	public static void main(String[] args) {
		IBusinessService businessService = new BusinessServiceImpl();
		BaseRequestEntity requestEntity = new UserRequestEntity(1);
		businessService.execute(requestEntity);
	}

}
