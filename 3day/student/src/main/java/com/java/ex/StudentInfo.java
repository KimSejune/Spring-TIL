package com.java.ex;

public class StudentInfo {
	private Student student;
	
	public StudentInfo(Student student) {
		this.student = student;
	}

	public void getStudenInfo() {
		if(student != null) {
			System.out.println("이름 :"+student.getName());
			System.out.println("나이 :"+student.getAge());
			System.out.println("학년 :"+student.getGradeNum());
			System.out.println("번호 :"+student.getClassNum());
		}
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
