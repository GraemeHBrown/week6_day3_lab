import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.hand = new ArrayList<>();
        this.name = name;
    }


    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void addCardToHand(Card cardToAdd) {
        this.hand.add(cardToAdd);
    }

    public String getName() {
        return this.name;
    }
}
