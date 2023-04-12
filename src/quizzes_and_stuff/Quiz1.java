package quizzes_and_stuff;

/*
 * Karim M.
 * Feb 27, 2023
 * Program that creates 1D array and fills it with very specific requests
 */

public class Quiz1 {

	public static void main(String[] args) {

		final int SIZE = 30;
		int[] nintendo = new int[SIZE];
		int n = 35;

		//creating -1's
		for (int i = 0; i < SIZE; i++) {
			nintendo[i] = -1;
		}
		//filling first half with random numbers
		for (int i = 0; i < SIZE/2; i++) {
			int x = (int) (Math.random()*100);
			nintendo[i] = x;
		}
		//doing the multiple of 5 thing
		for (int i = SIZE/2; i >= 0; i--) {
			if (nintendo[i]%5 == 0) nintendo[SIZE - 1] = nintendo[i];
		}

		printArray(nintendo, SIZE);
		printFirstN(nintendo, SIZE, n);
	}

	static void printArray(int[] nintendo, int SIZE) {

		for (int i = 0; i < SIZE; i++) {
			System.out.print(nintendo[i] + " ");
		}
	}
	static void printFirstN(int[] nintendo, int SIZE, int n) {

		if (0 <= n && n < SIZE) {
			System.out.println("\n\nHere are your first " + n + " numbers:");
			for (int i = 0; i < n; i++) {
				System.out.print(nintendo[i] + " ");
			}
		} if (n < 0) {
			System.out.println("\n\nYou can't print the negative amount of an array >:(");
		} else {
			System.out.println("\n\nHere is the whole array: ");
			printArray(nintendo, SIZE);
		}
	}
}
