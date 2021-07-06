package JavaSessions;

public class ClassAndObject_reference_Car_7 {

	String name;
	int price;
	String color;
	double mileage;
	boolean launched;
	char isAutotmatic;
	static final int wheels =4;
	final int num = 3;

	public static void main(String[] args) {

		ClassAndObject_reference_Car_7 c1 = new ClassAndObject_reference_Car_7();

		c1.name = "Audi";
		c1.price = 70;
		c1.color = "White";
		c1.mileage = 12.89;
		c1.launched = true;
		c1.isAutotmatic = 'Y';
		//c1.wheels = 5;

		System.out.println(c1.name + " " + c1.price+ c1.color + " " + c1.mileage + " " + c1.isAutotmatic + " "
				+ c1.launched  + " " + ClassAndObject_reference_Car_7.wheels);

		ClassAndObject_reference_Car_7 c2 = new ClassAndObject_reference_Car_7();

		c2.name = "BMW";
		c2.color = "Red";
		c2.isAutotmatic = 'Y';
		System.out.println(c2.name + " " + c2.price + " " + c2.color + " " + c2.mileage + " " + c2.isAutotmatic + " "
				+ c2.launched);

	//	ClassAndObject_reference_Car_7 c3 = new ClassAndObject_reference_Car_7();

		/*c3.name = "HONDA";
		
		System.out.println(c3.name) ;
		c3 = null;
		System.out.println(c3.name) ;*/
	}

}
