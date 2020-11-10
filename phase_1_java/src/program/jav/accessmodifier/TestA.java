package program.jav.accessmodifier;

public class TestA {

	private int a=45;
	public float b=45.0f;
	long c=500;
	protected double d=500.20;
	public void display()
	{
		System.out.println("value of private variable a is " + a);
		System.out.println("value of public variable b is " + b);
		System.out.println("value of default variable long c is " + c);
		System.out.println("value of protected variable double d is " + d);

	}

}
