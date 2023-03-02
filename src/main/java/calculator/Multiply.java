package calculator;

public class Multiply extends Calculator
{
	Multiply(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		super.ans = super.num1 * super.num2;
		
	}
}
