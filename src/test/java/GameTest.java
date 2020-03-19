import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player emma;
    private Player francesca;
    private Player joe;
    private Card emmaCard;
    private Card francescaCard;
    private Card joeCard;

    @Before
    public void before(){
        game = new Game();
        emma = new Player("Emma");
        francesca = new Player("Francesca");
        joe = new Player("Joe");
        emmaCard = new Card(SuitType.HEARTS, RankType.FOUR);
        francescaCard = new Card(SuitType.DIAMONDS, RankType.EIGHT);
        joeCard = new Card(SuitType.CLUBS, RankType.TEN);


        game.addPlayer(emma);
        game.addPlayer(francesca);
        game.addPlayer(joe);
    }

    @Test
    public void canAddPlayers(){
        assertEquals(3, game.getPlayerCount());
    }

    @Test
    public void canPlayGame(){
//        game.setUpGame();
//        System.out.println(emma.showHand());
//        System.out.println(francesca.showHand());
//        System.out.println(joe.showHand());
//        System.out.println(game.playGame());

        emma.getHand(emmaCard);
        joe.getHand(joeCard);
        francesca.getHand(francescaCard);

        assertEquals("Joe wins the game!", game.playGame());

    }

}
