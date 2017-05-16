package com.learn.designpattern.mediator;

/**
 * 派对成员
 * 
 * @author chenrg
 * @date 2017年5月16日
 */
public interface PartyMember {

	/**
	 * 加入派对
	 * 
	 * @param party
	 * @author chenrg
	 * @date 2017年5月16日
	 */
	public void joinedParty(Party party);

	/**
	 * 成员活动
	 * 
	 * @param action
	 * @author chenrg
	 * @date 2017年5月16日
	 */
	public void partyAction(Action action);

	/**
	 * 成员表演
	 * 
	 * @param action
	 * @author chenrg
	 * @date 2017年5月16日
	 */
	public void act(Action action);
}
