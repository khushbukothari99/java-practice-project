package helloworld;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
		int [] myNumbers= {1,2,3};
		System.out.println(myNumbers[10]);
		}
		catch(Exception e)
		{
			System.out.println("somethng went wrong");
		}
       
		finally
		{
			System.out.println("the try catch is finished");
		}
	}

}
