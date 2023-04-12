package the_real_stuff;

import java.util.Scanner;

/*
 * Karim M. and Nick S.
 * March 21, 2023
 * 
 * String manipulator program that forces sentences to be a certain
 * length and then prints a border of asterisks around it
 */


public class BorderOfStars {

	//maximum length of one sentence
	private static final int maxLength = 20;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a sentence and I'll put a border around it.");
		//string variable with a sentence longer than 20 characters
		String input = sc.nextLine();

		//splits the sentence into an array of words
		String[] words = input.split(" ");

		//a counter for the current line length
		int counter = 0;

		//prints a line of asterisks with a length of maxLength + 4
		for (int i = 0; i < maxLength + 4; i++) System.out.print("*");
		
		System.out.println();

		//prints the first line of the border
		System.out.print("* ");

		//for loop that goes through every word in the array
		for (int i = 0; i < words.length; i++) {

			//the current word in the array
			String currentWord = words[i];
			
			//prints an error message if any words are longer than the maxLength and exits out of the loop
			if (currentWord.length() > maxLength) {
				System.out.println("The word " + currentWord + " is too long");
				break;
			}

			//starts a new line if the length of the sentence + 1 is greater than the maxLength
			if (counter + currentWord.length() + 1 > maxLength) {

				//prinst spaces to fill out the rest of the line
				for (int j = counter; j < maxLength + 1; j++) {
					System.out.print(" ");
				}

				//starts a new line of the border
				System.out.print("*\n* ");

				//resets the counter for the new line
				counter = 0;
			}

			//prints the word followed by a space
			System.out.print(currentWord + " ");

			//updates the counter for the current line length
			counter += currentWord.length() + 1;

		}

		//prints spaces to fill out the line
		for (int i = counter; i < maxLength + 1; i++) {
			System.out.print(" ");
		}

		//prints the last line of the border
		System.out.println("*");

		//prints the last line of asterisks
		for (int i = 0; i < maxLength + 4; i++) {
			System.out.print("*");
		}
	}

}
