package totalizatorproject.dao.fotest;

import totalizatorproject.dao.BetDAO;
import totalizatorproject.entity.Bet;
import totalizatorproject.entity.User;

public class BetDAOTest implements BetDAO{

    @Override
    public int addBet(Bet bet) {
        System.out.println("add Bet");
        return 50;
    }

    @Override
    public void checkBet(int summ) {
        System.out.println("check Bet: " + summ);
    }

    @Override
    public void sendBetResult(String mail) {
        System.out.println("send Bet Result (to) " + mail);
    }

    @Override
    public User getBetUser() {
        System.out.println("get Bet User");
        return new User();
    }
    
}
