package cm.demo.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {

	//MetadataReader:��ȡ��ǰɨ�������Ϣ
	//MetadataReaderFactory:��ȡ���������Ϣ
	@Override
	public boolean match(MetadataReader arg0, MetadataReaderFactory arg1) throws IOException {
		//��ȡ��ǰ��ע�����Ϣ
		AnnotationMetadata annotationMetadata = arg0.getAnnotationMetadata();
		//��ȡ��ǰ����ɨ��������Ϣ
		ClassMetadata classMetadata = arg0.getClassMetadata();
		//��ȡ��ǰ�����Դ��·����
		Resource resource =arg0.getResource();
		String className = classMetadata.getClassName();
		if(className.contains("ll")) {
			return true;
		}
		return false;
	}

}
