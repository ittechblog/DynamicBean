package com.example.demo.bean;

import com.example.demo.controller.IndexController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Administrator on 2017/10/6.
 */
@Configuration
public class Schedule {

    @Autowired
    private ApplicationContext applicationContext;
    int i = 1;

    @Scheduled(fixedDelay=8000)
    public void fixJob(){
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getBean("dynamicConfiguration");
        String[] beanNames = beanFactory.getBeanDefinitionNames();
        for (String beanName:beanNames) {
            beanFactory.destroyBean(beanName);
        }

        BeanDefinitionBuilder indexControllerDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(IndexController.class);
        BeanDefinitionBuilder userDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserService.class);
        userDefinitionBuilder.addPropertyValue("name", "myConfigure"+i);
        beanFactory.registerBeanDefinition("userService", userDefinitionBuilder.getBeanDefinition());
        beanFactory.registerBeanDefinition("indexController",indexControllerDefinitionBuilder.getBeanDefinition());
        i++;
    }
}
