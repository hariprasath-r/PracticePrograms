import java.io.*;
import java.util.*;

public class WordCount{
	public static void main(String[] args) {
		
		String text = 	"Hi this is me Hariprasath i have successfully completed Btech"
						+" in Information technology and i am very proud of it Btech as"
						+" they say is tough challenging but am Hariprasath and i have"
						+" completed it that too in Information technology and this is "
						+" rubbish and i have been typing this stupid paragraph without"
						+" any punctuation whatsoever and its very very boring i dont even"
						+" know what to type and i have been typing whatever that comes into my"
						+" mind and i am Hariprasath completed Btech Information technology Hi";

		String[] words = text.split(" ");
		/*
		for (String w: words) {
			System.out.println(w);
		}*/
		Arrays.sort(words);
		for (String w: words) {
			System.out.println(w);
		}
		System.out.println("Number of Words: " + words.length);
		System.out.println();

		TreeMap<String,Integer> tree = new TreeMap<String,Integer>();
		String thisWord = "";
		String nextWord = "";
		int count = 0;
		if (words.length % 2 == 0) {
			for (int i = 0;i < (words.length - 1); i++) {
				thisWord = words[i];
				count++;
				nextWord = words[i+1];
				if (!thisWord.equals(nextWord)) {
					tree.put(thisWord,count);
					count = 0;
				}
			}	
		}
		else
		{
			for (int i = 0;i < (words.length - 1); i++) {
				thisWord = words[i];
				++count;
				nextWord = words[i+1];
				if (!thisWord.equals(nextWord)) {
					tree.put(thisWord,count);
					count = 0;
				}
			}
			nextWord = words[words.length - 1];
			if (thisWord.equals(nextWord)) {
				tree.put(nextWord,count);
				count = 0;
			}
			else{
				count = 1;
				tree.put(nextWord,count);
			}
		}

		Set set = tree.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
	}
}