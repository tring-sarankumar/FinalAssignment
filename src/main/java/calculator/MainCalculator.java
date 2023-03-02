package calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class MainCalculator 
{
    public void calculate()
    {
    	double num1;
    	double num2;
		double result;
    	Calculator obj;
    	Logger logger = Logger.getLogger("hi");
    	
    	Scanner sc = new Scanner(System.in);
 
    	logger.info("Enter First Number");
    	num1 = sc.nextDouble();
    	
    	result = num1;
    	while(true)
    	{
    		try {
        	logger.info("Enter Next Number");
        	num2 = sc.nextDouble();
        	
        	logger.info("Choose Operation addition(1) substraction(2) multiple(3) division(4) exit(5)");
        	int option = sc.nextInt();
    		
        	switch(option)
        	{
        		case 1:
        		{
        			obj = new Add(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 2:
        		{
        			obj = new Subract(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 3:
        		{
        			obj = new Multiply(result,num2);
        			obj.calculate();
        			result = obj.ans;
        			break;	
        		}
        		case 4:
        		{
        			obj = new Division(result,num2);
        			obj.calculate();
        			result = obj.ans;
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
		String res = String.valueOf(result);
        	logger.info(res);
    	}catch(Exception e) {
    		logger.info(" "+e);
    		sc.nextLine();
    	}
     }
    
   }
}













