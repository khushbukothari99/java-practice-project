package helloworld;

public class exception2
	{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		checkAge(15);
		
	}
		
	
	static void checkAge(int age)
		{
			if (age<18)
			{
				throw new ArithmeticException("access denied,below 18");
			}
			else
			{
				System.out.println("permission granted");
			}
		}
		
		
}
