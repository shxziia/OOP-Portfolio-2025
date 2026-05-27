import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Deck {

    private List<Card> deck;

    public Deck() {
    deck = new ArrayList<>();
    for (Card.Suit suit : Card.Suit.values()) {
        for (Card.FaceValue faceValue : Card.FaceValue.values()) {
            deck.add(new Card(suit, faceValue));
        }
    }
    shuffleDeck();
    }
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
    public Card dealCard() {
        if (deck.size() > 0) {
            return deck.remove(0);
        }
        return null;
    }
}
