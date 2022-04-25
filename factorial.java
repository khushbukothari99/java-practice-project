package helloworld;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		findfact(a);
		

	}

	public static void findfact(int a)

{
	   int mul=1;
	   mul= a*(findfact(a-1));
		//for(int i=2;i<=a;i++)
		//{
			//mul=mul*i;
		//}
		
		System.out.println("factorial of number is " + mul);
}
}
