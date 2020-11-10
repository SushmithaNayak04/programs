package program.jav.inheritance;

abstract class MNC{
	MNC(){
		System.out.println("Hello, Welcome");
		
	}
	abstract void run();
	abstract void run1();
	void display(){
		System.out.println("This is MNC company");
	}
}
	
	
	abstract class Infosys extends MNC{
		//abstract void leaves();
		void run(){
			System.out.println("Open");
		}
	}
	
	class Hello extends Infosys{
	/*	void leaves(){
			System.out.println("3 weeks of leaves per year.");
		}*/
		void run1(){
			System.out.println("It's also Open");
			
	}
		void show(){
			System.out.println("Thank you");
		}
	
	
	
}
public class AbstracExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Infosys h=new Hello();
		Hello he=new Hello();
		h.run();
		h.run1();
		h.display();
		he.show();
		
		

	}

}
