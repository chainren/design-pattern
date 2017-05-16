package com.learn.designpattern.proxy;

import java.util.Random;

/**
 * 总经理
 * 
 * @author chenrg
 * @date 2017年5月5日
 */
public class GeneralManager implements IManager {

	public void approveProject(String projectName) {
		System.out.println(projectName + "审批通过");
	}

	public void allocatingResource(String[] employees, String[] tasks) {
		Random rand = new Random();
		for (int i = 0; i < tasks.length; i++) {
			System.out.println(tasks[i] + "由" + employees[rand.nextInt(tasks.length)] + "负责");
		}
	}

}
