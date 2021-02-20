package co.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.demo.bean.ColorFactoryBean;

@Configuration
public class MainConfig {

	//ʹ��spring�ṩ��FactoryBean
	@Bean
	public ColorFactoryBean colorFactoryBean() {
		return new ColorFactoryBean();
	}
}
