import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }


    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void addCardToHand(Card cardToAdd) {
        this.hand.add(cardToAdd);
    }
}
