package JavaSessions.Assignments;

import java.util.Scanner;

public class Assignment1_ConditionalOperator_2 {

	public static void main(String[] args) {

		// 2. Write a Java program to test a number is positive or negative.
		// Test Data : Input number: 35 -- positive number Input number: -11 -- negative
		// number

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int number1 = sc.nextInt();

		if (number1 > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}
		System.out.println("Enter 2nd number:");

		int number2 = sc.nextInt();

		if (number2 > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}

		sc.close();
	}

}
