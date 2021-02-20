package cm.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


//excludeFilters按照规则排除bean
// @Filter(type=type=FilterType.ANNOTATION)//按照注解排除
// @Filter(type=FilterType.ASPECTJ)//按照J表达式排除
// @Filter(type=FilterType.ASSIGNABLE_TYPE)//按照类型排除
// @Filter(type=FilterType.CUSTOM)//按照自定义排除
// @Filter(type=FilterType.REGEX)//按照正则排除
@Configuration // 标记当前为配置类
@ComponentScan(value = "cm.demo", excludeFilters = @Filter(type = FilterType.ANNOTATION, value = { Controller.class,
		Service.class }))
public class ExcludeFiltersByAnnotationConfig {
}
