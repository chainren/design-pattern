package com.learn.designpattern.proxy.jproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author chenrg
 * Created at 2019/9/26 16:26
 **/
public class JdkProxyClient {

    public static void main(String[] args) {
        Worker instance = (Worker) Proxy.newProxyInstance(JdkProxyClient.class.getClassLoader(), new Class[]{Worker.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Get args:" + Arrays.toString(args));
                        return proxy;
                    }
                });
        instance.work("fork");
    }
}
