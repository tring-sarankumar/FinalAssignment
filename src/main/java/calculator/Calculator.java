package calculator;

public abstract class Calculator
{
	double num1;
	double num2;
	double ans;
	Calculator(double x , double y)
	{
		num1 = x;
		num2 = y;
	}
	public abstract void calculate();
}
