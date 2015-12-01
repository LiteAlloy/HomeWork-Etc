package totalizatorproject.dao.fotest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import totalizatorproject.dao.BetDAO;
import totalizatorproject.entity.Bet;
import totalizatorproject.entity.User;
import totalizatorproject.exceptions.TotalizatorDAOException;

public class BetDAOTest implements BetDAO {

    List<Bet> bets = new ArrayList<Bet>();
    
    @Override
    public void addBet(Bet bet) throws TotalizatorDAOException {
        try{
            bets.add(bet);
        } catch (Exception ex) {
            throw new TotalizatorDAOException(ex);
        }
        System.out.println("add Bet");
        
    }

    @Override
    public void uppdateBet(Bet bet) throws TotalizatorDAOException {
        Bet result = getBet(bet);
        result.setRace(bet.getRace());
        result.setHorse(bet.getHorse());
        result.setSumm(bet.getSumm());
        System.out.println("uppdate Bet");

    }

    @Override
    public void sendBetResult(Bet bet) throws TotalizatorDAOException {
        if (bet.getRace().getDate() == false) {
            System.out.println("Race is over!");
            System.out.println("Sendind result to " + bet.getUser().getMail());
        } else {
            System.out.println("The race is not over yet. Bet is valid");
        }
    }

    @Override
    public void deleteBet(Bet bet) throws TotalizatorDAOException {
        User user = bet.getUser();
        for (Iterator<Bet> it = bets.iterator(); it.hasNext();) {
            Bet found = it.next();
            if (bet.equals(found)) {
                it.remove();
                System.out.println("delete bet " + found);
            }
        }
    }
    
    @Override
    public Bet getBet(Bet bet) throws TotalizatorDAOException{
        Bet result = null;
        List<Bet> resultBet = bet.getUser().getBets();
        for(Bet b : bets) {
            if(b.hashCode() == bet.hashCode()) {
                result = b;
                break;
            }
        }
        return result;
    }
}
