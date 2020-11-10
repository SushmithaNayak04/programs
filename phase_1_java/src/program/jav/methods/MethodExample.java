package program.jav.methods;

public class MethodExample {
	public void area(int b, int h){
		System.out.println("area of triangle is: " + (0.5*b*h));
	}
	public void area(double r){
		System.out.println("area of circle is: " + (3.14*r*r));
	}
	public void area(int w, long l){
		System.out.println("area of triangle is: " + (w*l));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample me=new MethodExample();
		me.area(10,10);
		me.area(7.0);
		me.area(5,7);
		

	}

}
