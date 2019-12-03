package com.learn.designpattern.subscribe;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * 生产者，生产消息，并通过消息主题的notifyAll通知在该主题上等待的消费者
 *
 * @author chenrg
 * Created at 2019/12/2 17:41
 **/
@AllArgsConstructor
public class Producer implements Runnable {

    private final Topic topic;

    public void run() {
        while (true) {
            synchronized (topic) {
                topic.send(RandomStringUtils.randomAlphanumeric(32));
                topic.notifyAll();
                try {
                    Thread.sleep(RandomUtils.nextInt(100, 3000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
