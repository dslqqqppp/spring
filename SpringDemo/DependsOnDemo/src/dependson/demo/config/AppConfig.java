package dependson.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import dependson.demo.bean.EventListenerBean;
import dependson.demo.bean.EventPublisherBean;

@Configuration
@ComponentScan("dependson.demo")
public class AppConfig {

    @Bean(initMethod = "initialize")//initialize():Bean初始化时调用方法
    @DependsOn("eventListener")
    public EventPublisherBean eventPublisherBean () {
        return new EventPublisherBean();
    }

    @Bean(name = "eventListener", initMethod = "initialize")
    public EventListenerBean eventListenerBean () {
        return new EventListenerBean();
    }
}