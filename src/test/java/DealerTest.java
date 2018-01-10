import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer();
    }

    @Test
    public void dealerHasDeck(){
        assertEquals(52, dealer.getDealerDeck().getDeckCards().size());
    }

    @Test
    public void dealingCardReducesDeckSize(){
        Card dealtCard = dealer.dealCard();
        assertFalse(dealer.getDealerDeck().getDeckCards().contains(dealtCard));
    }

    @Test
    public void dealingCardRemovesItFromDeck(){

    }

    @Test
    public void dealCardReturnsCard(){
//        shuffle gets called so not possible to specify except within range
        Card dealtCard = dealer.dealCard();
        assertThat(dealtCard.getSuit(), anyOf(is(Suit.CLUBS), is(Suit.HEARTS), is(Suit.SPADES), is(Suit.DIAMONDS)));
    }
}


