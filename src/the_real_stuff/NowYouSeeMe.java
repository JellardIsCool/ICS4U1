package the_real_stuff;

/*
 * Karim M.
 * March 29th, 2023
 * Card shuffling program that takes an array of card objects and shuffles them using
 * the 'Fisher-Yates' algorithm.
 */

import java.util.Random;

public class NowYouSeeMe{

	public static void main(String[] args) {
		
		Cards [] deck = new Cards[52];

		//fills the deck with cards for each of the 4 suits and 13 ranks
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i < 14; i++) {
				
				//creates a new Card object with the rank and suit values
				Cards card = new Cards(i, j); 
				
				//add the card to the deck array at the correct index
				deck[(j * 13) + (i - 1)] = card; 
				
				//print out the card that was just added to the deck
				System.out.print(deck[(j * 13) + (i - 1)]); 
			}
			 //start a new line after each suit is finished
			System.out.println();
		}

		//prints out a line of equal signs to separate the deck creation from the shuffled deck
		for (int i = 0; i < 39; i++) 
			System.out.print("=");

		//shuffle 
		shuffleDeck(deck);

		//Print out the shuffled deck
		for (int i = 0; i < deck.length; i++) {
			
			//start a new line after every 13 cards are printed
			if (i%13 == 0) System.out.println(); 
			
			//prints out the cards
			System.out.print(deck[i]); 
		}
	}

	//method to shuffle the deck using the Fisher-Yates shuffle algorithm (I learned it online)
	public static void shuffleDeck(Cards[] deck) {
		
		//create a new Random object to generate random numbers
		Random rand = new Random(); 

		//loops through the deck array from the end to the beginning
		for (int i = deck.length - 1; i > 0; i--) {
			
			//generates a random index r between 0 and i (inclusive)
			int r = rand.nextInt(52);

			//swaps the cards
			Cards temp = deck[i];
			deck[i] = deck[r];
			deck[r] = temp;
		}
	}

	public static class Cards {
		
		//stores the suits
		private String[] suits = {"S", "H", "C", "D"};
		
		//stores the values of the cards
		private String[] values =  {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		//determines the suit of the card
		private int suitNumber;
		
		//determines the value of the card
		private int cardValue;

		Cards (int value, int suit) {
			this.cardValue = value;
			this.suitNumber = suit;
		}

		
		Cards (){}

		//creating own toString method
		@Override
		public String toString() {
			return values[cardValue - 1] + suits[suitNumber] + " ";
		}

	}

}
