package materials;

import java.util.Random;

public class Coin {

  private static Coin coin = null;

  public static Coin getInstance(){
    if (coin == null){
      coin = new Coin();
    }
    return coin;
  }


  private CoinState coinState;

  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    Random r = new Random();
    int choice = r.nextInt(2);
    if (choice==1){
      coinState = CoinState.TAILS;
    }else {
      coinState = CoinState.HEADS;
    }
  }

  public CoinState getState() {
    return coinState;
  }


}
