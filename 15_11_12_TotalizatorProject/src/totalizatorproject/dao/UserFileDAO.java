package totalizatorproject.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import totalizatorproject.entity.User;
import totalizatorproject.exceptions.TotalizatorDAOException;

public abstract class UserFileDAO implements UserDAO{
    protected List<User> users;

    @Override
    public String addUser(User user)  throws TotalizatorDAOException{
        if(users == null) {
            loadCollection();
        }
        try {
            User us = (User)user.clone();
            users.add(us);
            saveCollection();
        } catch (Exception ex) {
            throw new TotalizatorDAOException(ex);
        }    
        return user.getMail();
    }

    @Override
    public User getUser(String mail)  throws TotalizatorDAOException{
        if(users == null) {
            loadCollection();
        }
        User found = null;
        User tmp = getTrueUser(mail);
        if(tmp != null){
            found = (User)tmp.clone();
        }
        System.out.println("get User;");
        return found;
    }
    
    public User getTrueUser (String mail) {
        User result = null;
        for(User us : users) {
            if(us.getMail().equals(mail)){
                result = us;
                break;
            }
        }
        return result;
    }

    @Override
    public void uppdateUser(User user)  throws TotalizatorDAOException{
        User found = getUser(user.getMail());
        found.setMail(user.getMail());
        found.setBalance(user.getBalance());
        found.setBets(user.getBets());
        saveCollection();
    }

    @Override
    public void deleteUser(String mail)  throws TotalizatorDAOException{
        if(users == null) {
            loadCollection();
        }
        for(Iterator<User> it = users.iterator(); it.hasNext(); ){
            User user = it.next();
            if(user.getMail().equals(mail)){
                it.remove();
                break;
            }
        }
        saveCollection();
    }    

    @Override
    public List<User> getUsersList() throws TotalizatorDAOException {
        if(users == null) {
            loadCollection();
        }
        List<User> result = new ArrayList<User>();
        for(User us : users) {
            result.add((User)us.clone());
        }
        return result;
    }
    
    abstract protected void saveCollection() throws TotalizatorDAOException;
    abstract protected void loadCollection() throws TotalizatorDAOException;
}
