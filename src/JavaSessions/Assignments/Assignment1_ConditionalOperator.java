package JavaSessions.Assignments;

import java.util.Scanner;

public class Assignment1_ConditionalOperator {

	public static void main(String[] args) {
		// 9. Take three numbers from the user and print the greatest number.
		// Test Data : Input the 1st number: 25 , Input the 2nd number: 78 , Input the
		// 3rd number: 87
		// Expected Output : The greatest: 87

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Eneter third number:");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("gretest number is :" + num1);
		} else if (num2 > num3) {
			System.out.println("gretest number is :" + num2);
		} else {
			System.out.println("gretest number is :" + num3);
		}
		
		sc.close();
	}

}
