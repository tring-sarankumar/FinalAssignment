package contacts;
import java.util.*;
import java.util.logging.Logger;
public class MainContact 
{
    public void contacts()
    {
    	Scanner sc = new Scanner(System.in);
    	Logger logger = Logger.getLogger("hi");
    	LinkedList obj = new LinkedList();
    	while(true)
    	{
    		logger.info("Choose Option:\n1.Add\n2.Remove\n3.Search\n4.Print\n5.exit");
    		int op = sc.nextInt();
    		switch(op)
    		{
    			case 1:
    			{
    				try {
    	    		logger.info("Enter Name:");
    	    		String name = sc.next();
    	    		logger.info("Enter Your Mobile Number:");
    	    		int phone = sc.nextInt ();
    	    		logger.info("Enter Email ID:");
    	    		String email = sc.next();
    	    		
    				obj.addElement(name,phone,email);
    				}catch(Exception e) {
    					logger.info(" "+e);sc.next();
    				}
    				break;
    			}
    			case 2:
    			{
    				logger.info("Enter Name:");
    				String remname = sc.next();
    				obj.removeElement(remname);
    				break;
    				
    			}
    			case 3:
    			{
    				logger.info("Enter Name to search::");
    				String search = sc.next();
    				obj.search(search);
    				break;
    			}
    			case 4:
    			{
    				obj.print();
    				break;
    			}
    			case 5:
    			{
    				System.exit(0);
    				break;
    			}
    			default:
    			{
    				logger.info("Invalid Option");
    				break;
    			}
    		}
    	}
    }
}
