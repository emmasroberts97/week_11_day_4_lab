import java.util.ArrayList;

public class Game {

    private Dealer dealer;
    private ArrayList<Player> players;

    public Game(){
        this.dealer = new Dealer();
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public int getPlayerCount(){
        return this.players.size();
    }

    public void setUpGame(){
        for (Player player : this.players){
            Card card = this.dealer.dealCard();
            player.getHand(card);
        }
    }

    public String playGame(){
        int maximum = 0;
        Player winningPlayer = new Player("None");
        for (Player player : this.players){
            if (player.showHand() > maximum){
                maximum = player.showHand();
                winningPlayer.setName(player.getName());
            } else if (player.showHand() == maximum){
                return "It's a draw!";
            }
        }
        return winningPlayer.getName() + " wins the game!";
    }
}
