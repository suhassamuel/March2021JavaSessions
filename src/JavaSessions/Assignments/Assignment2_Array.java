package JavaSessions.Assignments;

public class Assignment2_Array {

	public static void main(String[] args) {


		/*
		 * Question 1: Write a program to print the following pattern using for loop:
		 * 
		 * 00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
		 * 26 27 28 29 30 31 32 33 34 35 36 37 38 39
		 */

		/*String ar[] = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
				"33", "34", "35", "36", "37", "38", "39" };
		*//*
		 * Object ar2[]= {00, 01, 02, 03, 04, 05, 06, 07, 8, 9, 10, 11, 12, 13, 14, 15,
		 * 16, 17, 18,19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
		 * 35, 36, 37, 38, 39};
		 */
		/*
		 * for(String st:ar) { System.out.println(st);
		 * 
		 * }
		 */

		/*
		 * for(Object st1:ar2) { System.out.println(st1);
		 * 
		 * }
		 */

		/*
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data: --name(String), age(age), team name(String), DOB(String),
		 * gender(char), Strike Rate(Double), isActive(boolean) --Try to create multiple
		 * Object Arrays for different players --Try to print all the values of each
		 * player on the console using normal for/while loop and for each loop
		 */
		System.out.println("===== Question 2 ======");
		Object ob[] = new Object[7];

		ob[0] = "Sachin Tendulkar";
		ob[1] = 48;
		ob[2] = "India";
		ob[3] = "24th April 1973";
		ob[4] = 'M';
		ob[5] = 86.2;
		ob[6] = true;

		Object ob1[] = new Object[7];

		ob1[0] = "Virat Kohli";
		ob1[1] = 32;
		ob1[2] = "India";
		ob1[3] = "25th Nov 1988";
		ob1[4] = 'M';
		ob1[5] = 93.2;
		ob1[6] = true;

		System.out.println("===== for each ======");
		System.out.println("Cricket data: " + ob[0]);
		for (Object sachin : ob) {
			System.out.println(sachin);
		}

		System.out.println("==== for loop =======");

		System.out.println("Cricket data: " + ob[0]);

		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}

		System.out.println("==== while loop =======");

		int j = 0;
		while (j < ob.length) {
			System.out.println(ob[j]);
			j++;
		}

		System.out.println("===========");

		System.out.println("Cricket data: " + ob1[0]);
		for (Object virat : ob1) {
			System.out.println(virat);
		}

		System.out.println("===== Question 3 ======");
		/*Question 3: Try to print the following pattern on the console:
			n = 4
			n = 3
			n = 2
			n = 1
			n = 0	*/
		
		int ar1[]=new int[5];
		
		ar1[0]=0;
		ar1[1]=1;
		ar1[2]=2;
		ar1[3]=3;
		ar1[4]=4;
		
		System.out.println(ar1.length);
		
		for(int p=ar1.length ; p>0;p--)
		{
			System.out.println("n = "+ar1[p-1]);
		}
	}

}
