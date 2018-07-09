package com.ab.hibernate_without_conf_and_mappingFILE;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private  int id;
	private String name;
	private String  surname;
	
	public Person() {
		super();
	}
	public Person(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
}//person
