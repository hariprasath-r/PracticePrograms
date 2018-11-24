import java.util.*;

public class LList
{
	public static void main(String[] args)
	{
		int n = 0;
		Scanner in = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		System.out.println("Enter elements into LinkedList followed by -1 to end.");
		while(true)
		{
			n = in.nextInt();
			if(n == -1)
				break;
			ll.add(n);
		}
		System.out.println("Enter the element : ");
		int el = in.nextInt();
		System.out.println("Enter the index : ");
		n = in.nextInt();
		ll.set(n,el);
		System.out.println("Elements in the LinkedList is : " + ll);
		int sum = 0;
		for(int i = 0; i < ll.size(); i++)
			sum += (Integer)ll.get(i);
		System.out.println("Sum of the elements in the Linked List is : " + sum);
	}
}