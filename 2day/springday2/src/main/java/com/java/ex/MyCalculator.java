package com.java.ex;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		calculator.addtion(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiple(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
	
}
