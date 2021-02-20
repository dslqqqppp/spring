package cp.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import cp.demo.bean.Person;
import cp.demo.condition.LinuxConditoin;
import cp.demo.condition.WindowsCondition;

//�����������������µ�ע�Ὣ��Ч
@Conditional({WindowsCondition.class})
@Configuration
public class MainConfig {
	
	//windowsϵͳ�´���
	//@Conditional({Condition})��������ע��bean
	//��������������ע�Ὣ��Ч
	@Conditional({WindowsCondition.class})
	@Bean("Joya")
	public Person person1() {return new Person("Joya",12);}
	//linuxϵͳ�´���
	//��������������ע�Ὣ��Ч
	@Conditional({LinuxConditoin.class})
	@Bean("Joyb")
	public Person person2() {return new Person("Joyb",22);}
}
