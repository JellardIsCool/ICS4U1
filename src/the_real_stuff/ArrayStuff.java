package the_real_stuff;

import java.util.Arrays;

public class ArrayStuff {

	public static void main(String[] args) {

		int x = 5;
		int y = 6;
		int[][] numbers = new int[x][y];
		int[] big5 = new int[x * y];

		print2DArray(numbers);
		sortArray(numbers, big5);
		System.out.println();
	}

	private static void print2DArray(int[][] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[0].length; j++) {
				int r = (int) (Math.random() * 90) + 9;
				numbers[i][j] = r;
				System.out.printf("%3d", numbers[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < numbers[0].length*3 + 1; i++) System.out.print("-");System.out.println();
	}

	private static void sortArray(int[][] numbers, int[] big5) {

		int n=0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[0].length; j++)	{
				big5[n++] = numbers[i][j];
			}
		}
		Arrays.sort(big5);
		System.out.println(Arrays.toString(big5));
		
		for(int i = 0; i < numbers[0].length * 3 + 1; i++) System.out.print("-"); System.out.println();
		
		System.out.println("Your 5 biggest numbers are: ");
		for(int i = big5.length - 1; i > big5.length - 6; i--) {
			System.out.print(big5[i] + " ");
		}	
	}
}