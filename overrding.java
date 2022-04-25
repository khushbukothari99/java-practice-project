package helloworld;
class Parent {
	void Print()
	{
		System.out.print("parent class called");
	}
}

class subclass1 extends Parent 
{
	void Print()
	{
		System.out.println("subclass1 is called");
		

	}
}
class subclass2  extends Parent
{
	void Print()
	{
		System.out.println("subclass2 is called");
		

	}
}
public class overrding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent a=new subclass1();
		a.Print();
		
		Parent b=new subclass2();
		b.Print();
	}

}
