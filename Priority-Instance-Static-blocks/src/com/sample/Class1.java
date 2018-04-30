package com.sample;

public abstract class Class1 {

	// executes first
	static {
		System.out.println("inside static block of Class1");
	}

	// executes second
	{
		System.out.println("inside instance block of Class1");
	}

	// executes third only if obj for subclass is created
	// and no paramaterized construtor of main class is invoked
	Class1() {
		System.out.println("inside default constructor block of Class1");
	}

	// executes third only if super("") is called from subclass
	Class1(String s) {
		System.out.println("inside param constructor block of Class1");
	}

	abstract String defaultMethod();

	//executes on the explicit invoke from the 
	//obj created of subclass
	String method1() {
		return "from method implementation of the main class";
	}

}
