import java.util.LinkedList;

public class RadixSort{

	static void display(int[] arr){
		for (int i = 0;i < arr.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void displayLinkedList(LinkedList[] digit){
		System.out.println();
		for (LinkedList l: digit) {
			System.out.println(l);
		}
		System.out.println();
	}

	static void distribute(int[] arr, LinkedList[] digit, String type){
		for (int i = 0;i < arr.length; i++) {
			if (type.equals("ones")) {
				digit[arr[i] % 10].addLast(arr[i]);
			}
			else{
				digit[arr[i] / 10].addLast(arr[i]);
			}
		}
	}

	static void collect(int[] arr, LinkedList[] digit){
		int j = 0;
		for (int i = 0;i < 10; i++) {
			while(!digit[i].isEmpty()){
				arr[j++] =(Integer) digit[i].removeFirst();
			}
		}
	}

	public static void main(String[] args) {
		final int size = 50;
		final int numQueues = 10;
		int[] arr = new int[size];
		for (int i = 0;i < size; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		
		LinkedList[] digit = new LinkedList[numQueues];
		for (int i = 0;i < numQueues; i++) {
			digit[i] = new LinkedList();
		}

		display(arr);
		//displayLinkedList(digit);
		distribute(arr, digit, "ones");
		displayLinkedList(digit);
		display(arr);
		collect(arr, digit);
		display(arr);
		distribute(arr, digit, "tens");
		displayLinkedList(digit);
		display(arr);
		collect(arr, digit);
		display(arr);
	}
}