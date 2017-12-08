package com.java.ut;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{


	@Override
	public boolean supports(Class<?> arg0) {
		// 검증할 객체의 class type 정보를 명시해준다. 
		return Student.class.isAssignableFrom(arg0);		
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student student = (Student) target;
		
		// 변경 전  
//		String stuName = student.getName();		
//		
//		if(stuName == null || stuName.trim().isEmpty() ) {
//			System.out.println("Name is Null OR Empty");
//			errors.rejectValue("name", "error");
//		}
		// 변경 후
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "problem");
		
		int stuId = student.getId();
		
		if(stuId == 0) {
			System.out.println("id is 0 ");
			errors.rejectValue("id", "error");
		}
	}
}
