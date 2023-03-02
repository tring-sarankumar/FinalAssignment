package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

public class Hashset {

	public void hashSet() {
		//Creating HashSet and adding elements
		 Logger log =  Logger.getLogger("hashset");
		 HashSet<String> set=new HashSet<String>();  
		 Scanner sc = new Scanner(System.in);
	        try {
	        	boolean loop=true;
	        	while(loop) {
	        	log.info("Enter Value:");
	        	String value=sc.next();
	        	set.add(value);
	        	log.info("Do you Want to add another Value yes/no:");
	        	String opt=sc.next();
        	        if(opt.equalsIgnoreCase("no")) {
         		     loop=false;
         	        }
	        	}
	        	
	        }catch(Exception e) {
	        	log.info(" "+e);
	        }
         //Traversing elements 
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         log.info(); 
		 log.fine("Elements {}", i.next());
         }  
         
   	    log.info("do you want to remove Key yes/no");
   	    String opt=sc.next();
   	    if(opt.equalsIgnoreCase("yes")) {
   	        log.info("Enter value to remove:");
               String value = sc.next();
               set.remove(value);
		log.fine("Removed Value {}", value);
   	    }
   	    
         
        while(i.hasNext())  
        {  
        log.fine("Elements {}", i.next());  
        } 
         


	}

}

