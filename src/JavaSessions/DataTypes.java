package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		
		// Data types : type of data
		// strict type : have to 
		//1. primitive datatype e.g. bollean , int, char,
		//2. non-primitive datatype e.g. array, string ,class,object,
		
		// 1. byte 
		// size : 1 byte = 8 bits 
		// range = -128 to 127
		byte b =20;
		System.out.println("byte value:"+b);
	
		//2. short
		// size: 2 bytes = 16 bits
		// range : -32768 to 32767
		
		short s = 100;
		
		System.out.println(s);
		// 3. int
		// size : 4 bytes = 32 bits
		// range : -2147483648 to 2147483647
		int i1 = 64;
		
		//4. long
		// size : 8 bytes = 64 bits
		// range : very high ( -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807)
		System.out.println(i1);
		long l1 = 545;
		System.out.println( Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		
		System.out.println(l1);
		//5. float
		// size : 4 byte = 32 bit
		// range : after . 7 digit
		
		float f1 = 23.33f;
		float f2 = (float)65.45;
		float f3 = 100;
		System.out.println(f1+f2);
		System.out.println(f3);

		// 6. double
		// size : 8 byte = 64 bits
		// range: after . upto 16 digits
		
		// 7. char : only single digit value
		// size : 2 bytes = 16 bits
		// a-z , A-Z , 0-9,special char 
		
		char c = 'a';
		char c1 = '1';
		
		// 8. boolean : true/false
		// size : ~1 bit
		System.out.println(c);
		System.out.println(c1);
		
		System.out.println(10/0.0);
		
	}

}
