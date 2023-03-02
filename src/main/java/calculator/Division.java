package calculator;

import java.util.logging.Logger;

public class Division extends Calculator
{
	Logger logger = Logger.getLogger("hi");
	Division(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
			super.ans = super.num1 / super.num2;
			
	}
}
