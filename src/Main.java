import game.Game;
import game.Rules;
import materials.Coin;
import materials.CoinState;
import player.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Game game = new Game();

    game.addPlayer(new Player(1));
    game.addPlayer(new Player(2));
    game.addPlayer(new Player(3));
    game.addPlayer(new Player(4));
    game.addPlayer(new Player(5));

    game.play();

    System.out.println(game.getHistory());
    System.out.println(game.getStatistics());

    System.out.println(game.getSpecificHistory(new Player(1)));
  }

}
