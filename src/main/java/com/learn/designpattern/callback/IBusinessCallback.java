package com.learn.designpattern.callback;

/**
 * 业务回调
 * 
 * @author chenrg
 * @date 2017年5月10日
 */
public interface IBusinessCallback {

	/**
	 * 执行业务，并返回结果
	 * 
	 * @param requestEntity
	 * @return
	 * @author chenrg
	 * @date 2017年5月10日
	 */
	public BaseResponseEntity doBusiness(BaseRequestEntity requestEntity);

}
