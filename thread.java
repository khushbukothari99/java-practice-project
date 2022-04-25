package helloworld;

public class thread extends Thread{
	
	public static void main(String[] args) {
		
	thread td=new thread();
	td.start();
	System.out.println("outside of thread");
	
	
	}
	
	public void run()
	{
		System.out.println("inside the thread");
	}
	}
	


