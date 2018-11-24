import java.util.ArrayList;
import java.util.Iterator;

/*
	Demonstration of For each or advanced For loop and Iterator class
	
	for (int n : collections)
	{
		statements;
	}
	
	Note:  	-> An Advanced For loop can be used if and only if a collection has elements.
			-> It cannot be used to fill in a collection 
	
	Iterator functions :
		-> hasNext();
		-> Next();

*/

public class Increment 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(" ArrayList Created.");
		for(int i = 0; i < 10; i++)
			a.add(i);
		System.out.println(" ArrayList is filled.");
		System.out.println(a);
		for(int n : a)
			System.out.println(n);
		for(Iterator<Integer> i = a.iterator(); i.hasNext();)
		{
			int n = i.next();
			System.out.println(n);
		}
	}
}