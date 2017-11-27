package com.javalec.ex;

public class Calculation {

	private int firstNum;
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	private int secondNum;
	
	public void addtion() {
		System.out.println("addtion()");
		int result = firstNum + secondNum;
		System.out.println(result);
	}
	
	public void subtraction() {
		System.out.println("subtraction()");
		int result = firstNum - secondNum;
		System.out.println(result);
	}
	
	public void multiple() {
		System.out.println("multiple()");
		int result = firstNum * secondNum;
		System.out.println(result);
	}
	
	public void division() {
		System.out.println("division()");
		int result = firstNum / secondNum;
		System.out.println(result);
	}
}
