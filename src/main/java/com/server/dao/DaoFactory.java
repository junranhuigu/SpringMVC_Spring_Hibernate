package com.server.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.server.dao.interfaces.ServerDao;

public class DaoFactory {
	private static DaoFactory instance;
	private ServerDao serverDao;
	
	private DaoFactory() {
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:applicationContext.xml"); 
		serverDao = ac.getBean("serverDao", ServerDao.class);
	}

	public static DaoFactory getInstance() {
		if(instance == null){
			instance = new DaoFactory();
		}
		return instance;
	}

	public ServerDao getServerDao() {
		return serverDao;
	}
}
