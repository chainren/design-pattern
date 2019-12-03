package com.learn.designpattern.subscribe;

/**
 * 使用notifyAll，wait实现发布-订阅服务。
 *
 * @author chenrg
 * Created at 2019/12/2 17:53
 **/
public class App {

    public static void main(String[] args) {
        Topic topic = new Topic();
        new Thread(new Producer(topic)).start();
        new Thread(new Consumer(topic, "Consumer-1")).start();
        new Thread(new Consumer(topic, "Consumer-2")).start();
        new Thread(new Consumer(topic, "Consumer-3")).start();
    }
}
