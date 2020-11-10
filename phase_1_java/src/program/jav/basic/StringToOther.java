package program.jav.basic;
import java.util.Scanner;

public class StringToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String str= sc.nextLine();     //reads string
		
		int i=Integer.parseInt(str);
		System.out.println("String converted to int : " + i);
		
		float f=Float.parseFloat(str);
		System.out.println("String converted to float: " +f);
		
		long x=Long.parseLong(str);
		System.out.println("String converted to int : " + x); 
		
		double y=Double.parseDouble(str);
		System.out.println("String converted to float:  "+y);
		
		//explicit conversion
		System.out.println("enter double value: ");
		double d= sc.nextDouble();
		float e=(float)d;
		int o=(int)e;
		System.out.println("String converted to float:  " + d);
		System.out.println("String converted to int:  " + o);

	}

}
