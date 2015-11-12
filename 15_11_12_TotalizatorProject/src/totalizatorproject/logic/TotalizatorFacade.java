package totalizatorproject.logic;

import totalizatorproject.entity.Bet;
import totalizatorproject.entity.User;

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
        return userManager.addUser(user);
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
    
    public void addHorserace(){
        horseraceManager.addHorserace();
    }
    public void uppdateHorserace(){
        horseraceManager.uppdateHorserace();
    }
    public void deleteHorserace(){
        horseraceManager.deleteHorserace();
    }
    
    public int addBet(Bet bet){
        return betManager.addBet(bet);
    }
    public void checkBet(int summ){
        betManager.checkBet(summ);
    }
    public void sendBetResult(String mail){
        betManager.sendBetResult(mail);
    }
    public User getBetUser(){
        return betManager.getBetUser();
    }
}
