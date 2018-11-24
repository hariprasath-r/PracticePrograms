import java.util.TreeSet;

public class WordList{

	// Program to remove duplicate words from a string array using TreeSet

	public static void main(String[] args) {
		String txt = "I am Hariprasath just completed btech Information Technology in SASTRA University "
		+"This is a good university this SASTRA University and i loved a girl names suppriya "
		+"funny how her name spelled suppriya you see is not a typical girl she is something else entirely and man i loved her so much that i could not let her go that easily and currently am in denial phase to remove her out of"
		+"my life that is not working out pretty well and every memory of SASTRA University reminds me of suppriya";
		
		String[] words = txt.split(" ");

		for(String s : words){
			System.out.println(s);
		}		
		System.out.println("Number of words in txt is : " + txt.length());

		TreeSet<String> ts = new TreeSet<String>();
		for (String s: words) {
			ts.add(s);
		}

		for (String s: ts) {
			System.out.println(s);
		}

		System.out.println("Number of words in TreeSet is : " + ts.size());
	}

}