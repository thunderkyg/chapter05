package com.javaex.ex03;

public class Person {
	
	//Field

	private String name;
	private String hp;
	private String company;
	
	//Constructor

	public Person() {

	}
	
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	//Method - gs
	
	public String getName() {
		return name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	//Method - ordinary
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}

}
