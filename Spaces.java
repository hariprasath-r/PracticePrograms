import java.util.*;

public class Spaces1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = in.nextLine();
		int x = findSpace(s,0,s.length(),0);
		System.out.println("The number of spaces in the given string is : " + x);
	}
	
	static int findSpace(String s, int i, int l, int count)
	{
		if(i>l)
			return count;
		else if(s.charAt(i) == ' ')
			return (findSpace(s, i++, l, count++));
		else
			return (findSpace(s, i++, l, count));
	}
}