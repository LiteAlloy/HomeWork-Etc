package totalizatorproject.logic;

import totalizatorproject.dao.HorseraceDAO;
import totalizatorproject.dao.HorseraceDAOFactory;

public class HorseraceManager {
    HorseraceDAO dao = HorseraceDAOFactory.getHorseraceDAO();
    
    public void addHorserace(){
        dao.addHorserace();
    }
    public void uppdateHorserace(){
        dao.uppdateHorserace();
    }
    public void deleteHorserace(){
        dao.deleteHorserace();
    }
}
