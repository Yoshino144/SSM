package top.pcat.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        System.out.println("在初始化之前执行postProcessBeforeInitialization");
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String
            beanName) throws BeansException {
        System.out.println("在初始化之后执行postProcessAfterInitialization");
        return bean;
    }
}
