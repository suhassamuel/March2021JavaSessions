package d_OOP_Interface;

public class TestSelenium {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		//WebDriver
		driver.getTitle();
		driver.get("www.google.com");
		driver.close();
		
		
		// Testing class
		driver.regressionTesting();
		driver.smokeTesting();
		
		driver.chromeVersion();
		
		driver.forward();
		driver.back();
		driver.click();
		
		
	//	WebDriver driver2 = new ChromeDriver(); // topcasting
		
	
		
		

	}

}
