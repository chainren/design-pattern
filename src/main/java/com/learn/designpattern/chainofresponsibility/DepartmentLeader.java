package com.learn.designpattern.chainofresponsibility;

/**
 * 部门Leader
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public class DepartmentLeader implements IManager {

	/**
	 * 审批权限，3天之内
	 */
	public static final Integer authorityDays = 3;

	public void doApprove(VacationApply vacationApply, IApproveChain approveChain) {
		if (vacationApply.getDays() <= authorityDays) {
			System.out
					.println(String.format("部门负责人：同意%1s的%2s休假申请，休假天数%3s天", vacationApply.getDepartment(), vacationApply.getEmployeeName(), vacationApply.getDays()));
			return;
		} else {
			System.out.println(String.format("部门负责人：%1s的%2s休假申请超过%3s天，请部门经理审批", vacationApply.getDepartment(), vacationApply.getEmployeeName(), authorityDays));
			approveChain.doApprove(vacationApply);
		}
	}

}
