package cn.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.demo.bean.SpringConfiguration;
import cn.demo.bean.Student;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 解析beans.xml，生成相应的bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student studentByXML = (Student) context.getBean("studentConstruct");
		System.out.println("解析beans.xml，生成相应的bean对象." 
				+ "id:" + studentByXML.getAge() 
				+ ";name:" + studentByXML.getName() 
				+ ";age:" + studentByXML.getAge());

		// 使用@Bean创建bean对象
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student studentByConifg = (Student) applicationContext.getBean("student");
		System.out.println("使用@Bean创建bean对象." 
				+ "id:" + studentByConifg.getAge() 
				+ ";name:" + studentByConifg.getName()
				+ ";age:" + studentByConifg.getAge());
	}
}
