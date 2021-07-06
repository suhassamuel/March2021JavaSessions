package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava_Employee_8 {

	// WAF
	// param : studentName(String)
	// return marks (int)

	public int getStudentMarks(String studentName) {
		if (studentName.equals("Suhas")) {
			System.out.println("Student Name is:" + studentName);
			return 70;
		} else if (studentName.equals("Neha")) {
			System.out.println("Student Name is:" + studentName);
			return 50;
		} else {
			return -1;
		}

	}

	// WAF - launch browserName
	// param - brName
	// return - true or false

	public boolean getBrowserName(String brName) {

		switch (brName) {
		case "Chrome":
			System.out.println("Chrome launched");
			return true;

		case "FF":
			System.out.println("FF launched");
			return true;

		default:
			System.out.println("No broswer Found_______ 400 ERROR");
			return false;
		}

	}

	// WAF : getEmployeeInfo
	// input : empName(String)
	// return : Array of Devices

	public String[] getEmployeeInfo(String employeeName) {

		if (employeeName.equals("Abhi")) {
			String devices[] = { "Macbook", "iphone" };
			return devices;
		} else if (employeeName.equals("Suresh")) {
			String devices[] = { "Macbook", "iphone", "ipad", "macbook pro" };
			return devices;
		} else {
			System.out.println("info not found");
			return null;
		}

	}

	// WAP to getPageLink
	// param : pageName

	public ArrayList<String> getPageLink(String pageName) {
		System.out.println("Page name is :" + pageName);

		ArrayList<String> linklist = new ArrayList<String>();

		switch (pageName) {
		case "Login":
			linklist.add("login");
			linklist.add("Forgot Password");
			linklist.add("sign up");

			break;

		case "Home":
			linklist.add("info");
			linklist.add("add  to cart");
			linklist.add("product");

			break;

		case "Payment":
			linklist.add("Policy");
			linklist.add("Order");

			break;

		default:
			System.out.println("Page not found--- 404 not found");
			break;
		}
		return linklist;
	}

	public static void main(String[] args) {

		FunctionsInJava_Employee_8 obj = new FunctionsInJava_Employee_8();
		int mark = obj.getStudentMarks("Neha");
		System.out.println(mark);

		System.out.println("===========");

		System.out.println(obj.getBrowserName("Chrome"));

		System.out.println("===========");

		System.out.println(obj.getEmployeeInfo("Suresh").length);
		for (String s : obj.getEmployeeInfo("Suresh")) {
			System.out.println(s);
		}
		System.out.println("===========");

		System.out.println(obj.getPageLink("Payment").size());

		obj.getPageLink("Payment").stream().forEach(e -> System.out.println(e));

		System.out.println("===========");

		for (String st : obj.getPageLink("Login")) {
			System.out.println(st);
		}

	}

}
