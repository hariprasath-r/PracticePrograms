import java.util.*;

public class Space
{
	// A program to calculate the number of spaces in a string using recursion
	int count=0;
	
	public int spaces(String s,int i, int l)
	{
		if(i>=l)
			return count;  
		else 
			if(s.charAt(i) != ' ')
			{
				count++;
				spaces(s,i++,l);
			}
			else 
				spaces(s,i++,l);
	}
	
	public static void main(String[] args)
	{
		String s;
		int numSpace = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		s = in.nextLine();
		numSpace = spaces(s,0,s.length());
		System.out.println("The Number of spaces in the given string is : " + numSpace);
	}	
}