import java.util.*;

public class PIN
{
	public static void main(String[] args) {
		int[] PIN = new int[5];
		if(arg[0] == '1')
			PIN = enterPIN(PIN);
		int choice = 0;
		Scanner in = new Scanner(System.in);
		while(choice < 3){
			System.out.print("Enter the PIN no : ");
			if(in.nextInt == PIN){
				System.out.println("pin verified");
				System.out.println("Welcome.");
			}
			else{
				continue;
				choice++;
			}
		}	
	}

	static int enterPIN(int[] a){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 PIN numbers :");
		for (int i =0; i < 5; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}
}