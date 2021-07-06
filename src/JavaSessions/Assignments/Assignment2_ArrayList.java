package JavaSessions.Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment2_ArrayList {

	public static void main(String[] args) {
		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection

		System.out.println("======= ArrayList Program : 1 =============");
		ArrayList<String> colorList = new ArrayList<String>();

		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Yellow");
		colorList.add("Green");
		colorList.add("Orange");
		for (String st : colorList) {
			System.out.println(st);
		}

		// 2. Write a Java program to insert an element into the array list at the first
		// and last positions.

		System.out.println("======= ArrayList Program : 2 : After adding element at 1st and last index=============");
		colorList.add(0, "White");
		colorList.add(5, "Black");

		for (String st : colorList) {
			System.out.println(st);
		}

		// 3. Write a Java program to retrieve an element (at a specified index) from a
		// given array list.
		System.out.println("======= ArrayList Program : 3 =============");

		System.out.println("Element (color) at 1st index is: " + colorList.get(0));
		System.out.println("Element (color) at 2nd last index is: " + colorList.get(5));

		// 4. Write a Java program to update specific array element by given element.

		System.out.println("======= ArrayList Program : 4=============");
		System.out.println("updating black color(at 5th index) with brown");

		colorList.set(5, "Brown");
		for (String st : colorList) {
			System.out.println(st);
		}

		System.out.println("======= ArrayList Program : 5=============");

		// 5. Write a Java program to remove the third element from a array list.

		colorList.remove(2);
		for (String st : colorList) {
			System.out.println(st);
		}
		System.out.println("======= ArrayList Program : 6=============");

		// 6. Write a Java program to search an element in a array list.

		colorList.stream().filter(e -> e.contains("White")).forEach(e -> System.out.println(e));

		// 7. Write a Java program to reverse elements in a array list

		System.out.println("======= ArrayList Program : 7 - Reverse");
		for (int i = colorList.size() - 1; i >= 0; i--) {
			System.out.println(colorList.get(i));
		}

		// 8. Write a Java program to extract a portion of a array list.

		System.out.println("======= ArrayList Program : 8 - extract a portion");

		for (String e : colorList.subList(0, 3)) {
			System.out.println(e);
		}

		// 9. Write a Java program of swap two elements in an array list.
		System.out.println("======= ArrayList Program : 9 - swap 2 element");
		Collections.swap(colorList, 0, 1);
		for (String e : colorList) {
			System.out.println(e);
		}
		// 10. Write a Java program to empty an array list.
		System.out.println("======= ArrayList Program : 10 - empty an array list");

		colorList.removeAll(colorList);
		for (String s : colorList) {
			System.out.println(s);
		}
		// 11. Write a Java program to trim the virtual capacity of an array list the current list size.
		System.out.println("======= ArrayList Program : 11 - trim the virtual capacity \n of an array list the  current list size");
		ArrayList<String> empList = new ArrayList<String>(4);
		empList.add("Suhas");
		empList.add("Ketan");
		empList.add("Mitul");
		empList.add("VP");
		empList.add("Vijay");

		for (String s : empList) {
			System.out.println(s);
		}
		// 2. Write a Java program to print all the elements of a ArrayList using the position of the elements
		System.out.println(
				"======= ArrayList - print all the elements of a ArrayList using the position of the elements");
		for (int i = 0; i < empList.size(); i++) {
			System.out.println("ArrayList Index :[" + i + "] : " + empList.get(i));
		}
	}

}
