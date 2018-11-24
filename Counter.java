import java.util.Random;

public class Counter
{
	public static void main(String[] args)
	{
		final int size = 21;
		int[] numbers = new int[size];
		int[] count = new int[size];
		Random r = new Random(System.currentTimeMillis());
		for(int i = 0; i < size; i++)
			numbers[i] = r.nextInt(size);
		for(int i = 0; i < size; i++)
			count[numbers[i]]++;
		for(int i = 0; i < size; i++)
			System.out.print(" " + numbers[i]);
		System.out.println("\n The Number and its occurrences are :");
		for(int i = 1; i < size; i++)
			System.out.println("Number " + i + " occurs : " + count[i]);
		histogram(count, size);
	}
	
	static void histogram(int[] a, int size)
	{
		int nstar = 0;
		String star = "";
		for(int i = 0; i < size; i++)
		{	
			nstar = a[i];
			for(int j = 0; j < nstar; j++)
				star += "*";
			System.out.println(i  + " : " + star);
			star = "";
			nstar = 0;
		}
	}
	
}