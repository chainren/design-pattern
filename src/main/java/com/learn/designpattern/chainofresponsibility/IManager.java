package com.learn.designpattern.chainofresponsibility;

/**
 * 公司管理人员接口
 * 
 * @author chenrg
 * @date 2017年5月11日
 */
public interface IManager {

	/**
	 * 管理人员审批
	 * 
	 * @param vacationApply
	 * @param approveChain
	 * @author chenrg
	 * @date 2017年5月11日
	 */
	public void doApprove(VacationApply vacationApply, IApproveChain approveChain);

}
