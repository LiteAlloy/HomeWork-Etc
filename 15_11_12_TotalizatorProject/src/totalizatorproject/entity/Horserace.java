package totalizatorproject.entity;

import java.io.Serializable;

public class Horserace implements Serializable{
    
    private long raceId;
    private String [] horses = {"1", "2", "3", "4", "5"};
    private boolean date;
    private String winner;

    public long getRaceId() {
        return raceId;
    }
    public void setRaceId(long raceId) {
        this.raceId = raceId;
    }

    public String[] getHorses() {
        return horses;
    }
    public void setHorses(String[] horses) {
        this.horses = horses;
    }

    public boolean getDate() {
        return date;
    }
    public void setDate(boolean date) {
        this.date = date;
    }

    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public Object clone() {
        Horserace race = new Horserace();
        race.setRaceId(raceId);
        race.setDate(date);
        race.setHorses(horses);
        race.setWinner(winner);
        return race;
    }
    
   
}
