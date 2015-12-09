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
            userManager.addUser(user);
        } catch (TotalizatorBusinessException ex) {
            System.out.println("Facade User Error!");
            ex.printStackTrace(System.out);
        }
        return user.getMail();
    }
    public User getUser(String mail){
        return userManager.getUser(mail);
    }
    public void uppdateUser(String mail){
        userManager.uppdateUser(mail);
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
            System.out.println("Facade Horserace Error!");
            ex.printStackTrace(System.out);
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
            System.out.println("Facade Bet Error!");
            ex.printStackTrace(System.out);
        }
    }
    public void checkBet(Bet bet){
        betManager.checkBet(bet);
    }
    public void sendBetResult(long betId){
        betManager.sendBetResult(betId);
    }
    public void deleteBet(long betId){
        betManager.deleteBet(betId);
    }
}
