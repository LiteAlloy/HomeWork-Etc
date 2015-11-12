package totalizatorproject.entity;

public class Horserace {
    
    private String [] horses = {"1", "2", "3", "4", "5"};
    private int date;
    private String winner;

    public String[] getHorses() {
        return horses;
    }

    public void setHorses(String[] horses) {
        this.horses = horses;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
   
}
