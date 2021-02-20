package dependson.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dependson.demo.config.AppConfig;


public class Test {
	public static void main(String[] args) {
		 new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
