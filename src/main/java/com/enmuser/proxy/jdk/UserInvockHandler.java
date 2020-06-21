package com.enmuser.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserInvockHandler implements InvocationHandler {

    private UserService userService;

    public UserInvockHandler(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke.......");

        method.invoke(userService,args);
        System.out.println("After  invoke.......");

        return null;
    }
}
