package com.chandler.provider;

import com.chandler.api.ProviderServiceInterface;
import com.chandler.api.User;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderService implements ProviderServiceInterface {

    public User getUser() {
        return new User("chandler");
    }
}
