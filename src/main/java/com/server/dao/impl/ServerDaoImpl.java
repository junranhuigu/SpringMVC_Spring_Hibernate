package com.server.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.server.dao.interfaces.ServerDao;
import com.server.dao.vo.Server;

public class ServerDaoImpl extends HibernateDaoSupport implements ServerDao{

	@Override
	public List<Server> all() {
		String hql = "from Server";
		return (List<Server>) getHibernateTemplate().find(hql);
	}

}
