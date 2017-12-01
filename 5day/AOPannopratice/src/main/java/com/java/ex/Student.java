package com.java.ex;

public class Student {
	
	private String name;
	private String age;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void getStudentInfo() {
		System.out.println(getName());
		System.out.println(getAge());
	}
	

}
