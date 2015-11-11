package livejournal.dao.user;

import java.util.Collections;
import java.util.List;
import livejournal.entity.LiveUser;

public class LiveUserFakeDAO implements LiveUserDAO{

    @Override
    public long addLiveUser(LiveUser user) {
        System.out.println("add Live User;");
      return 99;
    }

    @Override
    public void uppdateLiveUser(LiveUser user) {
        System.out.println("uppdate Live User;");
    }

    @Override
    public void deleteLiveUser(long userId) {
        System.out.println("delete Live User: " + userId + ';');
    }

    @Override
    public LiveUser getLiveUser(long id) {
        System.out.println("get Live User;");
        return new LiveUser();
    }

    @Override
    public List<LiveUser> findLiveUsers() {
        System.out.println("find Live Users;");
        return Collections.emptyList();
    }
    
}
