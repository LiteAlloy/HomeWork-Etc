package totalizatorproject.logic;

import totalizatorproject.dao.UserDAO;
import totalizatorproject.dao.UserDAOFactory;
import totalizatorproject.entity.User;

public class UserManager {
    UserDAO dao = UserDAOFactory.GetUserDAO();
    
    public String addUser(User user){
        return dao.addUser(user);
    }
    public User getUser(String mail){
        return dao.getUser(mail);
    }
    public void uppdateUser(String mail){
        dao.uppdateUser(mail);
    }
    public void deleteUser(String mail){
        dao.deleteUser(mail);
    }
    
}
