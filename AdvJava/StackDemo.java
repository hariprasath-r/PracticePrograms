import java.util.*;

public class StackDemo{
	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(24);
		s.push(8);
		s.push(1995);

		System.out.println("Top of stack : " + s.peek());

		s.pop();
		s.push("Hariprasath");

		if(! s.isEmpty()){
			System.out.println("Top is : " + s.peek());
		}
	}
}