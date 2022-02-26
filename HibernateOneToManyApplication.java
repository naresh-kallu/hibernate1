package com.tectoro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.tectoro.entity.DetailsStd;
@ServletComponentScan
@SpringBootApplication
public class HibernateOneToManyApplication {

	public static void main(String[] args) {
		
		/*
		 * Configuration configuration=new
		 * Configuration().configure("onetomany.cfg.xml"); SessionFactory
		 * factory=configuration.buildSessionFactory(); Session
		 * session=factory.openSession(); DetailsStd std=new DetailsStd(); Transaction
		 * transaction=session.beginTransaction(); std.setId(1);; std.setName("naresh");
		 * std.setEmail("n@gmail.com"); session.save(std);
		 * session.getTransaction().commit(); session.close();
		 * 
		 */
		
		
		
		
		
		SpringApplication.run(HibernateOneToManyApplication.class, args);
	}

}
