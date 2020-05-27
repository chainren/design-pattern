package com.learn.designpattern.listener;

public class Person {

	private String name;

	private Listener listener;

	public Person(String name, Listener listener) {
		super();
		this.name = name;
		this.listener = listener;
	}

	public void run() {
		this.listener.doRun(new Event(this));
		System.out.println(this.name + " is runing");
	}

	public void eat() {
		this.listener.doEat(new Event(this));
		System.out.println(this.name + " is eating");
	}

	public String getName() {
		return name;
	}

}
