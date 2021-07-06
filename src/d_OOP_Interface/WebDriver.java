package d_OOP_Interface;

public interface WebDriver extends SearchContext {

		// methods can not have method body
		// method proto type
		// only method declaration
		// abstract methods
			// 100% abstraction
	
	public String getTitle();
	
	public void get(String url);
	
	public void close();
	
	public  void findElementss(String ele);
	
	
	
	
	
	
	
}
