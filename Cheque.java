import java.io.*;
import java.util.*;

class ChequeMain
{
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	private ArrayList<Integer> ac = new ArrayList<Integer>();
	private ArrayList<String> as = new ArrayList<String>();
	private int amount;
	private String amountinwords = "";
	private String rupeeonly = " rupees only";
	private String[][] s = new String[10][10];
	private int i, j;

	ChequeMain(){
		amount = -1;
		assign();
	}

	public void assign(){
		assignNull();
		assignValueOneToNineteen();
		assignValueTwentyToNinety();
		assignValues();
	}

	public void assignNull(){
		for (i =0;i < 10; i++) {
			for (j =0;j < 10; j++) {
				s[i][j] = "";
			}
		}
	}

	public void assignValueOneToNineteen(){
		try{
			String filename = "OneToNineteen.txt";
			Scanner in = new Scanner(new FileReader(filename));
			while(in.hasNextLine()){
				for (i =0;i < 2; i++) {
					for (j =0;j < 10; j++) {
						s[i][j] = in.nextLine();
					}
				}
			}
			in.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void assignValueTwentyToNinety(){
		try{
			String filename = "TwentyToNinety.txt";
			Scanner in = new Scanner(new FileReader(filename));
			while(in.hasNextLine()){
				for (i = 2;i < 10; i++) {
					s[i][0] = in.nextLine();
				}
			}
			in.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void assignValues(){
		for (i =2;i < 10; i++) {
			for (j = 1;j < 10; j++) {
				s[i][j] = s[i][0] + s[0][j];
			}
		}
	}

	public void input(){
		System.out.print("\nEnter amount : ");
		Scanner in = new Scanner(System.in);
		amount = in.nextInt();
	}

	public void input1(int a){
		amount = a;
	}

	public void convertIntoArray(){
		int temp = -1;
		for (int i = 0;amount != 0; i++) {
			temp = amount % 10;
			arr.add(temp);
			temp = amount / 10;
			amount = temp;
		}
	}

	public void one(){
		ac.add(arr.get(0));
	}

	public void two(){
		int temp = 0;
		temp += arr.get(1) * 10;
		temp += arr.get(0);
		ac.add(temp);
	}

	public void three(){
		int temp = 0;
		temp += arr.get(1) * 10;
		temp += arr.get(0);
		ac.add(temp);
		ac.add(arr.get(2));
	}

	public void four(){
		int temp = 0;
		temp += arr.get(1) * 10;
		temp += arr.get(0);
		ac.add(temp);
		ac.add(arr.get(2));
		ac.add(arr.get(3));
	}

	public void aboveFour1(int size){
		int temp = 0;
		for (i = 4; i < size; i += 2) {
			temp += arr.get(i) * 10;
			temp += arr.get(i - 1);
			ac.add(temp);
			temp = 0;
		}
	}

	public void aboveFour(){
		three();
		int size = arr.size();
		if (size % 2 == 0) {
			aboveFour1(size);
			ac.add(arr.get(size - 1));
		}
		else
			aboveFour1(size);
	}

	public void splitArray(){
		int asize = arr.size();

		switch (asize){
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			default:
				aboveFour();
				break;
		}
	}

	public void reverseArray(){
		Collections.reverse(ac);
	}

	public void convertIntoWords(){
		for (int k = 0;k < ac.size(); k++) {
			as.add(returnWord(ac.get(k)));
		}
	}

	public String returnWord(int x){
		String tempS = "";
		i = j = 0;
		if (x == 0) {
			tempS = " ";
			return tempS;
		}
		else if (x < 10) {
			tempS = s[0][x]; 
			return tempS;
		}
		else{
			i = x / 10;
			j = x % 10;
			tempS = s[i][j];
			return tempS;
		}
	}

	public String tens(int x){
		return (as.get(x));
	}

	public String hundred(int x){
		if (as.get(x) == " ") {
			return (as.get(x) + tens(++x));
		}
		else if (as.get(x + 1) == " ") {
			return (as.get(x) + " hundred"); 	
		}
		else
			return (as.get(x) + " hundred and " + tens(++x)); 	
	}

	public String thousand(int x){
		if (as.get(x) == " ") {
			return (as.get(x) + tens(x + 2));
		}
		else if (as.get(x + 1) == " ") {
			return (as.get(x) + " thousand and " + tens(x + 2)); 		
		}
		else
			return (as.get(x) + " thousand " + hundred(++x));
	}

	public String lakh(int x){
		if (as.get(x) == " ") {
			return (as.get(x) + hundred(x + 2));
		}
		else if (as.get(x + 1) == " ") {
			return (as.get(x) + " lakh " + hundred(x + 2));
		}
		else
			return (as.get(x) + " lakh " + thousand(++x));
	}

	public String crore(int x){
		if(as.get(x + 1) == " "){
			return (as.get(x) + " crore " + thousand(x+2));	
		}
		else
			return (as.get(x) + " crore " + lakh(++x));
	}

	public String appends(){
		int wsize = as.size();
		switch(wsize){
			case 1:
				amountinwords = tens(0) + " rupee only";
				break;
			case 2:
				amountinwords = hundred(0) + rupeeonly;
				break;
			case 3:
				amountinwords = thousand(0) + rupeeonly;
				break;
			case 4:
				amountinwords = lakh(0) + rupeeonly;
				break;
			case 5:
				amountinwords = crore(0) + rupeeonly;
				break;
		}
		return amountinwords;
	}

	public void process(){
		convertIntoArray();
		splitArray();
		reverseArray();
		convertIntoWords();
	}

	public void output(){
		System.out.println("\n" +appends().toUpperCase());
	}
}

public class Cheque
{
	public static void main(String[] args) {
		ChequeMain c = new ChequeMain();
		c.input();
		c.process();
		c.output();
	}
}