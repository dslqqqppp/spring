package co.demo.bean;

import org.springframework.beans.factory.FactoryBean;

//����һ��Spring�����FactoryBean
public class ColorFactoryBean implements FactoryBean<Color>{
	//����һ��Color������������ע�뵽������
	@Override
	public Color getObject() throws Exception {return new Color();}
	//����bean������
	@Override
	public Class<?> getObjectType() {return Color.class;}
	//�Ƿ�Ϊ������true:������false:��ʵ��
	@Override
	public boolean isSingleton() {return true;}
}
