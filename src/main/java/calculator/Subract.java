package calculator;

public class Subract extends Calculator
{
	Subract(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		super.ans = super.num1 - super.num2;
		
	}
}
