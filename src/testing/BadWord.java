package testing;

import java.util.Scanner;

public class BadWord {

	public static void main(String[] args) {
		
		//This is an example of where we don't want to do anything
		//in the catch block.
		try {
			Thread.sleep(100); //wait for 0.1s
		} catch (InterruptedException e1) {}
		
		System.out.println("Please type in a word: ");

		try {
			String word = getWord();
			System.out.println("I really love " + word);
			int x = 5/0;
		} catch (BadWordException e) {
			e.printStackTrace();
			System.out.println("\n----------");
			System.out.println("ERROR " + e.getMessage());
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("You have AIDS");
		} finally {
			System.out.println("The program ends now!1!11!!1!!1!!");
			System.exit(0);
		}
		
		System.out.println("Has a nice day :D");
		
	}

	static String getWord() throws BadWordException {

		Scanner sc = new Scanner(System.in);
		String input = sc.next(); //only gets 1 word

		if(input.equals("balls")) {
			//throw exception here
			throw new BadWordException("Don't ever use the b**** word.");
		}
		return input;
	}
	
	//RuntimeException are unchecked. They kill the program immediately
	private static class BadWordException extends Exception {
		
		BadWordException(String s){ 
			super(s); //runs the parent class constructor
		}
	}
	
}
