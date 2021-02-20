package cm.demo.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {

	//MetadataReader:读取当前扫描类的信息
	//MetadataReaderFactory:获取其他类的信息
	@Override
	public boolean match(MetadataReader arg0, MetadataReaderFactory arg1) throws IOException {
		//获取当前类注解的信息
		AnnotationMetadata annotationMetadata = arg0.getAnnotationMetadata();
		//获取当前正在扫描的类的信息
		ClassMetadata classMetadata = arg0.getClassMetadata();
		//获取当前类的资源（路径）
		Resource resource =arg0.getResource();
		String className = classMetadata.getClassName();
		if(className.contains("ll")) {
			return true;
		}
		return false;
	}

}
