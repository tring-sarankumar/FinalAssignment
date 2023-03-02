package calculator;

public class Add extends Calculator
{
	Add(double x , double y)
	{
		super(x,y);
	}
	public void calculate()
	{
		super.ans = super.num1 + super.num2;
	}
}
