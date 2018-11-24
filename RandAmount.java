import java.io.*;
import java.util.*;

public class RandAmount{
	public static void main(String[] args) {
		Random r = new Random(System.currentTimeMillis());
		try{
			PrintWriter pw = new PrintWriter(new FileWriter("TestCase.txt"));
			for (int i =0;i < 10; i++) {
				pw.println(r.nextInt(999999999));			
			}		
			pw.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}