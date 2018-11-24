public class MathTest
{
	public static void main(String[] args)
	{
		// Math class operations 
		int x = 5;
		int y = 6;
		double z = 24.80;
		//Absolute
		System.out.println("Absolute value of " + x + "-" + y + " is :" + Math.abs(x-y));
		//Square root
		System.out.println("Square root of 6 is : " + Math.sqrt(y));
		//Floor
		System.out.println("Floor of " + z + " is : " + Math.floor(z));
		//Ceil
		System.out.println("Ceil of " + z + " is :" + Math.ceil(z));
		//Maximum 
		System.out.println("Maximum of " + x + " and " + y + " is : " + Math.max(x,y));
		//Minimum
		System.out.println("Minimum of " + x + " and " + y + " is : " + Math.min(x,y));
		//power
		System.out.println("Value of " + x + " raised to power " + y + " is : " + Math.pow(x,y));
	}
}