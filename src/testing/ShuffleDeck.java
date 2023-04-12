package testing;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleDeck {
    public static void main(String[] args) {
        // Create a deck of cards
        ArrayList<String> deck = new ArrayList<String>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // Shuffle the deck
        Collections.shuffle(deck);

        // Print the shuffled deck
        for (String card : deck) {
            System.out.println(card);
        }
    }
}
