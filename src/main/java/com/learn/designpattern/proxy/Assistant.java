package com.learn.designpattern.proxy;

/**
 * 经理助理，代理总经理事务
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public class Assistant implements IManager {

	private IManager generalManager = new GeneralManager();

	/**
	 * 助理在代理总经理处理事务时，记录执行日志
	 * 
	 * @author chenrg
	 * @date 2017年5月5日
	 */
	private void recordMessage() {
		System.out.println("记录事务执行日志");
	}

	public void approveProject(String projectName) {
		recordMessage();
		generalManager.approveProject(projectName);
	}

	public void allocatingResource(String[] employees, String[] tasks) {
		recordMessage();
		generalManager.allocatingResource(employees, tasks);
	}

}
