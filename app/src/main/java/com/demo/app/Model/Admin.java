package com.demo.app.Model;

public class Admin {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String role;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "admin [id=" + id + ", name=" + name + ", age=" + age + ", role=" + role + "]";
	}

}
