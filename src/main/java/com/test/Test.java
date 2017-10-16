package com.test;

import com.server.dao.DaoFactory;

public class Test {
	public static void main(String[] args) throws Exception{
//		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:applicationContext.xml"); 
//		ServerDaoImpl dao = ac.getBean(ServerDaoImpl.class);
		System.out.println(DaoFactory.getInstance().getServerDao().all());
	}
}
