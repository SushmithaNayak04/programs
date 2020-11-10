package program.jav.accessmodifier;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA obj =new TestA();
		
		obj.display();  //calling public method
		System.out.println("Value of public var b is " + obj.b); //accessing public variable (float) of class TestA using TeatA obj
		//System.out.println("Value of private variable a is " +obj.a);  //Compile time error because b is a private variable and can't be accessible outside the class.
		System.out.println("Value of default variable long c is " + obj.c);
		System.out.println("Value of protected variable double d is " + obj.d);
	}

}
