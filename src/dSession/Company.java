package dSession;

public class Company {
	String name;
	int shareprice;
	String HQ;
	
	
	// constructor with no parameter .. it is also called default constructor
	public Company()
	{
		System.out.println("test here......");
	}
	
	public Company(String name)
	{
	  //name = name1;
		
		this.name = name;
		
	}
	
	public  Company(String name,int shareprice , String HQ )
	{
	  //name = name1;
		
		this.name = name;
		this.shareprice = shareprice;
		this.HQ = HQ;
		
		
	}
	

	public static void main(String[] args) {
		Company obj = new Company("Tata", 45454, "pune");
		System.out.println(obj.name + " : " + obj.shareprice + ": " + obj.HQ);
		
		Company obj1 = new Company("Reliance", 4554, "mumbai");
		System.out.println(obj1.name + " : " + obj1.shareprice + ": " + obj1.HQ);

		//Company obj = new Company("Tata");
		
	 

		/*obj.name = "Tata";
		obj.shareprice = 45454;
		obj.HQ = "pune";

		System.out.println(obj.name + " : " + obj.shareprice + ": " + obj.HQ);

		Company obj2 = new Company();

		obj2.name = "Reliance";
		obj2.shareprice = 4554;
		obj2.HQ = "mumbai";

		System.out.println(obj2.name + " : " + obj2.shareprice + ": " + obj2.HQ);*/
		
		
		//MySystem obj3 = new MySystem();
		
		//MySystem obj4 = new MySystem(naming);
	}

}
