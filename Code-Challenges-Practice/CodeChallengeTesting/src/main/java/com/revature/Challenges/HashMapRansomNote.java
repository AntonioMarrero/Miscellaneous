package com.revature.Challenges;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapRansomNote {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		  
	        Scanner in = new Scanner(System.in);
	        int m = in.nextInt();
	        int n = in.nextInt();
	        
	        String magazine[] = new String[m];
	        
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	        	
	            magazine[magazine_i] = in.next();
	            
	        }
	        
	        HashMap<String,Integer> map = new HashMap<String, Integer>();
	        
	        for (int i=0; i<magazine.length; i++) {
	        	
	            if (map.containsKey(magazine[i])) {
	            	
	                map.put(magazine[i], map.get(magazine[i]) + 1);
	                
	            } else {
	            	
	                map.put(magazine[i], 1);
	            }
	        }
	        
	        String ransom[] = new String[n];
	        
	        boolean done = false;
	        
	        String answer = "Yes";
	        
	        for(int ransom_i=0; !done && ransom_i < n; ransom_i++){
	        	
	            ransom[ransom_i] = in.next();
	            
	            if (map.containsKey(ransom[ransom_i])) {
	            	
	                int x = map.get(ransom[ransom_i]);
	                
	                if (x > 1) {
	                	
	                    map.put(ransom[ransom_i], x - 1);
	                    
	                } else {
	                	
	                    map.remove(ransom[ransom_i]);
	                    
	                }
	                
	            } else {
	            	
	                done = true;
	                answer = "No";
	            }
	        }
	        
	        System.out.println(answer);
	    }
}