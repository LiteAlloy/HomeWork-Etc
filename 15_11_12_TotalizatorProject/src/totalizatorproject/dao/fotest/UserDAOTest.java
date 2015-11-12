package totalizatorproject.dao.fotest;

import totalizatorproject.dao.UserDAO;
import totalizatorproject.entity.User;

public class UserDAOTest implements UserDAO{

    @Override
    public String addUser(User user) {
        System.out.println("add User;");
        return "user1@send.to";
    }

    @Override
    public User getUser(String mail) {
        System.out.println("get User;");
        return new User();
    }

    @Override
    public void uppdateUser(String mail) {
        System.out.println("uppdate User");
    }

    @Override
    public void deleteUser(String mail) {
        System.out.println("delete User " + mail);
    }    
}
