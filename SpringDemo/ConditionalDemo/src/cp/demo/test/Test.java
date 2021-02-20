package cp.demo.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import cp.demo.bean.Person;
import cp.demo.config.MainConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		String[] beanDefinitionNamesForConfig = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNamesForConfig) {
			System.out.println("beanName: " + beanName);
		}
		Map<String,Person> persons = applicationContext.getBeansOfType(Person.class);
		System.out.println(persons);
		
		//获取环境变量
		Environment environment = applicationContext.getEnvironment();
		System.out.println(environment.getProperty("os.name"));
	}
}
