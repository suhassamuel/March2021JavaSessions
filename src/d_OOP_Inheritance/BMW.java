package d_OOP_Inheritance;
// is a relation

public class BMW extends Car {
	
	@Override
	public void stop()
	{
		System.out.println("stop.. BMW");
	}
	@Override
	public void start()
	{
		System.out.println("start.. BMW");
	}
	
	public void autostart()
	{
		System.out.println("Start.. AUTO BMW");
	}

}
