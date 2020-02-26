package game;

import materials.CoinState;

import java.util.List;

public class Rules {

  private static Rules rules = null;

  public static Rules getInstance(){
    if (rules == null){
      rules = new Rules();
    }
    return rules;
  }


  /**
   * Cette méthode permet de déterminer si une suite d'états de pièce permet de gagner à une partie
   * @param states liste d'états pour un joueur
   * @return true si un joueur a gagné, false sinon
   */
  public boolean checkWin(List<CoinState> states) {
    int numToWin = 3;
    int cpt = 0 ;
    if (states == null && states.size() < 3){
      return false;
    }else {
      for (CoinState coinState : states){
        if (coinState.equals(CoinState.TAILS)){
          cpt++;
        }
      }
    }
      return cpt == numToWin;
  }
}
