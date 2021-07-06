package d_OOP_Interface;

public class ChromeDriver extends Browser implements WebDriver,Testing   {
	
	
	public ChromeDriver()
	{
		System.out.println("Chrome browser launched");
	}

	@Override
	public String getTitle() {
		
		return "google";
	}

	@Override
	public void get(String url) {
	
		System.out.println("launch the url:"+url);
		
	}

	@Override
	public void close() {
		
		System.out.println("close the browser");
		
	}

	@Override
	public void findElementss(String ele) {
		System.out.println("find the element"+ele);
		
	}

	@Override
	public void smokeTesting() {
		System.out.println("this is smoke");
		
	}

	@Override
	public void regressionTesting() {
		
		System.out.println("this is regression");
		
	}
	
	// individual method
		
	public void chromeVersion()
	{
		System.out.println("Chrome version is: 2.009");
	}
	

	@Override
	

	
	public void forward() {
		
		
		//super.forward();
		System.out.println("Wow... this is forward");
		
	}
	
	@Override
	public void back() {
		//super.back();
		System.out.println("Wow... this is back");
	}

	@Override
	public void click() {
		System.out.println("click method of Search context interface which linked with WebDriver by extends");
		
	}

	



}
