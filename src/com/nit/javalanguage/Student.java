package com.nit.javalanguage;

public class Student {

	String studentName;
	Integer rollNo;
	int registerNumber;
	// Example for default Constructor.

	/*
	 * Do you see any constructor here? Nope! Then you have no special powers.
	 * Compiler has created one here!!! Believe me!!!
	 */

	public static void main(String[] args) {

		Student stu = new Student();
		System.out.println("Default value of String Class : " + stu.studentName);
		System.err.println("Default value of Integer Class :" + stu.rollNo);
		System.out.println("Default value of int : " + stu.registerNumber);
	}

}
