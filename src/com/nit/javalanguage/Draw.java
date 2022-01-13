//Overloading Constructor

//If we call a No argument constructor when we have only parameterized constructor = compile time error occurs

package com.nit.javalanguage;

public class Draw {

	String draw;

	Draw() {
		System.out.println("Draw object created");

	}

	Draw(String toDraw)

	{
		draw = toDraw;
		System.out.println("Drawing" + draw);
	}

	public static void main(String[] args) {

		Draw d = new Draw();
		Draw d1 = new Draw("circle");
	}
}

//comment constructor Draw() - and call No Argument constructor Draw() = compile time error occurs