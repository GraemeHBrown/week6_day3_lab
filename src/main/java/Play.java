public class Play {

    public static void main(String[] args) {
        HighestCardWins game = new HighestCardWins();
        Player player = new Player("Fred");
        Player player2 = new Player("Dave");

        game.addPlayersToGame(player);
        game.addPlayersToGame(player2);

        game.dealCardsToPlayers();

        Player winner = game.findWinner();

        System.out.println("Winner is: "+ winner.getName() + " with a score of: " + winner.getHand().get(0).getRank().getValue());
    }
}
