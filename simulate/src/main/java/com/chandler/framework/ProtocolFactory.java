package com.chandler.framework;

import com.chandler.protocol.dubbo.DubboProtocol;
import com.chandler.protocol.http.HttpProtocol;

public class ProtocolFactory {

    public static Protocol getProtocol() {
        // 简单工厂模式
        // 扩展：工厂模式分为简单工厂、工厂方法、抽象工厂
        String name = System.getProperty("protocolName");
        if (name == null || name.equals("")) name = "http";
        switch (name) {
            case "http":
                return new HttpProtocol();
            case "dubbo":
                return new DubboProtocol();
            default:
                break;
        }
        return new HttpProtocol();
    }
}
