package com.learn.designpattern.proxy;

/**
 * 代理模式：给某一个对象提供一个代理 ，并由代理控制对原对象的引用。代理类可添加自己的部分处理逻辑，而不会影响到目标类的功能。
 * <p>
 * 代理模式在spring被大量使用。
 * <p>
 * 代理可分为动态代理和静态代理
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public class Client {

	public static void main(String[] args) {
		IManager manager = new Assistant();
		// 审批项目
		String projectName = "资金存管";
		manager.approveProject(projectName);
		System.out.println("--------------------------------------------------------------");
		// 分配任务
		String[] employees = new String[] { "吴风照", "付莹", "张美佳", "郭朝辉", "黄飞飞", "白灵" };
		String[] tasks = new String[] { "开户", "对账", "账户体系", "购买" };
		manager.allocatingResource(employees, tasks);
	}
}
