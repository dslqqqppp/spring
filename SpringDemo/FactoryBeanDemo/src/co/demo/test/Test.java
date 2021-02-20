package co.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.demo.config.MainConfig;


public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Object obj1 = applicationContext.getBean("colorFactoryBean");
		System.out.println("bean������:"+obj1.getClass());
		//��ΪFactoryBean������isSingleton()Ϊtrue(����)���������λ�ȡ��������ȵ�
		Object obj2 = applicationContext.getBean("colorFactoryBean");
		System.out.println(obj1 == obj2);
		//��ӡ�&��������ȡFactoryBean�ı���
		Object obj3 = applicationContext.getBean("&colorFactoryBean");
		System.out.println("bean������:"+obj3.getClass());
	}
}
