package com.learn.designpattern.subscribe;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomUtils;

/**
 * 消费者，通过wait监听消息
 *
 * @author chenrg
 * Created at 2019/12/2 17:51
 **/
@AllArgsConstructor
public class Consumer implements Runnable {

    private Topic topic;

    private String name;

    public void run() {
        while (true) {
            synchronized (topic) {
                try {
                    topic.wait(RandomUtils.nextInt(100, 3000));
                    System.out.println(String.format("%s consume topic message : %s", name, topic.consume()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
