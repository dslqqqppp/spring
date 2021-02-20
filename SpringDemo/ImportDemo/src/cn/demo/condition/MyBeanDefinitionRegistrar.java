package cn.demo.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import cn.demo.ifpg.Color;

public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata arg0, 
			BeanDefinitionRegistry arg1) {
		RootBeanDefinition rootBeanDefinition = 
				new RootBeanDefinition(Color.class);
		arg1.registerBeanDefinition("person",rootBeanDefinition);
	}
}
