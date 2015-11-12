package totalizatorproject;

import totalizatorproject.entity.Bet;
import totalizatorproject.entity.Horserace;
import totalizatorproject.entity.User;
import totalizatorproject.logic.TotalizatorFacade;

public class Totalizator {

    public static void main(String[] args) {
        TotalizatorFacade facade = new TotalizatorFacade();
        
        User user = new User();
        
        String mail = facade.addUser(user);
        facade.getUser(mail);
        facade.uppdateUser(mail);
        facade.deleteUser(mail);
        
        System.out.println("---");
        Horserace race = new Horserace();
        
        facade.addHorserace();
        facade.uppdateHorserace();
        facade.deleteHorserace();
        
        System.out.println("---");
        Bet bet = new Bet();
        
        int summ = facade.addBet(bet);
        facade.checkBet(summ);
        facade.sendBetResult(mail);
        facade.getBetUser();
        
    }
    
}
