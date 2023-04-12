package testing;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int[] numbers = new int[15];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		sortArray(numbers);
	}

	private static void sortArray(int[] numbers) {

		for (int sorted = 0; sorted < numbers.length; sorted++) {
			
			int lowPos = sorted;
			
			for (int i = sorted; i < numbers.length; i++) {
				if (numbers[i] < numbers[lowPos]) lowPos = i;
			}
			
			int temp = numbers[sorted];
			numbers[sorted] = numbers[lowPos];
			numbers[lowPos] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}

}
