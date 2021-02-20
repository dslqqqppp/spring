package cq.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import cq.demo.bean.Person;

@Configuration
public class MainConfig {
	
	@Lazy
	@Bean
	public Person person() {
		System.out.println("´´½¨Person...");
		return new Person("joy",20);
	}

}
