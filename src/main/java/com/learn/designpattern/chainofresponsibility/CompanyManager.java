package com.learn.designpattern.chainofresponsibility;

public class CompanyManager implements IManager {

	/**
	 * 审批权限，7天之内
	 */
	public static final Integer authorityDays = 10;

	public void doApprove(VacationApply vacationApply, IApproveChain approveChain) {
		if (vacationApply.getDays() <= authorityDays) {
			System.out
					.println(String.format("公司总经理：同意%1s的%2s休假申请，休假天数%3s天", vacationApply.getDepartment(), vacationApply.getEmployeeName(), vacationApply.getDays()));
		} else {
			System.out.println(String.format("公司总经理：%1s的%2s休假申请超过%3s天，休假时间过长，不予通过", vacationApply.getDepartment(), vacationApply.getEmployeeName(), authorityDays));
		}
	}

}
