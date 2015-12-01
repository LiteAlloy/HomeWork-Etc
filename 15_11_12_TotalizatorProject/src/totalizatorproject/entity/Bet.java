package totalizatorproject.entity;

import java.io.Serializable;

public class Bet implements Serializable{
    private User user;
    private Horserace race;
    private String horse;
    private int summ;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Horserace getRace() {
        return race;
    }

    public void setRace(Horserace race) {
        this.race = race;
    }

    public String getHorse() {
        return horse;
    }

    public void setHorse(String horse) {
        this.horse = horse;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Bet be = new Bet();
        be.setUser(user);
        be.setRace(race);
        be.setHorse(horse);
        be.setSumm(summ);
        return be;
    }
    
    
}
