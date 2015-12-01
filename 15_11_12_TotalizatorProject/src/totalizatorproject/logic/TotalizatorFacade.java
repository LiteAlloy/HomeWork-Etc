package totalizatorproject.logic;

import java.util.List;
import totalizatorproject.entity.Bet;
import totalizatorproject.entity.Horserace;
import totalizatorproject.entity.User;
import totalizatorproject.exceptions.TotalizatorBusinessException;

public class TotalizatorFacade {
    private UserManager userManager;
    private HorseraceManager horseraceManager;
    private BetManager betManager;
    
    public TotalizatorFacade(){
        userManager = new UserManager();
        horseraceManager = new HorseraceManager();
        betManager = new BetManager();
    }
    
    public String addUser(User user){
        try {
            return userManager.addUser(user);
        } catch (TotalizatorBusinessException ex) {
        }
        return "mail";
    }
    public User getUser(String mail){
        return userManager.getUser(mail);
    }
    public void uppdateUser(User user){
        userManager.uppdateUser(user);
    }
    public void deleteUser(String mail){
        userManager.deleteUser(mail);
    }
    public List<User> getUsersList(){
        return userManager.getUsersList();
    }
    
    public void addHorserace(Horserace race){
        try {
            horseraceManager.addHorserace(race);
        } catch (TotalizatorBusinessException ex) {
        }
    }
    public void uppdateHorserace(Horserace race){
        horseraceManager.uppdateHorserace(race);
    }
    public void deleteHorserace(long raceId){
        horseraceManager.deleteHorserace(raceId);
    }
    
    public void addBet(Bet bet){
        try {
            betManager.addBet(bet);
        } catch (TotalizatorBusinessException ex) {
        }
    }
    public void checkBet(Bet bet){
        betManager.checkBet(bet);
    }
    public void sendBetResult(Bet bet){
        betManager.sendBetResult(bet);
    }
    public void deleteBet(Bet bet){
        betManager.deleteBet(bet);
    }
}
