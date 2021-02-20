package auto.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import auto.demo.config.MainConfigOfAutowired;
import auto.demo.dao.AppDao;
import auto.demo.service.AppService;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
		AppService service = applicationContext.getBean(AppService.class);
		System.out.println(service);
		AppDao dao = applicationContext.getBean(AppDao.class);
		Object dao2 = applicationContext.getBean("appDao");
		System.out.println("AppService [AppDao=" + dao + "]");
		
	}
}
