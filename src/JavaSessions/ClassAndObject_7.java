package JavaSessions;

public class ClassAndObject_7 {

	// class : is a blue print / category / template of objects
	// Data Members :  Class variable and class methods
	// Object is physical entity ---> instance of class
	
	String name;
	int age;
	double salary;
	char gender ;
	boolean flag;
	
	
	public static void main(String[] args) {
		
	 int  i = 10; // local variables
	 System.out.println(i);
	 
	 // create the object where "new ClassAndObject_7()" object and obj is reference name 
	 ClassAndObject_7 obj = new ClassAndObject_7();
	 
	 System.out.println("Name of Object: "+obj.age + " Age of Object: "+obj.name);
	 System.out.println("salary of Object: "+obj.salary + " gender of Object: "+obj.gender+" flag of Object: "+obj.flag );
	 obj.age = 4;
	 obj.name = "Test";
	 obj.salary= 2000.22;
	 obj.gender= 'M';
	 obj.flag= true;
	 System.out.println("Name of Object: "+obj.age + " Age of Object: "+obj.name);
	 System.out.println("salary of Object: "+obj.salary + " gender of Object: "+obj.gender+" flag of Object: "+obj.flag );
	 
	 System.out.println("==================");
	 ClassAndObject_7 obj1 = new ClassAndObject_7();
	 
	 System.out.println("Name of Object: "+obj1.age + " Age of Object: "+obj1.name);
	 System.out.println("salary of Object: "+obj1.salary + " gender of Object: "+obj1.gender+" flag of Object: "+obj1.flag );
	 obj1.age = 40;
	 obj1.name = "Test1";
	 obj1.salary= 50000.22;
	 obj1.gender= 'F';
	 obj1.flag= true;
	 System.out.println("Name of Object: "+obj1.age + " Age of Object: "+obj1.name);
	 System.out.println("salary of Object: "+obj1.salary + " gender of Object: "+obj1.gender+" flag of Object: "+obj1.flag );
	 
	 
	 
	 // garbage collector destroy null reference object and no reference object
	 System.out.println(new ClassAndObject_7().name); // this is no reference object
	 
	// ClassAndObject_7 obj3 = new ClassAndObject_7(); // this is null reference object
    // obj3 = null;
	// obj3.age = 4;
	 
	//  System.out.println(obj3.age); // null pointer exception
	
	}
}
