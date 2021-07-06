package dSession;

public class ClassObjectReferenceConcept {

	String name;
	int age;
	String city;
	
	
	
	public static void main(String[] args) {
		
		ClassObjectReferenceConcept c1 = new ClassObjectReferenceConcept();
		c1.name = "Madira";
		c1.age = 30;
		c1.city = "Pune";
	
		System.out.println("======== C1 ================");
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.city);

		ClassObjectReferenceConcept c2 = new ClassObjectReferenceConcept();
		c2.name = "Dimpu";
		c2.age = 22;
		c2.city = "Baroda";
		System.out.println("========== C2 ==============");
		
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.city);
		
		
		c1=c2;
		
		System.out.println("========= c1=c2 ===============");
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.city);
	}

}
