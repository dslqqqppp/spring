package cn.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//标记当前为配置类
@ComponentScan(value = "cn.demo")
public class MainConfig {}
