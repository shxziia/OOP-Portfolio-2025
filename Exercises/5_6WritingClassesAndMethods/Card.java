import java.util.Random;
public class Card {
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }
    public enum FaceValue{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }
    private Suit suit;
    private FaceValue faceValue;

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }
    public String toString() {
        return faceValue + " of " + suit;
    }
    public Suit getSuit() {
        return suit;
    }
    public FaceValue getFaceValue() {
        return faceValue;
    }
}
