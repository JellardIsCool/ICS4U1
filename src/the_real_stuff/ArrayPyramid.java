package the_real_stuff;

import java.util.Scanner;

/*
 * Karim M.
 * Feb 22 2023
 * This program prints out an array pyramid with numbers going up to the top
 * I used traditional math quadrants to show where each line of code is used
 */

public class ArrayPyramid {

	public static void main(String[] args) {

		System.out.println("Please enter how large you want your array pyramid to be: ");
		Scanner sc = new Scanner(System.in);		
		int SIZE = sc.nextInt();

		int x = 1;
		int[][] pyramid = new int[SIZE][SIZE];
		int MAX = SIZE/2;

		for(int row = 0; row < pyramid.length; row++) {
			for (int col = 0; col < pyramid.length; col++) {
				
				//quad I
				if (row < MAX && col >= MAX) {
					pyramid[row][col] = Math.min(row + 1, SIZE - col);
				}
				//quad II
				if (row <= MAX && col < MAX) {
					pyramid[row][col] = Math.min(row + 1, col + 1);
				}
				//quad III
				if (row > MAX && col <= MAX) {
					pyramid[row][col] = Math.min(SIZE - row, col + 1);
				}
				//quad IV
				if (row >= MAX && col > MAX) {
					pyramid[row][col] = Math.min(SIZE - row, SIZE - col);
				}
				if (row >= MAX && col < MAX) pyramid[row][col] = Math.min(SIZE - row, SIZE - col);
				
				//bug fixing
				if (row == MAX && col == MAX) pyramid[row][col] = Math.min(SIZE - row, SIZE - col);
				if (row >= MAX && col < MAX) pyramid[row][col] = Math.min(SIZE - row, col + 1);
			}
		}
		print2DArray(pyramid);
	}


	static void print2DArray(int[][] pyramid) {

		for(int row = 0; row < pyramid.length; row++) {
			for(int col = 0; col < pyramid[0].length; col++) {
				System.out.printf("%3d", pyramid[row][col]);
			}
			System.out.println();
		}
		for(int i = 0; i < pyramid[0].length * 3 + 2; i++) System.out.print("=");

	}

}
