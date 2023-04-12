package testing;

import java.util.Random;

public class poop {

    public static void main(String[] args) {

        Cards[] deck = new Cards[52];

        // create the deck of cards
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 14; i++) {
                Cards card = new Cards(i, j);
                deck[(j * 13) + (i - 1)] = card;
            }
        }

        // print the unshuffled deck
        for (Cards card : deck) {
            System.out.print(card.toString());
        }
        System.out.println();

        // shuffle the deck
        shuffleDeck(deck);

        // print the shuffled deck
        for (Cards card : deck) {
            System.out.print(card.toString());
        }
        System.out.println();
    }

    public static void shuffleDeck(Cards[] deck) {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Cards temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public static class Cards {

        private int suitNumber;
        private int cardValue;
        private String[] suits = {"S", "H", "C", "D"};
        private String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        public Cards(int value, int suit) {
            this.cardValue = value;
            this.suitNumber = suit;
        }

        public String toString() {
            return values[cardValue - 1] + suits[suitNumber] + " ";
        }
    }
}
