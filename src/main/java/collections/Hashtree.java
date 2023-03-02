package collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Hashtree {

	public void hashTree() {
		Logger l =  Logger.getLogger("HashTree");
		Scanner sc = new Scanner(System.in);
	      // TreeSet
        TreeSet<String> ts = new TreeSet<>();
        
        try {
        	boolean loop=true;
        	while(loop) {
        	log.info("Enter Value:");
        	String value=sc.next();
        	ts.add(value);
        	l.info("Do you Want to add another Value yes/no:");
        	String opt=sc.next();
                if(opt.equalsIgnoreCase("no")) {
         		     loop=false;
         	  }
         }
        	
        }catch(Exception e) {
        	l.info(" "+e);
        }
        
  
  
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        l.info(" "+ts);
        
      //Traversing elements 
        Iterator<String> it=ts.iterator();
		while(it.hasNext()) {
			l.log(Level.INFO,()->" " +it.next());
		}
		
		//Size
		l.log(Level.INFO,()->" "+(map.size()));
		
		ts.remove("BC");

	}

}
