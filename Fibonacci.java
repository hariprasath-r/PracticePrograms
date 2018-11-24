import java.util.*;
// still not right
class Fibo
{
	int n;
	
	int fib(int n)
	{
		if(n == 0)
			return 1;
		else if (n == 1)
			return 1;
		else
			return (fib(n - 1)+fib(n - 2));
	}
}

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Fibo f = new Fibo();
		System.out.println("Enter the number :");
		int number = in.nextInt();
		System.out.println("The Sum of Fibonacci series upto the number " + number + "is : " + f.fib(number));
	}
}