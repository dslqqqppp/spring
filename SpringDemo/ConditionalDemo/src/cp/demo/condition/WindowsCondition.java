package cp.demo.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// ��ȡiocʹ�õ�beanFactory�����ڵײ�װ��Ĺ�����Ϣ
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// ��ȡ�������
		ClassLoader classLoader = context.getClassLoader();
		// ��ȡ��������
		Environment environment = context.getEnvironment();
		// ��ȡbean�����ע����
		BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();

		String property = environment.getProperty("os.name");
		return property.contains("Windows");
	}

}
