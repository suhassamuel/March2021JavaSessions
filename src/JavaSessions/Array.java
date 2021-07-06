package JavaSessions;

public class Array {

	public static void main(String[] args) {

		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println("Length: "+i.length);
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println("Array"+"["+j+"] :"+i[j]);
		}
		
		String str[]= new String[3];
		
		str[0]= "Suhas";
		str[1]= "Myra";
		str[2]="Eva";
		
		System.out.println("String length:"+str.length);
		for(int j1=0;j1<str.length;j1++)
		{
			System.out.println("String"+"["+j1+"] :"+str[j1]);
		}
		
		Object ob[]= new Object[5];
		
		ob[0]="test";
		ob[1]=123;
		ob[2]='c';
		ob[3]=22.52;
		ob[4]=55;
		
		for(Object ob1:ob)
		{
			System.out.println("Object :"+ob1);
		}
		

	}

}
