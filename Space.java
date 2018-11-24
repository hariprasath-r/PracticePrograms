import java.util.*;

public class Space
{
	// A program to calculate the number of spaces in a string using recursion
	int count=0;
	
	public int spaces(String s,int i, int l)
	{
		if(i>l)
			return count;
		else if(s.charAt(i) != ' ')
			return spaces(s,i++,l);
		else
		{
			count++;
			return spaces(s,i++,l);
		}
	}	
}