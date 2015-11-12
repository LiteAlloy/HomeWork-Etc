package totalizatorproject.dao;

import totalizatorproject.dao.fotest.HorseraceDAOTest;

public class HorseraceDAOFactory {
    
    public static HorseraceDAO getHorseraceDAO(){
        return new HorseraceDAOTest();
    }
}
