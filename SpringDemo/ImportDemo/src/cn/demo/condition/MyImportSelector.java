package cn.demo.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//�Զ��巵�����
public class MyImportSelector implements ImportSelector{

	//���������ȫ����
	//AnnotationMetadata:��ǰ��ע@importע����������ע����Ϣ
	@Override
	public String[] selectImports(AnnotationMetadata arg0) {
		//����null�ᱨ��ָ��
		return new String[] {"cn.demo.ifpg.Color"};
	}
}
