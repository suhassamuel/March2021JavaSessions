package dSession;

public class ArrayConcept {

	public static void main(String[] args) {

		// int i = 1,2,3,4,5; not possible
		int j = 1;
		System.out.println(j);

		System.out.println("============");

		// int num[] = {2,3,2,1,2,3,4,5};

		// int i = 1;
		
		int i1[]= {0,1,2,3,4,5,6,7,8,9,10}; 

		System.out.println(i1.length);
		
		System.out.println("============");
		
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		// i[5]= 60; Array index out of bound exception

		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);

		System.out.println("============");
		
		System.out.println(i.length); // 5 == array length
		System.out.println(i.length-1); // 4 == max index value
		System.out.println(0); 
		
		System.out.println("============");
		
		for (int k = 0; k < i.length; k++) {

			System.out.println(i[k]);
		}
		System.out.println("======******=====");
		
		for (int k : i) {
			System.out.println(k);
		}
		System.out.println("======******=====");
		
		for (int k = i.length-1; k >= 0; k--) {

			System.out.println(i[k]);
		}
		
		
		System.out.println("============");
		
		String s[] = new String[4];
		s[0] = "Shifa";
		s[1] = "Pavan";
		s[2] = "Sonia";
		s[3] = "Ravi";
		
		
		
		// for each loop
		
		for (String e : s) {
			
			System.out.println(e);
			
	
		}
	}

}
