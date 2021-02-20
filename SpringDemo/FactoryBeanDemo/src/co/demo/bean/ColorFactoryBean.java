package co.demo.bean;

import org.springframework.beans.factory.FactoryBean;

//创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color>{
	//返回一个Color对象，这个对象会注入到容器中
	@Override
	public Color getObject() throws Exception {return new Color();}
	//返回bean的类型
	@Override
	public Class<?> getObjectType() {return Color.class;}
	//是否为单例，true:单例，false:多实例
	@Override
	public boolean isSingleton() {return true;}
}
