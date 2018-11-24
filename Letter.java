import java.util.Scanner;

public class Letter
{
	public static void main(String[] args)
	{
		String name, present , yourName = "Hari";
		int age;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Who gifted you ? ");
		name = in.nextLine();
		System.out.println(" What gift did you find ? ");
		present = in.nextLine();
		System.out.println(" This is your __ birthday ?");
		age = in.nextInt();
		
		System.out.println(" \n\t\tLetter generating :");
		System.out.println(" \t\t------------------\n");
		
		System.out.println(" Dear " +name);
		
		System.out.println("\n Thank you for the " + present + ". I really like it. i can't believe I'm \n already " + age + " years old, but it doesn't feel than\n much different than being " + (age-1) + ".");
		
		System.out.println("\n Thank you again for the " + present + ".");
		
		System.out.println("\n Sincerely, \n");
		
		System.out.println(" " + yourName + ".");
		
	}
}