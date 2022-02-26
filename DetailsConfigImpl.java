package com.tectoro.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
@Repository
public class DetailsConfigImpl implements DetailsConfig {
	
	static SessionFactory factory=null;
	@Override
	public SessionFactory getFSessionFactory() {
		Configuration configuration=new Configuration().configure("naresh.cfg.xml");
		factory=configuration.buildSessionFactory();
		System.out.println("Hello config");
		return factory;
	}

}
