package JavaSessions;

public class ConditionalOperator {

	public static void main(String[] args) {

		// write a program to print the highest number  from four different number given 
		int a = 120;
		int b = 15;
		int c = 50;
		int d = 180;

		if (a > b && a > c && a > d) {
			System.out.println("a is highest value");
		} else if (b > c && b > d) {
			System.out.println("b is highest value");
		} else if (c > d) {
			System.out.println("c is highest value");
		}
		else {System.out.println("d is highest value");}

	}
}
