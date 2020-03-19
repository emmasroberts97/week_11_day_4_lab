import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.hand = new ArrayList<Card>();
        this.name = name;
    }

    public void getHand(Card card){
        this.hand.add(card);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer showHand(){
        Card card = this.hand.get(0);
        return card.getCardInformation().get(card.getSuit());
    }
}
