public class LinkedList{
	public static void main(String[] args) {
		Node<String> node1 = new Node("Hari");
		Node<String> node2 = new Node("Prasath");
		Node<String> node3 = new Node("IT");
		node1.next = node2;
		node2.next = node3;
		Node<Integer> endNode = new Node(0);
		node3.next = endNode;
		Node<String> temp = new Node("temp");
		temp = node1;
		while(temp.next != null){
			System.out.println(temp.getData() + " ");
			temp = temp.next;
		}
	}
}