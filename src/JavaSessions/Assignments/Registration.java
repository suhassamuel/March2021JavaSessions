package JavaSessions.Assignments;

public class Registration {
	String firstName;
	String lastName;
	String email;
	String telephone;
	String password;

	// Constructor overloading
	public Registration(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Registration(String firstName, String lastName, String email) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Registration(String firstName, String lastName, String email,
			String telephone) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
	}
	public Registration(String firstName, String lastName, String email,
			String telephone, String password) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
	}

	public static void main(String[] args) {
		Registration reg = new Registration("Suhas", "samuel");
		System.out.println(reg.firstName + " : " + reg.lastName);
		Registration reg1 = new Registration("suhas", "samuel", "suhas.sahaj1@gmail.com");
		System.out.println(reg1.firstName + " : " + reg1.lastName + " : " + reg1.email);

		Registration reg2 = new Registration("Suhas", "samuel", "suhas.sahaj1@gmail.com",
				"+1 306 000 0000");
		System.out.println(reg2.firstName + " : " + reg2.lastName + " : " + reg2.email 
				+ " : " + reg2.telephone);

		Registration reg3 = new Registration("suhas", "samuel", "suhas.sahaj1@gmail.com",
				"+1 306 000 0000","suhas@123");

		System.out.println(reg3.firstName + " :" + reg3.lastName + ": " + reg3.email +
				": " + reg3.telephone + ":"	+ reg3.password);
	}
}
