package JavaSessions.Assignments;

public class Assignment2_Loops {

	public static void main(String[] args) {

		/*1. WAP to print following output:
			I am Batman

			I am Batman

			I am Batman

			I am Batman

			I am Batman*/
		System.out.println("======== Program 1 =========");

		for (int i = 0; i <= 4; i++) {
			System.out.println("I am Batman\n");
			// or
			// System.out.println( "I am Batman");
			// System.out.println();
		}

		System.out.println("\n ======== Program 2 =========");


		/*
		 * 2. WAP to print following output:
		 * I am Batman 1
		 * 
		 * I am Batman 2
		 * 
		 * I am Batman 3
		 * 
		 * I am Batman 4
		 * 
		 * I am Batman 5
		 * 
		 * I am Batman 6
		 * 
		 * I am Batman 7
		 * 
		 * I am Batman 8
		 * 
		 * I am Batman 9
		 */
		
		for (int j=1;j<=9;j++)
		{
			System.out.println("I am Batman "+ j);
			System.out.println("");
		}
		
		System.out.println("\n ======== Program 3 =========");

		
		// 3. WAP to print 10 to 1 using for, while and do-while loop
		
		int k=10;
		while(k>=1)
		{
			System.out.print(k+" ");
			k--;
		}
		System.out.println("\n =================");
		int k1=10;
		do
		{
			System.out.print(k1+" ");
			k1--;
		}
		while(k1>=1);
		
		
		
		System.out.println("\n ======== Program 4 =========");

		
		// 4. Write a program in Java to print "Hello World" ten times using while loop
		int l=1;
		while(l<=10)
		{
			System.out.println("Hello world");
			l++;
			
		}
		
		System.out.println("\n ======== Program 5 =========");

		
		// 5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
		int m = 1;
		while(m<=10)
		{
			System.out.println(m);
			
			if(m==7)
			{
				break;
			}
			m++;
		}
		
		
				

	}

}
