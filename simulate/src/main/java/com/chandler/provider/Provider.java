package com.chandler.provider;

import com.chandler.framework.Protocol;
import com.chandler.framework.ProtocolFactory;
import com.chandler.framework.URL;
import com.chandler.provider.api.HelloService;
import com.chandler.provider.impl.HelloServiceImpl;
import com.chandler.register.LocalRegister;
import com.chandler.register.RemoteMapRegister;

public class Provider {

    private static boolean isRun = true;

    public static void main(String[] args) {
        // 1. 注册服务
        // 2. 本地注册
        // 3. 启动tomcat

        // 注册服务
        URL url = new URL("localhost", 8080);
        RemoteMapRegister.regist(HelloService.class.getName(), url);

        //  服务：实现类
        LocalRegister.regist(HelloService.class.getName(), HelloServiceImpl.class);

        Protocol protocol = ProtocolFactory.getProtocol();
        protocol.start(url);



    }
}
