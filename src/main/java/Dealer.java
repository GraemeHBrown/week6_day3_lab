
public class Dealer {

    private Deck dealerDeck;

    public Dealer(){
        this.dealerDeck = new Deck();
    }

    public Deck getDealerDeck() {
        return this.dealerDeck;
    }


    public Card dealCard(){
        Deck deckInPlay = getDealerDeck();
        deckInPlay.shuffle();
        return deckInPlay.getDeckCards().remove(0);
    }

}
