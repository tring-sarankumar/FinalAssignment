package collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class Hashmap 
{
    public void hashMap()
    {
    	Logger l =  Logger.getLogger("CreditCard");
    	 HashMap<Integer, String> languages = new HashMap<>();
    	 Scanner sc = new Scanner(System.in);
    	 
    	 
         try {
         	boolean loop=true;
         	while(loop) {
             l.info("Enter Keys:");
             int key=sc.nextInt();
         	 l.info("Enter Value:");
         	 String value=sc.next();
         	 languages.put(key, value);
         	
         	l.info("Do you Want to add another Value yes/no:");
         	String opt=sc.next();
         	if(opt.equalsIgnoreCase("no")) {
         		loop=false;
         	}
         	}
         	
         }catch(Exception e) {
         	l.info(" "+e);
         }
    	 
          l.log(Level.INFO,()->"HashMap: " + languages);

    	   
    	    l.log(Level.INFO,()->"Keys: " + languages.keySet());

    	    
    	     l.log(Level.INFO,()->"Values: " + languages.values());

    	    
    	    l.log(Level.INFO,()->"Key/Value mappings: " + languages.entrySet());
    	    
 
    	    
    	 // iterate through keys only
    	    l.info("Keys: ");
    	    for (Integer key : languages.keySet()) {
    	      l.info("The key:"+key);
    	    }

    	    // iterate through values only
    	    l.info("\nValues: ");
    	    for (String values : languages.values()) {
    	      l.info(values);
    	    }
    	    
    	    // iterate through key/value entries
    	    l.info("\nEntries: ");
    	    for (Entry<Integer, String> entry : languages.entrySet()) {
    	      l.info("key/value"+entry);
    	      
    	   	    
      	    
      	    l.info("do you want to remove Key yes/no");
      	    String opt=sc.next();
      	    if(opt.equalsIgnoreCase("yes")) {
      	        l.info("Enter Key to remove:");
                  int key=sc.nextInt();
             	    String value = languages.remove(key);
          	    l.log(Level.INFO,()->"Removed value: " + value);
      	    }
      	

      	    l.log(Level.INFO,()->"Updated HashMap: " + languages);
        
    }
}
}
