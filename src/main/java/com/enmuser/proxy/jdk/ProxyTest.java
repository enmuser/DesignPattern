package com.enmuser.proxy.jdk;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        UserServiceImpl userService = new UserServiceImpl();

        UserInvockHandler invockHandler = new UserInvockHandler(userService);

        UserService instance = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), invockHandler);

        instance.sayHello();
    }
}
