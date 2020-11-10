package program.jav.basic;
import java.util.Scanner;
public class MainMethod {
	
	public static int main(String[] args)
	/*at the time of execution JVM does not consider this new method
	(with return type other than void) as the entry point of the program. It searches for the main method 
	which is public, static, with return type void, and a String array as an argument.*/
	
	{
		// TODO Auto-generated method stub
		int a;
		int b;
		int res;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		res=a+b;
		System.out.println("Sum of two no is:" +res);
		return res;
		

	}
	
	/*public static void main(int[] args) 
	
	
	{
		// TODO Auto-generated method stub
		int a;
		int b;
		int res;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		res=a+b;
		System.out.println("Sum of two no is:" +res);
		
		

	}*/


}
 

