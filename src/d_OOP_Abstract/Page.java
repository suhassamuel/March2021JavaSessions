package d_OOP_Abstract;

public abstract class Page {
	
	
	// 100% abstraction --
	//   0% abstraction
	// some% abstraction --
	// can not create an object of abstract class
	
	public Page()
	{
		System.out.println("Page: constrcutor");
	}
	

	public abstract void test1();
	
	public abstract String getTitle();
	

	public void test()
	{
		System.out.println("test method of PAGE class : Parent");
	}
	

}
