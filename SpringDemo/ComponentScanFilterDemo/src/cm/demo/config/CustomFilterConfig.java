package cm.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

@Configuration // 标记当前为配置类
@ComponentScan(value = "cm.demo.config", includeFilters = {
		@Filter(type = FilterType.CUSTOM, value = { MyTypeFilter.class }) }, useDefaultFilters = false)
public class CustomFilterConfig {

}
