import java.io.*;
import java.util.*;

public class SquareDance{
	public static void main(String[] args) {
		
		PriorityQueue<String> men = new PriorityQueue<String>();
		PriorityQueue<String> women = new PriorityQueue<String>();
		
		String line = "";
		String sex = "";

		try{
			//Scanner in = new Scanner(new FileReader("dance.txt"));
			// here using Scanner throws NoLineFound Exception i wonder why ?
			
			BufferedReader in = new BufferedReader(new FileReader("dance.txt"));
			while((line = in.readLine()) != null){
				sex =line.substring(0,1); 
				if(sex.equals("M")){
					men.add(line.substring(2));
				}
				else
					women.add(line.substring(2));
			}
			in.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage() + " Exception");
		}

		while(!men.isEmpty() && !women.isEmpty()){
			System.out.println("The Dancing partners are " + men.poll() + " and " + women.poll());
		}

		if(men.isEmpty()){
			System.out.println("There are " + women.size() + " women waiting.");
			System.out.println("The first dancer is " + women.peek());
		}

		if(women.isEmpty()){
			System.out.println("There are " + men.size() + " men waiting.");
			System.out.println("The first dancer is " + men.peek());
		}
		
		/*
		for (String s: men) {
			System.out.println(s);
		}

		for (String s: women) {
			System.out.println(s);
		}
		*/
	}
}