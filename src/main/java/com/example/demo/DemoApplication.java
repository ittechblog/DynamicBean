package com.example.demo;

import com.example.demo.bean.UserService;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(DemoApplication.class, args);
//		UserService userService = applicationContext.getBean(UserService.class);
//		System.out.println(userService.getName());
//		System.out.println(userService);
//
//		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getBean("dynamicConfiguration");
//		beanFactory.destroySingleton("userService");
//		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserService.class);
//		beanDefinitionBuilder.addPropertyValue("name", "myConfigure1");
//		beanFactory.registerBeanDefinition("userService", beanDefinitionBuilder.getBeanDefinition());
//		userService = applicationContext.getBean(UserService.class);
//		System.out.println(userService.getName());
//		System.out.println(userService);

	}
}
