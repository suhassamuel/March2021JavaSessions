package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a  = 100;
		int  b=300;
		System.out.println(a+b);
		System.out.println("=============1===============");
		
		String x = "Hello";
		String y= "world";
		System.out.println(x+y+a+b); //Helloworld100300
		
		System.out.println(a+b+x+y); //400Helloworld
		System.out.println(x+y+(a+b)); //Helloworld400
		
		System.out.println("value of a:"+a);
		System.out.println("value of a+b:"+a+b);
		System.out.println("value of (a+b):"+(a+b));
		char c1 = 'a';
		char c2  = 'b';
		// a to z = 97 to 122
		// A to Z = 65 to 90
		// 0 to 9 = 48 to 57
		System.out.println(c1+c2); // 97 + 98 =195
		System.out.println(c1);
		System.out.println(c1-c2); // -1
		System.out.println(c1*c2);
		System.out.println(c1/c2);
		
		System.out.println('A');
		
		//System.out.println('A2');
		//System.out.println('A1'/'A2');
	}

}
