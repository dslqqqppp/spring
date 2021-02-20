package cm.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//includeFilters���չ���ֻ����bean
//useDefaultFiltersĬ��Ϊtrue��ɨ��ȫbean��ֻ����ʱ��Ҫ�޸�Ϊfalse
//@Filter(type=type=FilterType.ANNOTATION)//����ע���ų�
@Configuration // ��ǵ�ǰΪ������
@ComponentScan(value = "cm.demo", includeFilters = @Filter(type = FilterType.ANNOTATION, value = { Controller.class,
		Service.class }), useDefaultFilters = false)
public class IncludeFiltersByAnnotationConfig {

}
