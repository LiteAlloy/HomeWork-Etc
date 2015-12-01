package totalizatorproject.logic;

import java.util.ArrayList;
import java.util.List;
import totalizatorproject.dao.UserDAO;
import totalizatorproject.dao.UserDAOFactory;
import totalizatorproject.entity.User;
import totalizatorproject.exceptions.TotalizatorBusinessException;
import totalizatorproject.exceptions.TotalizatorDAOException;

public class UserManager {
    private UserDAO dao = UserDAOFactory.GetUserDAO();
    private List<User> users = new ArrayList<User>();
    
    public String addUser(User user) throws TotalizatorBusinessException{
        try {
            return dao.addUser(user);
        } catch (TotalizatorDAOException ex){
            throw new TotalizatorBusinessException(ex);
        }    
    }
    public User getUser(String mail){
        try {
            return dao.getUser(mail);
        } catch (TotalizatorDAOException ex) {
        }
        return null;
    }
    public void uppdateUser(User user){
        try {
            dao.uppdateUser(user);
        } catch (TotalizatorDAOException ex) {
        }
    }
    public void deleteUser(String mail){
        try {
            dao.deleteUser(mail);
        } catch (TotalizatorDAOException ex) {
        }
    }  
    
    public List<User> getUsersList(){
        return users;
    }
}
