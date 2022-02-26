package com.tectoro.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository
public interface DetailsConfig {
	public SessionFactory getFSessionFactory();

}
