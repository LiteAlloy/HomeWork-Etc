
package totalizatorproject.dao;

import totalizatorproject.entity.Bet;
import totalizatorproject.exceptions.TotalizatorDAOException;

public interface BetDAO {
   public void addBet(Bet bet) throws TotalizatorDAOException;
   public void uppdateBet(Bet bet) throws TotalizatorDAOException;
   public void sendBetResult(Bet bet) throws TotalizatorDAOException;
   public void deleteBet(Bet bet) throws TotalizatorDAOException;
   public Bet getBet(Bet bet) throws TotalizatorDAOException;
}
