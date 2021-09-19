package com.nit.bean;

import java.util.Arrays;

public class UserBean {
	private String username;
	private String password;
	
	private String [] courses;
	public String[] getCourses() {
		return courses;
	}
	
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		return "UserBean [username=" + username + ", password=" + password + ", courses=" + Arrays.toString(courses)
				+ "]";
	}

	//business method
	public String loginCheck() {
		if("Naresh".equals(username)&& "Naresh".equals(password)) {
			return "Login Success";
		}else {
			return "Login failure";
		}
	}
	
	

}
