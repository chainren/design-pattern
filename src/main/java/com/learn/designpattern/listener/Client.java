package com.learn.designpattern.listener;

public class Client {
	public static void main(String[] args) {

		Person p = new Person("chenrg", new PersonListener());

		p.run();

		p.eat();
	}
}
