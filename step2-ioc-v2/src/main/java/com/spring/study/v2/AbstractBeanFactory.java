package com.spring.study.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 定义一个抽象类来做getbean 注册bean操作
 * @author pengfeng
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    private Map<String, BeanObject> map = new ConcurrentHashMap<String, BeanObject>();

    @Override
    public Object getBean(String name) {
        return map.get(name).getBean();
    }

    /**
     * 做三件事:
     * 1.创建bean对象
     * 2.将对象放进ObjectBean
     * 3.放进map中
     * @param name
     * @param bean
     */
    @Override
    public void registerBean(String name, BeanObject bean) {
        Object creatBean = this.creatBean(bean);
        bean.setBean(creatBean);
        map.put(name,bean);
    }

    protected abstract Object creatBean(BeanObject bean);
}
