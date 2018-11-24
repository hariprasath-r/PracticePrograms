import java.io.*;
import java.util.*;

public class Copy
{
	public static void main(String[] args) {
		String filename =  getFilename();
		String newFilename = createFilename(filename);
		copyFile(filename,newFilename);
	}

	static String getFilename(){
		System.out.print("Enter the Filename : ");
		Scanner in = new Scanner(System.in);
		return (in.nextLine());
	}

	static String createFilename(String filename){
		String newFilename = "";
		int i = 0;
		while(i < filename.length()){
			if (filename.charAt(i) == '.') {
				break;
			}
			else{
				newFilename += filename.charAt(i);
				i++;
			}
		}
		newFilename += ".txt";
		return newFilename;
	}

	static void copyFile(String oldFile,  String newFile){
		try{
			Scanner read = new Scanner(new FileReader(oldFile));
			PrintWriter pw = new PrintWriter(new FileWriter(newFile));
			while(read.hasNextLine()){
				pw.println(read.nextLine());
			}
			read.close();
			pw.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}