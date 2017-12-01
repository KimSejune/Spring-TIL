package com.java.ex;

public class Worker {
	private String name;
	private String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void workerInfo() {
		System.out.println(getName());
		System.out.println(getJob());
		
	}
	
	

}
