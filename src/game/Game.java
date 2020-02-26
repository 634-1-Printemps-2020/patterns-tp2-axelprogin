package game;

import materials.Coin;
import materials.CoinState;
import player.Player;
import utils.Statistics;

import javax.print.DocFlavor;
import java.util.*;

public class Game {

    private Rules rules;
    private Coin coin;
    private Map<Player, List<CoinState>> history;

    public Game() {
        history = new HashMap<>();
        rules = Rules.getInstance();
        coin = Coin.getInstance();
    }

    /**
     * Ajouter un nouveau joueur au jeu
     *
     * @param player le nouveau joueur
     */
    public void addPlayer(Player player) {
      history.put(player, new ArrayList<>());
    }

    /**
     * Faire joueur tous les joueurs et stocker chaque partie dans history
     */
    public void play() {
        List<CoinState> listLances;
        for (Player p : history.keySet()){
            listLances = history.get(p);
            while (!rules.checkWin(listLances)){
                coin.throwCoin();
                listLances.add(coin.getState());
            }
            history.put(p,listLances);
        }
    }

    /**
     * Calculer des statistiques de la partie précédente
     *
     * @return Statistics
     */
    public Statistics getStatistics() {
      // TODO: Votre code ici
      return null;
    }

    /**
     * Obtenir l'historique de tous les joueurs de la partie précédente
     *
     * @return Map contenant chaque joueur et la liste des ses lancers
     */
    public Map<Player, List<CoinState>> getHistory() {
      return history;
    }


    /**
     * Obtenir l'historique d'un joueur spécifique
     *
     * @param player instance du joueur pour lequel on veut avoir l'historique
     * @return la liste des lancers d'un joueur
     */
    public List<CoinState> getSpecificHistory(Player player) {
      return history.get(player);
    }

}
