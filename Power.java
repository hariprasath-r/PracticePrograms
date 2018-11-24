import java.util.*;
// power using recursion
public class Power
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = in.nextInt();
		System.out.println("Enter the power :");
		int p = in.nextInt();
		System.out.println("The Value of " + n + " raised to the power " + p + " is : " + power(n,p));
	}
	
	static int power(int n, int p)
	{
		if(p == 0)
			return 1 ;
		else 
			return (n*power(n,p-1));
	}
}