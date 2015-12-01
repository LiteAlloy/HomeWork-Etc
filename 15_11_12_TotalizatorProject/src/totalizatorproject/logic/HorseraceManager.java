package totalizatorproject.logic;

import totalizatorproject.dao.HorseraceDAO;
import totalizatorproject.dao.HorseraceDAOFactory;
import totalizatorproject.entity.Horserace;
import totalizatorproject.exceptions.TotalizatorBusinessException;
import totalizatorproject.exceptions.TotalizatorDAOException;

public class HorseraceManager {
    HorseraceDAO dao = HorseraceDAOFactory.getHorseraceDAO();
    
    public void addHorserace(Horserace race) throws TotalizatorBusinessException{
        try {
            dao.addHorserace(race);
        } catch (TotalizatorDAOException ex) {
            throw new TotalizatorBusinessException(ex);
        }
    }
    public void uppdateHorserace(Horserace race){
        try {
            dao.uppdateHorserace(race);
        } catch (TotalizatorDAOException ex) {
        }
    }
    public void deleteHorserace(long raceId){
        try {
            dao.deleteHorserace(raceId);
        } catch (TotalizatorDAOException ex) {
        }
    }
}
