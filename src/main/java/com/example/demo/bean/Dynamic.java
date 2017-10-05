package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/10/6.
 */
@Configuration
public class Dynamic {
    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public DefaultListableBeanFactory dynamicConfiguration() throws Exception
    {
        ConfigurableApplicationContext context = (ConfigurableApplicationContext)applicationContext;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory)context.getBeanFactory();
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserService.class);
        beanDefinitionBuilder.addPropertyValue("name", "myConfigure");
        beanFactory.registerBeanDefinition("userService", beanDefinitionBuilder.getBeanDefinition());
        return beanFactory;
    }
}
