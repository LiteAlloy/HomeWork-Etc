package livejournal.dao.user;

import java.util.List;
import livejournal.entity.LiveUser;

public interface LiveUserDAO {
    
    public long addLiveUser(LiveUser user);
    public void uppdateLiveUser(LiveUser user);
    public void deleteLiveUser(long userId);
    public LiveUser getLiveUser(long userId);
    public List<LiveUser> findLiveUsers();

}
