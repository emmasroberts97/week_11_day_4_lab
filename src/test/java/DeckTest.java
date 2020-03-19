import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canPopulate(){
        deck.populateDeck();
        assertEquals(52, deck.getDeck().size());
    }

    @Test
    public void canShuffle(){
        deck.populateDeck();
        System.out.println(deck.getDeck());
        deck.shuffleDeck();
        System.out.println(deck.getDeck());
    }

    @Test
    public void canGetRandom(){
        deck.populateDeck();
        deck.shuffleDeck();
        System.out.println(deck.dealRandomCard());
        System.out.println(deck.dealRandomCard());
    }

}
