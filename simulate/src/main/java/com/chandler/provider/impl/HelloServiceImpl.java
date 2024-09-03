package com.chandler.provider.impl;

import com.chandler.provider.api.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String userName) {
        return "Hello: " + userName;
    }
}
