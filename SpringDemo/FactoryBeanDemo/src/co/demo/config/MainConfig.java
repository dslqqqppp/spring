package co.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.demo.bean.ColorFactoryBean;

@Configuration
public class MainConfig {

	//使用spring提供的FactoryBean
	@Bean
	public ColorFactoryBean colorFactoryBean() {
		return new ColorFactoryBean();
	}
}
