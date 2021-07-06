package JavaSessions.Assignments;

import java.util.ArrayList;
import java.util.List;

/*1. Design a University class template with the following features:
variables:
	name
	country
	establishedDate
	List of course provided in Array List<String>
--	Design the constructor of this class with different parameters and all parameters.
--  Write the get method of each variable with return keyword. 
*/

public class University {

	String name;
	String country;
	String establishedDate;
	List<String> course;

	// Design the constructor of this class with different parameters and all parameters.

	public University(String name) {
		this.name = name;
	}

	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public University(String name, String country, String establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}

	public University(List<String> course) {
		this.course = course;
	}

	public University(String name, String country, String establishedDate,
			List<String> course) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.course = course;
	}
	
	
	// 	Write the get method of each variable with return keyword. 
	
	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public List<String> getCourse() {
		return course;
	}
	
	public static void main(String[] args) {

		List<String> course = new ArrayList<String>();
		course.add("Computer Science");
		course.add("Bio tech");
		course.add("Chemical techonology");
		course.add("Bio Science");
		course.add("Botany");
		
		University u1 = new University("Gujarat university");
		University u2 = new University("IIT Mumbai","India");
		University u3 = new University("Delhi University","India","Year: 1922");
		University u4 = new University(course);
		University u5 = new University("oxford university","UK","Year: 1096",course);
		
		System.out.println(u1.name);
		System.out.println(u2.name +" "+u2.country);
		System.out.println(u3.name +" "+u3.country+" "+u3.establishedDate);
		System.out.println(u4.course);
		System.out.println(u5.name+" "+u5.country+" "+u5.establishedDate+" "+u5.course);
		u5.course.stream().forEach(e->System.out.println(e));
		}
}
