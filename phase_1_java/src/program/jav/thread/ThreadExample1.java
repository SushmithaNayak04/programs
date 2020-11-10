package program.jav.thread;

class Table1{
	void prinTable1(int n){
		synchronized(this){
			for(int i=1;i<=5;i++){
				System.out.println(n*i);
				try{
					Thread.sleep(400);
				}catch(Exception e) {
					System.out.println(e);
				}
					
				}
			}
		}
		
	}
class MyT3 implements Runnable{
	Table1 t;
	MyT3 (Table1 t){
		this.t=t;
	}
	public void run(){
		t.prinTable1(30);
		//System.out.println("thread3");
	}
	
}

class MyT1 implements Runnable{
	Table1 t;
	MyT1(Table1 t){
		this.t=t;
	}
	public void run(){
		t.prinTable1(5);
		//System.out.println("thread1");
	}
	
}

class MyT2 implements Runnable{
	Table1 t;
	MyT2(Table1 t){
		this.t=t;
	}
	public void run(){
		t.prinTable1(25);
		//System.out.println("thread2");
	}
	
}



public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample1 TE=new ThreadExample1();
		Table1 obj = new Table1();
		Thread t1=new Thread();
		
		MyT1 t1=new MyT1(obj);
		MyT2 t2=new MyT2(obj);  
		MyT2 t3=new MyT2(obj);  
		
		t3.start();
		t1.start();  
		t2.start(); 

	}

}
