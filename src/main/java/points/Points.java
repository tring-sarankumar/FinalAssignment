package points;
import java.util.Scanner;
import java.util.logging.Logger;
public class Points 
{
    public void point()
    {
    	Logger log =  Logger.getLogger("points");
    	Scanner sc = new Scanner(System.in);
    	log.info("Enter Value for x:");
    	Float x = sc.nextFloat();
    	log.info("Enter Value for y:");
    	Float y = sc.nextFloat();
    	sc.close();
    	
        PointLogic obj= new PointLogic(x,y);
        PointLogic obj2 =obj.point();
        
        if(obj2.testEqual()) {
        	log.info("Values are same");
        }
        else {
        	log.info("Values are not same");
        }
    }
}
