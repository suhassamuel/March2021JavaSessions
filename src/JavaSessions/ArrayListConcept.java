package JavaSessions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList is a class
		// Dynamic array
		// to use arraylist we have to create a object of it
		// its is order or index base collection
		// generics in java.. to initialize

		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println(ar.size());
		ar.add(100);// 0
		ar.add(200); // 1
		ar.add(300); // 2
		ar.add(400); // 3
		ar.add(500); // 4
		ar.add(600); // 5
		ar.add(700); // 6
		ar.add(800); // 7
		ar.add(900); // 8
		ar.add(1000); // 9
		ar.add(1100); // 10
		ar.add(1200); // 11
		ar.add(1300); // 12
		ar.add(1400); // 13
		ar.add(1500); // 14
		ar.add(1600); // 15

		System.out.println(ar.size());
		System.out.println(ar.size());
		System.out.println(ar.size());
		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(50);
		markList.add(60);
		System.out.println(markList.size());

		ArrayList<String> nameList = new ArrayList<String>();

		nameList.add("Karuna");
		nameList.add("Ripple");
		nameList.add("Myra IBM");
		nameList.add("Eva IBM");
		System.out.println("---------namelist: for each loop----------");
		System.out.println("ArrayList size:" + nameList.size());
		for (String st : nameList) {
			System.out.println(st);
		}

		System.out.println("---------namelist: for  loop----------");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		nameList.remove(0);

		System.out.println("ArrayList size:" + nameList.size());
			for (String st : nameList) {
				System.out.println(st);
			}
		nameList.add("Karuna");
		nameList.add("Arun");
		System.out.println("---------namelist: for each loop----------");
		for (String st : nameList) {
			System.out.println(st);
			if (st.equals("Eva")) {
				System.out.println("Small sister");
				break;
			}
		}
		System.out.println("---------namelist: for each loop----------");
		for (String st : nameList) {
			System.out.println(st);
		}
		System.out.println("---------namelist: for each using stream----------");
		nameList.stream().forEach(e -> System.out.println(e));

		System.out.println("---------namelist: for each using stream: filter : equal----------");
		nameList.stream().filter(e -> e.equals("Ripple")).forEach(e -> System.out.println(e));
		
		
		System.out.println("$%@#%#@#%#%#%");

		System.out.println("---------namelist: for each using stream: filter : contains----------");
		nameList.stream().filter(e -> e.contains("IBM")).forEach(e -> System.out.println(e));

		System.out.println("---------namelist: for each using stream : sorting----------");
		nameList.stream().sorted().forEach(e -> System.out.println(e));

		System.out.println("---------namelist: for each using stream : filter contain----------");

		nameList.stream().filter(e -> e.contains("IBM")).forEach(e -> System.out.println(e));

		System.out.println("-------");

		IntStream.range(1, 5).forEach(e -> System.out.println(e));

		System.out.println("-------");

		IntStream.iterate(0, i -> i + 2).limit(5).forEach(e -> System.out.println(e));

		System.out.println("======== Revision=======");

		ArrayList<String> empList = new ArrayList<String>();

		empList.add("Mohan India");
		empList.add("Hijab Pakistan");
		empList.add("Suhas India");
		System.out.println("Array list size of emplist : " + empList.size());
		System.out.println("======== for each=======");

		for (String e : empList) {
			System.out.println(e);
		}
		System.out.println("======== for =======");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}
		System.out.println("======== stream concept =======");
		empList.stream().forEach(ele -> System.out.println(ele));

		System.out.println("======== stream :filter:contains =======");
		empList.stream().filter(e -> e.contains("India")).forEach(e -> System.out.println(e));

		System.out.println("======== IntStream : range=======");

		IntStream.range(0, 5).forEach(e -> System.out.println(e));

		System.out.println("======== IntStream : iterate=======");

		IntStream.iterate(0, i -> i + 5).limit(5).forEach(e -> System.out.println(e));

	}

}
