public class List<T> implements ListInterface<T>{

	private T[] arr;
	private int size;
	private int pos;	

	public List(int n){
		size = n;
		pos = 0;
		arr = (T[]) new Object[size];
	}

	public void add(T element){
		arr[pos] = element;
		pos++;
	}

	public String output(){
		String s = "";
		for (int i = 0;i < pos; i++) {
			s += arr[i] + " ";
		}
		return s;
	}
}