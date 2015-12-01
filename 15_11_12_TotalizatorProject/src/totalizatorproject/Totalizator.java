package totalizatorproject;

import java.util.List;
import totalizatorproject.entity.Bet;
import totalizatorproject.entity.Horserace;
import totalizatorproject.entity.User;
import totalizatorproject.logic.TotalizatorFacade;

public class Totalizator {

    public static void main(String[] args) {
        TotalizatorFacade facade = new TotalizatorFacade();
        
        User user = new User();
        user.setMail("user1@send.to");
        user.setBalance(100);
        
        String mail = facade.addUser(user);
        List<User> users = facade.getUsersList();
        facade.getUser(mail);
        facade.uppdateUser(user);
        facade.deleteUser(mail);
        
        System.out.println("---");
        Horserace race = new Horserace();
        
        facade.addHorserace(race);
        facade.uppdateHorserace(race);
        facade.deleteHorserace(race.getRaceId());
        
        System.out.println("---");
        Bet bet = new Bet();
        bet.setUser(user);
        bet.setRace(race);
        bet.setHorse("1");
        bet.setSumm(50);
        
        facade.addBet(bet);
        facade.checkBet(bet);
        facade.sendBetResult(bet);
        facade.deleteBet(bet);
    }
}
