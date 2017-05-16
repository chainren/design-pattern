package com.learn.designpattern.proxy;

/**
 * 经理接口
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public interface IManager {

	/**
	 * 审批项目
	 * 
	 * @author chenrg
	 * @date 2017年5月5日
	 */
	public void approveProject(String projectName);

	/**
	 * 分配资源
	 * 
	 * @author chenrg
	 * @date 2017年5月5日
	 */
	public void allocatingResource(String[] employees, String[] tasks);
}
