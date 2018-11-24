import java.util.TreeSet;

public class TreeSetDemo{
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Hari");
		names.add("Prasath");
		names.add("Hari Krishnan");
		names.add("Geetha");
		names.add("Ravichandran");

		for (String name: names) {
			System.out.println(name);
		}
		System.out.println("\nNumber of names in the TreeSet : " + names.size());	
		System.out.println("\nName next to Geetha is : " + names.higher("Geetha"));
		System.out.println("Name before to Geetha is : " + names.lower("Geetha"));
		System.out.println("First Name is : " + names.first());
		System.out.println("Last name is : " + names.last());

		TreeSet<String> namess = new TreeSet<String>();
		namess = names;
		System.out.println("\nNumber of names in the TreeSet : " + namess.size());	
	}
}