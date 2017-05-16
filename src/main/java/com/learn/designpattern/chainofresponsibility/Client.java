package com.learn.designpattern.chainofresponsibility;

/**
 * <p>
 * 责任链模式：消息在一组处理类间传递，直到最终被处理。而客户端不必知道消息具体被哪一个类进行处理。
 * <p>
 * 纯责任链：处于责任链上的类要么处理掉消息，要么直接将消息转给下一个类处理；
 * 不纯责任链：处于责任链上的类接收到消息会做部分处理，然后将消息转给下一个类处理，
 * 链上的类都可能对该消息做部分处理，直到最终被处理。比如servlet的Filter,FilterChain实现。
 * 
 * @author chenrg
 * @date 2017年5月12日
 */
public class Client {

	public static void main(String[] args) {
		IManager[] managers = new IManager[] { new DepartmentLeader(), new DepartMentManager(), new CompanyManager() };
		ApproveChain chain = new ApproveChain(managers);
		VacationApply vacationApply = new VacationApply("Tom", 5, "技术部");
		chain.doApprove(vacationApply);
	}
}
