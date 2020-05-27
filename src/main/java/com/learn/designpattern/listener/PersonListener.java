package com.learn.designpattern.listener;

public class PersonListener implements Listener {

	public void doRun(Event e) {
		System.out.println("before " + e.getPerson().getName() + " runing, please put on your shoes.");
	}

	public void doEat(Event e) {
		System.out.println("before " + e.getPerson().getName() + " eating, please rinse you hands.");
	}

}
