package com.tectoro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="details1")
public class DetailsStd {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	
	
	
	
	
	public DetailsStd() {
		super();
	}
	public DetailsStd(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		
		System.out.println("Hello pojo::"+id+" "+name+" "+email);
	}
	public int getId() {
		System.out.println(id);
		return id;
	}
	public void setId(int id) {
		System.out.println(id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "DetailsStd [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
}
