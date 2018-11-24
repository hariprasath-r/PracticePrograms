import java.util.*;

public class SpaceMain
{
	public static void main(String[] args)throws Exception
	{
	try
	{
		Space sp = new Space();
		String s;
		int numSpace = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		s = in.nextLine();
		numSpace = sp.spaces(s,0,s.length());
		System.out.println("The Number of spaces in the given string is : " + numSpace);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}