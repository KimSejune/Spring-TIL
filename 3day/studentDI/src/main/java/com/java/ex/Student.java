package com.java.ex;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Student {
	private String name;	// constructor
	private String age;	// constructor
	private ArrayList<String> hobbys; // constructor
	private double height; // setter
	private double weight; // setter
	
	
	public Student(String name, String age, ArrayList<String> hobbys) {
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
	}


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


	public ArrayList<String> getHobbys() {
		return hobbys;
	}


	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}