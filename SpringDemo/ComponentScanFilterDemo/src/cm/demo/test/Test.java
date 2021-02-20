package cm.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cm.demo.config.CustomFilterConfig;
import cm.demo.config.ExcludeFiltersByAnnotationConfig;
import cm.demo.config.IncludeFiltersByAnnotationConfig;

public class Test {
	public static void main(String[] args) {
		// ApplicationContext applicationContext =
		// new
		// AnnotationConfigApplicationContext(ExcludeFiltersByAnnotationConfig.class);
		// ApplicationContext applicationContext =
		// new
		// AnnotationConfigApplicationContext(IncludeFiltersByAnnotationConfig.class);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomFilterConfig.class);

		String[] beanDefinitionNamesForConfig = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNamesForConfig) {
			System.out.println("beanName: " + beanName);
		}

	}
}
