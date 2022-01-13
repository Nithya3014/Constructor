package com.nit.javalanguage;

public class Child extends Parent {

	public Child() {
		super();
		System.out.println("Child constructor");
	
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
	}
}

//comment super() keyword and run you will get same output
// if you run child class first it will go and execute parent class and then comes back to child class
//and execute child class : by default super() keyword occurs because when child class inherited properties of Parent class