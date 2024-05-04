package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDealer {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] FACE_VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        List<Card> deck = createDeck();
        Collections.shuffle(deck);

        System.out.println("Dealing five random cards:");
        for (int i = 0; i < 5; i++) {
            Card card = deck.get(i);
            System.out.println("Card " + (i + 1) + ": " + card);
        }
    }

    private static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String faceValue : FACE_VALUES) {
                deck.add(new Card(suit, faceValue));
            }
        }
        return deck;
    }
}

