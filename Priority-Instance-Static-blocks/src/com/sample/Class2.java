package com.sample;

public class Class2 extends Class1 {

	Class2() {
		super("hai");
	}

	public static void main(String[] args) {
		Class2 num2 = new Class2();
		num2.defaultMethod();
		System.out.println(num2.method1());
	}

	@Override
	String defaultMethod() {
		return "hai from Number2";
	}

}
