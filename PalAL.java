import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// amanaplanacanalpanama  is a palindrome

public class PalAL
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter the String :");
		String s = in.nextLine();
		buildAL(al, s);
		display(al);
		if(isPalindrome(al))
			System.out.println(s + " is a palindrome.");
		else
			System.out.println(s + " is not a palindrome.");
	}
	
	static void display(ArrayList<String> al)
	{
		for(int i = 0; i < al.size(); i++)
			System.out.print(al.get(i));
		System.out.println();
	}
	
	static void buildAL(ArrayList<String> al, String word)
	{
		for(int i = 0; i < word.length(); i++)
			al.add(word.charAt(i)+"");
	}
	
	static boolean isPalindrome(ArrayList<String> al)
	{
		ArrayList<String> rev = new ArrayList<String>();
		rev.addAll(al);
		Collections.reverse(rev);
		for(int i = 0; i < rev.size(); i++)
			if(!rev.get(i).equals(al.get(i)))
				return false;
		return true;
	}
}