package com.learn.designpattern.callback;

/**
 * 业务服务接口
 * 
 * @author chenrg
 * @date 2017年5月10日
 */
public interface IBusinessService {

	/**
	 * 执行业务方法
	 * 
	 * @param requestEntity
	 * @author chenrg
	 * @date 2017年5月10日
	 */
	public BaseResponseEntity execute(BaseRequestEntity requestEntity);
}
