package helloworld;
class helper
{
	static int Multiply(int a,int b)
	{
		return a*b;
	}
	static int Multiply(int a,int b,int c)
	{
		return a*b;
	}
}

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(helper.Multiply(2,4));
		System.out.println(helper.Multiply(2,3,4));
	}

}
