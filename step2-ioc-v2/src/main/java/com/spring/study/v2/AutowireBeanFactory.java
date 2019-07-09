package com.spring.study.v2;

/**
 * Autowire注入有能力的bean
 * @author pengfeng
 */
public class AutowireBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object creatBean(BeanObject bean) {
        try {
            //此处的beanClass是在setBeanClassName的时候放值的
            Object o = bean.getBeanClass().newInstance();
            return o;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
