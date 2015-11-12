package totalizatorproject.dao;

import totalizatorproject.entity.User;

public interface UserDAO {
    public String addUser(User user);
    public User getUser(String mail);
    public void uppdateUser(String mail);
    public void deleteUser(String mail);
}
