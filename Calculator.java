package program.jav.basic;
import java.util.Scanner; 

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double ans;
		char op;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1=scr.nextDouble();
		num2=scr.nextDouble();
		System.out.println("Enter an operator ");
		op=scr.next().charAt(0);
		switch(op)
		{
		case '+': ans=num1+num2;
		break;
		case '-': ans=num1-num2;
		break;
		case '*': ans=num1*num2;
		break;
		case '/': ans=num1/num2;
		break;
	    default:System.out.println("Enter correct operator");
	    return;
		}
		System.out.println("Result is given below");
		System.out.println(num1+ " " +op+ " " +num2+ " = " +ans);
		

	}

}
