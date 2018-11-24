public class Formulas
{
	// x / y - 3
	// 1 / (x+y)
	// the square root of x to the 6th plus y to the 5th
	// absolute value of x + y
	
	public static void main(String[] args)
	{
		double x = -13.0;
		double y = 2.0;
		System.out.println(" x / y - 3 : " + (x / y - 3));
		System.out.println(" 1 / (x+y) :" + 1 / (x+y));
		System.out.println(" Square root of x to the 6th plus y to the 5th : " + (Math.pow(x,6)+Math.pow(y,5)));
		System.out.println(" Absolute value of x + y : " + Math.abs(x+y));
	}
}