package com.jnmd.mybatis.domain;

public abstract class User {
	private String name;
	private String password;
	private int age;
	private int uid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", uid=" + uid + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public User(String name, String password, int age, int uid) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.uid = uid;
	}
	
	
}
