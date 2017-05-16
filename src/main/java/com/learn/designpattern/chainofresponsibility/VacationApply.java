package com.learn.designpattern.chainofresponsibility;

import java.io.Serializable;

/**
 * 请假申请
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public class VacationApply implements Serializable {

	private static final long serialVersionUID = 1L;

	private String employeeName;
	private Integer days;
	private String department;

	public VacationApply() {

	}

	public VacationApply(String employeeName, Integer days, String department) {
		super();
		this.employeeName = employeeName;
		this.days = days;
		this.department = department;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
