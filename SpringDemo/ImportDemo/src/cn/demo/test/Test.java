package cn.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.demo.config.MainConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] beanDefinitionNamesForConfig = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNamesForConfig) {
			System.out.println("beanName: " + beanName);
		}
	}
}
