package cp.demo.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxConditoin implements Condition {

	// ConditionContext:�ж�������ʹ�õ������ġ�
	// AnnotatedTypeMetadata:ע����Ϣ
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata arg1) {
		// ��ȡiocʹ�õ�beanFactory�����ڵײ�װ��Ĺ�����Ϣ
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// ��ȡ�������
		ClassLoader classLoader = context.getClassLoader();
		// ��ȡ��������
		Environment environment = context.getEnvironment();
		// ��ȡbean�����ע����
		BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();
		
		String property = environment.getProperty("os.name");
		return property.contains("Linux");
	}

}
