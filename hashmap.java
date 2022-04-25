package helloworld;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String ,String> capitalCities= new HashMap<String,String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germny", "Berlin");
		capitalCities.put("Norway", "Odlo");
		capitalCities.put("USA", "washington");
		
        System.out.println(capitalCities);
        
        System.out.println(capitalCities.get("USA"));
        
        System.out.println(capitalCities.size());
        
        for(String i:capitalCities.keySet())
        {
        	System.out.println( i + capitalCities.get(i));
        	
        }
       
	}

}
