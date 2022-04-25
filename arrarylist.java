package helloworld;

import java.util.ArrayList;
import java.util.Collections;


public class arrarylist {

	public static void main(String[] args)
	
	{
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("sujuki");
		cars.add("maruti");
		System.out.println("names of cars list"+  cars);
		cars.remove("volvo");
		System.out.println("names of cars list"+  cars);
				
	   int k= cars.size();
	   System.out.println("size of arraylist"+  cars);
	   System.out.println(cars.get(0));
	   
	   cars.set(1, "hundai");
	   System.out.println("size of arraylist"+  cars);
	   cars.add(1,"maruti");
	   for(int i=0;i<cars.size();i++)
	   {
	   System.out.println(cars.get(i));
	   }
	   
	   Collections.sort(cars);
	   
	   for (String i:cars)
	   {
		   System.out.println(i);
	   }
	}

}