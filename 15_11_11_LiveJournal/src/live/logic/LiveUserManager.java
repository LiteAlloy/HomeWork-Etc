package live.logic;

import java.util.List;
import livejournal.dao.user.LiveUserDAO;
import livejournal.dao.user.LiveUserDAOFactory;
import livejournal.entity.LiveUser;

public class LiveUserManager {
    
    private LiveUserDAO dao = LiveUserDAOFactory.getLiveUserDAO();
    
    public long addLiveUser(LiveUser user){
        return dao.addLiveUser(user);
    }
    
    public void uppdateLiveUser(LiveUser user){
        dao.uppdateLiveUser(user);
    }
    
    public void deleteLiveUser(long userId){
        dao.deleteLiveUser(userId);
    }
    
    public LiveUser getLiveUser(long userId) {
        return dao.getLiveUser(userId);
    }
    
    public List<LiveUser> findLiveUsers(){
        return dao.findLiveUsers();
    }
}
