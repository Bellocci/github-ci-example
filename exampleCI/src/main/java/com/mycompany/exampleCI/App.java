package com.mycompany.exampleCI;

public class App {
	
	public String sayHello(String name) {
		if (name == null)
			return "Hello";
		else
			return "Hello " + name;
	}

	public String sayHello() {
		return sayHello(null);
	}

	public int doubleTheNumber(int number) {
		return number * 2;
	}
}
