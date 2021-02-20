package cm.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//includeFilters按照规则只包含bean
//useDefaultFilters默认为true，扫描全bean，只包含时需要修改为false
//@Filter(type=type=FilterType.ANNOTATION)//按照注解排除
@Configuration // 标记当前为配置类
@ComponentScan(value = "cm.demo", includeFilters = @Filter(type = FilterType.ANNOTATION, value = { Controller.class,
		Service.class }), useDefaultFilters = false)
public class IncludeFiltersByAnnotationConfig {

}
