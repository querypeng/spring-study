package com.pengfeng.test;

import com.spring.study.BeanFactory;
import com.spring.study.ObjectBean;
import org.junit.Test;

public class BeanFactoryTest {

    @Test
    public void test1(){
        //初始化bean
        BeanFactory beanFactory = new BeanFactory();

        //模拟初始化bean
        ObjectBean bean = new ObjectBean(new HelloWorldTest());
        beanFactory.registerBean("HelloWorldTest",bean);

        //模拟spring获取bean
        HelloWorldTest helloWorldTest = (HelloWorldTest) beanFactory.getBean("HelloWorldTest");
        helloWorldTest.fn1();
    }
}
