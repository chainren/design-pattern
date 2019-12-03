package com.learn.designpattern.subscribe;

import lombok.ToString;

/**
 * 消息主题，生产者和消费者持有该对象的引用，并通过notifyAll和wait
 * @author chenrg
 * Created at 2019/12/2 17:45
 **/
@ToString
public class Topic {

    private String message;

    public void send(String message) {
        this.message = message;
    }

    public String consume() {
        return this.message;
    }

}
