package com.nit.javalanguage;

public class ODC {

	String Project;
	int ODC;

	ODC(String name, int num) {

		// Parameterized Constructor

		Project = name;
		ODC = num;

	}

	public void sayAboutProject() {

		System.out.println("Project " + Project + " is in ODC " + ODC);

	}

	public static void main(String[] args) {

		ODC ETA1 = new ODC("DANA", 304);
		ETA1.sayAboutProject();

		ODC ETA3 = new ODC("Apollo", 401);
		ETA3.sayAboutProject();
	}
}
