package JavaSessions;

public class Constructor_9 {

	
	
	// constructor
	/*
	 * it is having the same name as class
	 * can be overloaded
	 * not a function
	 * can not return any value and no void also
	 *  constructor is use to initialize the class variable
	 *  constructor will be called when you create the object
	 *  function is use for business logic /  feature / behaviour of app
	 *  
	 */
	
	/*public Constructor_9()
	{
		System.out.println("0 parameter or default constructor");
	}
	
	public  Constructor_9(int a)
	{
		System.out.println("1 parameter");
	}
	
	public  Constructor_9(int a, int b)
	{
		System.out.println("2 parameter");
	}*/
	
	String name;
	int sharePrice;
	String HQ;
	
	public Constructor_9 (String name)
	{
		this.name = name;
	}

	public Constructor_9 (String name,int sharePrice, String HQ)
	{
		this.name = name;
		this.sharePrice = sharePrice;
		this.HQ = HQ;		
	}

	public static void main(String[] args) {
		
		//Constructor_9 obj = new Constructor_9(10,20);

		/*Constructor_9 c1 = new Constructor_9();

		c1.name = "IBM";
		c1.sharePrice = 500;
		c1.HQ = "Pune";
		System.out.println(c1.name);

		Constructor_9 c2 = new Constructor_9();

		c2.name = "Infy";
		c2.sharePrice = 5004;
		c2.HQ = "Ahmedabad";
		System.out.println(c2.name);*/
		
		Constructor_9 c1 = new Constructor_9("Hello");
		System.out.println(c1.name);
		
		System.out.println("================");
		Constructor_9 c2 = new Constructor_9("Infy",50005,"Ahmedabad");
		System.out.println(c2.HQ);
		System.out.println(c2.name);
		System.out.println(c2.sharePrice);
		
		
		
		

	}

}
