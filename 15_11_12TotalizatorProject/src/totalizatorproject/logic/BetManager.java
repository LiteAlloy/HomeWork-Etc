package totalizatorproject.logic;

import totalizatorproject.dao.BetDAO;
import totalizatorproject.dao.BetDAOFactory;
import totalizatorproject.entity.Bet;
import totalizatorproject.entity.User;

public class BetManager {

    BetDAO dao = BetDAOFactory.getBetDAO();
    
    public int addBet(Bet bet){
        return dao.addBet(bet);
    }
    public void checkBet(int summ){
        dao.checkBet(summ);
    }

    public void sendBetResult(String mail){
        dao.sendBetResult(mail);
    }

    public User getBetUser(){
        return dao.getBetUser();
    }
}
