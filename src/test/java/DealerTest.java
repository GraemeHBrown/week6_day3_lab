import org.junit.*;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;


//import org.junit.Ignore;
//import org.junit.Test;

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


