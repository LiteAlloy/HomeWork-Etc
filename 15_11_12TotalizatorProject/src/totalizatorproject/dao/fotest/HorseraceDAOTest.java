package totalizatorproject.dao.fotest;

import totalizatorproject.dao.HorseraceDAO;

public class HorseraceDAOTest implements HorseraceDAO{

    @Override
    public void addHorserace() {
        System.out.println("add Horserace");
    }

    @Override
    public void uppdateHorserace() {
        System.out.println("uppdate Horserace");
    }

    @Override
    public void deleteHorserace() {
        System.out.println("delete Horserace");
    }
}
