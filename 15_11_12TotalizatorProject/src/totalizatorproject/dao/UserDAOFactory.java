package totalizatorproject.dao;

import totalizatorproject.dao.fotest.UserDAOTest;

public class UserDAOFactory {
    
    public static UserDAO GetUserDAO(){
        return new UserDAOTest();
    }
}
