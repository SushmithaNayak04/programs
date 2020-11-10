package program.jav.thread;

class Table{
	void prinTable(int n){
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
class MyThread3 extends Thread{
	Table t;
	MyThread3 (Table t){
		this.t=t;
	}
	public void run(){
		t.prinTable(30);
		//System.out.println("thread3");
	}
	
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run(){
		t.prinTable(5);
		//System.out.println("thread1");
	}
	
}

class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run(){
		t.prinTable(25);
		//System.out.println("thread2");
	}
	
}





public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);  
		MyThread2 t3=new MyThread2(obj);  
		
		t3.start();
		t1.start();  
		t2.start(); 

	}

}
