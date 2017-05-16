package com.learn.designpattern.mediator;

/**
 * 中介者模式（调停者模式）：中介者模式定义了一个封装了一组对象间相互作用的对象，可以将系统之间复杂的关系简化，要通信的对象不必直接关联，
 * 而通过中介者对象进行通信，中介者实现了这些对象间如何进行通信。另一方面，这将导致中介者对象程序非常复杂。
 * <p>
 * 中介者模式是可以改变程序间运作行为的一种行为模式。
 * 
 * @author chenrg
 * @date 2017年5月16日
 */
public class Client {

	public static void main(String[] args) {
		Party party = new PartyImpl();
		Hunter hunter = new Hunter();
		Hobbit hobbit = new Hobbit();
		Rogue rogue = new Rogue();
		Wizard wizard = new Wizard();

		// add members to party
		party.addMember(hunter);
		party.addMember(hobbit);
		party.addMember(rogue);
		party.addMember(wizard);

		// member act
		hunter.act(Action.HUNT);
		hobbit.act(Action.ENEMY);
		rogue.act(Action.GOLD);
		wizard.act(Action.TALE);
	}
}
