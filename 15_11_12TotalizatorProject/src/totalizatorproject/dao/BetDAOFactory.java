package totalizatorproject.dao;

import totalizatorproject.dao.fotest.BetDAOTest;

public class BetDAOFactory {
    
    public static BetDAO getBetDAO(){
        return new BetDAOTest();
    }
}
