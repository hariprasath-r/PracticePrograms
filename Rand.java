import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Rand
{
	public static void main(String[] args)
	{
		Random r = new Random(System.currentTimeMillis());
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
			al.add(r.nextInt(101));
		System.out.println(al);
		if(al.contains(0))
			System.out.println("The number 0 was found at position :" + al.indexOf(0));
		else
			System.out.println("The number 0 was not found.");
		System.out.println("Before Sorting : " + al);
		Collections.sort(al);
		System.out.println("After Sorting : " + al);
		Collections.reverse(al);
		System.out.println("After reversing : " + al);
	}
}