package helloworld;
interface Vechicle
{
	void changegear(int a);
	void speedup(int a);
	void applybrakes(int a);
	
}

class Testclass implements In1
{
	public void display()
	{
		System.out.println("geek");
				
	}
}
public class interfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testclass t=new Testclass();
		t.display();
		System.out.println(Testclass.a);
	}

}
