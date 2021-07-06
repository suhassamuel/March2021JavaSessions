package d_OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW obj = new BMW();
		obj.start(); // car inherited
		obj.stop(); // BMW .. overridden
		obj.autostart(); // BMW .. individual

		System.out.println("--------------------");
		Car obj2 = new Car();

		obj2.start();
		obj2.stop();
		obj2.refuel();

		System.out.println("--------------------");

		// child class object can be referred by parent class ref variable:
		// Top/Up casting
		Car c1 = new BMW();

		c1.start();
		c1.stop();
		c1.refuel();

		// Down CAsting:
		// parent class object can be referred by child class ref variable:
		 // BMW b1 = (BMW) new Car();//ClassCastException

	}

}
