package com.learn.designpattern.chainofresponsibility;

public interface IApproveChain {

	/**
	 * 进行审批
	 * 
	 * @param vacationApply
	 * @author chenrg
	 * @date 2017年5月11日
	 */
	public void doApprove(VacationApply vacationApply);

}
