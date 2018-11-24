public class BinarySearchTree{

	public Node root;

	public BinarySearchTree (){
		root = null;
	}

	public void insert (int data){
		Node newNode = new Node();
		newNode.data = data;
		if(root == null){
			root = newNode;
		}
		else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if (data < current.data) {
					current = current.left;
					parent.left = newNode;
					break;
				}
				else{
					current =current.right;
					parent.right = newNode;
					break;
				}
			}
		}
	}
}