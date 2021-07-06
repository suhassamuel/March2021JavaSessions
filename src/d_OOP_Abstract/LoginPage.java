package d_OOP_Abstract;

public class LoginPage extends Page {

	public LoginPage()
	{
		
		System.out.println("Login Page: constrcutor");
		System.out.println("============");
	}
	
	
	@Override
	public void test1() {
	System.out.println("test 1 method");
		
	}

	@Override
	public String getTitle() {
	  String st=	"Hello";
		return st; 
	}
	
	public void login()
	{
		System.out.println("login method");
	}

}
