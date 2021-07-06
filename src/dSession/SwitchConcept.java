package dSession;

public class SwitchConcept {

	
	// some input but no output
	
	// waf using switch to check and print respecitve browser name
	public static void launchBrowser(String browsername) {
		//String browsername = "chrome";

		switch (browsername.toLowerCase()) {
		case "chrome":

			System.out.println("this is chrome browser");
			break;
		case "firefox":
			System.out.println("this is firefox browser");
			break;

		case "IE":
			System.out.println("this is IE browser");
			break;
		default:
			System.out.println("no browser found");
			break;
		}

	}
	
	// some input but some output
	
	
	public static boolean launchBrowser1(String browsername) {
		//String browsername = "chrome";

		switch (browsername.toLowerCase()) {
		case "chrome":

			System.out.println("this is chrome browser");
			return true;
		
		case "firefox":
			System.out.println("this is firefox browser");
			return true;

		case "IE":
			System.out.println("this is IE browser");
			return true;
			
		default:
			System.out.println("no browser found");
		
			return false;
		}

	}
	

	public static void main(String[] args) {
		
		//launchBrowser("CHROME");
		
		System.out.println("==============");
		boolean b = launchBrowser1("tesst");
		
		if (b== false)
		{
			System.out.println("please pass correct browser name");
		}
		else
		{
			System.out.println("wow.. you got it right");
		}
		//System.out.println(b);

	}

}
