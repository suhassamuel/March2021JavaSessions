package JavaSessions;

public class FunctionsInJava_8 {
	
	// functions or methods
	// reusable code in a block : called functions
	// 2 types
		// a. default functions
		// b. user defined functions
			// name can be anything
			// duplicate functions name not allowed
			// can not create functions inside the functions
			// functions are independent or parallel to each other
	
	
	// 1. void : no input not return : 0  parameter
	public void test()
	{
		System.out.println("test method"); 
	}
	
	// 2. no input but return something: 1 parameter
	
	public int getMarks()
	{
		System.out.println("getMarks method");
		
		int f1 = 100;
		int f2 = 200;
		int total = f1 + f2;
		
		return total;
	}
	
	public String getTranername()
	{
		System.out.println("Trainer name:");
		return "naveen";
	}
	// 3. some input and some return : 2 parameters
	
	public int add(int x , int y)
	{
	  int add = x+y;
	  return add;
	}
	
	// 4. Some input but not retrun
	
	public void getEmpInfo(String emp)
	{
		System.out.println("Employee name is : "+emp);
	}
	
	public static void main(String[] args) {
		
	 // call the function, we have to create the object of class	

		FunctionsInJava_8 obj = new FunctionsInJava_8();
		obj.test();
		int a = obj.getMarks(); // a is called holding parameter
		System.out.println(a);
		
		String a1 = obj.getTranername();
		System.out.println(a1);
		
		int addition = obj.add(100, 55);
		System.out.println(addition);
		
		
	    obj.getEmpInfo("Anant");
		
		
		
	}
	
	

}
