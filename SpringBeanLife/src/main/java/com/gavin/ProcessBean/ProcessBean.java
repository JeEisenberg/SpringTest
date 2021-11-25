package com.gavin.ProcessBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ProcessBean  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前");
        System.out.println("这里必须返回bean,否则bean就会传不到下一步");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后");

        System.out.println("这里必须返回bean,否则bean就会传不到下一步");
        return bean;
    }
}
