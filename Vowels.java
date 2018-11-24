import java.util.*;

public class Vowels
{
	static int count;
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the String : ");
		String s = in.nextLine();
		/*for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))
				count++;
		}*/
		System.out.println("The number of vowels in the given string is : " + vow(s,0));
	}
	
	static int vow(String s, int l)
	{
		if(l == s.length())
			return count;
		else if((s.charAt(l) == 'a') || (s.charAt(l) == 'e') || (s.charAt(l) == 'i') ||  (s.charAt(l) == 'o') || (s.charAt(l) == 'u'))
		{
			count++;
			return vow(s,l++);
		}
		else
			return vow(s,l++);
			
	}
}