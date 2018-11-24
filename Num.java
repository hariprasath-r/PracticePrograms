public class Num
{
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		String s = a + "" + b;
		System.out.println(s.charAt(1));
		int c = Integer.parseInt(s);
		System.out.println(c);
	}
}