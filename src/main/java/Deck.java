import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deckCards;

    public Deck(){
        this.deckCards = new ArrayList<>();
        fillDeck();
    }

    public int cardCount() {
        return this.deckCards.size();
    }

    public void fillDeck() {
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                Card cardToAdd = new Card(suit, rank);
                deckCards.add(cardToAdd);
            }
        }
    }

    public ArrayList<Card> getDeckCards(){
        return this.deckCards;
    }

    public void shuffle(){
        Collections.shuffle(this.deckCards);
    }

    //TODO add shuffle method
}
