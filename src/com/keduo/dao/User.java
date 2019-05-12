package com.keduo.dao;

public class User {
	private String name;
	private int password;
	private String sex;

	public User() {

	}

	public User(String name, int password, String sex) {

		this.name = name;
		this.password = password;
		this.sex = sex;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getpassword() {
		return password;
	}

	public void setpassword(int password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
