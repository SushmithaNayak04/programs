package program.jav.methods;

public class MethodExample1 {
	public int area(int b, double h){
		System.out.println("area of triangle is: " + (0.5*b*h));
		return 0;
	}
	public long area(long r){
		System.out.println("area of circle is: " + (3.14*r*r));
		return 0;
	}
	public double area(double w, double l){
		System.out.println("area of rectangle is: " + (w*l));
		return 0.0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample1 me=new MethodExample1();
		me.area(10,10.0);
		me.area(25);
		me.area(5.0,7.0);

	}

}
