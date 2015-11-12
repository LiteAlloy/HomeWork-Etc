package totalizatorproject.entity;

public class Bet {
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
    
    
}
