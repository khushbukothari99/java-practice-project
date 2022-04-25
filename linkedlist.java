package helloworld;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> cars=new LinkedList<String>();
		cars.add("volvo");
		cars.add("maruti");
		cars.add("hundai");
		cars.add("bmw");
		cars.add("od");
		
		for(int i=0;i<cars.size();i++)
		{
		   System.out.println(cars.get(i));
		   
		}  
		
		cars.addFirst("mercidese");
		
		for(int i=0;i<cars.size();i++)
		{
		   System.out.println("addfirst "+ " " +  cars.get(i));
		   
		}  
		
		cars.addLast("nano");
		
		for(int i=0;i<cars.size();i++)
		{
		   System.out.println("addlast"+ cars.get(i));
		   
		}  
		
		cars.removeFirst();
		for(int i=0;i<cars.size();i++)
		{
		   System.out.println("removefirst" + cars.get(i));
		   
		}  
		
		cars.removeLast();
		for(int i=0;i<cars.size();i++)
		{
		   System.out.println("removelastt" + cars.get(i));
		   
		}  
		
		System.out.println("firstcAR" +cars.getFirst());
		
	
		LinkedList<Integer> number=new LinkedList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		System.out.println(number);
		
		Iterator<Integer> it =number.iterator();
		System.out.println(it.next());
		
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
 	}

}
