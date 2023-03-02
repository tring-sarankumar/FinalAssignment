package arraylst;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrList {
	protected String index="Enter Index:";
	protected String crtIndex="Enter Correct Index or add value to list!!!";
	Logger log = Logger.getLogger("Array");
		
	ArrayList<String> bikes = new ArrayList<String>();
	Scanner sc = new Scanner (System.in);

	public void arrlst() {

		
		boolean loop=true;
		while(loop) {
			log.info("1.add 2.Get Element At index 3.Change Element At index 4.remove 5.clear list");
			int option = sc.nextInt();
			switch(option) {
			
			case 1:
				log.info("Enter Value:");
				String str=sc.next();
				bikes.add(str);
				break;
			case 2:
				try {
				log.info(index);
				int getIndex=sc.nextInt();
				log.info(bikes.get(getIndex));}
				catch(IndexOutOfBoundsException e) {
					log.info(crtIndex);
				}
				break;
			
			case 3:
				try {
				log.info(index);
				int changeIndex = sc.nextInt();
				log.info("Enter Value:");
				String value=sc.next();
				bikes.set(changeIndex, value);}
				catch(IndexOutOfBoundsException e) {
					log.info(crtIndex);
				}
				break;
			case 4:
				try {
				log.info(index);
				int removeIndex = sc.nextInt();
				bikes.remove(removeIndex);}
				catch(IndexOutOfBoundsException e) {
					log.info(crtIndex);
				}
				break;
			case 5:
				bikes.clear();
				break;
			default:
        		log.info("Enter Correct Option!!!");
        		break;
			}
		
		}
	    
	}

}
