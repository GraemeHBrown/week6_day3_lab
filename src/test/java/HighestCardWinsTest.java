import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class HighestCardWinsTest {

    Player player;
    Card card;
    HighestCardWins game;
    Player player2;

    @Before
    public void before() {
        player = new Player("Fred");
        player2 = new Player("Dave");
        card = new Card(Suit.SPADES, Rank.ACE);
        game = new HighestCardWins();
        game.addPlayersToGame(player);
        game.addPlayersToGame(player2);
    }

    @Test
    public void dealingCardToPlayersAddsToPlayerHand(){
        game.dealCardsToPlayers();
        assertEquals(1, player.getHand().size());
    }

    @Test
    public void findWinnerReturnsAPlayer(){
        game.dealCardsToPlayers();
        Player winner = game.findWinner();
        assertThat(winner, instanceOf(Player.class));
    }


}
