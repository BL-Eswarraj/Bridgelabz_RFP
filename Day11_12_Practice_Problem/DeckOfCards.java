package Day_11_12_Practice_Problem;

import java.util.Random;

public class DeckOfCards {

    private static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
    };

    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    private static final String[] deck = new String[52];
    private static final String[][] players = new String[4][9]; // 4 players, 9 cards each

    public static void main(String[] args) {

        initializeDeck();
        shuffleDeck();
        distributeCards();
        printPlayersCards();
    }

    // ------------------ 1. Create Deck ---------------------
    private static void initializeDeck() {
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
    }

    private static void shuffleDeck() {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = rand.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    private static void distributeCards() {
        int cardIndex = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
    }

    private static void printPlayersCards() {
        System.out.println("\n-------- Cards Distributed to Players --------");

        for (int i = 0; i < 4; i++) {
            System.out.println("\nPlayer " + (i + 1) + " Cards:");
            for (int j = 0; j < 9; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }
}
