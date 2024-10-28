import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private String[] arrayOfValues;
    private String[] arrayOfSuits;

    public Deck(int numCards) {
        /*
         * Constructs a new deck based on one of 2 valid inputs:
         *   - 52 = standard deck
         *   - 0 = empty deck
         */

        if (numCards == 0){
            cards = new ArrayList<>();
        } else if (numCards == 52) {
            cards = new ArrayList<>();
            arrayOfValues = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            arrayOfSuits = new String[]{"S", "C", "D", "H"};
            for (int i = 0; i < arrayOfSuits.length; i++){
                for (int j = 0; j < arrayOfValues.length; j++){
                    Card newCard = new Card(arrayOfSuits[i], arrayOfValues[j]);
                    cards.add(newCard);
                }
            }
        } else {
            System.out.println("Invalid numCards input for Deck");
        }
    }

    public Card getTopCard(){
        Random rand = new Random();
        return this.cards.remove(rand.nextInt(52));
    }

    public void add(Card card){
        cards.add(card);
    }
}




