package com.learn.designpattern.callback;

public class BusinessServiceImpl implements IBusinessService {

	public BaseResponseEntity execute(final BaseRequestEntity requestEntity) {
		return executeWithCallback(requestEntity, new IBusinessCallback() {
			public BaseResponseEntity doBusiness(BaseRequestEntity requestEntity) {
				System.out.println("query user by id : " + requestEntity.getId());
				BaseResponseEntity userEntity = new UserResponseEntity(1, "tom", "19381121", "new york", 28);
				System.out.println("user info : " + userEntity);
				return userEntity;
			}
		});
	}

	private BaseResponseEntity executeWithCallback(final BaseRequestEntity requestEntity, IBusinessCallback businessCallback) {
		// TODO do something
		System.out.println("prepare work");
		BaseResponseEntity responseEntity = businessCallback.doBusiness(requestEntity);
		System.out.println("finally work");
		return responseEntity;

	}

}
