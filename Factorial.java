import java.util.*;

class Facto
{
	int n;
	
	public int fact(int n)
	{
		if(n == 1)
			return n;
		else
			return (n*fact(n-1));
	}
	
}


public class Factorial
{
	public static void main(String[] args)
	{
		Facto f = new Facto();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = in.nextInt();
		System.out.println("The Factorial of the given number is : " + f.fact(number));
	}
}