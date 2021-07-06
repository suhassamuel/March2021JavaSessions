package dSession;

public class ClassObjectConcept {

	// class variables
	String name;
	int age;
	double salary;
	char gender ;
	boolean flag;
	
	// class method
	// syntax public/private/protected  +  void/return type(int,string) + name of method +  ()
	
	
	public static void test()
	{
		System.out.print("hello dimpu");
	}
	
	
	
	
	public static void main(String[] args) {
	
		
		
		
		ClassObjectConcept obj = new ClassObjectConcept();
		
		//obj.test();
		test();
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		System.out.println(obj.flag);
		
		obj.age =20;
		obj.name= "Shaya";
		obj.salary=20000;
		obj.gender = 'M';
		obj.flag = true;
		
		System.out.println("=========================");
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		System.out.println(obj.flag);
		
		
		ClassObjectConcept obj2 = new ClassObjectConcept();
		obj2.age =30;
		obj2.name= "test";
		obj2.salary=450000;
		obj2.gender = 'f';
		obj2.flag = true;
		
		System.out.println("=========================");
		System.out.println(obj2.age);
		System.out.println(obj2.name);
		System.out.println(obj2.salary);
		System.out.println(obj2.gender);
		System.out.println(obj2.flag);
		
	}

}
