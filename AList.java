import java.util.*;

public class AList
{
	public static void main(String[] args)
	{
		ArrayList<Double> al = new ArrayList<Double>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of subjects : ");
		Double total = 0.00;
		int n = in.nextInt();
		System.out.println("Enter the marks for each subjects : ");
		for (int i=0;i < n;i++)
		{
			al.add(in.nextDouble());
			total += al.get(i);
		}
		double average =  total / al.size();
		ArrayList<Double> al1 = new ArrayList<Double>();
		al1.addAll(al);
		//
		System.out.println("Equal :" + a1.equals(al1));
		
		// Correct implementation is unknown --> removeAll();
		//System.out.println("The total is : " + total + " and average is : " + average);
		//al.clear();
		System.out.println("The Objects in the collection are :" + al1.size());
		//for(int i=0;i < al.size();i++)
			//System.out.println(al.get(i));
	}
}