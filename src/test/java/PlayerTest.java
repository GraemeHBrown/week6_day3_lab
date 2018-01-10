import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before() {
        player = new Player();
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void playersHandIsEmptyBeforeGameStarts(){
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void addingCardToHandIncreasesHandSize(){
        player.addCardToHand(card);
        assertEquals(1, player.getHand().size());
    }
}
