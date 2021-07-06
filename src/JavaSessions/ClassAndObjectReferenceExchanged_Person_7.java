package JavaSessions;

public class ClassAndObjectReferenceExchanged_Person_7 {

	// ObjectReferenceExchnage Concept

	String name;
	int age;
	String City;
	static int wheels=4;

	public static void main(String[] args) {

		ClassAndObjectReferenceExchanged_Person_7 p1 = new ClassAndObjectReferenceExchanged_Person_7();
		p1.name = "Vanita";
		p1.age = 20;
		p1.City = "London";

		ClassAndObjectReferenceExchanged_Person_7 p2 = new ClassAndObjectReferenceExchanged_Person_7();
		p2.name = "Anant";
		p2.age = 30;
		p2.City = "Mumbai";

		ClassAndObjectReferenceExchanged_Person_7 p3 = new ClassAndObjectReferenceExchanged_Person_7();
		p3.name = "Shifa";
		p3.age = 29;
		p3.City = "Dubai";

		System.out.println(p1.name + " " + p1.age + " " + p1.City); // vanita
		System.out.println(p2.name + " " + p2.age + " " + p2.City); // anant
		System.out.println(p3.name + " " + p3.age + " " + p3.City); // shifa
		
		System.out.println("==============");
		p1=p2;

		System.out.println(p1.name + " " + p1.age + " " + p1.City); // anant
		System.out.println(p2.name + " " + p2.age + " " + p2.City); // anant 
		System.out.println(p3.name + " " + p3.age + " " + p3.City); // shifa
		
		p2=p3;

		System.out.println("==============");

		System.out.println(p1.name + " " + p1.age + " " + p1.City); // anant
		System.out.println(p2.name + " " + p2.age + " " + p2.City); // shifa
		System.out.println(p3.name + " " + p3.age + " " + p3.City); // shifa
		
		p3=p1;

		System.out.println("==============");

		System.out.println(p1.name + " " + p1.age + " " + p1.City); // anant
		System.out.println(p2.name + " " + p2.age + " " + p2.City); // shifa
		System.out.println(p3.name + " " + p3.age + " " + p3.City); // anant
		
		
		
		
		
		
		
	}

}
