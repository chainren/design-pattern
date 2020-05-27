package com.learn.designpattern.listener;

/**
 * 事件
 * 
 * @author chenrg
 * @date 2018年4月3日
 */
public class Event {
	private Person person;

	public Event(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

}
