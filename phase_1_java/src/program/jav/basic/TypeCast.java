package program.jav.basic;
import java.util.Scanner;



public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //---------TYPECAST BETWEEN INT and LONG------------//
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer number");
		int i=sc.nextInt();
		long j=i;  // implicit type conversion from int to long
		System.out.println("long value "+ j);
		
		int o= (int)j;// explicit type conversion from long to int  
		System.out.println("int value "+ o);
		
		 //---------TYPECAST BETWEEN INT and FLOAT------------//
		System.out.println("enter an integer number");
		int a =sc.nextInt();
		float b = a; // implicit type conversion from int to float
		System.out.println("float value "+ b);
		
		int c=(int)b; //explicit type conversion from int to float
		System.out.println("int value "+ c);
		
		//--------TYPECAST BETWEEN DOUBLE and FLOAT---------//
		System.out.println("enter double value");
		double d = sc.nextDouble();
		float e = (float)d; // explicit typecast from double to float
		System.out.println("double value "+ d);
		System.out.println("float value "+ e);
		
		//--------TYPECAST FROM DOUBLE --> LONG --> INT in series---------//
		System.out.println("enter double value");
		double x = sc.nextDouble();
		long y = (long)x; // explicit typecast from double to long
		int z = (int)y; // explicit typecast from double to int
		System.out.println("double value "+ x);
		System.out.println("long value "+ y); 
		System.out.println("int value "+ z); 
		
		//--------TYPECAST BETWEEN LONG and FLOAT------------//
		System.out.println("enter long number");
		long f = sc.nextLong();
		float g=(float)f;//explicit type conversion from long to float
		System.out.println("float value "+ g);
		
		//--------TYPECAST BETWEEN BYTE, INT and DOUBLE--------//   
		byte m;
		int n=257;
		double p=257.012;
		
		System.out.println("**Conversion of int to byte.**"); 
		m=(byte) n;  //n%256 will happen
		System.out.println("int n= " + n + " byte m= " + m);
		
		System.out.println("\n**Conversion of double to byte.**"); 
        m = (byte) p;      //p%256 will happen
        System.out.println(" double p= " + p + " byte b= " + m); 
		
		

	}

}
