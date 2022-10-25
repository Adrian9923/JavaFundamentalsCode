import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Card implements Comparable<Card> {

    private String face;
    private char suit;

    private static final String[] ALL_FACES = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static final String ALL_SUITS = "♣♦♥♠";

    public Card(String face, char suit) {
        this.setFace(face);
        this.setSuit(suit);
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        if (Arrays.stream(ALL_FACES).noneMatch(f -> f.equals(face)))
            throw new IllegalArgumentException("Invalid face: " + face);
        this.face = face;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        if (ALL_SUITS.indexOf(suit) == -1)
            throw new IllegalArgumentException("Invalid suit: " + suit);
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.face + this.suit;
    }

    @Override
    public int compareTo(Card otherCard) {
        int compareResult = Integer.compare(getCardFaceIndex(this), getCardFaceIndex(otherCard));
        if (compareResult == 0)
            compareResult = Integer.compare(ALL_SUITS.indexOf(this.suit), ALL_SUITS.indexOf(otherCard.suit));
        return compareResult;
    }

    private static int getCardFaceIndex(Card card) {
        for (int i = 0; i < ALL_FACES.length; i++)
            if (ALL_FACES[i].equals(card.face))
                return i;
        return -1;
    }
}
public class Cards {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputCards = scanner.nextLine().split(" ");
        var cards = new ArrayList<Card>();
        for (var cardText : inputCards) {
            char suit = cardText.charAt(cardText.length() - 1);
            String face = cardText.substring(0, cardText.length() - 1);
            Card card = new Card(face, suit);
            cards.add(card);
        }
        cards.sort((c1, c2) -> c1.compareTo(c2));

        for (Card card : cards) {
            System.out.print(card + " ");
        }


    }
}


