package com.pengfeng.test;

import com.spring.study.v2.AutowireBeanFactory;
import com.spring.study.v2.BeanFactory;
import com.spring.study.v2.BeanObject;
import org.junit.Test;

public class BeanFactoryTest1 {

    @Test
    public void test2(){

        //初始化bean工厂
        BeanFactory factory = new AutowireBeanFactory();

        //注册bean
        BeanObject objectBean = new BeanObject();
        objectBean.setBeanClassName("com.pengfeng.test.HelloWorldTest1");
        factory.registerBean("HelloWorldTest1",objectBean);


        //模拟spring获取bean
        HelloWorldTest1 helloWorldTest1 = (HelloWorldTest1) factory.getBean("HelloWorldTest1");
        helloWorldTest1.fn1();
    }
}
