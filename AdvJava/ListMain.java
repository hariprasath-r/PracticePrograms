public class ListMain{

	static <T1, T2> void display(T1 n1, T2 n2){
		System.out.println(n1 + " --- " + n2);
	}

	public static void main(String[] args) {

		/* Note 
			
			List<Integer> iList = new List(5);

			List<Integer> iList = new List<Integer>(5);

			both works just fine.

		*/

		List<Integer> iList = new List(5);
		for (int i = 0;i < 5; i++) {
			iList.add(i);
		}
		List<String> sList = new List(5);
		sList.add("Hari");
		sList.add("Prasath");
		sList.add("Completed");
		sList.add("B.Tech");
		System.out.println(iList.output());
		System.out.println(sList.output());
		display("Generic",10);

		boolean[] b = {true, false, true};

		List<Boolean> bList = new List<Boolean>(5);
		for (int i = 0;i < b.length; i++) {
			bList.add(b[i]);
		}

		System.out.println(bList.output());
	}

}