package com.learn.designpattern.chainofresponsibility;

/**
 * 审批责任链
 * 
 * @author chenrg
 * @date 2017年5月12日
 */
public class ApproveChain implements IApproveChain {

	private IManager[] managers;

	private Integer managerIdx = 0;

	public ApproveChain(IManager[] managers) {
		super();
		this.managers = managers;
	}

	public void doApprove(VacationApply vacationApply) {
		if (managerIdx > managers.length) {
			return;
		}
		IManager manager = managers[managerIdx];
		managerIdx++;
		manager.doApprove(vacationApply, this);
	}
}
