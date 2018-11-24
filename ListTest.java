import java.util.*;

/* 
	Learning and demonstrating list functions 
	
		-> add()
		-> addAll()
		-> remove()
		-> isEmpty()
		-> size()
		-> indexOf()
		-> set()
		
*/


public class ListTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter n : ");
		int n = in.nextInt();
		for(int i = 0; i < n; i++)
			list.add(i,in.nextInt());
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(list);
		System.out.println("Removed object is : " + list1.remove(2));
		list1.set(1,5);
		////List<Integer> list2 = new List<Integer>();
		//List<Interger> list2 = list1.subList(2,4);
		for(int i = 0; i < list1.size(); i++)
			System.out.println(list1.get(i));
		boolean boo = list.isEmpty();
		System.out.println("Index of 2 is : " + list1.indexOf(0));
		
	}
}