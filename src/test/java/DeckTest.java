import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void deckStartsWithFiftyTwoCards(){
        assertEquals(52, deck.cardCount());
    }

    @Test// shuffle uses random so difficult to test fully.  Test included for documentary purposes.
    public void shuffleSortsDeckRandomly(){
        deck.shuffle();
    }


}
