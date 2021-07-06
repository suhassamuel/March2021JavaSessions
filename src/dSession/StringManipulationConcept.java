package dSession;

public class StringManipulationConcept {

	public static void main(String[] args) {
		String str = "Hello Hi this is my java code and I am so happy";

		// String str = "ello Hi HI this is my java code and I am so happy";

		System.out.println(str.length());

		System.out.println("li = " + 0);
		System.out.println("len = " + str.length());
		System.out.println("hi = " + (str.length() - 1));

		System.out.println(str.charAt(1));
		System.out.println(str.charAt(11));

		System.out.println("=====================");

		System.out.println(str.indexOf('H')); // 0 -- 5

		System.out.println(str.indexOf('H', str.indexOf('H') + 1));

		// System.out.println(str.indexOf('H',1));
		System.out.println(str.indexOf('j'));
		System.out.println(str.indexOf('i'));// 1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 2nd occurrence of i

		System.out.println("=====================");

		String messg = "welcome null";
		if (messg.indexOf("admin") != -1) {
			System.out.println("login is passed");
		} else {
			System.out.println("FAIL");
		}

		System.out.println("=====================");

		//String sucessMeg = "your product macbook is added to cart";

		// trim:
		String s1 = "     hello world    ";
		//System.out.println(s1.trim().replace(" ", ""));
		
		System.out.println(s1);
		System.out.println(s1.trim());		
		System.out.println(s1.trim().replace(" ", ""));
		

		System.out.println("=====================");
		String test = "hi this is naveen automation labs";
		//System.out.println(test.substring(11));
		System.out.println(test.substring(test.indexOf('i') + 1));
		System.out.println(test.substring(test.indexOf('s') + 1));
		//System.out.println(test.substring(test.indexOf(test.indexOf('s') + 1)));
		
		//System.out.println(test.substring(4, 11));
		System.out.println("=====================");
		
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT_PHP";
		String language[] = lang.split("_");
		//System.out.println(language[0]);
		/*
		for(String e : language) {
			System.out.println(e);
		}*/
		
		for (int i = 0; i < language.length; i++) {
			String string = language[i];
			
			System.out.println(string);
			
		}
		System.out.println("=====================");
		
		System.out.println("lenght: "+language.length);
		
		for (int j= language.length-1; j > 0 ; j--) {
			String string = language[j];
			
			System.out.println(string);
			
		}
	}

}
