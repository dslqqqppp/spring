package cp.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import cp.demo.bean.Person;
import cp.demo.condition.LinuxConditoin;
import cp.demo.condition.WindowsCondition;

//满足条件，配置类下的注册将生效
@Conditional({WindowsCondition.class})
@Configuration
public class MainConfig {
	
	//windows系统下创建
	//@Conditional({Condition})按照条件注册bean
	//满足条件，方法注册将生效
	@Conditional({WindowsCondition.class})
	@Bean("Joya")
	public Person person1() {return new Person("Joya",12);}
	//linux系统下创建
	//满足条件，方法注册将生效
	@Conditional({LinuxConditoin.class})
	@Bean("Joyb")
	public Person person2() {return new Person("Joyb",22);}
}
