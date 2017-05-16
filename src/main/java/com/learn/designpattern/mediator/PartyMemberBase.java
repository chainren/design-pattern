package com.learn.designpattern.mediator;

/**
 * 
 * 
 * @author chenrg
 * @date 2017年5月16日
 */
public abstract class PartyMemberBase implements PartyMember {

	protected Party party;

	public void joinedParty(Party party) {
		System.out.println(this + " joins the party.");
		this.party = party;
	}

	public void partyAction(Action action) {
		System.out.println(this + " " + action.getDescription());
	}

	public void act(Action action) {
		if (party != null) {
			System.out.println(this + " " + action.toString());
			party.act(this, action);
		}
	}

	public abstract String toString();
}
