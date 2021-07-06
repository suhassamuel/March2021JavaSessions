package dSession;

public class FuntionsInJava {

	// 1. no input - no output

	public void test() {
		System.out.print("hello dimpu");
	}

	// 2. no input - some output

	public int add() {
		int x = 5;
		int y = 6;

		int total = x + y;
		System.out.println("Total value of x and y: " + total);
		return total;
	}

	public String addname() {
		String st1 = "hello hi kem cho,,,, maza ma";

		return st1;
		
	}

	// 3. some input and some output

	public int multi(int x, int y) {


		return x * y;

	}
	
	// 4. some input and no output
	
	public void sub(int x2, int y2) {


		int sub1 =  x2 - y2;
		System.out.println("subtrction:"+x2+"and"+y2);
		System.out.println(sub1);

	}

	public static void main(String[] args) {

		FuntionsInJava obj = new FuntionsInJava();
		
		
		
		obj.test();
		System.out.println("======");
		int t = obj.add();
		System.out.println(t - 1);

		System.out.println(obj.addname());

		int value= obj.multi(100, 50);
		System.out.println("value is:" +value);
		
		obj.sub(50, 10);

	}

}
