package com.chandler.comsumer;

import com.chandler.framework.ProxyFactory;
import com.chandler.provider.api.HelloService;

public class Consumer {

    public static void main(String[] args) {
        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        String result = helloService.sayHello("chandler");
        System.out.println(result);

    }
}
