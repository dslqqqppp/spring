package cn.demo.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//自定义返回组件
public class MyImportSelector implements ImportSelector{

	//返回组件的全类名
	//AnnotationMetadata:当前标注@import注解的类的所有注解信息
	@Override
	public String[] selectImports(AnnotationMetadata arg0) {
		//返回null会报空指针
		return new String[] {"cn.demo.ifpg.Color"};
	}
}
