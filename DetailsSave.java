package com.tectoro.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.tectoro.dao.DetailsConfig;
import com.tectoro.dao.DetailsConfigImpl;
import com.tectoro.entity.DetailsEntity;
import com.tectoro.entity.DetailsStd;
import com.tectoro.service.DetailsService;

import java.io.IOException;
import java.util.Date;

@WebServlet("/save")
public class DetailsSave extends HttpServlet {
	//@Autowired
	//DetailsConfig config;
	
	//DetailsService detailsService;
	
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		try {
			System.out.println("Hello ser");
			int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		System.out.println(id+" "+name+""+email);
//DetailsConfig config=new DetailsConfigImpl();
		
		DetailsConfigImpl config=new DetailsConfigImpl();

		
		Session session=config.getFSessionFactory().openSession();
		
		Transaction transaction=session.beginTransaction();
     //DetailsStd std=new DetailsStd(id,name,email);
     
		
		DetailsStd entity=new DetailsStd();
		 entity.setId(id);
		entity.setName(name);
		entity.setEmail(email);
		
		System.out.println(entity.getId());
		
		/*
		 * DetailsStd detailsStd=new DetailsStd(); detailsStd.getId();
		 * detailsStd.getName(); detailsStd.getEmail();
		 * System.out.println(detailsStd.getId()+" "+detailsStd.getName()+" "+detailsStd
		 * .getEmail());
		 */
		
	//	DetailsEntity entity=new DetailsEntity(name,email,new Date(2022, 02, 01));
				session.save(entity);
	
		transaction.commit();
		session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	public DetailsSave() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
