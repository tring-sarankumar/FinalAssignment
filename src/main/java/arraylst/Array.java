package arraylst;

import java.util.Scanner;
import java.util.logging.Logger;



public class Array 
{
    public void array()
    {
    	Logger log = Logger.getLogger("Array");
        Arr obj = new Arr();
        Scanner sc = new Scanner (System.in);
        boolean loop=true;
        while(loop) {
        	log.info("1.Insert 2.Remove 3.Display 4.Exit");
        	int option=sc.nextInt();
        	switch(option) {
        	
        	case 1:
        		try {
        		log.info("Enter Value ");
                int a=sc.nextInt();
                obj.insert(a);}
        		catch(Exception e) {
        			log.info(" "+e);
        			sc.next(); 			
        		}
                break;
        	case 2:
        		obj.remove();
        		break;
        	case 3:
        		obj.display();		 
        		break;
        	case 4:
        		loop=false;
        		break;
        	
        	default:
        		log.info("Enter Correct Option!!!");
        		break;
        	}
            
        
        }
    }
}
