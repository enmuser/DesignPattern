package com.enmuser.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;

public class MetaSpaceTest {

    public static void main(String[] args) {
        //-XX:MaxMetaspaceSize=10m
        for (;;){

//            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");

            Enhancer enhancer = new Enhancer();

            enhancer.setUseCache(false);
            enhancer.setSuperclass(CglibSuperClass.class);
            enhancer.setCallback(new CglibInterceptor());
            CglibSuperClass spaceTest = (CglibSuperClass) enhancer.create();
            spaceTest.method();
        }
    }

}
