package com.revature.Challenges;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
		
		//Creates a new HashMap
		HashMap hm = new HashMap();
		
		//Put elements in to the map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		
		//Get a set of the entries
		Set set = hm.entrySet();
		
		//Get an Iterator
		Iterator i = set.iterator();
		
		//Display the elements
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		//Deposit 1500 into Zara's account
		double balance = ((Double)hm.get("Zara")).doubleValue();
		hm.put("Zara", new Double(balance + 1500));
		System.out.println("Zara's new balance is: " + hm.get("Zara") );
		
	}

}
