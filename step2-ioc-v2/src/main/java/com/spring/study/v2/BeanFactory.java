package com.spring.study.v2;

/**
 * @author pengfeng
 */
public interface BeanFactory {

    Object getBean(String name);

    void registerBean(String name, BeanObject bean);
}
