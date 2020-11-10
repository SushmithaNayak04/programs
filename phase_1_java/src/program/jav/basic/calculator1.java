package program.jav.basic;
import java.util.Scanner; 

public class calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,result;
		char choice;
		Scanner scr = new Scanner(System.in);
		 do
	        {
	            System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n\n");
	           
	            System.out.print("Enter Your Choice : ");
	            choice = scr.next().charAt(0);
	            switch(choice)
	            {
	                case '1' : System.out.print("Enter Two Numbers : ");
	                    num1 = scr.nextDouble();
	                    num2 = scr.nextDouble();
	                    result = num1+num2;
	                    System.out.print("Result = " + result);
	                    break;
	                case '2' : System.out.print("Enter Two Numbers : ");
	                    num1 = scr.nextDouble();
                        num2 = scr.nextDouble();
                        result = num1-num2;
	                    System.out.print("Result = " + result);
	                    break;
	                case '3' : System.out.print("Enter Two Number : ");
		                num1 = scr.nextDouble();
	                    num2 = scr.nextDouble();
	                    result = num1*num2;
	                    System.out.print("Result = " + result);
	                    break;
	                case '4' : System.out.print("Enter Two Number : ");
		                num1 = scr.nextDouble();
	                    num2 = scr.nextDouble();
	                    result = num1/num2;
	                    System.out.print("Result = " + result);
	                    break;
	                case '5' : System.exit(0);
	                    break;
	                default : System.out.print("Wrong Choice!!!");
	                    break;
	            }
	            System.out.print("\n---------------------------------------\n");
	        }while(choice != 5);       
	    }
	}