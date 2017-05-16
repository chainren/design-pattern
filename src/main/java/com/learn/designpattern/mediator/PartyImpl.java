package com.learn.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 派对实现类
 * 
 * @author chenrg
 * @date 2017年5月16日
 */
public class PartyImpl implements Party {

	private List<PartyMember> members;

	public PartyImpl() {
		this.members = new ArrayList<PartyMember>();
	}

	public void addMember(PartyMember partyMember) {
		members.add(partyMember);
		partyMember.joinedParty(this);
	}

	public void act(PartyMember partyMember, Action action) {
		for (PartyMember member : members) {
			if (member.equals(partyMember)) {
				member.partyAction(action);
			}
		}
	}

}
