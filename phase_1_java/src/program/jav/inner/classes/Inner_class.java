package program.jav.inner.classes;


/*public class Inner_class {
	//private int data=40;
	//protected int data=40;
	
	public int data=40;

	 class Inner{
		
		public void display(){
			System.out.println("data is" + data);
		}
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner_class obj=new Inner_class();
		Inner_class.Inner in=obj.new Inner();
        in.display();
        
        //System.out.println("value of data:" + obj.data);//accessing private variable data
        System.out.println("value of data:" + obj.data);//accessing public variable data
	}*/


public class Inner_class {
	//private int data=40;
	//protected int data=40;
	
	public int data=40;

	 private class Inner{
		
		public void display(){
			System.out.println("data is" + data);
		}
	 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner_class obj=new Inner_class();
		Inner_class.Inner in=obj.new Inner();
        in.display();
        
        //System.out.println("value of data:" + obj.data);//accessing private variable data
        System.out.println("value of data:" + obj.data);//accessing public variable data
	}


	
}
