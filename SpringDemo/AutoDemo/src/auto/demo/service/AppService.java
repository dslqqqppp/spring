package auto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import auto.demo.dao.AppDao;

@Service
public class AppService {
	@Qualifier("appDao")
	@Autowired
	private AppDao dao;
	
	public void print() {
		System.out.println(dao);
	}
	
	@Override
	public String toString() {
		return "AppService [AppDao=" + dao + "]";
		
	}
}
