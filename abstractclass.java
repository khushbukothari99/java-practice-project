package helloworld;


	abstract class Base
	{
		//t color;
		Base()
		{
			System.out.println("base constructor called");
		}

		final void fun()
		{
			System.out.println("base fun() called");
			
		}
		
		static void demofun()
		{
			System.out.println("static method called");
			
		}
	}
	
	class Derived extends Base
	
	{
		
	}
	public class abstractclass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Base b=new Derived();
		b.fun();
		
		Derived d=new Derived();
		d.fun();
		
		Base.demofun();
		Derived.demofun();
	}


}