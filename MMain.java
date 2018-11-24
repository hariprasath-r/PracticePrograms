import java.io.*;
import java.util.*;
public class MMain
{
	public static void main(String[] args)
	{
		Date d=new Date();
		d.setMonth(8);
		d.setDay(24);
		d.setYear(1995);
		System.out.println("The Date is :");
		System.out.println("\t Day : " + d.getDay());
		System.out.println("\t Month : " + d.getMonth());
		System.out.println("\t Year : " + d.getYear());
		System.out.println("\n Date : " + d.displayDate());
	}
}