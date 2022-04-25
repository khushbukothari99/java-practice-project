package helloworld;

public class simplemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		simplemethod mt=new simplemethod();
		System.out.println(mt.myMethod("khushbu"));
		String k=mt.myMethod("kamal");
		//myMethod("keya");
		System.out.println(k);
		
		
	}
		 String myMethod(String fname)
		{
		
		String fullname=fname +"jain";
		return fullname;
		}

	

}
