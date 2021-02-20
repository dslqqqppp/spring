package cq.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cq.demo.config.MainConfig;


public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(MainConfig.class);
		System.out.println("ioc容器创建完成...");
		Object obj1 = applicationContext.getBean("person");
		Object obj2 = applicationContext.getBean("person");
		System.out.println(obj1 == obj2);
	}
}
