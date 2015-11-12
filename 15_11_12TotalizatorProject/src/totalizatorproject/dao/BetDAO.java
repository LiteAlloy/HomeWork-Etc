
package totalizatorproject.dao;

import totalizatorproject.entity.Bet;
import totalizatorproject.entity.User;

public interface BetDAO {
   public int addBet(Bet bet);
   public void checkBet(int summ);
   public void sendBetResult(String mail);
   public User getBetUser();
}
