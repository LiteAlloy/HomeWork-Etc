package totalizatorproject.logic;

import totalizatorproject.dao.BetDAO;
import totalizatorproject.dao.BetDAOFactory;
import totalizatorproject.entity.Bet;
import totalizatorproject.entity.Horserace;
import totalizatorproject.entity.User;
import totalizatorproject.exceptions.TotalizatorBusinessException;
import totalizatorproject.exceptions.TotalizatorDAOException;

public class BetManager {

    BetDAO dao = BetDAOFactory.getBetDAO();
    
    public void addBet(Bet bet) throws TotalizatorBusinessException{
        try {
            dao.addBet(bet);
        } catch (TotalizatorDAOException ex) {
           throw new TotalizatorBusinessException (ex); 
        }
    }
    
    public void checkBet(Bet bet){
        try {
            dao.uppdateBet(bet);
        } catch (TotalizatorDAOException ex) {
        }
    }

    public void sendBetResult(Bet bet){
        try {
            dao.sendBetResult(bet);
        } catch (TotalizatorDAOException ex) {
        }
    }

    public void deleteBet(Bet bet){
        try {
            dao.deleteBet(bet);
        } catch (TotalizatorDAOException ex) {
        }
    }
}
