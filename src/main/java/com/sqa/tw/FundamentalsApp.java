/**
 * File Name: FundamentalsApp.java<br>
 * Wong, Tony<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: May 1, 2017
 */
package com.sqa.tw;

import com.sqa.tw.helpers.*;

public class FundamentalsApp {

	public static void main(String[] args) {
		String name = AppBasics.greetUser("Fundamentals App");
		// checkNumber();
		// checkMonth();
		evalGrade();
		AppBasics.farewellUser(name);
	}

	private static void checkMonth() {
		// Write a program that prints the name of month using switch statement
		// given a number from the user. *You will need to use the
		// Integer.parseInt() method to convert a user supplied string to a
		// number type variable that can be evaluated.
		int monthNumber = AppBasics.requestInt("Please enter a month number (1-12):");
		switch (monthNumber) {
		case 1:
			System.out.println("Current month chosen is January");
			break;
		case 2:
			System.out.println("Current month chosen is February");
			break;
		case 3:
			System.out.println("Current month chosen is March");
			break;
		case 4:
			System.out.println("Current month chosen is April");
			break;
		case 5:
			System.out.println("Current month chosen is May");
			break;
		case 6:
			System.out.println("Current month chosen is June");
			break;
		case 7:
			System.out.println("Current month chosen is July");
			break;
		case 8:
			System.out.println("Current month chosen is August");
			break;
		case 9:
			System.out.println("Current month chosen is September");
			break;
		case 10:
			System.out.println("Current month chosen is October");
			break;
		case 11:
			System.out.println("Current month chosen is November");
			break;
		case 12:
			System.out.println("Current month chosen is December");
			break;
		default:
			System.out.println("You have not entered a valid month");
			break;
		}
	}

	private static void checkNumber() {
		// Write a function which takes a int parameter and print the message on
		// screen that “number is greater than 10” otherwise it should print
		// “number is smaller than 10” (Can you support if parameter is equal to
		// 10)
		int number = AppBasics.requestInt("What number do you want to evaluate?");
		if (number > 10) {
			System.out.println("Number is greater than 10");
		} else if (number < 10) {
			System.out.println("Number is less than 10");
		} else {
			System.out.println("Number is equal to 10");
		}
	}

	private static void evalGrade() {
		// Write a program that can ask the user for a grade value and print the
		// associated grade letter.
		int gradeValue = AppBasics.requestInt("What grade do you want to evaluate?");
		if (gradeValue >= 90 && gradeValue <= 100) {
			System.out.println("Your grade = A");
		} else if (gradeValue >= 80 && gradeValue <= 90) {
			System.out.println("Your grade = B");
		} else if (gradeValue >= 70 && gradeValue <= 80) {
			System.out.println("Your grade = C");
		} else if (gradeValue >= 60 && gradeValue <= 70) {
			System.out.println("Your grade = D");
		} else if (gradeValue >= 0 && gradeValue <= 60) {
			System.out.println("Your grade = F");
		} else {
			System.out.println("You entered an invalid grade (" + gradeValue + ")");
		}
	}
}
