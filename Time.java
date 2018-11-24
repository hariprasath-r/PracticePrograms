import java.io.*;
import java.util.*;

public class Time
{
	private int hr, min, sec;
	
	public void input(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter hour : ");
		hr = in.nextInt();
		System.out.print("Enter minutes : ");
		min = in.nextInt();
		System.out.print("Enter seconds : ");
		sec = in.nextInt();
	}
	
	public void process(Time a, Time b){
		hr = a.hr + b.hr;
		min = a.min + b.min;
		sec = a.sec + b.sec;
		
		min += sec / 60;
		sec = sec % 60;
		hr += min / 60;
		min = min % 60;
		hr = hr % 12;
	}
	
	public void output(){
		System.out.print("The new time is : " + hr + " : " + min + " : " + sec);
	}
}