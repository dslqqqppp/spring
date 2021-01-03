package cn.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	 @Bean
	 public Student student(){
	     return new Student(11,"jack",22);
	 }
}