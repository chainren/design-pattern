package com.learn.designpattern.mediator;

/**
 * 派对，角色：mediator
 * 
 * @author chenrg
 * @date 2017年5月16日
 */
public interface Party {

	/**
	 * 添加成员
	 * @param partyMember
	 * @author chenrg
	 * @date 2017年5月16日
	 */
	public void addMember(PartyMember partyMember);
	
	public void act(PartyMember partyMember, Action action);
}
