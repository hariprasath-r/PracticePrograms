import java.io.*;
import java.util.*;

public class ToDoList{
	public static void main(String[] args) {
		String filename = "To-Do List.txt";
		int choice = -1;
		while(choice != 0){
			choice = displayMenu();
			switch(choice){
				case 1: 
					showList(filename);
					break;
				case 2:
					addItem(filename);
					break;
				case 3:
					deleteItem(filename);
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}

	static int displayMenu(){
		System.out.println("\n\t\t ----- Main Menu ----- \n");
		System.out.println("\t 1 -> To show the list.");
		System.out.println("\t 2 -> To add an item.");
		System.out.println("\t 3 -> To delete an item.");
		System.out.println("\t 0 -> To exit the program");
		System.out.println();
		System.out.print("Enter your choice : ");
		Scanner in = new Scanner(System.in);
		return (in.nextInt());
	}

	static void showList(String filename){
		try{
			Scanner in = new Scanner(new FileReader(filename));
			int number = 1;
			if (in.hasNextLine()) {
				System.out.println("\n\t\t ----- To-Do List -----\n");
				while(in.hasNextLine()){
					System.out.println("\t" + number + " " + in.nextLine());
					number++;
				}	
			}
			else
				System.out.println("\n\t\t ----- Empty File -----");
			in.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	static void addItem(String filename){
		try{
			PrintWriter pw = new PrintWriter(new FileWriter(filename, true));
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the item :");
			pw.println(in.nextLine());
			System.out.println("\n\t\t ----- Item Entered -----");
			pw.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	static void deleteItem(String filename){
		try{
			int choice = -1, number = 1;
			showList(filename);
			System.out.print("Enter the number to remove item : ");
			Scanner in = new Scanner(System.in);
			choice = in.nextInt();
			ArrayList<String> a = new ArrayList<String>();
			Scanner read = new Scanner(new FileReader(filename));
			String item = "";
			while(read.hasNextLine()){
				item = read.nextLine();
				if(number != choice){
					a.add(item);
					number++;
				}
			}
			PrintWriter pw = new PrintWriter(new FileWriter(filename));
			for (int i =0;i < a.size() ;i++ ) {
				pw.println(a.get(i));
			}
			pw.close();
			read.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
