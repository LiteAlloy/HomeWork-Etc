package totalizatorproject.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
    private String mail;
    private int balance;
    private List<Bet> bets;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    @Override
    public Object clone(){
        User us = new User();
        us.setMail(mail);
        us.setBalance(balance);
        us.setBets(bets);
        return us;
    }
    
    
}
