import java.util.*;

public class Cards
{
	public static void main(String[] args)
	{
		final int row = 4;
		final int col = 13;
		int[][] deck = new int[row][col];
		intDeck(deck, row, col);
		shuffleDeck(deck, row, col);
		displayDeck(deck, row, col);
	}
	
	static void intDeck(int[][] arr, int row, int col)
	{
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				arr[i][j] = 0;
	}
	
	static void shuffleDeck(int[][] arr, int row, int col)
	{
		Random rand = new Random(System.currentTimeMillis());
		int r = 0;
		int c = 0;
		for(int card = 1; card <= 52; card++)
		{
			r = rand.nextInt(4);
			c = rand.nextInt(13);
			if(arr[r][c] == 0)
				arr[r][c] = card;
			else
			{
				while(arr[r][c] != 0)
				{
					r = rand.nextInt(4);
					c = rand.nextInt(13);
				}
			}
			arr[r][c] = card;
		}
	}
	
	static void displayDeck(int[][] arr, int row, int col)
	{
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
					System.out.print(" " + arr[i][j]);
			System.out.println();
		}
	}
}

