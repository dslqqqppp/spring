package co.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.demo.config.MainConfig;


public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Object obj1 = applicationContext.getBean("colorFactoryBean");
		System.out.println("bean的类型:"+obj1.getClass());
		//因为FactoryBean中设置isSingleton()为true(单例)，所以两次获取对象是相等的
		Object obj2 = applicationContext.getBean("colorFactoryBean");
		System.out.println(obj1 == obj2);
		//添加‘&’符，获取FactoryBean的本身
		Object obj3 = applicationContext.getBean("&colorFactoryBean");
		System.out.println("bean的类型:"+obj3.getClass());
	}
}
