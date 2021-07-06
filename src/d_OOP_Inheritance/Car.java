package d_OOP_Inheritance;

public class Car extends Vehicle {
	
	
	public void start()
	{
		System.out.println("Start.. CAR");
	}

	public void stop()
	{
		System.out.println("stop.. CAR");
	}
	public void refuel()
	{
		System.out.println("refuel.. CAR");
	}
	
	@Override
	public void steel()
	{
		System.out.println("car : steel ");
	}
}
