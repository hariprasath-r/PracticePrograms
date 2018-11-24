import java.util.*;

public class Convert{

	// Using stack to convert decimal number to binary number

	static String binary(int num){
		final int base = 2;
		Stack s = new Stack();
		do{
			s.push(num % 2);
			num /= 2;
		}while(num != 0);
		String result = "";
		while(!s.empty()){
			result += s.peek();
			s.pop();
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 6; // 110
		System.out.println("The Binary value of " + n + " is: " + binary(n));
	}
}