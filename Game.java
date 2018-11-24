import java.util.Scanner;

public class Game
{
	public static void main(String[] args)
	{
		String answer = "watson";
		String ans;
		//boolean flag = false; 
		Scanner in = new Scanner(System.in);
		
		int i=0;
		
		System.out.println("Let's play a guessing game. You got 3 tries.");
		System.out.println("What was the name of the computer that played jeopardy? : ");
		
		do
		{
			ans = in.nextLine();
			if(answer.equals(ans))
			{	
				System.out.println(" That's Right!");
				//flag = true;
				break;
			}
			else if (i==0)
			{
				System.out.println(" Sorry. Guess again : ");
				i++;
			}
			else if (i==1)
			{
				System.out.println(" Still not right. ! more try. ");
				i++;
			}
		}while(i<3);
	}
}