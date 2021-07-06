package JavaSessions.Assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		// 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		System.out.println("======== 1st program: ======= ");
		System.out.println("Hello");
		System.out.println("Suhas S");

		// 2. Write a Java program to print the sum of two numbers.Test Data: 74 + 36  // Expected Output :110

		int i = 74;
		int j = 36;
		System.out.println("======== 2nd program: ======= ");

		System.out.println("Sum of 2 numbers: " + i + " and " + j + "= " + (i + j));

		// 3. Write a Java program to divide two numbers and print on the screen.Test // Data :50/3 Expected Output :16

		int a = 50;
		int b = 3;
		System.out.println("======== 3rd program: ======= ");

		System.out.println("Division: " + a + "/" + b + "= " + (a / b));

		// 4. Write a Java program to print the result of the following operations.
		// Change your test data accordingly.
		// Test Data: a. -5 + 8 * 6 b. (55+9) % 9 c. 20 + -3*5/8 d. 5 + 15 / 3 * 2 - 8 % 	// Expected Output : 43 1 19 13
		System.out.println("======== 4.1 program: ======= ");

		int a1 = -5;
		int a2 = 8;
		int a3 = 6;
		System.out.println("output of 4.1 i.e. -5 + 8 * 6 : " + (a1 + a2 * a3));

		System.out.println("======== 4.2 program: ======= ");
		int b1 = 55;
		int b2 = 9;
		System.out.println("output (55+9) % 9: " + (b1 + b2) % b2);

		System.out.println("======== 4.3 program: ======= ");
		int c1 = 20;
		int c2 = -3;
		int c3 = 5;
		int c4 = 8;
		System.out.println("output of  20 + -3*5 : " + (c1 + c2 * c3 / c4));

		System.out.println("======== 4.4 program: ======= ");
		int d1 = 5;
		int d2 = 15;
		int d3 = 3;
		int d4 = 2;
		int d5 = 8;
		System.out.println("Outout of 5 + 15 / 3 * 2 - 8 % 3 : " + (d1 + d2 / d3 * d4 - d5 % d3));

		// 5. Write a Java program to compute the specified expressions and print the 
		// output. Go to the editor
		// Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) Expected Output:  2.138888888888889
		System.out.println("======== 5th program: ======= ");
		double e1 = 25.5;
		double e2 = 3.5;
		double e3 = 40.5;
		double e4 = 4.5;
		System.out.println("Output of((25.5*3.5-3.5*3.5)/(40.5-4.5)): " + ((e1 * e2 - e2 * e2) / (e3 - e4)));

		// 6. Try to concat "Hello Selenium" with a character 't'.
		System.out.println("======== 6th program: ======= ");
		String s = "Hello Selenium";
		char c = 't';
		System.out.println(s + c);

		// 7. Create three int variables having values like : 100, 200, 3400.
		// Add them and concatenate and generate this output String :"Your Toal amount is. 3700"
		System.out.println("======== 7th program: ======= ");
		int f1 = 100;
		int f2 = 200;
		int f3 = 3400;
		System.out.println("Your Total amount is." + (f1 + f2 + f3));

		// 8. What should be the output for : byte b3 = 065;
		System.out.println("======== 8th program: ======= ");
		byte b3 = 065;
		System.out.println(b3);
	}
}
