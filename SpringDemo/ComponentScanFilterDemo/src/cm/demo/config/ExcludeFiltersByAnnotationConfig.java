package cm.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


//excludeFilters���չ����ų�bean
// @Filter(type=type=FilterType.ANNOTATION)//����ע���ų�
// @Filter(type=FilterType.ASPECTJ)//����J���ʽ�ų�
// @Filter(type=FilterType.ASSIGNABLE_TYPE)//���������ų�
// @Filter(type=FilterType.CUSTOM)//�����Զ����ų�
// @Filter(type=FilterType.REGEX)//���������ų�
@Configuration // ��ǵ�ǰΪ������
@ComponentScan(value = "cm.demo", excludeFilters = @Filter(type = FilterType.ANNOTATION, value = { Controller.class,
		Service.class }))
public class ExcludeFiltersByAnnotationConfig {
}
