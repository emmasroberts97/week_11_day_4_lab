

public class Dealer {

    private Deck deck;

    public Dealer(){

        this.deck = new Deck();

        this.deck.populateDeck();
        this.deck.shuffleDeck();
    }

    public Card dealCard(){
        return this.deck.dealRandomCard();
    }
}
