package cn.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cn.demo.condition.MyBeanDefinitionRegistrar;
import cn.demo.condition.MyImportSelector;
import cn.demo.ifpg.Color;

@Configuration
//@Import({Color.class,MyImportSelector.class})
@Import(value = { MyBeanDefinitionRegistrar.class})
public class MainConfig {
}
