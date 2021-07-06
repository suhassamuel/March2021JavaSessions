package JavaSessions.Assignments;

import java.util.Scanner;

public class Assignment3_Methods {

	// 1.Write a program to print the sum of two numbers entered by user by defining
	// your own method.

	public void getSum() {
		System.out.println("Program 1: To print the sum of two numbers entered by user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b = sc.nextInt();
		int total = a + b;
		sc.close();
		System.out.println("Total is :" + total);

	}

	// 2. Define a method that returns the product of two numbers entered by user.
	public int getProduct() {
		System.out.println("Program 2: method that returns the product of two numbers entered by user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a1 = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b1 = sc.nextInt();
		int result = a1 * b1;
		sc.close();
		return result;

	}

	/*
	 * 3. Write a program to print the circumference and area of a circle of radius
	 * entered by user by defining your own method. Circle Solve for circumference =
	 * C=2* 3.14 * r and Area A= 3.14* r*2
	 */

	public void circle() {
		System.out.println("print the circumference and area of a circle of radius entered by user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		System.out.println("Circumference : " + 2 * (3.14) * radius);
		System.out.println("Area : " + 3.14 * (radius * radius));
		sc.close();
	}

	/*
	 * 4. Define two methods to print the maximum and the minimum number
	 * respectively among three numbers entered by user.
	 */

	public void findMaxNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Number:");
		int c = sc.nextInt();
		if (a > b && a > c) {

			System.out.println("Maximum number is 1st Number i.e." + a);
		} else if (b > c) {
			System.out.println("Maximum number is 2nd Number i.e." + b);

		} else {
			System.out.println("Maximum number is 3rd Number i.e." + c);

		}
		sc.close();

	}

	// 5. Define a program to find out whether a given number is even or odd.
	public void findNumberOddEven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the out it is odd or even");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		sc.close();

	}

	// 6. A person is eligible to vote if his/her age
	// is greater than or equal to 18. Define a method to find out if he/she is
	// eligible to vote.

	public void vote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		} else {
			System.out.println("Person is NOT eligible to vote");
		}
		sc.close();
	}

	// 7. Define a method to find out if number is prime or not.
	public boolean prime(int x) {
		boolean prime = true;

		if (x > 1) {

			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}

		return prime;
	}

	/*
	 * 8. Write a program which will ask the user to enter his/her marks (out of
	 * 100). Define a method that will display grades according to the marks entered
	 * as below: Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD
	 * <=40 Fail
	 */

	public void getGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int mark = sc.nextInt();

		if (mark >= 91) {
			System.out.println("Grade : AA");
		} else if (mark > 80 && mark < 91) {
			System.out.println("Grade : AB");
		} else if (mark > 70 && mark < 81) {
			System.out.println("Grade : BB");
		} else if (mark > 60 && mark < 71) {
			System.out.println("Grade : BC");
		}
		else if (mark > 50 && mark < 61) {
			System.out.println("Grade : CD");
		} else if (mark > 40 && mark < 51) {

			System.out.println("Grade : DD");
		} else if (mark <= 40) {
			System.out.println("Grade : FAIL");
		}

		sc.close();
	}

	public static void main(String[] args) {

		Assignment3_Methods obj = new Assignment3_Methods();

		/*
		 * obj.getSum();
		 * 
		 * Assignment3_Methods obj1 = new Assignment3_Methods(); int productResult =
		 * obj1.getProduct(); System.out.println("Product of two numbers: " +
		 * productResult);
		 */
		// obj.circle();

		// obj.findMaxNumber();

		// obj.findNumberOddEven();

		// obj.vote();

		/*
		 * Scanner sc = new Scanner (System.in);
		 * System.out.println("Enter any value to check prime or not");
		 * 
		 * int num = sc.nextInt();
		 * 
		 * boolean b = obj.prime(num); if(b==false) {
		 * System.out.println("It is not Prime number"); } else {
		 * System.out.println("It is Prime number"); } sc.close();
		 */

		obj.getGrade();

	}

}
