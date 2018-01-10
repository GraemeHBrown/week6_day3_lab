import java.util.ArrayList;
import java.util.Comparator;


public class HighestCardWins {


    private ArrayList<Player> players;
    private ArrayList<Player> winner;

    public HighestCardWins() {
        this.players = new ArrayList<>();
        this.winner = new ArrayList<>();
    }

    public void addPlayersToGame(Player player) {
        this.players.add(player);
    }

    public void dealCardsToPlayers() {
        Dealer dealer = new Dealer();
        dealer.getDealerDeck().shuffle();
        for (Player player : this.players) {
            player.addCardToHand(dealer.dealCard());
        }
    }

    public Player findWinner() {
        Player winningPlayer = this.players.stream().max(Comparator.comparing(v -> v.getHand().get(0).getRank().getValue())).get();
        return winningPlayer;
    }


}
