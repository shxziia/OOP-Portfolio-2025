public class Maincard {
    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println("Dealing 5 Random Cards: ");
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            if (card != null) {
                System.out.println(card);
            }
        }
    }
}
