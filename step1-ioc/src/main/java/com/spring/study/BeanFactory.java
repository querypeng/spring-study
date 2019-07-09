package com.spring.study;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author pengfeng
 */
public class BeanFactory {

    private Map<String, ObjectBean> map = new ConcurrentHashMap<String, ObjectBean>();

    /**
     * 模拟spring注册bean
     */
    public void registerBean(String name, ObjectBean bean) {
        map.put(name, bean);
    }

    /**
     * bean工厂获取bean
     */
    public Object getBean(String name) {
        return map.get(name).getBean();
    }
}
