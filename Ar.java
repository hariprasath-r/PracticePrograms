public class Ar{
	public static void main(String[] args) {
		int row = 10;
		int col = 10;
		int[][] a = new int[row][col];

		for (int i =0;i < row; i++) {
			for (int j =0;j < col; j++) {
				System.out.print(" " + i + "" + j);
			}
			System.out.println("\n");
		}
	}
}